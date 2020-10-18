class DemandDeposit extends Deposit {

    DemandDeposit(String name, String currency, double amount,
                  double yearly_percents, boolean capitalization) throws DepositException {
        super(name, currency, amount, yearly_percents, capitalization);
        this.type = "Demand Deposit";
    }

    public double cancel() {
        System.out.println("Deposit " + name + " was cancelled!");
        double temp = this.amount + this.percents_cumm;
        this.amount = 0;
        System.out.println("Got " + Double.toString(temp) + this.currency);
        return temp;
    }
}
