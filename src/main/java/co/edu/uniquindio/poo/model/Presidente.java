package co.edu.uniquindio.poo.model;

public class Presidente extends Directivo {

    @Override
    public String aprobar(int presupuesto) {

        return "✅ Presidente aprobó el presupuesto de $" + presupuesto;
    }
}

