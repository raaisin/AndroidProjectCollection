package com.example.androidprojectcollection;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class ButtonTestingActivity extends AppCompatActivity{

    Button btn1, btn2, btn3, btn4, btn5;

    LinearLayout MainBackground;
    private View contentView;
    private View loadingView;
    private int shortAnimationDuration;
    int counter = 0;
    int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_testing);

        btn1 = (Button) findViewById(R.id.btnClose);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                finish();

            }


        });

        btn2 = (Button) findViewById(R.id.btnToast);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonTestingActivity.this, "Wanna Break From the Ads?", Toast.LENGTH_SHORT).show();
            }
        });

        btn3 = (Button) findViewById(R.id.btnChangeBG);
        LinearLayout MainBG = findViewById(R.id.MainBackground);
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                if(counter == 0){
                    counter = 1;
                    MainBG.setBackgroundColor(WHITE);

                }else if(counter == 1){
                    counter++;
                    MainBG.setBackgroundColor(RED);

                }else if(counter == 2){
                    counter++;
                    MainBG.setBackgroundColor(GREEN);

                }else if(counter == 3){
                    counter = 0;
                    MainBG.setBackgroundColor(BLUE);

                }



            }


        });

        btn4 = (Button) findViewById(R.id.btnChangeButtonBG);
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                /*
                int swapper = 1;

                switch(swapper){
                    case 1:
                        btn1.setBackgroundColor(WHITE);
                        btn1.setTextColor(BLACK);
                        btn2.setBackgroundColor(WHITE);
                        btn2.setTextColor(BLACK);
                        btn3.setBackgroundColor(WHITE);
                        btn3.setTextColor(BLACK);
                        btn4.setBackgroundColor(WHITE);
                        btn4.setTextColor(BLACK);
                        btn5.setBackgroundColor(WHITE);
                        btn5.setTextColor(BLACK);

                        swapper = 2;
                        break;

                    case 2:
                        btn1.setBackgroundColor(RED);
                        btn1.setTextColor(WHITE);
                        btn2.setBackgroundColor(RED);
                        btn2.setTextColor(WHITE);
                        btn3.setBackgroundColor(RED);
                        btn3.setTextColor(WHITE);
                        btn4.setBackgroundColor(RED);
                        btn4.setTextColor(WHITE);
                        btn5.setBackgroundColor(RED);
                        btn5.setTextColor(WHITE);

                        swapper = 1;
                        break;
                }
                */

                if(counter == 0){
                    counter = 1;
                    btn1.setBackgroundColor(WHITE);
                    btn1.setTextColor(BLACK);
                    btn2.setBackgroundColor(WHITE);
                    btn2.setTextColor(BLACK);
                    btn3.setBackgroundColor(WHITE);
                    btn3.setTextColor(BLACK);
                    btn4.setBackgroundColor(WHITE);
                    btn4.setTextColor(BLACK);
                    btn5.setBackgroundColor(WHITE);
                    btn5.setTextColor(BLACK);
                }else if(counter == 1){
                    counter++;
                    btn1.setBackgroundColor(RED);
                    btn1.setTextColor(WHITE);
                    btn2.setBackgroundColor(RED);
                    btn2.setTextColor(WHITE);
                    btn3.setBackgroundColor(RED);
                    btn3.setTextColor(WHITE);
                    btn4.setBackgroundColor(RED);
                    btn4.setTextColor(WHITE);
                    btn5.setBackgroundColor(RED);
                    btn5.setTextColor(WHITE);
                }else if(counter == 2){
                    counter = 0;
                    btn1.setBackgroundColor(GREEN);
                    btn1.setTextColor(WHITE);
                    btn2.setBackgroundColor(GREEN);
                    btn2.setTextColor(WHITE);
                    btn3.setBackgroundColor(GREEN);
                    btn3.setTextColor(WHITE);
                    btn4.setBackgroundColor(GREEN);
                    btn4.setTextColor(WHITE);
                    btn5.setBackgroundColor(GREEN);
                    btn5.setTextColor(WHITE);
                }


            }


        });

        btn5 = (Button) findViewById(R.id.btnDisappear);
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                btn5.setVisibility(View.GONE);

            }


        });
    }
}