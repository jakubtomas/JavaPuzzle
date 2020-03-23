package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
         launch(args);














        /* Field field = new Field();

        field.print();
      field.toggleTiles(1);
        //field.shuffle();ł
        //field.shuffle();
        field.print();
       // field.toggleTiles(3);

        field.print();
*/




/*
        int[][] game = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10,11, 12},{13, 14,15, 16}};
        for (int i = 0; i < game.length; i++) { //pruchods pres pole poli
            for (int j = 0; j < game[i].length; j++) { //pruchod samotnym polem (radkem)
                System.out.print(game[i][j] + " ");

            }
            System.out.println("");
        }
*/


        // policko tile
        // 0 false
        // x true

        // pole trieda z nazvom field
        //game




        /*if (y == 0 && x == 0) {
            array[y][x+1].toggle();
            array[y+1][x].toggle();
            array[y+1][x+1].toggle();
        }

        if (y == 0 && x > 0 && x < array.length) {
            array[y][x-1].toggle();// left
            array[y][x+1].toggle();// right

            array[y+1][x].toggle(); // down
            array[y+1][x-1].toggle(); // down left
            array[y+1][x+1].toggle(); // down right

        }

        if (y == 0 && x == array.length -1   ) {
            array[y][x-1].toggle();// left
            array[y+1][x-1].toggle();// down left
            array[y+1][x].toggle();// down
        }

        if (x== 0 && y >0 && y < array.length) {

        }*/

    }
}
