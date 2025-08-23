package com.ai.cnn.image.classification.crud.model;

public class ImageData {

	private String id;
	private String label; // e.g. "cat" or "dog"
	private String path;

	public ImageData(String id, String label, String path) {
		this.id = id;
		this.label = label;
		this.path = path;
	}

	// Getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}