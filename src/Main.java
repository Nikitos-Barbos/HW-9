public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println();
        System.out.println("Задание 1");

        int[] add = { 772, 7328, 29812, 17721, 6288 };
        int result = 0;

        for (int i = 0; i < add.length; i++) {
            result += add[i];
        }

        System.out.println("Сумма трат за месяц составила " + result + " рублей");

        System.out.println();
        System.out.println("Задание 2");

        int min = add[0];
        int max = add[0];

        for (int i = 1; i < add.length; i++) {
            if (add[i] < min) {
                min = add[i];
            }
            if (add[i] > max) {
                max = add[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");


    }
}