import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice,
                                                 double tipRate,
                                                 double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static double employeesSalary(double numHours, double dollarPerHour, int vacationDays) {
        if (numHours < 0) {
            return -1;
        }
        if (dollarPerHour < 0) {
            return -1;
        }
        double result1 = numHours * dollarPerHour;
        double unpaidTime = vacationDays * dollarPerHour * 8;
        return (result1 * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");

        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

        double result = Math.pow(2, 5);
        System.out.println(result);

        System.out.println(Math.max(2, 5));

        double salary = employeesSalary(40, 15, 8);
        System.out.println(salary);
    }

}
