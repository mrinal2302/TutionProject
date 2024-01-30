package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {
    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest(){
         //execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testOnlyForJava11(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyForJava17(){
        //execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max = JRE.JAVA_17)
    void testOnlyForJavaRange(){
        //execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_9)
    void testOnlyForJavaRangeMin(){
        //execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Mrinal_ENV", matches = "DEV")
    void testOnlyForDevEnvironment(){
        //execute method and perform asserts
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Mrinal_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){
        //execute method and perform asserts
    }
}
