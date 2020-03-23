package sample;

import java.util.ArrayList;
import java.util.Random;

public class Field {
// 16 objects

    private Tile array[][];

    private int[] arrayNumbers = new int[15];
    public Tile[][] getArray() {
        return array;
    }

    public void setArray(Tile[][] array) {
        this.array = array;
    }


    public Field() {
        //
        InitField();
    }

    private void InitField() {
      //  int[] arrayNumbers = new int[15];
        // int[] arrayNumbers  = new int[15];
        int arrCount = 0;


        Random rnd = new Random();

        //  put all code into the for what must generate 15 numbers


        // numbers.add(rndNumber);
        int matches = 0;
        int gNum = 15;

        for (int g = 0; g < gNum; g++) { // generate number

            int rndNumber = rnd.nextInt(15);
            System.out.println("generate  " + rndNumber);


            boolean permission = true;


            System.out.println("G " + g );
            // check the number we have yes or no
            for (int i = 0; i < g; i++) {
                System.out.println("rnd " + rndNumber + " ===="  + arrayNumbers[i]);

                if (rndNumber == arrayNumbers[i] ) {

                    System.out.println("match values");
                    permission = false;
                    break;


                }

            }
            if (permission) {
                arrayNumbers[arrCount] = rndNumber;
                ++arrCount;
            } else {
                g--;
            }

            /*if (g == 14) {
                g = g - matches;
            }*/
        }
        System.out.println(" Length array " + arrayNumbers.length);
        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.println(" [" +  i   + "] " +arrayNumbers[i]);


            // checking that we used the  number

        }



        array = new Tile[4][4];
        int count = 3 ;

      /*  for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                array[i][j] = new Tile(arrayNumbers[count]);

               // array[i][j].setValue(4);

            }
        }*/

        array[0][0] = new Tile(arrayNumbers[0]);
        array[0][1] = new Tile(arrayNumbers[1]);
        array[0][2] = new Tile(arrayNumbers[2]);
        array[0][3] = new Tile(arrayNumbers[3]);


        array[1][0] = new Tile(arrayNumbers[4]);
        array[1][1] = new Tile(arrayNumbers[5]);
        array[1][2] = new Tile(arrayNumbers[6]);
        array[1][3] = new Tile(arrayNumbers[7]);

        array[2][0] = new Tile(arrayNumbers[8]);
        array[2][1] = new Tile(arrayNumbers[9]);
        array[2][2] = new Tile(arrayNumbers[10]);
        array[2][3] = new Tile(arrayNumbers[11]);

        array[3][0] = new Tile(arrayNumbers[12]);
        array[3][1] = new Tile(arrayNumbers[13]);
        array[3][2] = new Tile(arrayNumbers[14]);
        array[3][3] = new Tile(99);




    }

    public boolean isWinner() {




        /*int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (array[i][j].isValue()) {
                    count++;
                }
            }
        }

        // something you have to add  in this function
        if (count == 16 || count == 0) {
            System.out.println("You  won!");
            return true;
        }
*/
        return false;

    }

    public void toggleTiles(int number) {


        /*int xcol = number%4;  // col stlpec
        int yrow = number/4;  // row riadok

        for (int jrow = 0; jrow<array.length; jrow++){ // riadok
            for (int icol = 0; icol<array.length; icol++){// stlpec
                if (!(xcol == icol && yrow == jrow) && Math.abs(xcol-icol) <= 1 && Math.abs(yrow-jrow) <= 1){
                    array[icol][jrow].toggle();
                }
            }
        }*/
    }

    public void print() {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(array[i][j].getValue());
            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }

    public void shuffle() {// take the number


    }
    //return false;
}


