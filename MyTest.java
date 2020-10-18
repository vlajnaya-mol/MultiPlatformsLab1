class MyTest {
    public static void main(String[] args) {

        System.out.println("Start working with deposits!\n");

        try {
            System.out.println("Try Saving Term Deposit!\n");
            SavingTermDeposit deposit = new SavingTermDeposit("My savings for emergency",
                    "USD",
                    10000, 17, false, 12);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            System.out.println();
        } catch (DepositException e) {
            System.out.println("Something went wrong!");
        }


        try {
            System.out.println("Try Saving Term Deposit with capitalization!\n");
            SavingTermDeposit deposit = new SavingTermDeposit("My savings for emergency with capitalization",
                    "USD",
                    10000, 17, true, 12);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.printDeposit();
            System.out.println();
        } catch (DepositException e) {
            System.out.println("Something went wrong!");
        }

        try {
            System.out.println("Try Expenses Term Deposit!\n");
            ExpensesTermDeposit deposit = new ExpensesTermDeposit("My day-to-day expenses",
                    "UAH",
                    20000, 6, false, 12);
            deposit.printDeposit();
            deposit.removeAmount(2000);
            deposit.waitMonths(1);
            deposit.printDeposit();
            deposit.removeAmount(5000);
            deposit.waitMonths(4);
            deposit.removeAmount(3000);
            deposit.printDeposit();
            System.out.println();
        } catch (DepositException e) {
            System.out.println("Something went wrong!");
        }


        try {
            System.out.println("Try Accumulative Term Deposit!\n");
            AccumulativeTermDeposit deposit = new AccumulativeTermDeposit("For future car",
                    "USD",
                    5000, 10, false, 24);
            deposit.printDeposit();
            deposit.waitMonths(2);
            deposit.addAmount(1500);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.addAmount(4000);
            deposit.printDeposit();
            deposit.waitMonths(2);
            deposit.printDeposit();
            System.out.println();
        } catch (DepositException e) {
            System.out.println("Something went wrong!");
        }


        try {
            System.out.println("Try Demand Deposit!\n");
            DemandDeposit deposit = new DemandDeposit("Just ordinary demand deposit",
                    "USD",
                    50000, 8, false);
            deposit.printDeposit();
            deposit.waitMonths(6);
            deposit.cancel();
            System.out.println();
        } catch (DepositException e) {
            System.out.println("Something went wrong!");
        }
    }
}