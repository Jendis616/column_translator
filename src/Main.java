import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String columnTitle;
        final int maxAlphabetLength = 26;
        final int maxColumnNumberLimit = 2597;
        boolean isValid = false;
        boolean isRepeated;
        int finalValue = 0;
        Map<Character, Integer> alphabetMap = new HashMap<>();

        //init
        alphabetMap.put('A', 1);
        alphabetMap.put('B', 2);
        alphabetMap.put('C', 3);
        alphabetMap.put('D', 4);
        alphabetMap.put('E', 5);
        alphabetMap.put('F', 6);
        alphabetMap.put('G', 7);
        alphabetMap.put('H', 8);
        alphabetMap.put('I', 9);
        alphabetMap.put('J', 10);
        alphabetMap.put('K', 11);
        alphabetMap.put('L', 12);
        alphabetMap.put('M', 13);
        alphabetMap.put('N', 14);
        alphabetMap.put('O', 15);
        alphabetMap.put('P', 16);
        alphabetMap.put('Q', 17);
        alphabetMap.put('R', 18);
        alphabetMap.put('S', 19);
        alphabetMap.put('T', 20);
        alphabetMap.put('U', 21);
        alphabetMap.put('V', 22);
        alphabetMap.put('W', 23);
        alphabetMap.put('X', 24);
        alphabetMap.put('Y', 25);
        alphabetMap.put('Z', 26);

        // main loop
        System.out.println("Hello and welcome!");
        do {
            finalValue = 0;
            isRepeated = false;

            //user's input
            do {
                System.out.println("Enter the letter which you want to translate:");
                columnTitle = sc.nextLine().toUpperCase();

                if (!columnTitle.isEmpty() && columnTitle.length() <= 7)
                    isValid = true;

                if (!isValid)
                    System.out.println("Given letter is not in range. Try again!:");

            } while (!isValid);

            // translator logic
            char[] columnTitleCharArray = columnTitle.toCharArray();

            for (int i = 0; i < columnTitle.length(); i++) {
                int value;

                if (i == columnTitle.length() - 1)
                    value = alphabetMap.get(columnTitleCharArray[i]);
                else
                    value = maxAlphabetLength * alphabetMap.get(columnTitleCharArray[i]);

                finalValue += value;
            }

            if (finalValue > maxColumnNumberLimit)
                System.out.println("Entered value oversize the limit. Max. column title is FXSHRXW");
            else
                System.out.printf("Your column number is %d \n", finalValue);

            System.out.println("Repeat? [Y/N]");

            //
            String answer = sc.nextLine();
            if (answer.contains("Y"))
                isRepeated = true;

        } while (isRepeated);
    }
}