package com.example.migration.lib;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("demo.acme")
public class AcmeProperties {

	/**
	 * Super useful name.
	 */
	private String name;

	/**
	 * Some counter.
	 */
	private int counter = 42;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
