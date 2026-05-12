package co.edu.uniquindio.poo.model;

public abstract class Directivo {

    protected Directivo siguiente;

    public void setSiguiente(Directivo siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String aprobar(int presupuesto);
}
