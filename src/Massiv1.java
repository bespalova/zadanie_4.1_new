/**
 * Created by Yuliya on 23.12.2014.
 */

import java.util.*;

public class Massiv1 {

    public static void main(String[] args) {

        System.out.println("Введите длину массива");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = "Иванов" + i;
        }

        String[] greetings = new String[n];
        for (int i = 0; i < n; i++) {
            greetings[i] = "Привет, " + names[i];
            System.out.println(greetings[i]);
        }


    }

}
