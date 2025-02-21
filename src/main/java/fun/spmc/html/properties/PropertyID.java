package fun.spmc.html.properties;

import fun.spmc.html.util.HTMLProperty;

public class PropertyID extends HTMLProperty {
    String properties;

    public PropertyID(String properties) {
        this.properties = properties;
    }

    @Override
    public String getName() {
        return "id";
    }

    @Override
    public String getValue() {
        return properties;
    }
}
