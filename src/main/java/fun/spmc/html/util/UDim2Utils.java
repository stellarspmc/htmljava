package fun.spmc.html.util;

public class UDim2Utils {
    public static UDim2 fromScale(float scaleX, float scaleY) {
        return new UDim2(scaleX, 0, scaleY, 0);
    }

    public static UDim2 fromOffset(int offsetX, int offsetY) {
        return new UDim2(0, offsetX, 0, offsetY);
    }
}
