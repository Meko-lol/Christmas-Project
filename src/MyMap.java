import java.util.Arrays;

public class MyMap {
    private Rows[] columns;
    private int mapSizeX;
    private int mapSizeY;

    public String createMap(int sizeX, int sizeY) {
        if(sizeX >= 0 && sizeY >= 0){
            mapSizeX = sizeX;
            mapSizeY = sizeY;
            columns = new Rows[sizeY];
            for (int i = 0; i < sizeY; i++) {
                columns[i] = new Rows();
                columns[i].createRow(sizeX);
            }
            return "Map created";
        }
        return "Incorrect size: createMap";
    }

    public Object getFromMap(int indexX, int indexY) {
        if (indexX >= 0 && indexY >= 0 && indexX <= mapSizeX && indexY <= mapSizeY) {
            return columns[indexY].getFromRow(indexX);
        }
        return "Incorrect index: getFromMap";
    }

    public Object addToIndex(int indexX, int indexY, Object object) {
        if (indexX >= 0 && indexY >= 0 && indexX < mapSizeX && indexY <= mapSizeY) {
            Rows temp = columns[indexY];
            temp.setToIndex(indexX, object);
            columns[indexY] = temp;
            return columns[indexY].getFromRow(indexX);
        }
        return "Incorrect index: addToIndex";
    }

    public String printMap() {
        String map = "";
        for (int i = 0; i < mapSizeY; i++) {
            map += Arrays.toString(columns[i].getRow()) + "\n";
        }
        return map;
    }

    public Rows[] getColumns() {
        return columns;
    }

    public int getMapSizeX() {
        return mapSizeX;
    }

    public int getMapSizeY() {
        return mapSizeY;
    }

    @Override
    public String toString() {
        return "MyMap: " +
                "columns=" + Arrays.toString(columns);
    }
}
