package co.edu.uniquindio.poo.model;

public class Viceprecidente extends Directivo{

    private int limite = 100;
    private Directivo siguiente;

    public Viceprecidente() {

    }

    @Override
    public void setSiguiente(Directivo siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public void aprobarPresupuesto(int presupuesto) {
        if (presupuesto <= limite) {
            System.out.println("✅ Viceprecidente de equipo aprobó el gasto de $" + presupuesto);
        } else if (siguiente != null) {
            System.out.println("➡️ Viceprecidente de equipo pasa el gasto de $" + presupuesto + " al siguiente nivel");
            siguiente.aprobarPresupuesto(presupuesto);
        } else {
            System.out.println("❌ No hay nadie que pueda aprobar el gasto de $" + presupuesto);
        }
    }
}
