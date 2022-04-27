package com.mizore.gwt.widgets.client.dropdown.events;

import com.google.gwt.event.shared.GwtEvent;

public class SelectedItemEvent extends
		GwtEvent<SelectedItemHandler> {

	private static Type<SelectedItemHandler> type;

	public static Type<SelectedItemHandler> getType() {
		if (type == null) {
			type = new Type<SelectedItemHandler>();
		}
		return type;
	}

	public SelectedItemEvent() {
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<SelectedItemHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(SelectedItemHandler handler) {
		handler.onSelectedItem(this);
	}

}
