package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.mizore.gwt.widgets.client.layout.LayoutVisiblePanel;
import com.mizore.gwt.widgets.client.menu.events.VisibilityChangedEvent;
import com.mizore.gwt.widgets.client.menu.events.VisibilityChangedHandler;
import com.mizore.gwt.widgets.client.menu.locker.LockMenu;
import com.mizore.gwt.widgets.client.menu.themes.MenuTheme;

public class MenuWidget extends LayoutVisiblePanel {

	private NavContainer navigation;
	private LockMenu locker;

	public enum Orientaton {
		HORIZONTAL, VERTICAL;
	}

	public MenuWidget() {
		this(Orientaton.VERTICAL);
	}

	public MenuWidget(Orientaton orientation) {
		this.navigation = new NavContainer();

		this.add(navigation);

		switch (orientation) {
		case HORIZONTAL:
			this.navigation.addStyleName("horizontal");
			this.setWidgetTopHeight(navigation, 0, Unit.PX, 60, Unit.PX);
			this.setWidgetLeftRight(navigation, 0, Unit.PX, 0, Unit.PX);

			break;
		case VERTICAL:
			this.locker = new LockMenu();
			this.add(locker);
			this.setWidgetTopBottom(navigation, 0, Unit.PX, 0, Unit.PX);
			this.setWidgetLeftWidth(navigation, 0, Unit.PX, 100, Unit.PCT);

			this.setWidgetTopHeight(locker, 10, Unit.PX, 58, Unit.PX);
			this.setWidgetRightWidth(locker, -58, Unit.PX, 58, Unit.PX);

			this.locker.addClickHandler(new ClickHandler() {

				public void onClick(ClickEvent event) {
					MenuWidget.this.locker.activate(!MenuWidget.this.locker.isActive());
					MenuWidget.this.navigation.activate(MenuWidget.this.locker.isActive());
				}
			});

			this.navigation.addOnVisibilityChanged(new VisibilityChangedHandler() {
				public void onVisibilityChanged(VisibilityChangedEvent event) {
					if(locker.asWidget().isVisible()){
						MenuWidget.this.locker.activate(event.isVisible());
					}else{
						navigation.activate(false);
					}
				}
			});

			break;
		}

		this.setSize("100%", "100%");
	}

	public HandlerRegistration addMenuLockerClickHandler(ClickHandler handler) {
		return this.locker.addClickHandler(handler);
	}

	public MenuItem addItem(String title, String name) {
		MenuItem item = new MenuItem(title, name);
		this.navigation.addItem(item);
		return item;
	}

	public void addCustomItem(CustomMenuItem widget) {
		this.navigation.addItem(widget);
	}

	public MenuItem addItem(final MenuItem item) {
		this.navigation.addItem(item);
		return item;
	}

	public void setTheme(MenuTheme header) {
		this.navigation.setTheme(header);
	}

	public NavContainer getNavigation() {
		return navigation;
	}

	public void setLockerVisible(boolean visible) {
		this.setWidgetVisible(locker.asWidget(), visible);
	}
	
	@Override
	public void clear() {
		this.navigation.clear();
	}

}
