import java.util.HashSet;

public class MiConjunto<T> {
    private HashSet<T> conjunto;

    public MiConjunto() {
        conjunto = new HashSet<>();
    }

    public void add(T elemento) {
        conjunto.add(elemento);
    }
    public boolean contains(T elemento) {
        return conjunto.contains(elemento);
    }
    public void remove(T elemento) {
        conjunto.remove(elemento);
    }


}

