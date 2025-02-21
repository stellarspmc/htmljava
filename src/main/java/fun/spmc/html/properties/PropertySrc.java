package fun.spmc.html.properties;

import fun.spmc.html.util.HTMLProperty;

public class PropertySrc extends HTMLProperty {
    String src;

    public PropertySrc(String src) {
        this.src = src;
    }

    @Override
    public String getName() {
        return "src";
    }

    @Override
    public String getValue() {
        return src;
    }
}
