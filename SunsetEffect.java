public class SunsetEffect {
    public static void main(String[] args) {
        Picture pic = new Picture("input.jpg");
        for (int row = 0; row < pic.getHeight(); row++) {
            for (int col = 0; col < pic.getWidth(); col++) {
                Pixel pixel = pic.getPixel(col, row);
                int red = pixel.getRed();
                int newRed = (int) (red * 1.3);
                if (newRed > 255) {
                    newRed = 255;
                }
                pixel.setRed(newRed);
            }
        }
        pic.show();
        pic.write("output.jpg");
    }
}

