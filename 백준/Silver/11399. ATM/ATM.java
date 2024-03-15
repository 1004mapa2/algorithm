import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String[] inputString = input.split(" ");
        int[] inputInt = new int[people];
        int sum = 0;

        //String 배열 => int 배열
        for(int i = 0; i < inputString.length; i++) {
            inputInt[i] = Integer.parseInt(inputString[i]);
        }

        // 오름차순 만들기
        for(int i = inputInt.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(inputInt[j] > inputInt[j + 1]) {
                    int temporary = inputInt[j];
                    inputInt[j] = inputInt[j + 1];
                    inputInt[j + 1] = temporary;
                }
            }
        }

        // 합 구하기
        for(int i = 0; i < people; i++) {
            for(int j = 0; j <= i; j++) {
                sum += inputInt[j];
            }
        }

        System.out.println(sum);
    }
}