package edu.ib;

import javafx.application.Platform;
import javafx.scene.control.TextField;

import java.time.LocalTime;

public class TimeUpdateCounter implements Observer{
    private TextField textField;
    private int counter;

    public TimeUpdateCounter(TextField textField) {
        this.textField = textField;
    }


    @Override
    public void update(LocalTime localTime) {
        counter++;
        String display=String.valueOf(counter);
        Platform.runLater(()->textField.setText(display));
    }
}//end of class
