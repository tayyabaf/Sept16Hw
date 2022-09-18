package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How is the weather today? (high, low, or humid)");
        String weather = input.next();
        if (weather.equalsIgnoreCase("high")) {
            System.out.println("Sunblock may be needed");
        } else if (weather.equalsIgnoreCase("low")) {
            System.out.println("A coat may be needed");
        } else if (weather.equalsIgnoreCase("humid")) {
            System.out.println("It's muggy");
        }
    }
}
