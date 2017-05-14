package net.michaltsis.paint;

/**
 * Color class
 */
class Color {
    // Field
    private int rgb;

    // Constructor
    public Color() {
        rgb = 0;
    }

    // Methods
    /**
     * @param r red  : 0 - 255. Cuts values beneath 0 to 0 and above 255 to 255
     * @param g green: 0 - 255. Cuts values beneath 0 to 0 and above 255 to 255
     * @param b blue : 0 - 255. Cuts values beneath 0 to 0 and above 255 to 255
     */
    public void setRGB(int r, int g, int b) {
        if (r > 255)
            r = 255;
        if (r < 0)
            r = 0;
        if (g > 255)
            g = 255;
        if (g < 0)
            g = 0;
        if (b > 255)
            b = 255;
        if (b < 0)
            b = 0;
        String sR = String.format("%08d", Integer.valueOf(Integer.toBinaryString(r)));
        String sG = String.format("%08d", Integer.valueOf(Integer.toBinaryString(g)));
        String sB = String.format("%08d", Integer.valueOf(Integer.toBinaryString(b)));
        String sRGB = sR + sG + sB; // red: 16 - 23; green: 8 - 15; blue: 0 - 7
        this.rgb = Integer.parseInt(sRGB, 2);
    }
    /**
     * @return returns integer value of 24 bit binary representation of RGB Value
     */
    public int getRGB() {
        return rgb;
    }
}