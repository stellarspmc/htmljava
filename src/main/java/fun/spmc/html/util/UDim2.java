package fun.spmc.html.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UDim2 {
    float scaleX;
    int offsetX;
    float scaleY;
    int offsetY;

    public void add(UDim2 uDim) {
        scaleX += uDim.scaleX;
        offsetX += uDim.offsetX;
        scaleY += uDim.scaleY;
        offsetY += uDim.offsetY;
    }

    public void subtract(UDim2 uDim) {
        scaleX -= uDim.scaleX;
        offsetX -= uDim.offsetX;
        scaleY -= uDim.scaleY;
        offsetY -= uDim.offsetY;
    }
}
