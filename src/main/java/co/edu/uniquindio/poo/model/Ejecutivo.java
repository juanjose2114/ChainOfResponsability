package co.edu.uniquindio.poo.model;

public class Ejecutivo extends Directivo {

    private final int limite = 20;

    @Override
    public String aprobar(int presupuesto) {

        if (presupuesto <= limite) {
            return "✅ Ejecutivo aprobó el presupuesto de $" + presupuesto;
        }

        return "➡ Ejecutivo pasa el presupuesto\n" +
                siguiente.aprobar(presupuesto);
    }
}
