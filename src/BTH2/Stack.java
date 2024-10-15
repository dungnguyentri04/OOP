package BTH2;

public class Stack {
    Node head;
    private int size;

    public Stack(){
        head=null;
        size=0;
    }

    public void push(int value){
        size++;
        Node newNode = new Node(value);
        if (head==null) head=newNode;
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public int pop(){
        if (isEmpty(head)) return -1;
        size--;
        int k = head.getValue();
        head=head.next;
        return k;
    }

    public int peak(){
        return head.getValue();
    }


    public boolean isEmpty(Node head){
        return head == null;
    }

    public int numOfElement(){
        return size;
    }

    public void displayElement(){
        if (head==null) System.out.println("Empty");
        Node tmp = head;
        while (tmp!=null){
            System.out.println(tmp.getValue()+" ");
            tmp=tmp.next;
        }
    }


}
