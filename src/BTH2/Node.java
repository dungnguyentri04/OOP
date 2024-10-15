package BTH2;

public class Node {
    Node next;
    private int value;

    public Node(int value){
        this.value=value;
        next=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
