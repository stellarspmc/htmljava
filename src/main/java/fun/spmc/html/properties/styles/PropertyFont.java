package fun.spmc.html.properties.styles;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyFont extends PropertyStyle {
    ArrayList<String> font;

    public PropertyFont(String... fonts) {
        this.font = (ArrayList<String>) Arrays.asList(fonts);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("font-family: ");
        for (int i = 0; i < font.size(); i++) {
            sb.append(font.get(i));
            if (i < font.size() - 1) sb.append(",");
        }
        sb.append(";");

        return sb.toString();
    }
}
