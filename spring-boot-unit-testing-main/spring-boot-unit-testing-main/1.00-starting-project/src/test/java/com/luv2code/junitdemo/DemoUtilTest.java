package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
         demoUtils = new DemoUtils();
        System.out.println("Running Before Each method");
        System.out.println();
    }

    @Test
    @DisplayName("Equals And NotEquals")
    @Order(1)
    void test_Equals_And_Not_Equals(){
       // DemoUtils demoUtils = new DemoUtils();
        assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");
        System.out.println("Running testEqualsAndNotEquals");
    }

    @Test
    @DisplayName("Null and NotNull")
    @Order(3)
    void testNullAndNotNull(){
        //DemoUtils demoUtils = new DemoUtils();
        String str1 = null;
        String str2 = "mrinal";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
        System.out.println("Running testNullAndNotNull");
    }

    @DisplayName("Same and NotSame")
    @Test
    @Order(2)
    void testSameAndNotSame(){
        String str="Luv2Code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Object should refer same Object");
        assertNotSame(str,demoUtils.getAcademy(),"Object should not refer same Object");
    }

    @Test
    @DisplayName("True and False")
    @Order(20)
    void testTrueFalse(){
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
    }

    @Test
    @DisplayName("Array Equals")
    @Order(11)
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays Should be same");
    }

    @Test
    @DisplayName("Iterable Equals")
    @Order(6)
    void testIterableEquals(){
        List<String> theList  = List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"Expected List should be same");
    }

    @DisplayName("Line Match")
    @Test
    void testLineMatch(){
        List<String> theList  = List.of("luv","2","code");
        assertLinesMatch(theList,demoUtils.getAcademyInList(),"Line should match");
    }

    @Test
    @DisplayName("Throws and Does not Throws")
    void throwsAndDoesNotThrow() throws Exception {
        assertThrows(Exception.class,()->{demoUtils.throwException(-1);}, "should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(2);},"should not throw exception");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
            assertEquals(12, demoUtils.multiply(4,3),"4*3 must be 12");
    }
    @Test
    @DisplayName("Timeout")
    void testTimeout(){
        assertTimeout(Duration.ofSeconds(3), ()->demoUtils.checkTimeout(),"Message should be execute in 3 sec");
    }

   /* @AfterEach
    void setupAfterEach(){
        System.out.println("Running After Each Method");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeForEachClass(){
        System.out.println("@BeforeAll executes only once before all test methode execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all test methode execution in the class");
    }
*/
}
