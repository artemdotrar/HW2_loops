//4)Составьте программу, вычисляющую A*B, не пользуясь операцией
//умножения.

import java.util.Scanner;

public class e4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c = 0;

        System.out.print("A = ");
        a = in.nextInt();
        System.out.print("B = ");
        b = in.nextInt();

        for (int i = 0; i < b; i++){
            c+= a;
        }

        System.out.println (a + " * " + b + " = " + c);

    }
}
