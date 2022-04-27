package com.mizore.gwt.widgets.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.mizore.gwt.widgets.client.dropdown.CssResourceDropDown;
import com.mizore.gwt.widgets.client.loader.CssResourceLoader;
import com.mizore.gwt.widgets.client.menu.CssResourceMenu;

public interface WidgetsBundle extends ClientBundle {

	public final static class Util {

		private static WidgetsBundle bundle;

		public static WidgetsBundle get() {

			if (bundle == null) {
				bundle = GWT.create(WidgetsBundle.class);

				// Important : Inject CSS into DOM.
				bundle.menu().ensureInjected();
				bundle.loader().ensureInjected();
				bundle.dropdown().ensureInjected();
			}

			return bundle;
		}

	}

	@Source("menu/menu.css")
	@NotStrict
	CssResourceMenu menu();
	
	@Source("loader/loader.css")
	@NotStrict
	CssResourceLoader loader();
	
	@Source("dropdown/dropdown.css")
	@NotStrict
	CssResourceDropDown dropdown();
}
