package com.mizore.gwt.widgets.client.dropdown;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class ListWidget extends ComplexPanel {

	public ListWidget() {
		Element elem = DOM.createElement("ul");
		this.setElement(elem);
	}

	public void addItem(ListItemWidget item) {
		this.add(item);
	}

	public void add(Widget child) {
		super.add(child, getElement());
	}
}
