package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class MenuItem implements IsWidget, HasClickHandlers {

	private MenuItemContainer container;

	private InlineLabel titleLbl;
	private InlineLabel nameLbl;
	private FlowPanel contents;

	private String key;

	public MenuItem(String title, String name) {
		this.container = new MenuItemContainer();
		this.titleLbl = new InlineLabel(title);
		this.nameLbl = new InlineLabel(name);
		this.contents = new FlowPanel();

		this.titleLbl.addStyleName("Gwt-MenuItem-Title");
		this.nameLbl.addStyleName("Gwt-MenuItem-Label");

		this.container.setItemTitle(titleLbl, nameLbl);

		this.key = toKey(title, name);
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

	public static String toKey(String title, String name) {
		return new StringBuilder("#").append(title).append(".").append(name)
				.toString();
	}

}
