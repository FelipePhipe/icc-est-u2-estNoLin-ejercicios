package main.Ejercicio_01_insert;
import main.Materia.Models.Node;
import java.util.LinkedList;
import java.util.Queue;

public class InsertBSTTest {
    private Node root;

    public InsertBSTTest() {
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
        return node; // Si es duplicado, no lo inserta
    }

   /*  public void printInOrder() {
        System.out.println("Impresión en orden:");
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(Node node) {
        if (node != null) {
            printInOrderRec(node.getLeft());
            System.out.print(node.getValue() + " ");
            printInOrderRec(node.getRight());
        }
    }*/

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
}
