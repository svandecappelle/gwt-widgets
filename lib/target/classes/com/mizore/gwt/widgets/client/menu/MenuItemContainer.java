package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class MenuItemContainer extends ComplexPanel {

	private FlowPanel titleContainer;
	private SimplePanel contentsContainer;

	protected MenuItemContainer(Element menu) {
		this.setElement(menu);
		this.titleContainer = new FlowPanel();
		this.contentsContainer = new SimplePanel();
		this.add(titleContainer);
		this.add(contentsContainer);

		this.titleContainer.addStyleName("title");
		this.contentsContainer.addStyleName("Gwt-MenuItem-Content");
	}

	public MenuItemContainer() {
		this(DOM.createElement("li"));
	}

	public void setItemTitle(IsWidget itemTitle, IsWidget itemLabel) {
		itemTitle.asWidget().addStyleName("TitleShort");
		itemLabel.asWidget().addStyleName("TitleFull");
		this.titleContainer.add(itemTitle);
		this.titleContainer.add(itemLabel);
	}

	public void setItemTitle(IsWidget itemTitle) {
		this.titleContainer.add(itemTitle);
	}

	public void setItemContents(IsWidget child) {
		this.contentsContainer.setWidget(child);
	}

	public void add(Widget child) {
		super.add(child, getElement());
	}

	public HandlerRegistration addTitleClickHandler(ClickHandler handler) {
		return this.titleContainer.addDomHandler(handler, ClickEvent.getType());
	}

	public boolean isActive() {
		if (contentsContainer.getElement().hasClassName("active")) {
			return true;
		} else {
			return false;
		}
	}

	public void activate(boolean activate) {
		if (contentsContainer.getElement().hasClassName("active") && !activate) {
			contentsContainer.removeStyleName("active");
			this.removeStyleName("active");
		} else if (!contentsContainer.getElement().hasClassName("active") && activate) {
			contentsContainer.addStyleName("active");
			this.addStyleName("active");
		}
	}
}
