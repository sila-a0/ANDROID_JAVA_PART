package org.tensorflow.lite.examples.detection.tflite;
import android.content.res.AssetManager;

import java.io.IOException;

public class DetectorFactoryDinnerFood {
    public static NEW getDetector(
            final AssetManager assetManager,
            final String modelFilename)
            throws IOException {
        String labelFilename = "file:///android_asset/label.txt";
        boolean isQuantized = false;
        int inputSize = 0;
        int[] output_width = new int[]{0};
        int[][] masks = new int[][]{{0}};
        int[] anchors = new int[]{0};

//        if (modelFilename.equals("yolov5s.tflite")) {
//            labelFilename = "file:///android_asset/customclasses.txt";
//            isQuantized = false;
//            inputSize = 416;
//            output_width = new int[]{80, 40, 20};
//            masks = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
//            anchors = new int[]{
//                    10,13, 16,30, 33,23, 30,61, 62,45, 59,119, 116,90, 156,198, 373,326
//            };
//        }
        if (modelFilename.equals("YoloDinnerFood.tflite")) {
            labelFilename = "file:///android_asset/label.txt";
            isQuantized = false;
            inputSize = 416;
            output_width = new int[]{80, 40, 20};
            masks = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
            anchors = new int[]{
                    10,13, 16,30, 33,23, 30,61, 62,45, 59,119, 116,90, 156,198, 373,326
            };
        }

//        else if (modelFilename.equals("try.tflite")) {
//            labelFilename = "file:///android_asset/customclasses.txt";
//            isQuantized = false;
//            inputSize = 640;
//            output_width = new int[]{80, 40, 20};
//            masks = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
//            anchors = new int[]{
//                    10,13, 16,30, 33,23, 30,61, 62,45, 59,119, 116,90, 156,198, 373,326
//            };
//        }
//        else if (modelFilename.equals("best-fp16.tflite")) {
//            labelFilename = "file:///android_asset/customclasses.txt";
//            isQuantized = false;
//            inputSize = 416;
//            output_width = new int[]{40, 20, 10};
//            masks = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
//            anchors = new int[]{
//                    10,13, 16,30, 33,23, 30,61, 62,45, 59,119, 116,90, 156,198, 373,326
//            };
//        }
//        else if (modelFilename.equals("yolov5s-int8.tflite")) {
//            labelFilename = "file:///android_asset/customclasses.txt";
//            isQuantized = true;
//            inputSize = 416;
//            output_width = new int[]{40, 20, 10};
//            masks = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
//            anchors = new int[]{
//                    10,13, 16,30, 33,23, 30,61, 62,45, 59,119, 116,90, 156,198, 373,326
//            };
//        }
        return NEW.create(assetManager, modelFilename, labelFilename, isQuantized,
                inputSize);


    }
}
