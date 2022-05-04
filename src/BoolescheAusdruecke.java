public class BoolescheAusdruecke {
    public static void main(String[] args) {
        double tempRoom = 30;
        int agePers = 15;
        double tempThreshold = 22.5;

        boolean tempBelowThreshold = tempRoom < tempThreshold;

        boolean ageBetween = !(agePers >= 13 && agePers <= 18);


        System.out.println("Is the temperature in the room below 22.5°C? " + tempBelowThreshold);
        System.out.println("Is this person not between the age of 13 and 18? " + ageBetween);
    }
    
}
