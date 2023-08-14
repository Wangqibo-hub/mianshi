package com.example.demo.service;

import com.example.demo.dao.DemoRepository;
import com.example.demo.model.DemoAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public void add(Integer num1, Integer num2) {
        DemoAdd demoAdd = new DemoAdd();
        demoAdd.setNum1(num1);
        demoAdd.setNum2(num2);
        demoAdd.setSum(num1 + num2);
        demoRepository.add(demoAdd);
    }
}
