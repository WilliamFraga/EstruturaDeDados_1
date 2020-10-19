package Pilha_Inteiros_Sequencial;

public class Pilha implements IPilha {
    int topo;
    int[] elementos;

    public Pilha() {
        elementos = new int[10];
        topo = -1;
    }

    public void empilhar(int valor) throws PilhaCheiaException {
        if (estahCheia()) {
            throw new PilhaCheiaException();
        }
        topo++;
        elementos[topo] = valor;
    }

    public int desempilhar() throws PilhaVaziaException {
        if (estahVazia()) {
            throw new PilhaVaziaException();
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public int getTopo() throws PilhaVaziaException {
        if (estahVazia()) {
            throw new PilhaVaziaException();
        }
        return this.elementos[topo];
    }

    public int getQtd() {
        return topo+1;
    }

    public boolean estahVazia() {
        return (topo == -1);
    }

    public boolean estahCheia() {
        return (topo == 9);
    }
}
