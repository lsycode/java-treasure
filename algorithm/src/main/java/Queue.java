/**
 * Created by lsy on 2016/4/28.
 */
public class Queue {
    Node root;
    Node tail;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Queue add(int val) {
        Node node = new Node(val);
        if (root == null) {
            root = node;
            tail = root;
            return this;
        }
        tail.next = node;
        tail = tail.next;
        return this;
    }

    public void out() {
        out(root);
    }

    private void out(Node node) {
        //System.out.println(this);
        System.out.printf(String.valueOf(node.val));
        if (node.next.next == null) {
            System.out.printf(String.valueOf(node.next.val));
            return;
        }
        Node del = node.next;
        node = del.next;
        del.next = null;
        addToTail(del);
        out(node);
    }


    private void addToTail(Node node) {
        tail.next = node;
        tail = tail.next;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node node = root;
        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(6);
        q.add(3);
        q.add(1);
        q.add(7);
        q.add(5).add(8).add(9).add(2).add(4);
        q.out();
    }

}
