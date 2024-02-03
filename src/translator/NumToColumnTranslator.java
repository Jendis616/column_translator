package translator;

public class NumToColumnTranslator {

    public String translateNumToColumn(int number) {
        StringBuilder columnTitle = new StringBuilder();

        while (number -1 >= 0) {
            columnTitle.append((char) (64 - (number % 26)));
            number /= 26;
        }

        columnTitle.reverse();

        return columnTitle.toString();
    }
}
