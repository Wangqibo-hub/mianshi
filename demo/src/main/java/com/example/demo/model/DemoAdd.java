package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.UUID;

@Data
@TableName("demo")
public class DemoAdd {
    @TableField
    private String id = UUID.randomUUID().toString();
    private Integer num1;
    private Integer num2;
    private Integer sum;
}
