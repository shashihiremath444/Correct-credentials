package confirmtkt;

public class ConfirmTicket extends BaseClass {

    public static void main(String[] args) throws InterruptedException {
        ConfirmTicket confirmTicket = new ConfirmTicket();
        confirmTicket.setUp();

        try {
            LoginPage loginPage = new LoginPage(confirmTicket.driver);
            loginPage.openLoginPage();
            loginPage.login("your_mobile_number");

            SearchPage searchPage = new SearchPage(confirmTicket.driver);
            searchPage.selectDestinations();

            BookingPage bookingPage = new BookingPage(confirmTicket.driver);
            bookingPage.selectTrainAndClass();
            bookingPage.enterPassengerDetails();
            bookingPage.proceedToPayment();
        } finally {
            confirmTicket.tearDown();
        }
    }
}
