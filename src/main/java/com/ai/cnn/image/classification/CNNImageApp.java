package com.ai.cnn.image.classification;

import com.ai.cnn.image.classification.crud.controller.ImageController;
import com.ai.cnn.image.classification.crud.service.CNNClassifierService;

public class CNNImageApp {

	public static void main(String[] args) {
		ImageController controller = new ImageController();
		controller.runDemo();

		CNNClassifierService cnn = new CNNClassifierService();
		cnn.createCNNModel(); // Model creation
		System.out.println("CNN Model Initialized.");
	}
}