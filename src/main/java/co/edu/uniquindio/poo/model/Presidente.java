package co.edu.uniquindio.poo.model;

public class Presidente extends Directivo{

    private int limite = 200;
    private Directivo siguiente;

    public Presidente (){

    }

    @Override
    public void setSiguiente(Directivo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void aprobarPresupuesto(int presupuesto) {
        if (presupuesto <= limite) {
            System.out.println("✅ Presidente de equipo aprobó el gasto de $" + presupuesto);
        } else if (siguiente != null) {
            System.out.println("➡️ Presidente de equipo pasa el gasto de $" + presupuesto + " al siguiente nivel");
            siguiente.aprobarPresupuesto(presupuesto);
        } else {
            System.out.println("❌ No hay nadie que pueda aprobar el gasto de $" + presupuesto);
        }
    }
}

