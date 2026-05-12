package co.edu.uniquindio.poo.model;

public class Ejecutivo extends Directivo{

    private int limite = 20;
    private Directivo siguiente;

    public Ejecutivo() {

    }

    @Override
    public void setSiguiente(Directivo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void aprobarPresupuesto(int presupuesto) {
        if (presupuesto <= limite) {
            System.out.println("✅ Ejecutivo de equipo aprobó el gasto de $" + presupuesto);
        } else if (siguiente != null) {
            System.out.println("➡️ Ejecutivo de equipo pasa el gasto de $" + presupuesto + " al siguiente nivel");
            siguiente.aprobarPresupuesto(presupuesto);
        } else {
            System.out.println("❌ No hay nadie que pueda aprobar el gasto de $" + presupuesto);
        }
    }
}
