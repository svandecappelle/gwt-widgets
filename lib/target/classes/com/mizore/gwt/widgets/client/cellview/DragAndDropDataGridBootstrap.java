package com.mizore.gwt.widgets.client.cellview;

import com.github.gwtbootstrap.client.ui.DataGrid;
import com.github.gwtbootstrap.client.ui.CellTable.TableType;
import com.github.gwtbootstrap.client.ui.base.HasStyle;
import com.github.gwtbootstrap.client.ui.base.IsResponsive;
import com.github.gwtbootstrap.client.ui.base.ResponsiveHelper;
import com.github.gwtbootstrap.client.ui.base.StyleHelper;
import com.github.gwtbootstrap.client.ui.constants.Device;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.CssResource.ImportedWithPrefix;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;

/**
 * The Bootstrap style DataGrid
 * 
 * @since 2.0.4.0
 * @author ohashi keisuke
 * @param <T>
 *            the data type of each row
 */
public class DragAndDropDataGridBootstrap<T> extends DataGrid<T> implements HasStyle, IsResponsive {

    /**
     * Basic GWT-Bootstrap style Table Resource.
     * 
     * @author ohashi keisuke
     */
    public interface Resources extends com.google.gwt.user.cellview.client.DataGrid.Resources, DataGrid.Resources {

        @Override
        @Source(Style.DEFAULT_CSS)
        com.github.gwtbootstrap.client.ui.DataGrid.Style dataGridStyle();
    }

    /**
     * Selectable GWT-Bootstrap style Table Resource.
     * <p>
     * If select row,apply style. It focus to Basic TwBootstrap style. If you
     * use custom style,you should override @ Resources} like this.
     * </p>
     * 
     * @author ohashi keisuke
     *
     */
    public interface SelectableResources<T extends com.github.gwtbootstrap.client.ui.DataGrid.Style> extends Resources {

        @Override
        @Source(SelectableStyle.DEFAULT_CSS)
        T dataGridStyle();
    }

    @ImportedWithPrefix("gwt-bootstrap-dataGrid")
    public interface Style extends com.google.gwt.user.cellview.client.DataGrid.Style {

        String DEFAULT_CSS = "com/github/gwtbootstrap/client/ui/GwtBootstrapDataGrid.css";
    }

    @ImportedWithPrefix("gwt-bootstrap-dataGrid")
    public interface SelectableStyle extends com.google.gwt.user.cellview.client.DataGrid.Style {

        String DEFAULT_CSS = "com/github/gwtbootstrap/client/ui/GwtBootstrapDataGridSelectable.css";
    }

    private static final int DEFAULT_PAGESIZE = 50;
    private static Resources DEFAULT_RESOURCES;

    /**
     * Create the default loading indicator using the loading image in the
     * specified {@link Resources}.
     * 
     * @param resources
     *            the resources containing the loading image
     * @return a widget loading indicator
     */
    private static Widget createDefaultLoadingIndicator(Resources resources) {
        ImageResource loadingImg = resources.dataGridLoading();
        if (loadingImg == null) {
            return null;
        }
        Image image = new Image(loadingImg);
        image.getElement().getStyle().setMarginTop(30.0, Unit.PX);
        return image;
    }

    private static Resources getDefaultResources() {
        if (DEFAULT_RESOURCES == null) {
            DEFAULT_RESOURCES = GWT.create(Resources.class);
        }
        return DEFAULT_RESOURCES;
    }

    /**
     * Constructs a table with a default page size of 50.
     */
    public DragAndDropDataGridBootstrap() {
        this(DEFAULT_PAGESIZE);
    }

    /**
     * Constructs a table with the given page size.
     * 
     * @param pageSize
     *            the page size
     */
    public DragAndDropDataGridBootstrap(final int pageSize) {
        this(pageSize, getDefaultResources());
    }

    /**
     * Constructs a table with the given page size and the given
     * {@link ProvidesKey key provider}.
     * 
     * @param pageSize
     *            the page size
     * @param keyProvider
     *            an instance of ProvidesKey<T>, or null if the record object
     *            should act as its own key
     */
    public DragAndDropDataGridBootstrap(int pageSize, ProvidesKey<T> keyProvider) {
        this(pageSize, getDefaultResources(), keyProvider);
    }

    /**
     * Constructs a table with the given page size with the specified
     * {@link Resources}.
     * 
     * @param pageSize
     *            the page size
     * @param resources
     *            the resources to use for this widget
     */
    public DragAndDropDataGridBootstrap(int pageSize, Resources resources) {
        this(pageSize, resources, null);
    }

    /**
     * Constructs a table with the given page size, the specified
     * {@link Resources}, and the given key provider.
     * 
     * @param pageSize
     *            the page size
     * @param resources
     *            the resources to use for this widget
     * @param keyProvider
     *            an instance of ProvidesKey<T>, or null if the record object
     *            should act as its own key
     */
    public DragAndDropDataGridBootstrap(int pageSize, Resources resources, ProvidesKey<T> keyProvider) {
        this(pageSize, resources, keyProvider, createDefaultLoadingIndicator(resources));
    }

    /**
     * Constructs a table with the given page size, the specified
     * {@link Resources}, and the given key provider.
     * 
     * @param pageSize
     *            the page size
     * @param resources
     *            the resources to use for this widget
     * @param keyProvider
     *            an instance of ProvidesKey<T>, or null if the record object
     *            should act as its own key
     * @param loadingIndicator
     *            the widget to use as a loading indicator, or null to disable
     */
    public DragAndDropDataGridBootstrap(int pageSize, Resources resources, ProvidesKey<T> keyProvider, Widget loadingIndicator) {
        super(pageSize, resources, keyProvider, loadingIndicator);
    }

    /**
     * set Striped style
     * 
     * @param striped
     *            true:set false:remove
     */
    public void setStriped(boolean striped) {
        applyTableStyle(striped, TableType.STRIPED);
    }

    /**
     * set Bordered style
     * 
     * @param bordered
     *            true:set false:remove
     */
    public void setBordered(boolean bordered) {
        applyTableStyle(bordered, TableType.BORDERED);
    }

    /**
     * set Condensed style
     * 
     * @param condensed
     *            true:set false:remove
     */
    public void setCondensed(boolean condensed) {
        applyTableStyle(condensed, TableType.CONDENSED);
    }

    /**
     * set Hover style
     * 
     * @param hover
     *            true:set false:remove
     */
    public void setHover(boolean hover) {
        applyTableStyle(hover, TableType.HOVER);
    }

    private void applyTableStyle(boolean striped, TableType type) {
        if (striped) {
            getTableHeadElement().getParentElement().addClassName(type.get());
            getTableBodyElement().getParentElement().addClassName(type.get());
            getTableFootElement().getParentElement().addClassName(type.get());
        } else {
            getTableHeadElement().getParentElement().removeClassName(type.get());
            getTableBodyElement().getParentElement().removeClassName(type.get());
            getTableFootElement().getParentElement().removeClassName(type.get());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setShowOn(Device device) {
        ResponsiveHelper.setShowOn(this, device);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHideOn(Device device) {
        ResponsiveHelper.setHideOn(this, device);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setStyle(com.github.gwtbootstrap.client.ui.base.Style style) {
        StyleHelper.setStyle(this, style);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addStyle(com.github.gwtbootstrap.client.ui.base.Style style) {
        StyleHelper.addStyle(this, style);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeStyle(com.github.gwtbootstrap.client.ui.base.Style style) {
        StyleHelper.removeStyle(this, style);

    }
}
