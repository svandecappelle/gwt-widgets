package com.mizore.gwt.widgets.client.tab;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class PureCssTabPanel extends ComplexPanel {

	public PureCssTabPanel() {
		Element el = DOM.createElement("ul");
		this.setElement(el);

		this.addStyleName("tabs");
	}

	@Override
	public void add(Widget child) {
		super.add(child, getElement());
	}
}
