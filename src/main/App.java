package main;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("Ejercicio 1: ");
        InsertBSTTest e= new InsertBSTTest();
        e.insert(5);
        e.insert(3);
        e.insert(7);
        e.insert(2);
        e.insert(4);
        e.insert(6);
        e.insert(8);
        //e.printInOrder();
        e.mostrarArbol();
        System.out.println();


        System.out.println("Ejercicio 2: ");
        InvertBinaryTree c= new InvertBinaryTree();
        c.insert(4);
        c.insert(2);
        c.insert(7);
        c.insert(1);
        c.insert(3);
        c.insert(6);
        c.insert(9);
        System.out.println("Arbol original: ");
        c.mostrarArbol();
        c.invertir();
        System.out.println("Arbol invertido: ");
        c.mostrarArbol();
        System.out.println();


        System.out.println("Ejercicio 3: ");
        ListLevels l= new ListLevels();
        l.insert(4);
        l.insert(2);
        l.insert(7);
        l.insert(1);
        l.insert(3);
        l.insert(6);
        l.insert(9);

        l.listarNiveles();
        l.imprimirNiveles();
        System.out.println();

        System.out.println("Ejercicio 4: ");
        Depth a= new Depth();
        a.insert(4);
        a.insert(2);
        a.insert(7);
        a.insert(1);
        a.insert(3);
        a.insert(8);

        int deep= a.maxDepth();
        System.out.println("Profundidad max del arbol: "+ deep);


    }

}
