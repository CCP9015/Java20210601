package car;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your car'id");
        String id = scan.next();
        Car c1 = new Car(id);

    }
}
