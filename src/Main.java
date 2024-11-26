import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int [] tratiKompanii1 = generateRandomArray();
        System.out.println(Arrays.toString(tratiKompanii1));
//        int [] tratiKompanii = {100_500, 125_874, 0, 198_234, 187_423};
        int tratiZaMesyac = 0;

        for (int trati : tratiKompanii1) {
            tratiZaMesyac += trati;
        }
        System.out.println("Сумма трат за месяц составила " + tratiZaMesyac + " рублей");

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int [] tratiKompanii2 = generateRandomArray();
        System.out.println(Arrays.toString(tratiKompanii2));
        int minTrati = tratiKompanii2[0];
        int maxTrati = tratiKompanii2[0];
//        int minTrati = tratiKompanii[0];
//        int maxTrati = tratiKompanii[0];

        for (int trati : tratiKompanii2) {
            if (trati < minTrati) {
                minTrati = trati;
            }
            if (trati > maxTrati) {
                maxTrati = trati;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minTrati + " рублей. Максимальная сумма трат за неделю составила " + maxTrati + " рублей");

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        tratiZaMesyac = 0;
        int [] tratiKompanii3 = generateRandomArray();
        System.out.println(Arrays.toString(tratiKompanii3));
        for (int zatrati : tratiKompanii3) {
            tratiZaMesyac += zatrati;
        }
        double srednieTrati = (double) tratiZaMesyac / tratiKompanii3.length;
//        double srednieTrati = (double) tratiZaMesyac / tratiKompanii.length;

        System.out.println("Средняя сумма трат за месяц составила " + srednieTrati + " рублей");

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i = reverseFullName.length - 1; i >= 0; i--) {
//            System.out.print(reverseFullName[i]);
//        }
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char razvorot = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = razvorot;
        }
        System.out.println(new String(reverseFullName));


}

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        }
}