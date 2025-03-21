package lecture4;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double height = sc.nextDouble();
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.printf("age = %d, height = %.2f\n", age, height);
        System.out.print("name = " + name);
        sc.close();
    }
}
