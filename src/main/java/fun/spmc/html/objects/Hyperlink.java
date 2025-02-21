package fun.spmc.html.objects;

import fun.spmc.html.util.HTMLObject;
import fun.spmc.html.util.UDim2;
import lombok.*;

@Getter
public class Hyperlink extends HTMLObject {
    String href;

    @Builder
    public Hyperlink(String href, UDim2 position, UDim2 size) {
        super(position, size);
        this.href = href;
    }


    @Override
    protected String translate() {
        return "";
    }
}
