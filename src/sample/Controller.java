package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {


    public Button btnNewGame;
    public Button btnendGame;
    public Button btnRestartButton;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    private Game game;

    public Controller() {
        game = new Game();

    } // create new game



    public void initialize() {
        btnRestartButton.setDisable(true);
        btn0.setDisable(true);
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btn10.setDisable(true);
        btn11.setDisable(true);
        btn12.setDisable(true);
        btn13.setDisable(true);
        btn14.setDisable(true);
        btn15.setDisable(true);

    }



    public void clickBtn(ActionEvent event) {

        System.out.println("button " + ((Button) event.getSource()).getId());// id number ale je to String

        String id = (((Button) event.getSource()).getId().substring(3));// chane to int from string

        int value = Integer.parseInt(id);

        game.nextMove(value);

        if (game.getField() != null) {
            //rePaint();
        }


    }

    /*public void rePaint() {
        Tile[][] arr = game.getField().getArray(); // return array
      *//*  btn0.setText(arr[0][0].isValue() ? "YES" : "NO");
        btn1.setText(arr[0][1].isValue() ? "YES" : "NO");
        btn2.setText(arr[0][2].isValue() ? "YES" : "NO");
        btn3.setText(arr[0][3].isValue() ? "YES" : "NO");
        btn4.setText(arr[0][3].isValue() ? "YES" : "NO");*//*


        btn0.setText(arr[0][0].isValue() ? "Y" : "N"); // set value
        btn4.setText(arr[0][1].isValue() ? "Y" : "N"); //  ?? ternary operator
        btn8.setText(arr[0][2].isValue() ? "Y" : "N"); // position
        btn12.setText(arr[0][3].isValue() ? "Y" : "N");

        btn1.setText(arr[1][0].isValue() ? "Y" : "N");
        btn5.setText(arr[1][1].isValue() ? "Y" : "N");
        btn9.setText(arr[1][2].isValue() ? "Y" : "N");
        btn13.setText(arr[1][3].isValue() ? "Y" : "N");

        btn2.setText(arr[2][0].isValue() ? "Y" : "N");
        btn6.setText(arr[2][1].isValue() ? "Y" : "N");
        btn10.setText(arr[2][2].isValue() ? "Y" : "N");
        btn14.setText(arr[2][3].isValue() ? "Y" : "N");

        btn3.setText(arr[3][0].isValue() ? "Y" : "N");
        btn7.setText(arr[3][1].isValue() ? "Y" : "N");
        btn11.setText(arr[3][2].isValue() ? "Y" : "N");
        btn15.setText(arr[3][3].isValue() ? "Y" : "N");


        changeBackgroundColor();
    }*/

    /*public void changeBackgroundColor() {
        Tile[][] arr = game.getField().getArray();

        if (arr[0][0].isValue()) {
            btn0.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn0.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }

        if (arr[0][1].isValue()) {
            btn4.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn4.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[0][2].isValue()) {
            btn8.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn8.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[0][3].isValue()) {
            btn12.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn12.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[1][0].isValue()) {
            btn1.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn1.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[1][1].isValue()) {
            btn5.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn5.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[1][2].isValue()) {
            btn9.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn9.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[1][3].isValue()) {
            btn13.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn13.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[2][0].isValue()) {
            btn2.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn2.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[2][1].isValue()) {
            btn6.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn6.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[2][2].isValue()) {
            btn10.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn10.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[2][3].isValue()) {
            btn14.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn14.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[3][0].isValue()) {
            btn3.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn3.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[3][1].isValue()) {
            btn7.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn7.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }
        if (arr[3][2].isValue()) {
            btn11.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn11.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        }

        if (arr[3][3].isValue()) {
            btn15.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY)));
        } else {
            btn15.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    */
    public void rePaint() {
        Tile[][] arr = game.getField().getArray();
        btn0.setText(String.valueOf(arr[0][0].getValue()));
        btn4.setText(String.valueOf(arr[0][1].getValue()));
        btn8.setText(String.valueOf(arr[0][2].getValue()));
        btn12.setText(String.valueOf(arr[0][3].getValue()));

        btn1.setText(String.valueOf(arr[1][0].getValue()));
        btn5.setText(String.valueOf(arr[1][1].getValue()));
        btn9.setText(String.valueOf(arr[1][2].getValue()));
        btn13.setText(String.valueOf(arr[1][3].getValue()));

        btn2.setText(String.valueOf(arr[2][0].getValue()));
        btn6.setText(String.valueOf(arr[2][1].getValue()));
        btn10.setText(String.valueOf(arr[2][2].getValue()));
        btn14.setText(String.valueOf(arr[2][3].getValue()));

        btn3.setText(String.valueOf(arr[3][0].getValue()));
        btn7.setText(String.valueOf(arr[3][1].getValue()));
        btn11.setText(String.valueOf(arr[3][2].getValue()));
        btn15.setText(String.valueOf(arr[3][3].getValue()));

        //changeBackgroundColor();

    }



    public void newGame(ActionEvent actionEvent) {
      /*  game.start();
        btnNewGame.setDisable(true);
        btnendGame.setDisable(false);
        btnRestartButton.setDisable(false);
        rePaint();*/

        game.start();
        btnNewGame.setDisable(true);
        btnRestartButton.setDisable(false);
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btn10.setDisable(false);
        btn11.setDisable(false);
        btn12.setDisable(false);
        btn13.setDisable(false);
        btn14.setDisable(false);
        btn15.setDisable(false);
        rePaint();



    }

    public void endGame(ActionEvent actionEvent) {
        game.endGame();
        Stage stage = (Stage) btnendGame.getScene().getWindow();
        stage.close();
    }

    public void restartGame(ActionEvent actionEvent) {
        game.resetGame();
        btnNewGame.setDisable(false);
        btnRestartButton.setDisable(true);
    }


}
