package com.mizore.gwt.widgets.client.dropdown.events;

import com.google.gwt.event.shared.GwtEvent;

public class ValueChangedEvent<V> extends GwtEvent<ValueChangedHandler> {

	private static Type<ValueChangedHandler> type;

	public static Type<ValueChangedHandler> getType() {
		if (type == null) {
			type = new Type<ValueChangedHandler>();
		}
		return type;
	}

	private V value;

	public ValueChangedEvent(V value) {
		this.value = value;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ValueChangedHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(ValueChangedHandler handler) {
		handler.onValueChanged(this);
	}

	public V getValue() {
		return value;
	}
}
