package Hafta2;

public class Soru2 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 3, 2, 8, 5, 10, 3};
        System.out.print("Tekrar eden sayılar: ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
    }
}
