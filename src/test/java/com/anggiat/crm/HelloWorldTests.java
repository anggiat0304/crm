package com.anggiat.crm;

import com.anggiat.crm.controller.TestController;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldTests {

    @Autowired
    private TestController testController;

    @Test
     void testHelloWorld(){
        assertEquals("Hello World",testController.helloWorld().getBody());
    }
}
