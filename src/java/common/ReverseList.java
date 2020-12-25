package common;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Hu yujing
 * Date: 2019/11/24
 * Time: 22:25
 * Describe：
 */
public class ReverseList {
    public static void main(String[] args) {
        Node node4 = new Node(4, null);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node reverseList = ReverseList.reverseList(node1);
        System.out.println(reverseList);
    }

    public static Node reverseList(Node node) {

        if (node == null || node.next == null) {
            return node;
        }
        Node newNode = reverseList(node.next);
        Node next = node.next;
        next.next = node;
        node.next = null;
        return newNode;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setDate(int date) {
        this.data = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
