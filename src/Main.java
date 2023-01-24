import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static void Task1() {
        System.out.println("Задача №1");
        int[] dailyMeal = new int[3];
        dailyMeal[0] = 1;
        dailyMeal[1] = 2;
        dailyMeal[2] = 3;
        double[] interestRate = {1.57, 7.654, 9.986};
        int[] year = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,};
    }

    public static void Task2() {
        System.out.println("Задача №2");
        int[] dailyMeal = {1, 2, 3};
        double[] interestRate = {1.57, 7.654, 9.986};
        int[] year = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,};

        for (int i = 0; i < dailyMeal.length; i++) {
            System.out.print(dailyMeal[i]);
            if (i != dailyMeal.length - 1) {
                System.out.print(". ");
            }
        }
        System.out.println();
        for (int i = 0; i < interestRate.length; i++) {
            System.out.print(interestRate[i]);
            if (i != interestRate.length - 1) {
                System.out.print(". ");


            }
        }
        System.out.println();
        for (int i = 0; i < year.length; i++) {
            System.out.print(year[i]);
            if (i != year.length - 1) {
                System.out.print(". ");
            }
        }
        System.out.println();
    }

    public static void Task3() {
        System.out.println("Задача №3");
        int[] dailyMeal = {1, 2, 3};
        double[] interestRate = {1.57, 7.654, 9.986};
        int[] year = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,};

        for (int i = dailyMeal.length -1; i >= 0; i--) {
            System.out.print(dailyMeal[i]);
            if (i != 0) {
                System.out.print(". ");
            }
        }
        System.out.println();
        for (int i = interestRate.length -1; i >= 0; i--) {
            System.out.print(interestRate[i]);
            if (i != 0) {
                System.out.print(". ");
            }
        }
        System.out.println();
        for (int i = year.length -1; i >= 0; i--) {
            System.out.print(year[i]);
            if (i != 0) {
                System.out.print(". ");
            }


        }
        System.out.println();
    }
    public static void Task4(){
        System.out.println("Задача №4");
        int[] dailyMeal = {1, 2, 3};
        for (int i = 0; i < dailyMeal.length; i++) {
            if (dailyMeal[i] % 2 != 0){
                dailyMeal[i] += 1;
            }
        }
        System.out.println(Arrays.toString(dailyMeal));
    }

}