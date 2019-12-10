package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    private AtomicClock atomicClock;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField digitalCLock;

    @FXML
    private TextField updateCounter;

    @FXML
    void initialize() {
        assert digitalCLock != null : "fx:id=\"digitalCLock\" was not injected: check your FXML file 'main.fxml'.";
        assert updateCounter != null : "fx:id=\"updateCounter\" was not injected: check your FXML file 'main.fxml'.";
        atomicClock=new AtomicClock();
        atomicClock.start();
    }
}
