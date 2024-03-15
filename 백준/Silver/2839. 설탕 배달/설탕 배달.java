import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int bag5 = 0;
        int bag3 = 0;
        int bag5_3 = 0;

        if(input % 5 == 0) {
            bag5 = input / 5;
            System.out.println(bag5);
        } else if(bag5 == 0) {
            for(int i = 1; i <= input / 5; i++) {
                for(int j = 1; j <= input / 3; j++) {
                    if(5 * i + 3 * j == input) {
                        bag5_3 = i + j;
                    }
                }
            }
            if(bag5_3 != 0) {
                System.out.println(bag5_3);
            } else {
                if(input % 3 == 0) {
                    bag3 = input / 3;
                    System.out.println(bag3);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}