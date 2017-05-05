class Color {
    private int rgb;
    public Color() {
	rgb = 0;
    }
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
	String sRGB = sR + sG + sB;
	this.rgb = Integer.parseInt(sRGB, 2);
    }
    public int getRGB() {
	return rgb;
    }
}
