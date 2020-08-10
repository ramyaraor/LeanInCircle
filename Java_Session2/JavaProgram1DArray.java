public class JavaProgram1DArray {

    public static void main(String args[]) {
        // 0. Array Limitation - it has a fixed length
        // 1. Declare - declares an Array of integers.
        String[] pandavas;

        // 2. Allocate
        pandavas = new String[5];

        // String[] pandavas = new String[5]; // combining both statements in one

        // 3. Initialise , Push your data to the store
        pandavas[0] = "Arjun";
        pandavas[1] = "Bhima";
        pandavas[2] = "Nakula";
        pandavas[3] = "Sahadev";
        pandavas[4] = "Yudhistir";
        System.out.println("Pandava at index 0: "
                + pandavas[0]);
        System.out.println("Pandava at index 1: "
                + pandavas[1]);
        System.out.println("Pandava at index 2: "
                + pandavas[2]);
        System.out.println("Pandava at index 3: "
                + pandavas[3]);
        System.out.println("Pandava at index 4: "
                + pandavas[4]);

        // 4. Find Length of your Array
        System.out.println("Number of son's Kunthi had "
                +pandavas.length);

        // 5. Accessing Java Array Elements using for Loop

        for (int i = 0; i < pandavas.length; i++)
            System.out.println("Looping...Pandava at index " + i +
                    " : "+ pandavas[i]);

    }
}