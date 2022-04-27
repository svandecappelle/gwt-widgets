package com.mizore.gwt.widgets.client.layout;

import com.mizore.gwt.widgets.client.layout.LayoutVisible.AnimationCallback;


/**
 * Specifies that a panel can animate between layouts.
 * 
 * <p>
 * The normal use pattern is to set all childrens' positions, then to call
 * {@link #animate(int)} to move them to their new positions over some period
 * of time.
 * </p>
 */
public interface AnimatedVisibleLayout {

  /**
   * Layout children, animating over the specified period of time.
   * 
   * @param duration the animation duration, in milliseconds
   */
  void animate(int duration);

  /**
   * Layout children, animating over the specified period of time.
   * 
   * <p>
   * This method provides a callback that will be informed of animation updates.
   * This can be used to create more complex animation effects.
   * </p>
   * 
   * @param duration the animation duration, in milliseconds
   * @param callback the animation callback
   */
  void animate(final int duration, final AnimationCallback callback);

  /**
   * Layout children immediately.
   * 
   * <p>
   * This is not normally necessary, unless you want to update child widgets'
   * positions explicitly to create a starting point for a subsequent call to
   * {@link #animate(int)}.
   * </p>
   * 
   * @see #animate(int)
   * @see #animate(int, LayoutVisible.AnimationCallback)
   */
  void forceLayout();
}
