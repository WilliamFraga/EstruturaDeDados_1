package Pilha_Inteiros_Sequencial;

public interface IPilha {

    public void empilhar(int valor) throws PilhaCheiaException;

    public int desempilhar() throws PilhaVaziaException;

    public int getTopo() throws PilhaVaziaException;

    public int getQtd();

    public boolean estahVazia();
}
