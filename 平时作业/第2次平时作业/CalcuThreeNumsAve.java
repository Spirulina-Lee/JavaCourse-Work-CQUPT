package CalcuAve;
import java.util.Scanner;

public class CalcuThreeNumsAve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        
        double sum = x + y + z;
        double average = sum / 3.0;
        
        System.out.println("sum=" + sum);
        System.out.println("average=" + average);

	}

}

