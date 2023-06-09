/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_4_listaenlasala;

/**
 *
 * @author W11
 */
public class Lista {
    private Nodo front;
    private Nodo back;
    private int size;

    // Al crear la lista front debe ser igual (La lista esta vacia)
    public Lista() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo al final de la lista
    // BIG-OH: O(N) -> Antes
    // BIG-OH: O(1) -> Agregando Back
    // Por default se agrega al final
    public void add(int value) {
        Nodo newNode = new Nodo(value);

        if (front == null) {
            front = newNode;
            back = newNode;
        } else {
//            Node temp = front;

            // O(N):
//            while (temp.getNext() != null) {
//                temp = temp.getNext();
//            }

            back.setNext(newNode);
            back = newNode;
        }

        size++;
    }

    // Devuelve los valores de la lista formateados
    // O(N)
    public String toString() {
        String text = "[";
        Nodo temp = front;

        while (temp != null) {
            text += temp.getValue();
            temp = temp.getNext();

            if (temp != null) {
                text += ",";
            }
        }

        text += "]";

        return text;
    }

    // O(N*N)
    public String toString2() throws Exception {
        String text = "[";
        int pos = size - 1;

        while (pos >= 0 ) {
            text += findPos(pos);
            if (pos != 0) {
                text += ",";
            }
            pos--;
        }

        text += "]";

        return text;
    }

    public int getSize() {
        return size;
    }

    // Devuelve el tamaño de la lista
    // O(N)
//    public int getSize() {
//        Node temp = front;
//        int count = 0;
//
//        while (temp != null) {
//            count++;
//            temp = temp.getNext();
//        }
//
//        return count;
//    }

    // Devuelve si la lista esta vacia
    // O(1)
    public boolean isEmpty() {
        return front == null;
    }

    // O(1)
    public void empty() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo en la posición deseada
    // O(N)
    public void addAt(int value, int pos) throws Exception {
        int nodeCount = size;

        // Validad posición
        if ((pos >= 0) && (pos < nodeCount)) {
            Nodo newNode = new Nodo(value);

            if (pos == 0) { // Agregar en la posición 0
                newNode.setNext(front);
                front = newNode;
            } else { // Agregar en cualquier otra posición
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Nodo temp = front;
                int nodesPos = 1;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                // Se conecta el nuevo nodo en la posición deseada
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }

            size++;
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }

    }

    // Eliminar un elemento en la posición indicada
    // O(N)
    public void deleteAt(int pos) throws Exception {
        int nodeCount = size;

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {

            if (nodeCount == 1) {
                empty();
            } else if (pos == 0) {
                front = front.getNext();
                size--;
            } else {
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Nodo temp = front;
                int nodesPos = 1;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                temp.setNext(temp.getNext().getNext());

                if (temp.getNext() == null) {
                    back = temp;
                }

                size--;
            }
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

    // Buscar un valor, si lo encuentra devuelve la posición, en su defecto devuelve -1
    // O(N)
    public int findValuePos(int val) {
        // Se recorren los nodos hasta encontrar el que coincida con el valor
        Nodo temp = front;
        int nodesPos = 0;
        boolean flag = false;

        while (temp != null) {
            if (temp.getValue() == val) {
                flag = true;
                break;
            }
            temp = temp.getNext();
            nodesPos++;
        }

        if (!flag)
            nodesPos = -1;

        return nodesPos;
    }

    // Busca un posición y devuelve el valor en esa posición
    // O(N)
    public int findPos(int pos) throws Exception {
        int nodeCount = size;

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {
            // Se recorren los nodos hasta el nodo de la posición deseada
            Nodo temp = front;
            int nodesPos = 0;

            while (nodesPos < pos) {
                temp = temp.getNext();
                nodesPos++;
            }

            return temp.getValue();
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

}