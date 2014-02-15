package org.gwtbootstrap3.client.ui.base.mixin;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.user.client.ui.UIObject;

/**
 * @author godi
 */
public class AttributeMixin<T extends UIObject> extends AbstractMixin {

    public AttributeMixin(final T uiObject) {
        super(uiObject);
    }

    public void setAttribute(final String attributeName, final String attributeValue) {
        uiObject.getElement().setAttribute(attributeName, attributeValue);
    }

    public String getAttribute(final String attributeName) {
        return uiObject.getElement().getAttribute(attributeName);
    }

    public void removeAttribute(final String attributeName) {
        uiObject.getElement().removeAttribute(attributeName);
    }
}