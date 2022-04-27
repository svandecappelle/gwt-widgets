package com.mizore.gwt.widgets.client.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.mizore.gwt.widgets.client.WidgetsBundle;
import com.mizore.gwt.widgets.client.menu.events.VisibilityChangedEvent;
import com.mizore.gwt.widgets.client.menu.events.VisibilityChangedHandler;
import com.mizore.gwt.widgets.client.menu.themes.MenuTheme;

/**
 * @author svandecappelle
 *
 *         A Navigation HTML5 container.
 */
public class NavContainer extends AbsolutePanel {

	/**
	 * @author svandecappelle
	 *
	 *         State of the menu.
	 */
	private enum State {
		ACTIVE, INACTIVE;
	}

	// The menu items container.
	private HtmlMenu htmlMenu;
	// Weather the menu is hiding in automatic mode.
	private boolean autoHide = false;
	// State of items.
	private Map<MenuItem, State> stateItems;

	// Css Resources
	private static final CssResourceMenu css = WidgetsBundle.Util.get().menu();

	// Constants
	private static final String ACTIVE = "active";
	private static final String ELEMENT = "nav";

	/**
	 * Constructor using ElementTag.
	 * 
	 * @param navElement
	 *            the element to create menu into.
	 */
	protected NavContainer(Element navElement) {
		super(navElement);
		this.stateItems = new HashMap<MenuItem, State>();
		this.htmlMenu = new HtmlMenu();
		super.add(this.htmlMenu);

		this.addStyleName(css.menu());
	}

	/**
	 * Default Constructor.
	 */
	public NavContainer() {
		this(DOM.createElement(ELEMENT));
		// create a NAV html5 DOM element.
	}

	/**
	 * Add an item to menu.
	 * 
	 * @param item
	 *            the item to add.
	 */
	public void addItem(final MenuItem item) {
		this.htmlMenu.addItem(item);
		item.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {

				NavContainer.this.desactivateAll();

				if (!autoHide) {
					item.activate(!item.isActive());
					NavContainer.this.activate(true);
				} else {
					item.activate(!item.isActive());
					NavContainer.this.activate(item.isActive());
				}

				NavContainer.this.stateItems.put(item, item.isActive() ? State.ACTIVE : State.INACTIVE);
			}
		});
		this.stateItems.put(item, State.INACTIVE);
	}

	/**
	 * Deactivate all menuItems.
	 */
	public void desactivateAll() {
		for (Entry<MenuItem, State> itemsInNavBar : this.stateItems.entrySet()) {
			itemsInNavBar.setValue(State.INACTIVE);
			itemsInNavBar.getKey().activate(false);
		}
	}

	/**
	 * Activate the menu. (adding css 'active')
	 * 
	 * @param activate
	 *            <code>true</code> to activate <code>false</code> else.
	 */
	public void activate(boolean activate) {
		if (this.getElement().hasClassName(ACTIVE) && !activate) {
			this.removeStyleName(ACTIVE);
			fireEvent(new VisibilityChangedEvent(activate));
		} else if (!this.getElement().hasClassName(ACTIVE) && activate) {
			this.addStyleName(ACTIVE);
			fireEvent(new VisibilityChangedEvent(activate));
		}
	}

	/**
	 * Add Visibility changed Handler.
	 * 
	 * @param handler
	 *            the handler to attach to event.
	 * 
	 * @return an HandlerRegistration.
	 */
	public HandlerRegistration addOnVisibilityChanged(VisibilityChangedHandler handler) {
		return addHandler(handler, VisibilityChangedEvent.getType());
	}

	public void setTheme(MenuTheme header) {
		this.addStyleName(header.get().menu());
	}

	public void addItem(IsWidget widget) {
		this.htmlMenu.add(widget);
	}
	
	@Override
	public void clear() {
		htmlMenu.clear();
	}
}
