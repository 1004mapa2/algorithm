import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int n = Integer.parseInt(inputArray[0]);
        int k = Integer.parseInt(inputArray[1]);
        int[] coinArray = new int[n];
        int minCount = 0;

        // int 배열에 n의 수만큼 단위 넣기
        for(int i = 0; i < n; i++) {
            int coin = Integer.parseInt(scanner.nextLine());
            coinArray[i] = coin;
        }

        for(int i = n - 1; i >= 0; i--) {
            minCount += k / coinArray[i];
            k = k % coinArray[i];
            if(k == 0) {
                break;
            }
        }
        System.out.println(minCount);
    }
}