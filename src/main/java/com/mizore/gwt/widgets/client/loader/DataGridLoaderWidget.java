package com.mizore.gwt.widgets.client.loader;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.mizore.gwt.widgets.client.WidgetsBundle;

public class DataGridLoaderWidget extends FlowPanel {

    private CssResourceLoader css = WidgetsBundle.Util.get().loader();

    public DataGridLoaderWidget() {
        SimplePanel first = new SimplePanel();
        SimplePanel second = new SimplePanel();
        SimplePanel third = new SimplePanel();

        first.setStyleName(css.simpleLoaderDotLine());
        second.setStyleName(css.simpleLoaderDotLine());
        third.setStyleName(css.simpleLoaderDotLine());

        first.addStyleName(css.first());
        second.addStyleName(css.second());
        third.addStyleName(css.third());

        this.add(first);
        this.add(second);
        this.add(third);

        this.setStyleName(css.simpleLoaderDot());
    }
}
