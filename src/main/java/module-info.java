module com.example.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.example.calculatorjavafx to javafx.fxml;
    exports com.example.calculatorjavafx;
}