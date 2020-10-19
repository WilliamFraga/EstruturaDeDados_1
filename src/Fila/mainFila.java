package Fila;

public class mainFila {

    public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {
        Fila fila = new Fila();

        fila.incluir(1);
        fila.incluir(2);
        fila.incluir(3);
        fila.incluir(4);
        fila.incluir(5);
        fila.incluir(6);
        fila.incluir(7);

        System.out.println(fila.getQtd());
        System.out.println(fila.estaCheia());



    }


}
