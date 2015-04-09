package com.mizore.gwt.widgets.client.menu;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.mizore.gwt.widgets.client.menu.locker.LockMenu;


public class DisclosureMenu extends LayoutPanel {
    
    LockMenu lockMenu;
    FlowPanel container;
    
    public DisclosureMenu() {
        lockMenu = new LockMenu();
        add(lockMenu);
        setWidgetTopHeight(lockMenu, 0, Unit.PX, 58, Unit.PX);
        setWidgetRightWidth(lockMenu, 0, Unit.PX, 58, Unit.PX);
        container = new FlowPanel();
        add(container);
        setWidgetTopBottom(container, 0, Unit.PX, 0, Unit.PX);
        setWidgetLeftRight(container, 0, Unit.PX, 0, Unit.PX);
        lockMenu.addClickHandler(new ClickHandler() {
            
            @Override
            public void onClick(ClickEvent event) {
                lockMenu.activate(!lockMenu.isActive());
                if (lockMenu.isActive()) {
                    DisclosureMenu.this.addStyleName("active");
                } else {
                  DisclosureMenu.this.removeStyleName("active");  
                }
            }
        });
        
        DisclosureMenu.this.addStyleName("active");
        lockMenu.activate(true);
    }
    
    public LockMenu getLockMenu() {
        return lockMenu;
    }
    
    public void addToContainer(IsWidget widget){
        this.container.add(widget);
    }
}
