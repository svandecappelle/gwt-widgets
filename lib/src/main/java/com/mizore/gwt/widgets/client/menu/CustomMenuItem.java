package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CustomMenuItem implements IsWidget, HasClickHandlers {

	private MenuItemContainer container;

	private FlowPanel contents;

	private String key;

	public CustomMenuItem(IsWidget widget) {
		this.container = new MenuItemContainer();
		this.contents = new FlowPanel();

		this.container.setItemTitle(widget);
	}

	public Widget asWidget() {
		return container;
	}

	public void addContent(IsWidget child) {
		this.container.setItemContents(contents);
		this.contents.add(child);
	}

	public void fireEvent(GwtEvent<?> event) {
		this.container.fireEvent(event);
	}

	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return this.container.addTitleClickHandler(handler);
	}

	public boolean isActive() {
		return this.container.isActive();
	}

	public void activate(boolean activate) {
		this.container.activate(activate);
	}

	public String getKey() {
		return key;
	}

}
