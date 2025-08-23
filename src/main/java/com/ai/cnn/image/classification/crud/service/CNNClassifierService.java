package com.ai.cnn.image.classification.crud.service;

import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.*;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.lossfunctions.LossFunctions;

public class CNNClassifierService {

	public MultiLayerNetwork createCNNModel() {

		MultiLayerConfiguration config = new NeuralNetConfiguration.Builder()
				.updater(new org.nd4j.linalg.learning.config.Adam(0.001)).list()
				.layer(new ConvolutionLayer.Builder(3, 3).nIn(1).nOut(16).stride(1, 1).activation(Activation.RELU)
						.build())
				.layer(new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX)
						.kernelSize(2, 2).stride(2, 2).build())
				.layer(new DenseLayer.Builder().nOut(64).activation(Activation.RELU).build())
				.layer(new OutputLayer.Builder(LossFunctions.LossFunction.NEGATIVELOGLIKELIHOOD).nOut(2) // e.g., cat vs
																											// dog
						.activation(Activation.SOFTMAX).build())
				.setInputType(org.deeplearning4j.nn.conf.inputs.InputType.convolutionalFlat(28, 28, 1)).build();

		return new MultiLayerNetwork(config);
	}
}