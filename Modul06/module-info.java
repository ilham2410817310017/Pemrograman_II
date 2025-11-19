module PrakPemro2Modul6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens application to javafx.fxml;
    opens Controller to javafx.fxml;
    opens Model to javafx.base;

    exports application;
}
