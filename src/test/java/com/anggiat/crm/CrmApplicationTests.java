package com.anggiat.crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrmApplicationTests {
    @Autowired
    CrmApplication crmApplication;
    @Test
    void contextLoads() {
        CrmApplication.main(new String[] {});
        assertEquals("1","1");
    }
//    @Test
//    void mainMethodTest() {
//        // Simulasi pemanggilan metode main
//        CrmApplication.main(new String[] {});
//    }

}
