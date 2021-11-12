package com.example.cicd;

import com.example.cicd.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdApplicationTests {

    @Test
    void contextLoads() {
        TestController controller = new TestController();
        System.out.println(controller.test());
    }

}
