package com.example.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Test
    public void contextLoads() {
        String systemProperty = "com.example.demo2.Demo2ApplicationTests.fail";
        System.out.println(getClass() + " fail if system property '" + systemProperty + "' is set to true");
        if (Boolean.valueOf(System.getProperty(systemProperty, "false"))) {
            throw new AssertionError("System property '" + systemProperty + "' set to true");
        }

        String environmentVariable = systemProperty.replace('.', '_').toUpperCase(Locale.US);
        System.out.println(getClass() + " fail if environment variable '" + environmentVariable + "' is set to true");
        if (Boolean.valueOf(System.getenv(environmentVariable))) {
            throw new AssertionError("Environment variable '" + environmentVariable + "' set to true");
        }
    }

}
