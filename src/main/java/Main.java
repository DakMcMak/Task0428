import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                j++;
            }
        }
        if (j == 0){
            System.out.println(0);
        }
        if (j > 0){
            System.out.println(j);
        }
    }
}
