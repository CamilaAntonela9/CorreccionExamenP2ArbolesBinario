package arboles;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("-----------------------------------------------------");
        System.out.println("             ARBOLES BINARIOS - MENÚ  ");
        System.out.println("-----------------------------------------------------");

        int opcion;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println(" 1. Insertar nodo");
            System.out.println(" 2. Recorrido en Preorden");
            System.out.println(" 3. Recorrido en Inorden");
            System.out.println(" 4. Recorrido en Postorden");
            System.out.println(" 5. Contar número de nodos");
            System.out.println(" 6. Calcular suma de elementos");
            System.out.println(" 7. Salir");
            System.out.println("-----------------------------------------------------");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del nodo a insertar: ");
                    int dato = scanner.nextInt();
                    arbol.insertar(dato);
                    System.out.println("Nodo " + dato + " insertado correctamente.");
                    break;
                case 2:
                    System.out.println("Recorrido en Preorden:");
                    ArbolBinario.preorden(arbol.raizArbol());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Recorrido en Inorden:");
                    ArbolBinario.inorden(arbol.raizArbol());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Recorrido en Postorden:");
                    ArbolBinario.postorden(arbol.raizArbol());
                    System.out.println();
                    break;
                case 5:
                    int numNodos = arbol.contarNodos(arbol.raizArbol());
                    System.out.println("Número de nodos en el árbol: " + numNodos);
                    break;
                case 6:
                    int sumaElementos = arbol.calcularSuma(arbol.raizArbol());
                    System.out.println("La suma de elementos del árbol es: " + sumaElementos);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opción válida.");
            }
        } while (opcion != 7);
    }
}
