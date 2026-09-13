package com.example.demo.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
    void hello_shouldReturnExpectedMessage() {
        HelloController controller = new HelloController();
        String response = controller.hello();
//        assertEquals("Hello from CI/CD Demo!", response);
        assertEquals("Wrong Message!", response);
    }

}
