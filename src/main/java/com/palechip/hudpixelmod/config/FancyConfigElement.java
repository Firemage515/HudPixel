/*******************************************************************************
 * HudPixel Reloaded (github.com/palechip/HudPixel), an unofficial Minecraft Mod for the Hypixel Network
 *
 * Copyright (c) 2014-2015 palechip (twitter.com/palechip) and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package com.palechip.hudpixelmod.config;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.client.config.GuiConfigEntries.IConfigEntry;

/**
 * A class for producing fancy config entries like DummyConfigElement but this one saves it's values.
 * Works pretty similarly but extends ConfigElement and doesn't just implement IConfigElement
 * @author palechip
 */
public class FancyConfigElement extends ConfigElement {
    protected String[] validValues;
    protected Object minValue;
    protected Object maxValue;
    protected Class<? extends IConfigEntry> configEntryClass;

    public FancyConfigElement(Property prop, String[] validValues) {
        super(prop);
        this.validValues = validValues;
    }
    
    public FancyConfigElement(Property prop, Object minValue, Object maxValue) {
        super(prop);
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
    
    public FancyConfigElement(Property prop, Object minValue, Object maxValue, Class<? extends IConfigEntry> configEntryClass) {
        this(prop, minValue, maxValue);
        this.configEntryClass = configEntryClass;
    }
    
    @Override
    public String[] getValidValues() {
        return this.validValues;
    }
    
    @Override
    public Object getMinValue() {
        return this.minValue;
    }
    
    @Override
    public Object getMaxValue() {
        return this.maxValue;
    }
    
    @Override
    public Class<? extends IConfigEntry> getConfigEntryClass() {
        return this.configEntryClass;
    }
}