import java.util.*;
import java.math.*;

public class JavaProgramSort {
    public static void main(String[] args) {
        System.out.println("Enter N"+"\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal[] arr = new BigDecimal[n];
        System.out.println("Enter N Elements"+"\n");
        for (int i=0; i<n; ++i)
            arr[i] = sc.nextBigDecimal();
        Arrays.sort(arr);
        for (int i=n-1; i>=0; --i)
            System.out.println(arr[i]);
    }
}