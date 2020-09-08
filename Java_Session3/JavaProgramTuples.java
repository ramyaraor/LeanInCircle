import java.util.*;
import org.javatuples.*;
import org.javatuples.Quartet;

    class JavaProgramTuples {
        public static void main(String[] args)
        {   // creating tuple object
            // Pair<String, Integer> firstPairObj = Pair.with("Kunti's children", 5);
            Pair<String, Integer> firstPairObj = new Pair<String, Integer>("Kunti's children", 5);

            //Can do Reference , Cannot change values of first object
            Pair<String, Integer> SecPairObj = firstPairObj.setAt0("Pandavas");

            System.out.println(firstPairObj);
            System.out.println(SecPairObj);
            System.out.println(firstPairObj);

            Quartet<String, String, String, String>
                    firstQuarletObj = new Quartet<String, String, String, String>(
                    "Yudhistir", "Bhim" , "Nakul", "Sahadev");

            // Print Quartet
            System.out.println("Quartet: " + firstQuarletObj);

            // Create Quintet from Quartet
            Quintet<String, String, String, String, String>
                    quintet = new Quintet<String, String, String, String, String>(
                    firstQuarletObj.getValue0(),
                    firstQuarletObj.getValue1(),
                    "Arjun",
                    firstQuarletObj.getValue2(),
                    firstQuarletObj.getValue3());

            // Print Quintet
            System.out.println("Quintet: " + quintet);
        }
    }
