package com.mizore.gwt.widgets.client.layout;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;
import com.mizore.gwt.widgets.client.layout.LayoutVisible.AnimationCallback;
import com.mizore.gwt.widgets.client.layout.LayoutVisible.Layer;

/**
 * A scheduled command used by animated layouts to ensure that only layout is
 * ever performed for a panel within a given user event.
 * 
 * <p>
 * Note: This class assumes that
 * {@link LayoutVisible.Layer#getUserObject
 * Layer.getUserObject()} will return the widget associated with a given layer.
 * </p>
 */
public class LayoutVisibleCommand implements ScheduledCommand {

	private boolean scheduled, canceled;
	private int duration;
	private LayoutVisible.AnimationCallback callback;
	private final LayoutVisible layout;

	/**
	 * Creates a new command for the given layout object.
	 * 
	 * @param layout
	 */
	public LayoutVisibleCommand(LayoutVisible layout) {
		this.layout = layout;
	}

	/**
	 * Cancels this command. A subsequent call to
	 * {@link #schedule(int, LayoutVisible.AnimationCallback)} will re-enable it.
	 */
	public void cancel() {
		// There's no way to "unschedule" a command, so we use a canceled flag.
		canceled = true;
	}

	public final void execute() {
		scheduled = false;
		if (canceled) {
			return;
		}

		doBeforeLayout();

		layout.layout(duration, new LayoutVisible.AnimationCallback() {
			public void onAnimationComplete() {
				// Chain to the passed callback.
				if (callback != null) {
					callback.onAnimationComplete();
				}
			}

			public void onLayout(Layer layer, double progress) {
				// Inform the child associated with this layer that its size may
				// have changed.
				Widget child = (Widget) layer.getUserObject();
				if (child instanceof RequiresResize) {
					((RequiresResize) child).onResize();
				}

				// Chain to the passed callback.
				if (callback != null) {
					callback.onLayout(layer, progress);
				}
			}
		});
	}

	/**
	 * Schedules a layout. The duration and callback passed to this method will
	 * supercede any previous call that has not yet been executed.
	 * 
	 * @param duration
	 * @param callback
	 */
	public void schedule(int duration, AnimationCallback callback) {
		this.duration = duration;
		this.callback = callback;

		canceled = false;
		if (!scheduled) {
			scheduled = true;
			Scheduler.get().scheduleFinally(this);
		}
	}

	/**
	 * Called before the layout is executed. Override this method to perform any
	 * work that needs to happen just before it.
	 */
	protected void doBeforeLayout() {
	}
}
