public class Ejemplo4<T> {
    private T contenido;

    public void poner(T contenido) {
        this.contenido = contenido;
    }

    public T sacar() {
        return contenido;
    }
}
