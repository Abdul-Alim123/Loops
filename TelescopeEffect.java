public class TelescopeEffect {
    public static void main(String[] args) {
        Picture pic = new Picture("input.jpg");
        int width = pic.getWidth();
        int height = pic.getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = (int) (0.4 * Math.min(width, height));

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int dx = col - centerX;
                int dy = row - centerY;
                if (dx * dx + dy * dy > radius * radius) {
                    Pixel pixel = pic.getPixel(col, row);
                    pixel.setRed(0);
                    pixel.setGreen(0);
                    pixel.setBlue(0);
                }
            }
        }
        pic.show();
        pic.write("output.jpg");
    }
}
