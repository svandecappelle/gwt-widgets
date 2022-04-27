package com.mizore.gwt.widgets.client.selector;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

public final class SelectOption extends ComplexPanel implements HasText {

	private final class OptionSwitcher extends RadioButton {

		public OptionSwitcher(String name, String text) {
			super(name, text);
			this.setStyleName("option");
		}

	}

	private String idGroup;
	private OptionSwitcher optionSwitcher;

	public SelectOption(String option) {
		this.setElement((Element) DOM.createDiv());
		this.setStyleName("option");
		this.optionSwitcher = new OptionSwitcher(idGroup, option);
		this.add(optionSwitcher);
	}

	public void setGroup(String name) {
		this.idGroup = name;
	}

	@Override
	public void add(Widget child) {
		super.add(child, getElement());
	}

	@Override
	public String getText() {
		return this.optionSwitcher.getText();
	}

	@Override
	public void setText(String text) {
		this.optionSwitcher.setText(text);
	}

}
