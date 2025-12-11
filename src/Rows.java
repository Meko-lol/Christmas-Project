import java.io.File;
import java.util.Arrays;

public class Rows {
    private Object[] row;


    public void createRow(int size) {
        row = new Object[size];
    }

    public Object getFromRow(int index) {
        if (index >= 0 && index <= row.length) {
            FileManager.writeToLog("returned" + row[index]);
            return row[index];
        } else {
            String message = "Incorrect index: getFromRow";
            FileManager.writeToLog(message);
            return message;
        }
    }

    public Object setToIndex(int index, Object object) {
        if (index >= 0 && index <= row.length) {
            row[index] = object;
            FileManager.writeToLog("set in row in index" + row[index]);
            return row[index];
        } else {
            String message = "Incorrect index: setToIndex";
            FileManager.writeToLog(message);
            return message;
        }
    }

    public Object[] getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "Rows{" +
                "row=" + Arrays.toString(row) +
                '}';
    }
}
