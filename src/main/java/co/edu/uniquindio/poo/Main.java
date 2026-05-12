package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Directivo ejecutivo = new Ejecutivo();
        Directivo gerente = new Getente();
        Directivo vicepresidente = new Viceprecidente();
        Directivo presidente = new Presidente();

        ejecutivo.setSiguiente(gerente);
        gerente.setSiguiente(vicepresidente);
        vicepresidente.setSiguiente(presidente);

        ejecutivo.aprobarPresupuesto(199);
    }
}
