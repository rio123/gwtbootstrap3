package com.svenjacobs.gwtbootstrap3.client.ui.constants;

import com.google.gwt.dom.client.Style;

/**
 * @author Sven Jacobs
 */
public enum ColumnSize implements Size, Style.HasCssName {
    // Extra small devices (<768px)
    XS_1("col-1"),
    XS_2("col-2"),
    XS_3("col-3"),
    XS_4("col-4"),
    XS_5("col-5"),
    XS_6("col-6"),
    XS_7("col-7"),
    XS_8("col-8"),
    XS_9("col-9"),
    XS_10("col-10"),
    XS_11("col-11"),
    XS_12("col-12"),

    // Small devices (>768px)
    SM_1("col-sm-1"),
    SM_2("col-sm-2"),
    SM_3("col-sm-3"),
    SM_4("col-sm-4"),
    SM_5("col-sm-5"),
    SM_6("col-sm-6"),
    SM_7("col-sm-7"),
    SM_8("col-sm-8"),
    SM_9("col-sm-9"),
    SM_10("col-sm-10"),
    SM_11("col-sm-11"),
    SM_12("col-sm-12"),

    // Medium (>992px) to large devices (>1200px)
    LG_1("col-lg-1"),
    LG_2("col-lg-2"),
    LG_3("col-lg-3"),
    LG_4("col-lg-4"),
    LG_5("col-lg-5"),
    LG_6("col-lg-6"),
    LG_7("col-lg-7"),
    LG_8("col-lg-8"),
    LG_9("col-lg-9"),
    LG_10("col-lg-10"),
    LG_11("col-lg-11"),
    LG_12("col-lg-12");

    private final String cssClass;

    private ColumnSize(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }
}