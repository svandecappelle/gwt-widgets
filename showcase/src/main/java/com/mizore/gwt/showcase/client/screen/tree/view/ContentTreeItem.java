package com.mizore.gwt.showcase.client.screen.tree.view;


import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.InlineLabel;

public class ContentTreeItem extends FlowPanel {

    private InlineLabel label;
    private MultiStateCheckBox selection;

    public ContentTreeItem(String text) {
        label = new InlineLabel(text);
        selection = new MultiStateCheckBox();

        selection.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
        add(selection);
        add(label);
    }

    public MultiStateCheckBox getSelection() {
        return selection;
    }

}
