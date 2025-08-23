package com.ai.cnn.image.classification.crud.service;

import java.util.List;
import java.util.UUID;

import com.ai.cnn.image.classification.crud.model.ImageData;
import com.ai.cnn.image.classification.crud.repository.ImageRepository;

public class ImageService {
	private final ImageRepository repository = new ImageRepository();

	public String addImage(String label, String path) {
		String id = UUID.randomUUID().toString();
		ImageData image = new ImageData(id, label, path);
		repository.save(image);
		return id;
	}

	public List<ImageData> getAllImages() {
		return repository.findAll();
	}

	public ImageData getImage(String id) {
		return repository.findById(id);
	}

	public void updateImage(String id, String label, String path) {
		repository.update(id, new ImageData(id, label, path));
	}

	public void deleteImage(String id) {
		repository.delete(id);
	}
}