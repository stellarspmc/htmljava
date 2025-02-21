package fun.spmc.html.util;

public class HTMLColor {
    int r = 0;
    int g = 0;
    int b = 0;
    float a = 1;

    ///  #rrggbbaa
    HTMLColor(String hex) {
        String rh = hex.substring(1, 3);
        String gh = hex.substring(3, 5);
        String bh = hex.substring(5, 7);
        String ah = hex.substring(7, 9);

        r = Integer.parseInt(rh, 16);
        g = Integer.parseInt(gh, 16);
        b = Integer.parseInt(bh, 16);
        a = (float) (Integer.parseInt(ah, 16) / 255);
    }

    HTMLColor(int r, int g, int b, float a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    HTMLColor(double r, double g, double b, float a) {
        this.r = (int) (r * 255);
        this.g = (int) (g * 255);
        this.b = (int) (b * 255);
        this.a = a;
    }

    @Override
    public String toString() {
        return String.format("rgba(%d, %d, %d, %f)", r, g, b, a);
    }
}
