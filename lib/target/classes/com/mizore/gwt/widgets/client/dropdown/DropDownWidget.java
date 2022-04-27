package com.mizore.gwt.widgets.client.dropdown;

import java.util.Collection;

import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Label;
import com.mizore.gwt.widgets.client.WidgetsBundle;
import com.mizore.gwt.widgets.client.dropdown.events.HasValueChangedHandler;
import com.mizore.gwt.widgets.client.dropdown.events.SelectedItemEvent;
import com.mizore.gwt.widgets.client.dropdown.events.SelectedItemHandler;
import com.mizore.gwt.widgets.client.dropdown.events.ValueChangedEvent;
import com.mizore.gwt.widgets.client.dropdown.events.ValueChangedHandler;

public class DropDownWidget<V> extends FocusPanel implements HasValueChangedHandler<V> {

    private ListWidget list;
    private Label label;

    private V selectedValue;
    private Renderer<V> renderer;

    private static final CssResourceDropDown css = WidgetsBundle.Util.get().dropdown();

    public DropDownWidget(Renderer<V> renderer) {
        this();
        this.renderer = renderer;
    }

    public DropDownWidget() {
        FlowPanel wrapper = new FlowPanel();
        this.add(wrapper);

        this.label = new Label();
        wrapper.add(this.label);

        this.label.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                toggleOpenClose();
            }
        });

        this.list = new ListWidget();
        this.list.getElement().getStyle().setZIndex(2);
        wrapper.add(this.list);

        this.setStyleName(css.dropdown());
        this.addBlurHandler(new BlurHandler() {

            @Override
            public void onBlur(BlurEvent event) {
                close();
            }
        });
    }

    public DropDownWidget(String label) {
        this();
        setLabelText(label);
    }

    public void addItem(V item) {
        this.addItem(new ListItemWidget<V>(this.renderer.render(item), item));
    }

    public void setAvailableItems(Collection<V> items) {
        this.clear();
        for (V item : items) {
            this.addItem(new ListItemWidget<V>(this.renderer.render(item), item));
        }
    }

    public void addItem(final ListItemWidget<V> item) {
        this.list.addItem(item);

        item.addSelectedItemHandler(new SelectedItemHandler() {

            @Override
            public void onSelectedItem(SelectedItemEvent event) {
                DropDownWidget.this.selectedValue = item.getValue();
                DropDownWidget.this.fireEvent(new ValueChangedEvent<V>(item.getValue()));
                toggleOpenClose();
                DropDownWidget.this.setLabelText(DropDownWidget.this.renderer.render(selectedValue));
            }
        });
    }

    public void toggleOpenClose() {
        if (DropDownWidget.this.getElement().hasClassName("open")) {
            DropDownWidget.this.removeStyleName("open");
        } else {
            DropDownWidget.this.addStyleName("open");
        }
    }

    public void close() {
        if (DropDownWidget.this.getElement().hasClassName("open")) {
            DropDownWidget.this.removeStyleName("open");
        }
    }

    public void open() {
        if (!DropDownWidget.this.getElement().hasClassName("open")) {
            DropDownWidget.this.addStyleName("open");
        }
    }

    @Override
    public HandlerRegistration addValueChangedHandler(ValueChangedHandler<V> handler) {
        return addHandler(handler, ValueChangedEvent.getType());
    }

    public V getSelectedValue() {
        return this.selectedValue;
    }

    public void setLabelText(String text) {
        this.label.setText(text);
    }

    public void setValue(V value) {
        DropDownWidget.this.selectedValue = value;
        DropDownWidget.this.setLabelText(DropDownWidget.this.renderer.render(selectedValue));
    }

    @Override
    public void clear() {
        list.clear();
    }

    public void setMaxHeightDropDown(Number value, Unit unit) {
        this.list.getElement().getStyle().setProperty("maxHeight", value.doubleValue(), unit);
        this.list.getElement().getStyle().setOverflowY(Overflow.AUTO);
    }

}
