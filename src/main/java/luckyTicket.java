//Написать юнит тесты для счастливого билета(используя техники тест-дизайна):
//- с использованием TestNg
//- с использованием Junit 5
public class luckyTicket {

    public static boolean isTicketLucky(int a, int b, int c, int x, int y, int z) {
        if (a + b + c == x + y +z) {
            System.out.println("Ticket is lucky");
            return true;
        } else {
            System.out.println("Incorrect value. Try again, please");
            return false;
        }
    }
}