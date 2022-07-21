module ge.vakho {
    requires javafx.controls;
    requires javafx.fxml;

    opens ge.vakho to javafx.fxml;
    exports ge.vakho;
}