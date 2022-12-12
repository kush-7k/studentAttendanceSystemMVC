module com.example.demogui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demogui to javafx.fxml;
    exports com.example.demogui;
}