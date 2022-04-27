package com.mizore.gwt.widgets.client.menu.themes;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource.NotStrict;

public enum MenuTheme {

	OPTIMIX_HEADER;

	private static ClientMenuBundleTheme bundle;
	private static final List<MenuTheme> injected = new ArrayList<MenuTheme>();

	interface ClientMenuBundleTheme extends ClientBundle {

		@Source("orange.css")
		@NotStrict
		CssMenuTheme themeOptimix();

	}

	public static ClientMenuBundleTheme getBundle() {

		if (bundle == null) {
			bundle = GWT.create(ClientMenuBundleTheme.class);
		}

		return bundle;
	}

	public CssMenuTheme get() {
		return this.getTheme(this, injected.contains(this));
	}

	private CssMenuTheme getTheme(MenuTheme menuTheme, boolean isInjected) {
		CssMenuTheme menuThemeResource = null;
		switch (menuTheme) {
		case OPTIMIX_HEADER:
			// Important : Inject CSS into DOM.
			menuThemeResource = getBundle().themeOptimix();
			break;

		default:
			break;
		}

		if (!isInjected && menuThemeResource != null) {
			menuThemeResource.ensureInjected();
			injected.add(this);
		}

		return menuThemeResource;
	}
}
