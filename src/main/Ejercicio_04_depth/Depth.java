package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    private Node root;

    public Depth() {
        this.root = null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            return newNode;
        } else if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }
    public int maxDepth(){
        return maxDepth(root);
    }


    public int maxDepth(Node root){
        if(root==null){
            return 0;
        }

        int izq= maxDepth(root.getLeft());
        int der= maxDepth(root.getRight());

        return 1+ Math.max(izq, der);
    }
    
}
