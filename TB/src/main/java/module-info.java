module com.example.tb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tb to javafx.fxml;
    exports com.example.tb;
}