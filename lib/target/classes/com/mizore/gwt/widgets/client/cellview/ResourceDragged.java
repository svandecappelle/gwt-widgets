package com.mizore.gwt.widgets.client.cellview;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface ResourceDragged extends ClientBundle {

    static final String CSS_LOCATION = "com/mizore/gwt/widgets/client/cellview/draggedDatagrid.css";

    static final CssDraggedWidget INSTANCE = GWT.create(CssDraggedWidget.class);

    @Source(CSS_LOCATION)
    public CssDraggedWidget draggedWidget();
}
