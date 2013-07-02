package com.jumlabs.jumbpm.services;

import com.jumlabs.jumbpm.services.ExampleService;

import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
