package com.mizore.gwt.widgets.client.container;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class SimpleTitledContainer extends Composite {

	private FlowPanel panel;
	private SimplePanel widgetContainer;
	private TitleWidget title;

	class TitleWidget extends Widget {
		public TitleWidget() {
			Element domElement = DOM.createElement("h1");
			super.setElement(domElement);
		}

		public void setText(String title) {
			getElement().setInnerText(title);
		}
	}

	public SimpleTitledContainer() {
		this.panel = new FlowPanel();
		this.widgetContainer = new SimplePanel();
		this.title = new TitleWidget();
		super.initWidget(panel);

		this.panel.addStyleName("SimpleTitleContainer");

		this.panel.add(title);
		this.panel.add(widgetContainer);
	}

	@Override
	public void setTitle(String title) {
		this.title.setText(title);
	}

	public void setContent(FlowPanel enseigneContainerWidgets) {
		this.widgetContainer.setWidget(enseigneContainerWidgets);
	}

	public void setContent(IsWidget widget) {
		this.widgetContainer.setWidget(widget);
	}
}
