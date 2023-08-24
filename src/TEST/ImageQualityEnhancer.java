//package TEST;
//import javax.media.jai.JAI;
//import javax.media.jai.PlanarImage;
//
//import java.awt.image.ImagingOpException;
//import java.io.File;
//import java.io.IOException;
//
//public class ImageQualityEnhancer {
//    public static void main(String[] args) {
//		String ip="C:\\Users\\nawar\\Downloads\\Programs\\image.png",op="C:\\Users\\nawar\\Downloads\\Programs\\imageO.png";
//
//
//        // Read the image using JAI
//        PlanarImage inputImage = JAI.create("fileload", ip);
//
//        // Enhance the image quality
//        PlanarImage enhancedImage = enhanceImageQuality(inputImage);
//
//        // Save the enhanced image
//        saveImage(enhancedImage, op);
//
//        System.out.println("Image quality enhancement completed.");
//    }
//
//    private static PlanarImage enhanceImageQuality(PlanarImage inputImage) {
//        // You can apply various image enhancement techniques here.
//        // For example, you can reduce noise, adjust brightness/contrast, etc.
//        // Below is just a simple example that copies the input image.
//
//        // If you have specific enhancement techniques in mind, you can apply them here.
//
//        return inputImage;
//    }
//
//    private static void saveImage(PlanarImage image, String outputImagePath) {
//        try {
//            // Save the image to the specified path
//            File outputFile = new File(outputImagePath);
//            JAI.create("filestore", image, outputFile.getAbsolutePath(), "png");
//        } catch (ImagingOpException e) {
//            e.printStackTrace();
//        }
//    }
//}
