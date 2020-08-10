public class JavaProgramStrings {
    public static void main(String[] args) {
        // Handling Strings
        // Gievn below Kaurava and the Pāṇḍava princes and their successors.
        String Family1 = "Pandavas : Yudhistir Bhim Arjun Nakul Sahadev only";
        String Family2= "Kauravas : Duryodhana Dushasana Dussala and other 98 sons only";

        // Adding other family members to the Family
        String PāṇḍavasMother= "Kunti";
        String PāṇḍavasFather = "Pandu";
        String KauravasMother= "Gandhari";
        String KauravasFather = "Dhritarashtra";
        String AliasName ="Savyasachi";

        // Concat Mother and Father names at the beginning and end of the String
        if (Family1.contains("Pandavas")) {
            Family1 = Family1.replaceAll("only","");
            Family1 = Family1.concat(" " + PāṇḍavasMother);
            Family1 = Family1.concat(" " + PāṇḍavasFather);
        }
        // Add Kaurava family mambers
        if (!Family2.contains("Pandavas")) {
            Family2 = Family2.replaceAll("only","");
            Family2 = Family2.concat(" " + KauravasMother);
            Family2 = Family2.concat(" " + KauravasFather);
            //StringBuffer sb = new StringBuffer(Family1);
            //sb.insert(10 , PāṇḍavasFather);
        }
        // 2 . Replace
        Family1 = Family1.replace("Arjun", AliasName);
        System.out.println("********** Family 1 ***********"+ Family1);
        System.out.println("********** Family 2 ***********"+ Family2);
    }
}