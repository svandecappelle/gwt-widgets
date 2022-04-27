package com.mizore.gwt.widgets.client.selector;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class Selector extends Composite {

	private FieldsetContainer selectorContainer;

	private final String idDom;

	private final class FieldsetContainer extends ComplexPanel {

		private final class TitleFieldSet extends Widget implements HasText {
			private Element legend;

			public TitleFieldSet() {
				this.legend = DOM.createLegend();
				this.setElement(legend);
			}

			@Override
			public String getText() {
				return this.legend.getInnerText();
			}

			@Override
			public void setText(String text) {
				this.legend.setInnerText(text);
			}

		}

		private TitleFieldSet legend;
		private Element fieldSet;

		public FieldsetContainer(String title) {
			this.fieldSet = DOM.createFieldSet();
			this.legend = new TitleFieldSet();
			this.legend.setText(title);

			this.setElement(fieldSet);
			this.add(legend);
			
			fieldSet.addClassName("switch");
		}

		@Override
		public void add(Widget child) {
			super.add(child, getElement());
		}
	}

	public Selector(String selectorTitle) {
		SimplePanel container = new SimplePanel();
		initWidget(container);
		this.idDom = DOM.createUniqueId();
		this.selectorContainer = new FieldsetContainer(selectorTitle);
		container.setWidget(selectorContainer);
	}

	public void addOption(SelectOption option) {
		this.selectorContainer.add(option);
		option.setGroup(idDom);
	}

}
