package com.baoly.banner;

import com.baoly.banner.bean.Person;
import com.baoly.banner.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BannerApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private Student student;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(student);
    }

}
