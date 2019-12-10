package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {

    private AtomicClock atomicClock;
    private TFDigitalClock tfDigitalClock;
    private TimeUpdateCounter timeUpdateCounter;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField digitalCLock;

    @FXML
    private TextField updateCounter;

    @FXML
    private Button btnStart;

    @FXML
    void btnStartClicked(ActionEvent event) {
        if(!atomicClock.isRunning())
        atomicClock.start();
    }

    @FXML
    void initialize() {
        assert digitalCLock != null : "fx:id=\"digitalCLock\" was not injected: check your FXML file 'main.fxml'.";
        assert updateCounter != null : "fx:id=\"updateCounter\" was not injected: check your FXML file 'main.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'main.fxml'.";
        tfDigitalClock=new TFDigitalClock(digitalCLock);
        timeUpdateCounter=new TimeUpdateCounter(updateCounter);
        atomicClock=new AtomicClock();
        atomicClock.registerObserver(tfDigitalClock);
        atomicClock.registerObserver(timeUpdateCounter);

    }
}
