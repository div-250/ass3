public class Atm {
    public void deposit(int amount) {
        System.out.println("Deposited $" + amount + " in cash");
    }


    public void deposit(String checkNumber, int amount) {
        System.out.println("Deposited $" + amount + " using check #" + checkNumber);
    }


    public void deposit(String phoneNumber, double amount) {
        System.out.println("Deposited $" + amount + " via mobile transfer from " + phoneNumber);
    }
}
