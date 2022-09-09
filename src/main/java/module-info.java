module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.buffer;
    requires io.netty.transport;


    opens com.example.demo2 to javafx.fxml;
    //exports com.example.demo2;
    exports com.example.demo2;
    //opens com.example.demo2 to javafx.fxml;
}