void main() throws IOException {
    int sqare = 1;
    int xSize = sqare;
    int ySize = sqare;
    MyMap map = new MyMap();
    FileManager.writeToLog(map.createMap(xSize, ySize));
    for (int i = 0; i < ySize; i++) {
        for (int j = 0; j < xSize; j++) {
            map.addToIndex(i, j, i * j);
        }
    }
    IO.println(map.printMap());

}
