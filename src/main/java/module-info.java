module com.example.taller {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.uniquindio.almacen to javafx.fxml;
    exports co.uniquindio.almacen;
    exports co.uniquindio.almacen.application;
    opens co.uniquindio.almacen.application to javafx.fxml;
}