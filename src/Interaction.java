public class Interaction {
    private String name;
    private Interaction[] next;
    private Object resoult;

    public String getNamesOfNextInteractions(){
        String names = "";
        for (int i = 0; i < next.length; i++) {
            names += next[i].getName() + ", ";
        }
        return names;
    }

    public Object interract(){

        return "Interraction couldnt complete";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Interaction[] getNext() {
        return next;
    }

    public void setNext(Interaction[] next) {
        this.next = next;
    }

    public Object getResoult() {
        return resoult;
    }

    public void setResoult(Object resoult) {
        this.resoult = resoult;
    }
}