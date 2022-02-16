//8)Нарисовать пирамидки в консоли

import java.util.Scanner;

public class e8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("pyramid height: ");
        int height = in.nextInt();

        for(int i = 1; i <= height; i++){
            int currentWidth = 0;
            while (currentWidth < i){
                System.out.print("*");
                currentWidth++;
            }
        }

        System.out.println();
        for(int i = height; i >=0; i--){
            int currentWigthSpace = 0;
            int currentWidth = 0;

            while (currentWigthSpace < height - i){
                System.out.print(" ");
                currentWigthSpace++;
            }

            while (currentWidth < i)
            {
                System.out.print("*");
                currentWidth++;
            }

            System.out.println();
        }
    }
}
