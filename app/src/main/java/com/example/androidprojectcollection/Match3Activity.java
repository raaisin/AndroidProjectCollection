package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Match3Activity extends AppCompatActivity {

        final int[] COLORSET = { Color.RED, Color.GREEN, Color.BLUE };  // Set of colors to use, 0=RED, 1=GREEN, 2=BLUE
        public static boolean enabled = true;                           // True if buttons are allowed to be clicked, False if not
        int[][] tiles = new int[][]{{0,0,0,0,0},
                                    {0,0,0,0,0},
                                    {0,0,0,0,0},
                                    {0,0,0,0,0},
                                    {0,0,0,0,0}};           // Tile values can be 0, 1, or 2 each number corresponds to a color in COLORSET
        Button[][] btns;    // 2D array of buttons, [row][col], example : btns[0][0] is the top-left button, btns[2][2] is the bottom-right button
        Button btnReset;
        Button btnSameColor;// Reset button
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_match3);

            // Initialize array of buttons
            btns = new Button[][]{
                    {findViewById(R.id.btn11), findViewById(R.id.btn12), findViewById(R.id.btn13), findViewById(R.id.btn14), findViewById(R.id.btn15)},
                    {findViewById(R.id.btn21), findViewById(R.id.btn22), findViewById(R.id.btn23), findViewById(R.id.btn24), findViewById(R.id.btn25)},
                    {findViewById(R.id.btn31), findViewById(R.id.btn32), findViewById(R.id.btn33), findViewById(R.id.btn34), findViewById(R.id.btn35)},
                    {findViewById(R.id.btn41), findViewById(R.id.btn42), findViewById(R.id.btn43), findViewById(R.id.btn44), findViewById(R.id.btn45)},
                    {findViewById(R.id.btn51), findViewById(R.id.btn52), findViewById(R.id.btn53), findViewById(R.id.btn54), findViewById(R.id.btn55)}
            };

            // Set onClickListeners for Buttons
            for( int i = 0; i < 5; i++){
                for( int j = 0; j < 5; j++){
                    int row = i, col = j;
                    btns[row][col].setOnClickListener(new View.OnClickListener() {
                        final int r = row;
                        final int c = col;
                        @Override
                        public void onClick(View v) {
                            if (enabled)            // checks if game enabled before doing clickButton function
                                clickButton(r,c);
                        }
                    });
                }
            }

            // get reset button and set its onClickListener
            btnReset = findViewById(R.id.btnReturn);
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    randomizeTiles();   // set random tile values to all tiles
                    updateColors();     // changes tiles color depending on their tile values
                    enabled = true;     // enables buttons so that they can be clicked
                }
            });

            // get give up button and set its onClickListener
            btnSameColor = findViewById(R.id.btnGiveup);
            btnSameColor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //randomizeTiles();   // set random tile values to all tiles
                    //updateColors();     // changes tiles color depending on their tile values
                    giveUP();

                }
            });

            // INITIALIZE GAME
            randomizeTiles();   // set random tile values to all tiles
            updateColors();     // changes tiles color depending on their tile values
        }

        private void clickButton(int row, int col){ // sets tile values of this button and 4 surrounding buttons to the next value: 0->1, 1->2, 2->0

            changeTileValue( row , col );           // change tile value of this button
            changeTileValue( row - 1 , col );   // change tile value of up button
            changeTileValue( row + 1 , col );   // change tile value of down button
            changeTileValue( row , col - 1 );   // change tile value of left button
            changeTileValue( row , col + 1 );   // change tile value of right button

            updateColors(); // update buttons to display correct color according to its tile value

            if( allSameTiles() ){   // check if all colors are the same (win condition)
                enabled = false;    // disables the buttons because win condition
                Toast.makeText(getApplicationContext(), "YOU WIN !", Toast.LENGTH_SHORT).show(); // Display win message
            }
        }

        private void changeTileValue(int row, int col) {  // increments the tile value of a single tile such that 0->1, 1->2, 2->0
            if( row<0 || row>4 || col<0 || col>4 )
                return;     // check if row and column is invalid and ends the function if so

            tiles[row][col] = ( tiles[row][col] + 1 ) % 3;// actual changing of value
        }
        private void updateColors(){
            // Update button color display depending on tile value
            for( int row = 0; row < 5; row++){
                for( int col = 0; col < 5; col++){

                    int tileValue = tiles[row][col];            // get tile value from tiles
                    int color = COLORSET[ tileValue ];          // get corresponding color of the tile value
                    btns[row][col].setBackgroundColor( color ); // set background color of the button to this color

                }
            }
        }
        private boolean allSameTiles(){               // function to check if all tiles are same color
            int val = tiles[0][0];                  // gets value of 1st tile
            for(int row = 0; row < 5; row++) {
                for( int col = 0; col < 5; col++){
                    if( tiles[row][col] != val )    // check if current tile value is not the same as val
                        return false;               // return false if it meets a different value
                }
            }
            return true;                            // returns true if all tile values are the same
        }

        private void randomizeTiles(){                          // Function to randomize tile values
            Random random = new Random();
            for( int row = 0; row < 5; row++){
                for( int col = 0; col < 5; col++){

                    tiles[row][col] = random.nextInt(3);  // set tile value a random value from 0 to 2

                }
            }
        }

        private void giveUP(){

            Random random = new Random();
            int set = random.nextInt(3);

            for( int row = 0; row < 5; row++){
                for( int col = 0; col < 5; col++){

                    tiles[row][col] = set;            // get tile value from tiles
                    int color = COLORSET[ set ];          // get corresponding color of the tile value
                    btns[row][col].setBackgroundColor( color ); // set background color of the button to this color

                    if( allSameTiles() ){   // check if all colors are the same (win condition)
                        enabled = false;    // disables the buttons because win condition
                        Toast.makeText(getApplicationContext(), "BETTER LUCK NEXT TIME!", Toast.LENGTH_SHORT).show(); // Display win message
                    }

                }
            }

        }
    }