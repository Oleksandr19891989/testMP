module demo.testmp {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.testmp to javafx.fxml;
    exports demo.testmp;
}