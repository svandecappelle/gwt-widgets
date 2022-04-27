package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class HtmlMenu extends ComplexPanel {

	protected HtmlMenu(Element menu) {
		this.setElement(menu);
	}

	public HtmlMenu() {
		this(DOM.createElement("ul"));
		// Create a UL html Element.
	}

	public void addItem(MenuItem item) {
		this.add(item);
	}

	public void add(Widget child) {
		super.add(child, getElement());
	}

}
