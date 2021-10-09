package ru.mirea.task11.guessnubmer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{
    public String num;
    public Integer p  = 0;

    @FXML
    private Label text, text3;
    private TextField text2;

    @FXML
    protected void onClick() {
        if (text2.getText() == num){
            text.setText("Your winner");
        }
        else if (p != 3)
        {
            p++;
            text.setText("Try again");
        }
        if (p == 3)
            text.setText("Your lose");
        text3.setText(p.toString());
    }
}