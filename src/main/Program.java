import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //Admitting n is always bigger than 0 and lower than 100
        runPermutations(4);
        
    }

    private static void runPermutations(int maxNumber) {
        //Declaring List of each group:
        ArrayList<Integer> policeDoorList = new ArrayList<>();
        ArrayList<Integer> fireStationDoorList = new ArrayList<>();
        ArrayList<Integer> courtDoorList = new ArrayList<>();
        //Validating numbers and putting them in each group's list
        for (int i=1; i<=maxNumber;i++) {
            if (i%2==0) { policeDoorList.add(i); }//if 'i' is not odd, add it to the PoliceList
            if (isPrime(i)) {fireStationDoorList.add(i);} //if 'i' is prime, add to fireStationList
            if (doestNotEndsIn3(i)) {courtDoorList.add(i);} //if 'i' does not end in 3, add to courtList
        }
        int numberOfCombinations = 0;
        //Looping through each possible combination
        for (int policeNumber : policeDoorList) {
            for (int fireStationNumber : fireStationDoorList) {
                for (int courtNumber : courtDoorList) {
                    if (numbersAreNotEqual(policeNumber,fireStationNumber,courtNumber)) {
                        String possibleCombination = "{"+policeNumber+","+fireStationNumber+","+courtNumber+"}";
                        System.out.println(possibleCombination);
                        numberOfCombinations++;
                    }
                }
            }
        }
        System.out.println("total: "+numberOfCombinations);
    }

    public static boolean numbersAreNotEqual(int a, int b, int c) {
        if (a == b || a == c || b == c) { //Any number match = do not pass method's logic
            return false;
        }
        return true;
    }

    public static boolean doestNotEndsIn3(int number) {
        int lastDigit = number%10; //last digit is what is left of a division of 10
        return lastDigit != 3;
    }

    public static boolean isPrime(int number) {
        //If equals to 0, not prime:
        if(number==0){ return false;}
        //If equals to 1, prime ( this is discussible =P )
        if (number==1) {return true;}
        //If number above 1, must try each digit
        for (int i = 2; i <= number/2; i++) {
            // condition for non-prime number
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
