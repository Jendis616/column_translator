package translator;

public class ColumnToNumTranslator {

    public int translateColumnToNum(String columnTitle) {
        int value = 0;
        char[] columnTitleCharArray = columnTitle.toCharArray();

        // translator logic
        for (char title : columnTitleCharArray) {

            value = value * 26 + ((int) title - 64);
        }

        return value;
    }

}
