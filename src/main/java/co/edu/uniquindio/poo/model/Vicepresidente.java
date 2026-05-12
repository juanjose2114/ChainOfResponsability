package co.edu.uniquindio.poo.model;

public class Vicepresidente extends Directivo {

    private final int limite = 180;

    @Override
    public String aprobar(int presupuesto) {

        if (presupuesto <= limite) {
            return "✅ Vicepresidente aprobó el presupuesto de $" + presupuesto;
        }

        return "➡ Vicepresidente pasa el presupuesto\n" +
                siguiente.aprobar(presupuesto);
    }
}
