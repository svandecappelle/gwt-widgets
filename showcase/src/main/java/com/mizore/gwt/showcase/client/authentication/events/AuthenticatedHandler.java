package com.mizore.gwt.showcase.client.authentication.events;

import com.google.gwt.event.shared.EventHandler;

public interface AuthenticatedHandler extends EventHandler {

	void onAuthenticated(AuthenticatedEvent event);

}
