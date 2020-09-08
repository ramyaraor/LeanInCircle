import java.util.*;

class JavaProgramHRP1DArrayGame {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        
        System.out.println("Enter t-number of times game is played");
        int t = Integer.parseInt(inputObj.nextLine());
        
        for (int i = 0; i < t; i++) {
            System.out.println("Enter n-number of items");
            int n = inputObj.nextInt();
            System.out.println("Enter jump - allowed leap number");
            int jump = inputObj.nextInt();
            System.out.println(n + " " + jump);
            int[] arr = new int[n];
            System.out.println("Enter array elements");
            for (int j = 0; j < n; j++) {
                arr[j] = inputObj.nextInt();
                System.out.print(arr[j]);
            }
            System.out.println();
            // Function call , Send array and all other Requirements to our function
            if (gameRecFunc(n, jump, arr, new boolean[n], 0)) {
                System.out.println("YES ! its a WIN");
            } else {
                System.out.println("OH NO ! U LOST");
            }
        }
    }

    // Function Definition , n- number of array elements , Jump , array to keep all elements , CurrentPosition
    public static boolean gameRecFunc(int n, int jump, int[] arr, boolean[] visited, int curr) {
        // Simple condition , jump > n elements
        if (curr + jump >= n || curr + 1 == n) {
            System.out.println("Loop i + jump(end of the Array)");
            return true;
        }

        boolean[] newVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            newVisited[i] = visited[i];
        }

        boolean s = false;
        // condition : to walk one step ahead , when next element is 0 (i+1)
        if (!visited[curr+1] && arr[curr+1] == 0) {
            System.out.println("Loop i + 1 ");
            newVisited[curr+1] = true;
            s = gameRecFunc(n,jump,arr,newVisited,curr+1); // moving to the next element cur+1
        }

        if (s) {
            return true;
        }
        // condition to jump when the next hop element is 0 , curr+jump=0
        if (jump > 1 && arr[curr+jump] == 0 && !visited[curr+jump]) {
            System.out.println("Loop i + jump ");
            newVisited[curr+jump] = true;
            s = gameRecFunc(n,jump,arr,newVisited,curr+jump);
        }
        if (s) {
            return true;
        }
        // condition to move backwards one step
        if (curr > 0 && arr[curr-1] == 0 && !visited[curr-1]) {
            System.out.println("Loop i - 1 ");
            newVisited[curr-1] = true;
            s = gameRecFunc(n,jump,arr,newVisited,curr-1);
        }
        return s;
    }
}