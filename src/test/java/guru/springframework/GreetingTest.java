package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void  beforeAllClass() {
        System.out.println("In BeforeALL ********** ...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each...");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After each...");
    }

    @AfterAll
    public static void  afterAllClass() {
        System.out.println("In After ALL ********** ...");
    }
}