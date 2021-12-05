package com.baoly;

import com.baoly.bean.User;
import com.baoly.config.SpringMvcConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMvcConfig.class})
@WebAppConfiguration
public class UserTest {
    @Autowired
    private User user;

    @Test
    public void test1() {
        System.out.println(user);
    }
}
