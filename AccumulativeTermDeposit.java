class AccumulativeTermDeposit extends TermDeposit {

    AccumulativeTermDeposit(String name, String currency, double amount,
                            double yearly_percents, boolean capitalization, int months) throws DepositException {
        super(name, currency, amount, yearly_percents, capitalization, months);
        this.type = "Accumulative Term Deposit";
    }

    public void addAmount(double additional_amount) throws DepositException {
        if (additional_amount <= 0) {
            throw new DepositException("You can only add positive amount of money!");
        }
        this.amount += additional_amount;
        System.out.println("Added " + Double.toString(additional_amount) + this.currency + " to " + this.name);
    }
}
