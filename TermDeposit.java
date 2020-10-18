public abstract class TermDeposit extends Deposit {
    private int months;

    TermDeposit(String name, String currency, double amount, double yearly_percents, boolean capitalization,
                int months) throws DepositException{
        super(name, currency, amount, yearly_percents, capitalization);
        if (months == 0 || months % 3 != 0)
            throw new DepositException("Wrong number of months!");
        this.months = months;
    }

    public void waitMonth() {
        super.waitMonth();
        if (this.duration % this.months == 0) {
            System.out.println("Deposit was continued!");
            this.amount += this.percents_cumm;
            this.percents_cumm = 0;
        }

    }

    public void printDeposit(){
        super.printDeposit();
        System.out.println("Term: " +  Integer.toString(this.months));
    }

    public double cancel() {
        System.out.println("Deposit " + name + " was cancelled!");
        double temp = this.amount;
        this.amount = 0;
        System.out.println("Got " + Double.toString(temp) + this.currency);
        return temp;
    }
}
