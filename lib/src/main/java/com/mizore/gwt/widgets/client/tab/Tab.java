package com.mizore.gwt.widgets.client.tab;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class Tab extends ComplexPanel implements IsWidget {

	private SimplePanel tabContent;
	private final String idTab;
	private TabButton tabButton;
	private TrueLabel tabTitle;

	private final class TabButton extends Widget {
		// <input type="radio" name="tabs" id="tab1" checked />
		public TabButton(String idTab) {
			Element el = DOM.createInputRadio("tabs");
			el.setId("tab-" + idTab);
			this.setElement(el);
		}
	}

	private final class TrueLabel extends Widget {
		public TrueLabel(String idTab, String text) {
			// <label for="tab1">Description</label>
			Element el = DOM.createLabel();
			el.setAttribute("for", "tab-" + idTab);
			el.setInnerText(text);
			this.setElement(el);
		}
	}

	public Tab(String title) {
		idTab = DOM.createUniqueId();
		Element el = DOM.createElement("li");
		this.setElement(el);

		this.tabButton = new TabButton(idTab);

		this.tabTitle = new TrueLabel(idTab, title);
		this.tabContent = new SimplePanel();

		this.tabContent.getElement().setId("tab-content-" + idTab);
		this.tabContent.addStyleName("tab-content");

		this.add(tabButton);
		this.add(tabTitle);
		this.add(tabContent);
	}

	public void add(Widget child) {
		super.add(child, getElement());
	}

	public void setWidget(IsWidget widget) {
		this.tabContent.setWidget(widget);
	}
}
