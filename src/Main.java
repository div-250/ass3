public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();


        Atm.deposit(100);
        Atm.deposit("CHK12345", 500);
        Atm.deposit("+1234567890", 250.75);
    }
}