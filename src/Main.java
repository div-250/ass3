public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();


        atm.deposit(100);
        atm.deposit("CHK12345", 500);
        atm.deposit("+1234567890", 250.75);
    }
}