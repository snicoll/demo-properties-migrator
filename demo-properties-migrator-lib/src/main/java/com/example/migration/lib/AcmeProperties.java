package com.example.migration.lib;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

@ConfigurationProperties("demo.acme")
public class AcmeProperties {

	/**
	 * Super useful target.
	 */
	private String target;

	/**
	 * Some counter.
	 */
	private int counter = 42;

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
