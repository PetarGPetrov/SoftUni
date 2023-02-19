import java.util.ArrayDeque;
import java.util.Scanner;

public class Task_03_Decimal_to_Binary_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> bits = new ArrayDeque<>();

        int num = Integer.parseInt(scan.nextLine());

        if (num == 0 ){
            System.out.println(0);
            return;
        }

        while (num > 0){
            int bit = num % 2;
            bits.push(bit);

            num = num / 2;

        }
        while (!bits.isEmpty()){
            System.out.print(bits.poll());

        }


    }
}
