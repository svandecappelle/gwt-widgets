package com.mizore.gwt.widgets.client.dropdown.events;

import com.google.gwt.event.shared.EventHandler;

public interface ValueChangedHandler<V> extends EventHandler {

	void onValueChanged(ValueChangedEvent<V> event);

}
