package fun.spmc.html.properties;

import fun.spmc.html.util.HTMLProperty;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class PropertyClass extends HTMLProperty {
    List<String> properties;

    public PropertyClass(String... properties) {
        this.properties = Arrays.asList(properties);
    }

    @Override
    public String getName() {
        return "class";
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i));
            if (i < properties.size() - 1) sb.append(" ");
        }

        return sb.toString();
    }
}
