package com.mizore.gwt.widgets.client.loader;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.mizore.gwt.widgets.client.WidgetsBundle;

public class LoaderWidget extends FlowPanel {

	private CssResourceLoader css = WidgetsBundle.Util.get().loader();

	private static ArrayList<String> circlesSyles;

	private static final String FIRST = "first";
	private static final String SECOND = "second";
	private static final String THIRD = "third";
	private static final String FOURTH = "fourth";
	private static final String FIFTH = "fifth";

	static {
		circlesSyles = new ArrayList<String>();
		circlesSyles.add(FIRST);
		circlesSyles.add(SECOND);
		circlesSyles.add(THIRD);
		circlesSyles.add(FOURTH);
		circlesSyles.add(FIFTH);
	}

	public LoaderWidget() {
		FlowPanel loader = new FlowPanel();
		for (String circle : circlesSyles) {
			SimplePanel circleWidget = new SimplePanel();
			circleWidget.addStyleName(css.circle());
			circleWidget.addStyleName(circle);
			loader.add(circleWidget);
		}

		loader.addStyleName(css.loader());
		this.add(loader);
		this.addStyleName(css.fullscreenLoaderContainer());
	}
}
