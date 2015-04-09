package com.mizore.gwt.widgets.client.dropdown.events;

import com.google.gwt.event.shared.HandlerRegistration;

public interface HasValueChangedHandler<V> {

	HandlerRegistration addValueChangedHandler(ValueChangedHandler<V> event);

}
