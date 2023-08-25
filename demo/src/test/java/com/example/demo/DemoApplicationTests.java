package com.example.demo;


import com.example.demo.service.DemoService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void should_add_success(){
        Integer sum = demoService.add(1, 1);
        Assertions.assertThat(sum).isEqualTo(2);
    }

}
