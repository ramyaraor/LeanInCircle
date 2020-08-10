import java.math.BigDecimal;
import java.util.*;

class JavaProgramBigDecimalHRP {
    public static void main(String []args) {
        //  HackerRankProblem : https://www.hackerrank.com/challenges/java-bigdecimal/problem
        //Input
        System.out.println("Number of Elements to enter");
        Scanner sc = new Scanner(System.in);
        int totalElements = sc.nextInt();
        String [] bucket = new String[totalElements+2];
        System.out.println("Enter value which will be pushed to the bucket");
        for (int i = 0; i < totalElements; i++) {
            bucket[i] = sc.next();
        }
        sc.close();
        // Step 2
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                System.out.println(a);
                System.out.println(b);
                System.out.println(b.compareTo(a));
                System.out.println("**********************");
                return b.compareTo(a);
            }
        };
        // Step 1
        Arrays.sort(bucket, 0, totalElements, customComparator);
        //Output
        System.out.println("Sorted output");
        for (int i = 0; i < totalElements; i++) {
            System.out.println(bucket[i]);
        }
    }
}