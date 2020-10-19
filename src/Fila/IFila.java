package Fila;

public interface IFila {

    public void incluir(int valor) throws FilaCheiaException;
    public int remover() throws FilaVaziaException;
    public int getQtd();
    public boolean estaVazia();
    public void limpar();
    public int visualizarProximo() throws FilaVaziaException;
}
