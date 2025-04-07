package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("a");
        first.next = new Node("b");
        first.next.next = new Node("c");

        System.out.println("first = " + first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회
        int index = 1;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "d");
        System.out.println(first);
        add(first, "e");
        System.out.println(first);
        add(first, "f");
        System.out.println(first);
        add(first, "g");
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i=0; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String s) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(s);
    }
}
