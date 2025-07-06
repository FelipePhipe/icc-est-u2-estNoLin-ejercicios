package main.Ejercicio_02_invert;

import java.util.LinkedList;
import java.util.Queue;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    private Node root;

    public InvertBinaryTree() {
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
    

    public void mostrarArbol() {
        if (root == null) return;
        Queue<Node> cola = new LinkedList<>();
        cola.add(root);
        while (!cola.isEmpty()) {
            int nivelSize = cola.size();
            for (int i = 0; i < nivelSize; i++) {
                Node actual = cola.poll();
                System.out.print(actual.getValue() + " ");
                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            System.out.println();
        }
    }

    public void invertir(){
        root= invertir(root);
    }
    public Node invertir(Node node){
        if(node==null){
            return null;
        }

        Node temp= node.getLeft();
        node.setLeft(invertir(node.getRight()));
        node.setRight(invertir(temp));

        return node;

    }

}
    
