package CloneGraph_133;

import Node.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        Node node1 = new Node(1, new ArrayList<Node>());
        Node node2 = new Node(2, new ArrayList<Node>());
        Node node3 = new Node(3, new ArrayList<Node>());
        Node node4 = new Node(4, new ArrayList<Node>());

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node3);
        node4.neighbors.add(node1);

        Node result = s.cloneGraph(node1);
        System.out.print(result);
    }
}