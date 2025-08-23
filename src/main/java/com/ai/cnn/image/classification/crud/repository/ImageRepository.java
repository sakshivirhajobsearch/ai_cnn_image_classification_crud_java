package com.ai.cnn.image.classification.crud.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.cnn.image.classification.crud.model.ImageData;

public class ImageRepository {
	private final Map<String, ImageData> store = new HashMap<>();

	public void save(ImageData image) {
		store.put(image.getId(), image);
	}

	public ImageData findById(String id) {
		return store.get(id);
	}

	public List<ImageData> findAll() {
		return new ArrayList<>(store.values());
	}

	public void delete(String id) {
		store.remove(id);
	}

	public void update(String id, ImageData updated) {
		store.put(id, updated);
	}
}