package co.edu.uniquindio.poo.model;

public class Getente extends Directivo{

    private int limite = 50;
    private Directivo siguiente;

    public Getente() {

    }

    @Override
    public void setSiguiente(Directivo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void aprobarPresupuesto(int presupuesto) {
        if (presupuesto <= limite) {
            System.out.println("✅ Gerente de equipo aprobó el gasto de $" + presupuesto);
        } else if (siguiente != null) {
            System.out.println("➡️ Gerente de equipo pasa el gasto de $" + presupuesto + " al siguiente nivel");
            siguiente.aprobarPresupuesto(presupuesto);
        } else {
            System.out.println("❌ No hay nadie que pueda aprobar el gasto de $" + presupuesto);
        }
    }
}
