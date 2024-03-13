import java.util.NoSuchElementException;

public class Pilha {
    private int topo;
    private int[] pilha;
    private final int CAPACIDADE_PADRAO = 20;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.pilha = new int[capacidade];
    }

    public Pilha() {
        this.topo = -1;
        this.pilha = new int[CAPACIDADE_PADRAO];
    }

    public void push(int elemento) {
        if (isFull()) throw new RuntimeException("Pilha cheia!");
        this.pilha[++this.topo] = elemento;
    }

    public void pop() {
        if (isEmpty()) throw new NoSuchElementException("Pilha vazia!");
        this.topo--;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Pilha vazia!");
        return this.pilha[this.topo];
    }

    public int size() {
        return this.topo + 1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }
    
    public boolean isFull() {
        return this.topo + 1 == this.pilha.length;
    }
}
