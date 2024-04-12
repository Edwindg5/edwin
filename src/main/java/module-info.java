module org.example.proyectomulti {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.proyectomulti to javafx.fxml;
    exports org.example.proyectomulti;
    exports org.example.proyectomulti.controller;
    opens org.example.proyectomulti.controller to javafx.fxml;
}