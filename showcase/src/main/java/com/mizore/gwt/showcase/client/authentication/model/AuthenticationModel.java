package com.mizore.gwt.showcase.client.authentication.model;

import net.customware.gwt.presenter.client.EventBus;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.mizore.gwt.showcase.client.GreetingServiceAsync;
import com.mizore.gwt.showcase.client.authentication.events.AuthenticatedEvent;
import com.mizore.gwt.showcase.client.authentication.events.ErrorAuthenticationEvent;
import com.mizore.gwt.showcase.shared.UserCredentials;

public class AuthenticationModel {

	@Inject
	private GreetingServiceAsync service;

	@Inject
	private EventBus eventBus;

	public void checkAuthentication() {
		service.isAuthenticated(new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean isAuthenticated) {
				eventBus.fireEvent(new AuthenticatedEvent(isAuthenticated));
			}

			@Override
			public void onFailure(Throwable caught) {
				eventBus.fireEvent(new ErrorAuthenticationEvent());
			}
		});
	}

	public void authenticate(UserCredentials userCredentials) {
		service.authenticate(userCredentials, new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean isAuthenticated) {
				eventBus.fireEvent(new AuthenticatedEvent(isAuthenticated));
			}

			@Override
			public void onFailure(Throwable caught) {
				eventBus.fireEvent(new ErrorAuthenticationEvent());
			}
		});
	}

}
