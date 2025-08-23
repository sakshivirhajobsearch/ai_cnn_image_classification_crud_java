package com.ai.cnn.image.classification.crud.controller;

import java.util.List;

import com.ai.cnn.image.classification.crud.model.ImageData;
import com.ai.cnn.image.classification.crud.service.ImageService;

public class ImageController {
	
	private final ImageService service = new ImageService();

	public void runDemo() {
		
		// CREATE
		String id1 = service.addImage("cat", "src/main/resources/image-dataset/cat/cat1.jpg");
		String id2 = service.addImage("dog", "src/main/resources/image-dataset/dog/dog1.jpg");

		// READ
		List<ImageData> all = service.getAllImages();
		all.forEach(image -> System.out.println(image.getId() + ": " + image.getLabel()));

		// UPDATE
		service.updateImage(id1, "cat", "src/main/resources/image-dataset/cat/cat2.jpg");

		// DELETE
		service.deleteImage(id2);
	}
}