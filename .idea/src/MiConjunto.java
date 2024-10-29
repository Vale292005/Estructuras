import java.util.HashSet;

public class MiConjunto<T> {
    private HashSet<T> conjun;

    public MiConjunto() {
        conjun = new HashSet<>();
    }

    public void add(T elemento) {
        conjun.add(elemento);
    }
    public boolean contains(T elemento) {
        return conjun.contains(elemento);
    }
    public void remove(T elemento) {
        conjun.remove(elemento);
    }


}

