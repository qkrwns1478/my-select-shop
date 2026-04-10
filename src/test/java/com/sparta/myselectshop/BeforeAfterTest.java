package com.sparta.myselectshop;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {
    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트 코드가 실행되기 전에 수행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트 코드가 실행된 후에 수행");
    }

    @BeforeAll
    static void beforeAll() { // static으로 만들어야 함
        System.out.println("모든 테스트 코드가 실행되기 전에 최초로 수행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 수행된 후 마지막으로 수행");
    }

    @Nested
    @DisplayName("첫 번째 테스트")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Test1 {
        @Order(2)
        @Test
        @DisplayName("테스트 1-1")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Order(1)
        @Test
        @DisplayName("테스트 1-2")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @Nested
    @DisplayName("두 번째 테스트")
    class Test2 {
        @Test
        @DisplayName("테스트 2-1")
        void test1() {
            System.out.println("Test2.test1");
        }

        @Test
        @DisplayName("테스트 2-2")
        void test2() {
            System.out.println("Test2.test2");
        }
    }
}
