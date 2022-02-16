//1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?

public class e1 {
    public static void main (String[] args){
        double distance = 10;
        double fullDistance = 0;

        for(int i = 1; i <= 7; i++){
            fullDistance += distance;
            distance += distance * 0.1;
            System.out.println("Day " + i + ", full distanse: " + fullDistance);
        }
    }
}
