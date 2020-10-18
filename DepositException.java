public class DepositException extends Exception {
    public DepositException(String message) {
        super(message);
        System.out.println("Deposit Exception!");
    }
}

