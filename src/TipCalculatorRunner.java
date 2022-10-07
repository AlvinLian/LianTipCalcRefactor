import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group?: ");
        int numOfPeople = input.nextInt();

        System.out.print("What's the tip percentage? (0 - 100): ");
        int tipPercentage = input.nextInt();

        TipCalculator calc1 = new TipCalculator(numOfPeople, tipPercentage);

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost1 = input.nextDouble();
        calc1.addMeal(cost1);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost2 = input.nextDouble();
        calc1.addMeal(cost2);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost3 = input.nextDouble();
        calc1.addMeal(cost3);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost4 = input.nextDouble();
        calc1.addMeal(cost4);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost5 = input.nextDouble();
        calc1.addMeal(cost5);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost6 = input.nextDouble();
        calc1.addMeal(cost6);

        System.out.println("--------------------------------");

        System.out.printf("Total Bill Before Tip: %.2f.", calc1.getTotalBeforeTip());
        System.out.println();
        System.out.print("Tip Percentage: " + calc1.getTipPercentage());
        System.out.println();
        System.out.printf("Total Tip: %.2f.", calc1.tipAmount());
        System.out.println();
        System.out.printf("Total Bill With Tip: %.2f.", calc1.totalBill());
        System.out.println();
        System.out.printf("Per Person Before Tip: %.2f.", calc1.perPersonCostBeforeTip());
        System.out.println();
        System.out.printf("Tip Per Person: %.2f.", calc1.perPersonTipAmount());
        System.out.println();
        System.out.printf("Total Cost Per Person: %.2f.", calc1.perPersonTotalCost());
        System.out.println();
    }
}

