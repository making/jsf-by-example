package org.javaserverfaces.chapter03;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

/**
 * A Simple JSF Application
 * 
 * @author juneau
 */
@Named(value = "helloWorldController")
@Scope("session")
public class HelloWorldController implements Serializable {
	private String hello;

	/**
	 * Creates a new instance of HelloWorldController
	 */
	public HelloWorldController() {
		hello = "Hello World";
	}

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello
	 *            the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
}
