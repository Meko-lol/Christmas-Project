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
                return "Created sucesfully";
            }
        }
        return "Incorrect size";
    }

    public Object getFromMap(int indexX, int indexY) {
        if (indexX >= 0 && indexY >= 0 && indexX <= mapSizeX && indexY <= mapSizeY) {
            return columns[indexY].getFromRow(indexX);
        }
        return "Incorrect index";
    }

    public Object setToIndex(int indexX, int indexY, Object object) {
        if (indexX >= 0 && indexY >= 0 && indexX < mapSizeX && indexY >= mapSizeY) {
            Rows temp = columns[indexY];
            temp.setToIndex(indexX, object);
            columns[indexY] = temp;
            return columns[indexY].getFromRow(indexX);
        }
        return "Incorrect index";
    }
}
