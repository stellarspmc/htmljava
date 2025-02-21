package fun.spmc.html.util;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public abstract class HTMLObject {
    final List<Class<? extends HTMLProperty>> properties = new ArrayList<>();
    UDim2 position;
    UDim2 size;

    protected abstract String translate();

    @SafeVarargs
    public final void addProperties(Class<? extends HTMLProperty>... property) {
        properties.addAll(Arrays.asList(property));
    }
}
