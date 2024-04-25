module com.example.wordssearchtest1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordssearchtest1 to javafx.fxml;
    exports com.example.wordssearchtest1;
}