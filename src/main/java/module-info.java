module com.carl.lab08_carl {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.carl.lab08_carl to javafx.fxml;
    exports com.carl.lab08_carl;
}
