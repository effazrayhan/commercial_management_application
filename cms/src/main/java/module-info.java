module com.bsse {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bsse to javafx.fxml;
    exports com.bsse;
}
