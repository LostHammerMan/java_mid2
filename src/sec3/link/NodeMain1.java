package sec3.link;

public class NodeMain1 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노트 탐색");
        Node x = first;

        while (x != null){
            System.out.println("x.item = " + x.item);
            x = x.next;
        }
    }

}
