module com.example.practicaexam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicaexam to javafx.fxml;
    exports com.example.practicaexam;
}