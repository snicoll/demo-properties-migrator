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

	@DeprecatedConfigurationProperty(replacement = "demo.acme.target")
	@Deprecated
	public String getName() {
		return getTarget();
	}

	@Deprecated
	public void setName(String name) {
		setTarget(name);
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
