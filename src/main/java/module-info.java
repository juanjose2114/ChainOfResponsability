module ChainOfResponsability {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;



    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo;
}