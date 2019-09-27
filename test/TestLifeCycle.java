import org.junit.jupiter.api.*;

public class TestLifeCycle {
    @BeforeAll
    public static void initAll(){
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init(){
        System.out.println("Before each test");
    }

    @Test
    void testDemoMethod1(){
        System.out.println("The 1st test");
    }

    @Test
    void testDemoMethod2(){
        System.out.println("The 2st test");
    }

    @BeforeEach
    void tearDown(){
        System.out.println("After each test");
    }

    @AfterAll
    public static void tearAll(){
        System.out.println("After all tests");
    }
}
