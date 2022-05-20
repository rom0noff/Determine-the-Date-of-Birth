module com.example.determinethedateofbirth {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.determinethedateofbirth to javafx.fxml;
    exports com.example.determinethedateofbirth;
}