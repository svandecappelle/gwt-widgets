package com.mizore.gwt.widgets.client.menu.locker;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class LockMenu implements IsWidget {

	private FlowPanel container;

	public LockMenu() {
		this.container = new FlowPanel();
		SimplePanel lineFirst = new SimplePanel();
		SimplePanel lineSecond = new SimplePanel();
		SimplePanel lineThird = new SimplePanel();

		lineFirst.addStyleName("line");
		lineSecond.addStyleName("line");
		lineThird.addStyleName("line");

		lineFirst.addStyleName("first");
		lineSecond.addStyleName("second");
		lineThird.addStyleName("third");

		container.addStyleName("Gwt-Toggle-Menu");

		this.container.add(lineFirst);
		this.container.add(lineSecond);
		this.container.add(lineThird);
	}

	public Widget asWidget() {
		return container;
	}

	public void removeStyleName(String style) {
		this.container.removeStyleName(style);
	}

	public void addStyleName(String style) {
		this.container.addStyleName(style);
	}

	public boolean isActive() {
		if (this.container.getElement().hasClassName("active")) {
			return true;
		} else {
			return false;
		}
	}

	public void activate(boolean activate) {
		if (this.container.getElement().hasClassName("active") && !activate) {
			this.removeStyleName("active");
		} else if (!this.container.getElement().hasClassName("active")
				&& activate) {
			this.addStyleName("active");
		}
	}

	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return this.container.addDomHandler(handler, ClickEvent.getType());
	}

}
