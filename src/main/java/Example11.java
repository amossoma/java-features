import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.MultiResolutionImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<Image> images = prepareImages();

        MultiResolutionImage multiResolutionImage = new BaseMultiResolutionImage(images.toArray(new Image[0]));

        List<Image> variants = multiResolutionImage.getResolutionVariants();
        System.out.println("Number of variants" + variants.size());
        System.out.println("Variants list:");
        variants.stream().forEach(System.out::println);

        // get a resolution-specific image variant for each indicated size
        showVariantForResolution(multiResolutionImage, 1280, 960);
        showVariantForResolution(multiResolutionImage, 720, 480);
        showVariantForResolution(multiResolutionImage, 600, 400);
        showVariantForResolution(multiResolutionImage, 320, 240);
        showVariantForResolution(multiResolutionImage, 240, 160);
    }

    private static void showVariantForResolution(MultiResolutionImage multiResolutionImage, int width, int height) {
        Image variant = multiResolutionImage.getResolutionVariant(width, height);
        System.out.println(String.format("Image for resoultion[%d,%d]: [%d,%d]", width, height, variant.getWidth(null),variant.getHeight(null)));
    }

    private static List<Image> prepareImages() {
        List<String> imgUrls = List.of(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg/313px-Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg/392px-Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg/501px-Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg/669px-Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/96/Berlin_-_Berliner_Fernsehturm_-_Fensterreinigung.jpg");

        return imgUrls.stream().map(url -> {
            try {
                return ImageIO.read(new URL(url));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }
}
