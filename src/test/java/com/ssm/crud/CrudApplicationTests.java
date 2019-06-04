package com.ssm.crud;

import com.ssm.crud.bean.Department;
import com.ssm.crud.dao.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired要使用的组件即可
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CrudApplicationTests {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 测试DepartmentMapper
     */
    @Test
    public void testCRUD() {
        //1.插入部门
        departmentMapper.insertSelective(new Department(null,"开发部"));
        departmentMapper.insertSelective(new Department(null,"测试部"));
    }

}
