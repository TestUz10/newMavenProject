import org.testng.Assert;
import org.testng.annotations.*;

public class LuckyTicketNG {
    @DataProvider(name = "digits")
    public static Object[][] ticketDigits() {
        return new Object[][]{
                {1, 2, 3, 3, 2, 1},
        };
    };

    @Test(dataProvider = "digits")
    public static void isTicketLucky(int d1, int d2, int d3, int d4, int d5, int d6) {
        Assert.assertTrue(luckyTicket.isTicketLucky(1, 2, 3, 3, 2, 1));
        Assert.assertFalse(luckyTicket.isTicketLucky(2, 3, 4, 51, 3, 4));
        Assert.assertFalse(luckyTicket.isTicketLucky(2, 2, 3, 4, 1, -2));
    }

    @BeforeTest
    public void beforeEachTest() {
        System.out.printf("This is text before each test\n");
    }

    @AfterTest
    public void afterEachTest() {
        System.out.printf("This is text after each test\n");
    }

    @BeforeClass
    public void beforeAllTests() {
        System.out.printf("Before all tests …\n");
    }

    @AfterClass
    public void afterAllTests() {
        System.out.printf("After all tests …\n");
    }


}

