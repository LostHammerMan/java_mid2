package sec3.link;

public class NodeMain2 {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        //

    }

    private static void printAll(Node node){
        Node x= node;
    }
}
