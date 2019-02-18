import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first person letters");
//        String strOne = scan.next();
//        System.out.println("Enter second person letters");
//        String strTwo = scan.next();

//        System.out.println(whoGotHighScore(strOne, strTwo));

//        int[] numbers = new int[] {10,36,24,7,18};
//
//        System.out.println(search(numbers, 25));

        // System.out.println(longestStreak("Ryyaaaaannnnnn"));

//        int[] array = {1,7,5,9,2,11};
//
//        int answer = findPairs(array, 2);
//        System.out.println(answer);
//
//        String x = new String("hello");
//        System.out.println(x);
//        x = new String("Ryan");
//        System.out.println(x);

        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyz"));

    }


    public static String whoGotHighScore(String emily, String bob){

        int emilyScore=0;
        int bobScore=0;

        for (int i = 0; i < emily.length(); i++) {
            
            char letter = emily.charAt(i);
            
            if (letter == 'E'){
                emilyScore += 1;
            } else if (letter == 'M'){
                emilyScore += 3;
            } else if (letter == 'H'){
                emilyScore += 5;
            }
        }

        for (int i = 0; i < bob.length(); i++) {

            char letter = bob.charAt(i);

            if (letter == 'E'){
                bobScore += 1;
            } else if (letter == 'M'){
                bobScore += 3;
            } else if (letter == 'H'){
                bobScore += 5;
            }
        }

        System.out.println("Emily's score is: " + emilyScore);
        System.out.println("Bob's score is: " + bobScore);

        String result = "";

        if (emilyScore > bobScore){
            result = "EMILY";
        } else if (bobScore > emilyScore){
            result = "BOB";
        } else {
            result = "TIE";
        }

        return result;
    }

    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int longestStreak(String str){

        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = i; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                } else {
                    break;
                }
            }
            if (count > max){
                max = count;
            }
        }

        return max;
    }

    // int[] array = {1,7,5,9,2,11};

    public static int findPairs(int[] arr, int k){

        int pairsFound = 0;
        int loopCounter = 0;
        int iloop = 0;

        for (int i = 0; i < arr.length-1; i++) {

            System.out.println("i loop-- " + arr[i]);

            for (int j = 1; j < arr.length; j++) {
                System.out.println("starting j loop round " + loopCounter++);

                if ((j+i) > arr.length-1){
                    break;
                }

                System.out.println(arr[j+i]);

                if ((arr[i] + k) == arr[j+i] || (arr[i] - k) == arr[j+i]){
                    System.out.println("pair added");
                    pairsFound++;
                }
            }
        }
        return pairsFound;
    }

    public static boolean isUnique(String str){

        char[] arr = str.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])){
                return false;
            } else {
                list.add(arr[i]);
            }
        }
        return true;
    }

}
