// 12)В переменную присвойте какое-то число. Посчитайте сумму его цифр. Представим, что вводимое число неизвестно заранее.

import java.util.Scanner;

public class e12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Num: ");
        int a = in.nextInt();
        int sum = 0;
        int mult = 1;
        if(a < 0){
            a *= - 1; //делаем число положительным
        }
        while (a > 0){
            int num = a% 10;
            sum += num;
            mult *= num;
            a /= 10;
        }
        System.out.println("Sum of nums: " + sum);
    }
}
