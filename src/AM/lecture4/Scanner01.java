package AM.lecture4;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // double height = sc.nextDouble();
        // boolean isS = sc.nextBoolean();


        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        System.out.println("이름: "+name+ "\t나이: "+age);
        sc.close();
    }
}