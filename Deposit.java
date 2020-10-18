public abstract class Deposit {
    protected boolean capitalization;
    protected String name;
    protected String currency;
    protected double yearly_percents;
    protected double amount;
    protected double percents_cumm;
    protected int duration = 0;
    protected String type;

    Deposit(String name, String currency, double amount, double yearly_percents, boolean capitalization) throws DepositException {

        if (amount <= 0 || yearly_percents >= 100 || yearly_percents <= 0) {
            throw new DepositException("Incorrect parameters for the deposit!");
        }
        System.out.println("Creating deposit " + name + "!");
        this.amount = amount;
        this.name = name;
        this.currency = currency;
        this.yearly_percents = yearly_percents;
        this.capitalization = capitalization;
    }

    public abstract double cancel();

    public void addAmount(double additional_amount) throws DepositException {
        throw new DepositException("This type of deposit does not support adding money!");
    }

    public void removeAmount(double retrieval_amount) throws DepositException {
        throw new DepositException("This type of deposit does not support money retrieval!");
    }

    public void waitMonths(int months) {
        System.out.println("Waiting " + Integer.toString(months) + " months!");
        for (int i = 0; i < months; i++)
            this.waitMonth();
    }

    public void printDeposit() {
        System.out.println("\nDeposit: " + this.name);
        System.out.println("Deposit type: " + this.type);
        System.out.println("Currency: " + this.currency);
        System.out.println("Capitalization: " + Boolean.toString(this.capitalization));
        System.out.println("Yearly percents: " + Double.toString(this.yearly_percents));
        System.out.println("Amount of money: " + Double.toString(this.amount));
        System.out.println("Accumulated money: " + Double.toString(this.percents_cumm));
        System.out.println("Duration: " +  Integer.toString(this.duration));
    }

    protected void waitMonth() {
        this.duration += 1;
        if (this.capitalization)
            this.percents_cumm += (this.amount + this.percents_cumm) * this.yearly_percents / 12 / 100;
        else
            this.percents_cumm += this.amount * this.yearly_percents / 12 / 100;
    }
}


