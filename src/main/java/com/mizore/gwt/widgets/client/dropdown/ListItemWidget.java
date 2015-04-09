package com.mizore.gwt.widgets.client.dropdown;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.mizore.gwt.widgets.client.dropdown.events.HasSelectedItemHandler;
import com.mizore.gwt.widgets.client.dropdown.events.SelectedItemEvent;
import com.mizore.gwt.widgets.client.dropdown.events.SelectedItemHandler;

public class ListItemWidget<V> extends ComplexPanel implements HasSelectedItemHandler, TakesValue<V> {

	private Hyperlink hyperlink;
	private V value;

	public ListItemWidget(String text) {
		Element elem = DOM.createElement("li");
		this.setElement(elem);

		this.hyperlink = new Hyperlink();
		this.hyperlink.setText(text);
		this.add(hyperlink);

		this.addDomHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				fireEvent(new SelectedItemEvent());
			}
		}, ClickEvent.getType());
	}

	public ListItemWidget(String text, V value) {
		this(text);
		this.setValue(value);
	}

	public void add(Widget child) {
		super.add(child, getElement());
	}

	@Override
	public HandlerRegistration addSelectedItemHandler(SelectedItemHandler handler) {
		return addHandler(handler, SelectedItemEvent.getType());
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public void setValue(V value) {
		this.value = value;
	}
}
