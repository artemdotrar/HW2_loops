//9) Реализация числа Фибоначчи

public class e9 {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + ", " + b + ", ");

        while (c < 1000000000) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }
    }
}
