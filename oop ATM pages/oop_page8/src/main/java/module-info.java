module com.example.oop_page8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.oop_page8 to javafx.fxml;
    exports com.example.oop_page8;
}