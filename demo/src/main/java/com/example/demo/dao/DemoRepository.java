package com.example.demo.dao;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.DemoAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    private DemoMapper demoMapper;

    @Autowired
    public DemoRepository(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    public void add(DemoAdd add) {
        demoMapper.insert(add);
    }
}
