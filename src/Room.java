import java.util.Arrays;

public class Room {
    private String type;
    private boolean goNorth;
    private boolean goSouth;
    private boolean goEast;
    private boolean goWest;
    private Object[] attributes;

    public Room(String type, boolean goNorth, boolean goSouth, boolean goEast, boolean goWest, Object[] attributes) {
        this.type = type;
        this.goNorth = goNorth;
        this.goSouth = goSouth;
        this.goEast = goEast;
        this.goWest = goWest;
        this.attributes = attributes;
        FileManager.writeToLog("Room created");
    }

    public Room() {
        FileManager.writeToLog("Room created");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGoNorth() {
        return goNorth;
    }

    public void setGoNorth(boolean goNorth) {
        this.goNorth = goNorth;
    }

    public boolean isGoSouth() {
        return goSouth;
    }

    public void setGoSouth(boolean goSouth) {
        this.goSouth = goSouth;
    }

    public boolean isGoEast() {
        return goEast;
    }

    public void setGoEast(boolean goEast) {
        this.goEast = goEast;
    }

    public boolean isGoWest() {
        return goWest;
    }

    public void setGoWest(boolean goWest) {
        this.goWest = goWest;
    }

    public Object[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Object[] attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Room: " +
                "type = " + type +
                ", goNorth = " + goNorth +
                ", goSouth = " + goSouth +
                ", goEast = " + goEast +
                ", goWest = " + goWest +
                ", attributes=" + Arrays.toString(attributes);
    }
}
