import translator.ColumnToNumTranslator;
import translator.NumToColumnTranslator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ColumnToNumTranslator columnToNumTranslator = new ColumnToNumTranslator();
        NumToColumnTranslator numToColumnTranslator = new NumToColumnTranslator();
        Validator validator = new Validator();

        Scanner sc = new Scanner(System.in);
        String columnTitle;
        int selectedMethod;

        boolean isValid;
        boolean isRepeated;

        // main loop
        System.out.println("Hello and welcome!");
        System.out.println("Select method you want to use:");
        System.out.println("[1] Translate column title to number");
        System.out.println("[2] Translate number to column title -- IN PROGRESS");

        selectedMethod = sc.nextInt();

        do {
            isRepeated = false;

            switch (selectedMethod) {
                case 1:
                    do {
                        System.out.println("Enter the column you want to translate:");
                        columnTitle = sc.nextLine().toUpperCase();
                        isValid = validator.isTextInputValid(columnTitle);

                    } while (!isValid);
                    System.out.printf("Your column number is %d \n", columnToNumTranslator.translateColumnToNum(columnTitle));

                    break;
                case 2:
                    // TODO
                    int columnNumber = sc.nextInt();
                    System.out.println(columnNumber);
                    System.out.printf("Your column title is %s \n", numToColumnTranslator.translateNumToColumn(columnNumber));
            }

            System.out.println("Repeat? [Y/N]");
            String answer = sc.nextLine();
            if (answer.contains("Y"))
                isRepeated = true;

        } while (isRepeated);
    }
}