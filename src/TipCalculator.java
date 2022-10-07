public class TipCalculator {
    private int numOfPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numOfPeople, int tipPercentage) {
        this.numOfPeople = numOfPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return (tipPercentage / 100.0) * totalBillBeforeTip;
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numOfPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numOfPeople;
    }

    public double perPersonTotalCost() {
        return totalBill() / numOfPeople;
    }
}
