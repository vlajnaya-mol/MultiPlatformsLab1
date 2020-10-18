class ExpensesTermDeposit extends TermDeposit {

    ExpensesTermDeposit(String name, String currency, double amount,
                        double yearly_percents, boolean capitalization, int months) throws DepositException {
        super(name, currency, amount, yearly_percents, capitalization, months);
        this.type = "Expenses Term Deposit";
    }

    public void removeAmount(double retrieval_amount) throws DepositException {
        if (retrieval_amount <= 0) {
            throw new DepositException("You can only remove positive amount of money!");
        }
        this.amount -= retrieval_amount;
        System.out.println("Removed " + Double.toString(retrieval_amount) + this.currency + " from " + this.name);
    }

    public void addAmount(double additional_amount) throws DepositException {
        if (additional_amount <= 0) {
            throw new DepositException("You can only add positive amount of money!");
        }
        this.amount += additional_amount;
        System.out.println("Added " + Double.toString(additional_amount) + this.currency + " to " + this.name);
    }
}
