import java.util.ArrayList;

public class Validator {

    public boolean isTextInputValid(String columnTitle) {

        boolean isValid = false;

        ArrayList<Character> wrongInputChars = new ArrayList<>();
        char[] columnTitleCharArray = columnTitle.toCharArray();

        if (!columnTitle.isEmpty() && columnTitle.length() <= 7) {
            isValid = true;

            for (char letter : columnTitleCharArray) {
                if (!Character.isLetter(letter)) {
                    isValid = false;
                    wrongInputChars.add(letter);
                }
            }

            if (!wrongInputChars.isEmpty())
                System.out.printf("Given character %s must be only English letters \n", wrongInputChars);

        } else {
            System.out.println("Given column is not in range. Max. range is 7. Try again!:");
        }

        return isValid;
    }

}
