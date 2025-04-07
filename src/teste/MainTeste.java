package teste;
import filas.filaInt;

public class MainTeste {
    public static void main(String[] args) {
        filaInt fila = new filaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        if (fila.isEmpty())
            System.out.println("Queue is empty!");
        else
            System.out.println("Valor retirado da fila :" + fila.dequeue());
        if (fila.isEmpty())
            System.out.println("Queue is empty!");
        else
            System.out.println("Valor retirado da fila :" + fila.dequeue());
        if (fila.isEmpty())
            System.out.println("Queue is empty!");
        else
            System.out.println("Valor retirado da fila :" + fila.dequeue());
        if (fila.isEmpty())
            System.out.println("Queue is empty!");
    }


}
