package com.example.demogui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;
import javafx.scene.text.Text;

import java.util.Random;



public class A3Controller {

    @FXML
    private ColorPicker favColorOfStudent;

    @FXML
    private TextField givenNameOfStudent;

    @FXML
    private Pane placeOfStudent1;

    @FXML
    private Pane placeOfStudent2;

    @FXML
    private Pane placeOfStudent3;

    @FXML
    private Pane placeOfStudent4;

    @FXML
    private Pane placeOfStudent5;

    @FXML
    private Pane placeOfStudent6;

    @FXML
    private Pane placeOfStudent7;

    @FXML
    private Pane placeOfStudent8;

    @FXML
    private Pane placeOfStudent9;
    @FXML
    private Text studentNumber1;

    @FXML
    private Text studentNumber2;

    @FXML
    private Text studentNumber3;

    @FXML
    private Text studentNumber4;

    @FXML
    private Text studentNumber5;

    @FXML
    private Text studentNumber6;
    @FXML
    private Label msgDisplay;

    @FXML
    private Text studentNumber7;

    @FXML
    private Text studentNumber8;

    @FXML
    private Text studentNumber9;

    int sum=0;
    @FXML
    void onAddStudent(ActionEvent event) {
        Pane placeOfStudent[]=new Pane[10];
        placeOfStudent[1]=placeOfStudent1;
        placeOfStudent[2]=placeOfStudent2;
        placeOfStudent[3]=placeOfStudent3;
        placeOfStudent[4]=placeOfStudent4;
        placeOfStudent[5]=placeOfStudent5;
        placeOfStudent[6]=placeOfStudent6;
        placeOfStudent[7]=placeOfStudent7;
        placeOfStudent[8]=placeOfStudent8;
        placeOfStudent[9]=placeOfStudent9;
        Text studentNumber[]=new Text[10];
        studentNumber[1]=studentNumber1;
        studentNumber[2]=studentNumber2;
        studentNumber[3]=studentNumber3;
        studentNumber[4]=studentNumber4;
        studentNumber[5]=studentNumber5;
        studentNumber[6]=studentNumber6;
        studentNumber[7]=studentNumber7;
        studentNumber[8]=studentNumber8;
        studentNumber[9]=studentNumber9;
        int array[]=new int[10];
        for(int i=0;i<10;i++){
            array[i]=0;
        }
        array[0]=1;
        Random rand = new Random();
        int error = 0;
        String givenName = givenNameOfStudent.getText();
        Color color = favColorOfStudent.getValue();
        int randomInteger = rand.nextInt(1, 10);

if(sum==9){
    msgDisplay.setStyle("-fx-background-color: RED");
    msgDisplay.setStyle("-fx-text-fill: YELLOW");
    msgDisplay.setText("No more seats avilable");
    msgDisplay.setVisible(true);
    error=93;
}
while (error!=93){

    if (placeOfStudent[randomInteger].getStyle().equals("-fx-background-color: #ffffff; -fx-border-color: #000000;" ))
    {
        if(color.toString().equals("0xffffffff"))
        {error=3; break;}
        if(givenName.isEmpty())
        {
            error=4; break;
        }
        if(placeOfStudent[1].getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || placeOfStudent[2].getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        || placeOfStudent[3].getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || placeOfStudent[4].getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        || placeOfStudent[5].getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || placeOfStudent[6].getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        || placeOfStudent[7].getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || placeOfStudent[8].getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||placeOfStudent[9].getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
        {error=2;
            break;}
        if(((studentNumber[1].getText().compareTo(givenName)==0)&& (studentNumber[1].getText().length()==givenName.length())) || ((studentNumber[2].getText().compareTo(givenName)==0)&& (studentNumber[2].getText().length()==givenName.length())) || ((studentNumber[3].getText().compareTo(givenName)==0)&& (studentNumber[3].getText().length()==givenName.length()))
        ||((studentNumber[4].getText().compareTo(givenName)==0)&& (studentNumber[4].getText().length()==givenName.length()))|| ((studentNumber[5].getText().compareTo(givenName)==0)&& (studentNumber[5].getText().length()==givenName.length()))|| ((studentNumber[6].getText().compareTo(givenName)==0)&& (studentNumber[6].getText().length()==givenName.length()))
        || ((studentNumber[7].getText().compareTo(givenName)==0)&& (studentNumber[7].getText().length()==givenName.length()))|| ((studentNumber[8].getText().compareTo(givenName)==0)&& (studentNumber[8].getText().length()==givenName.length()))|| ((studentNumber[9].getText().compareTo(givenName)==0)&& (studentNumber[9].getText().length()==givenName.length())))
        {error=1; break;}

            msgDisplay.setVisible(false);
            array[randomInteger]=1;
            sum=sum+array[randomInteger];
            placeOfStudent[randomInteger].setStyle("-fx-background-color: #" + color.toString().substring(2));
            studentNumber[randomInteger].setText(givenName);
            studentNumber[randomInteger].setVisible(true);
            if(sum==9)
            {msgDisplay.setText("Congratulation!! All Seats taken");msgDisplay.setStyle("-fx-background-color: rgba(255,0,0,.3)");
                msgDisplay.setVisible(true);break;}
            break;

    }

    else{
        error=10;
        randomInteger = rand.nextInt(1, 10);
        if(array[randomInteger]==0)
            continue;

        if(sum==9)
            break;
    }
}
        if (error == 1) {
            msgDisplay.setText("STUDENT NAME ALREADY TAKEN!!");

            msgDisplay.setVisible(true);
        } else if (error == 2) {
            msgDisplay.setText("COLOR TAKEN BY OTHER STUDENT");

            msgDisplay.setVisible(true);
        } else if (error==3) {
            msgDisplay.setText("White Color is not valid");

            msgDisplay.setVisible(true);
        } else if (error==4) {
            msgDisplay.setText("Name is Empty");

            msgDisplay.setVisible(true);
        }
    }

    @FXML
    void initialize() {
        studentNumber1.setVisible(false);
        studentNumber3.setVisible(false);
        studentNumber2.setVisible(false);
        studentNumber4.setVisible(false);
        studentNumber5.setVisible(false);
        studentNumber6.setVisible(false);
        studentNumber7.setVisible(false);
        studentNumber8.setVisible(false);
        studentNumber9.setVisible(false);
        msgDisplay.setVisible(false);
    }

}