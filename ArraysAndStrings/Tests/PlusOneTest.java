import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    @Test
    public void test_JUnit() {
        System.out.println("This is a testcase in this class");
        String str1 = "I do not match expected";
        assertEquals("This is a testcase in this class", str1);
    }

}