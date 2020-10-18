class SavingTermDeposit extends TermDeposit {

    SavingTermDeposit(String name, String currency, double amount,
                      double yearly_percents, boolean capitalization, int months) throws DepositException {
        super(name, currency, amount, yearly_percents, capitalization, months);
        this.type = "Saving Term Deposit";
    }
}
