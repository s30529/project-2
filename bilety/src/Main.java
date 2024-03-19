import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String location = getString("Location");
        String weekday = getString("Weekday");
        int age = getInt("Age");

        display(location, weekday, age);
    }

    public static void display(String location, String weekday, int age) {
        double discount = getDiscount(location, weekday, age);
        double price = getPrice(discount);

        System.out.println(
                "Data: "
                        + location + ", "
                        + age + " years old, "
                        + weekday + ", Price: "
                        + price + "\ndiscount: " + discount*100 + "%"
        );
    }

    public static double getPrice(double discount) {
        return 40 - (40*discount);
    }

    public static double getDiscount(String location, String weekday, int age) {
        if(age < 10 || weekday.equalsIgnoreCase("Thursday"))
            return 1;

        double discount = 0;

        if(age <= 18)
            discount = 0.5;

        if(location.equalsIgnoreCase("Warsaw"))
            discount += 0.1;

        return discount;
    }

    public static String getString(String dataname) {
        System.out.println("Enter " + dataname + ": ");
        return scanner.nextLine();
    }

    public static int getInt(String dataname) {
        System.out.println("Enter " + dataname + ": ");
        return scanner.nextInt();
    }

}