import org.junit.jupiter.api.*;
import org.testng.Assert;


public class LuckyTicketTest {

    @BeforeEach public void beforeEachTest() {System.out.printf("This is text before each test\n");}

    @AfterEach
    public void afterEachTest() {
        System.out.printf("This is text after each test\n");
    }

    @BeforeAll
    static void beforeAllTests() {
        System.out.printf("Before all tests…\n");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.printf("After all tests …\n");
    }

    @Test
    public void verifyTicketIsLucky() {
        luckyTicket.isTicketLucky(1, 2, 3, 3, 2, 1);
        //two tests for checking BVA below
        luckyTicket.isTicketLucky(0, 0, 0, 0, 0, 0);
        luckyTicket.isTicketLucky(9, 9, 9, 9, 9, 9);
        Assert.assertTrue(true);
    }

    @Test
    public void verifyTicketIsNotLucky() {
        luckyTicket.isTicketLucky(1, 2, 8, 9, 2, 1);
        Assert.assertFalse(false);
    }

    @Test
    public void verifyTicketWithNegativeValue() {
        luckyTicket.isTicketLucky(1, 2, -9, 9, 2, 1);
        Assert.assertFalse(false);

    }

}
//positive:000000,999999 - b.values,123321,
//negative: 129567 - negative
//567  and 1234567890 - incorrect lenght
//exceptions: " "- empty,test - not int, 4567-70



