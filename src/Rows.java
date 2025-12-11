public class Rows {
    Object[] row;

    public void createRow(int size) {
        row = new Object[size];
    }

    public Object getFromRow(int index) {
        if (index >= 0 && index <= row.length) {
            return row[index];
        } else return "Incorrect index";
    }

    public Object setToIndex(int index, Object object) {
        if (index >= 0 && index <= row.length) {
            row[index] = object;
            return row[index];
        } else return "Incorrect index";
    }
}
