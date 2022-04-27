package com.mizore.gwt.showcase.client.application;

import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;

import com.google.gwt.inject.client.AbstractGinModule;
import com.mizore.gwt.showcase.client.application.interfaces.ApplicationDisplay;
import com.mizore.gwt.showcase.client.application.view.ApplicationViewImpl;
import com.mizore.gwt.showcase.client.authentication.interfaces.AuthenticationDisplay;
import com.mizore.gwt.showcase.client.authentication.view.AuthenticationViewImpl;
import com.mizore.gwt.showcase.client.screen.demo.interfaces.DemoScreenDisplay;
import com.mizore.gwt.showcase.client.screen.demo.view.DemoScreenViewImpl;
import com.mizore.gwt.showcase.client.screen.graph.interfaces.GraphDisplay;
import com.mizore.gwt.showcase.client.screen.graph.view.GraphViewImpl;
import com.mizore.gwt.showcase.client.screen.menu.interfaces.MenuDisplay;
import com.mizore.gwt.showcase.client.screen.menu.view.MenuViewImpl;
import com.mizore.gwt.showcase.client.screen.tree.interfaces.TreeWidgetDisplay;
import com.mizore.gwt.showcase.client.screen.tree.view.TreeWidgetViewImpl;

public class ApplicationModule extends AbstractGinModule{

	@Override
	protected void configure() {
		bind(EventBus.class).to(DefaultEventBus.class).asEagerSingleton();
		bind(ApplicationDisplay.class).to(ApplicationViewImpl.class);

		// authentication
		bind(AuthenticationDisplay.class).to(AuthenticationViewImpl.class);
		
		// demo
		bind(DemoScreenDisplay.class).to(DemoScreenViewImpl.class);
		bind(GraphDisplay.class).to(GraphViewImpl.class);
		bind(MenuDisplay.class).to(MenuViewImpl.class);
		bind(TreeWidgetDisplay.class).to(TreeWidgetViewImpl.class);
	}

}
