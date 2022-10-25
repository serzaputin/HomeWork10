public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее Задание 10");

        System.out.println("Задание 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц : " + sum);

        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element<min) {
                min=element;
            } else if (element > max){
                max=element;
            }
        }
        System.out.println("Минимальная затрата за день: " +min);
        System.out.println("Максимальная затрата за день: " +max);

        System.out.println("Задание 3");
        for (int i : arr) {
            sum +=i;
        }
        System.out.println(sum / (float) arr.length);

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}