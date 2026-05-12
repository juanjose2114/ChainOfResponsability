package co.edu.uniquindio.poo.model;

public class Gerente extends Directivo {

    private final int limite = 100;

    @Override
    public String aprobar(int presupuesto) {

        if (presupuesto <= limite) {
            return "✅ Gerente aprobó el presupuesto de $" + presupuesto;
        }

        return "➡ Gerente pasa el presupuesto\n" +
                siguiente.aprobar(presupuesto);
    }
}