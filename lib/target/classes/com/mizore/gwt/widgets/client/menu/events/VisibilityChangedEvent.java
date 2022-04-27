package com.mizore.gwt.widgets.client.menu.events;

import com.google.gwt.event.shared.GwtEvent;

public class VisibilityChangedEvent extends GwtEvent<VisibilityChangedHandler> {

	private static Type<VisibilityChangedHandler> type;

	public static Type<VisibilityChangedHandler> getType() {
		if (type == null) {
			type = new Type<VisibilityChangedHandler>();
		}
		return type;
	}

	private boolean visible;

	public VisibilityChangedEvent(boolean isVisible) {
		this.visible = isVisible;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<VisibilityChangedHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(VisibilityChangedHandler handler) {
		handler.onVisibilityChanged(this);
	}

	public boolean isVisible() {
		return visible;
	}

}
