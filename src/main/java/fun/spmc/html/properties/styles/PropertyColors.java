package fun.spmc.html.properties.styles;

import fun.spmc.html.util.HTMLColor;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyColors extends PropertyStyle {
    HTMLColor color;

    public PropertyColors(HTMLColor color) {
        this.color = color;
    }

    @Override
    public String getValue() {
        return "color: " + color.toString() + ";";
    }
}
