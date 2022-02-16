//10) Выведите на экран все положительные делители натурального числа
//11) Определить, является ли число простым

import java.util.Scanner;

public class e10e11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Num: ");
        int a = in.nextInt();
        boolean isSimple = true;

        for (int i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.print(i + ", ");
                if(i != 1 && i != a){
                    isSimple = false;
                }
            }
        }
        if(isSimple){
            System.out.println("\n" + a + " is Simple");
        }
        else {
            System.out.println("\n" + a + " is not Simple");
        }

    }
}
