package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    private Node root;

    public ListLevels() {
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

    public List<LinkedList<Node>> listarNiveles() {
        List<LinkedList<Node>> resultado = new ArrayList<>();
        if (root == null) return resultado;

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int size = cola.size();
            LinkedList<Node> nivel = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node actual = cola.poll();
                nivel.add(actual);
                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            resultado.add(nivel);
        }

        return resultado;
    }

    public void imprimirNiveles() {
        List<LinkedList<Node>> niveles = listarNiveles();
        for (LinkedList<Node> nivel : niveles) {
            for (Node nodo : nivel) {
                System.out.print(nodo.getValue());
                if (nivel.getLast() != nodo) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    
}
