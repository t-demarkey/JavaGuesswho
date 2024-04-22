module org.example.groupproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.groupproject to javafx.fxml;
    exports org.example.groupproject;
}