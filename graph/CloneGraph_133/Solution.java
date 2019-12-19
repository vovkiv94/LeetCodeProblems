package CloneGraph_133;

import Node.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
 * Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 * <p>
 * Note:
 * <p>
 * The number of nodes will be between 1 and 100.
 * The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
 * Since the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.
 * You must return the copy of the given node as a reference to the cloned graph.
 */
class Solution {
    HashMap<Integer, Node> map = new HashMap<>();

    Map<Integer, Node> cloned = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node copy;
        if (!cloned.containsKey(node.val)) {
            List<Node> _neighbors = new ArrayList<>();
            copy = new Node(node.val, _neighbors);
            cloned.put(copy.val, copy);
            for (Node neighbor : node.neighbors) {
                _neighbors.add(cloneGraph(neighbor));
            }
        } else {
            copy = cloned.get(node.val);
        }
        return copy;
    }


    public Node cloneGraph1(Node node) {
        return clone(node);
    }

    public Node clone(Node node) {
        if (node == null) return null;

        if (map.containsKey(node.val))
            return map.get(node.val);

        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(newNode.val, newNode);
        for (Node neighbor : node.neighbors)
            newNode.neighbors.add(clone(neighbor));
        return newNode;
    }
}