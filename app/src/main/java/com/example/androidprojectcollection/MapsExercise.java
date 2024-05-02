package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MapsExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        final ConstraintLayout[] background = new ConstraintLayout[1];
        LinearLayout background2 = findViewById(R.id.invisible);


        ImageButton btnCotta;
        //8.139958,123.8466749
        btnCotta = (ImageButton) findViewById(R.id.imgbtnBirhen);
        btnCotta.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("geo:8.139958,123.8466749")
                );

                startActivity(intent);

               // background2.setVisibility(View.GONE);

                background[0] = (ConstraintLayout) findViewById(R.id.FullLayout);
                background[0].setBackgroundResource(R.drawable.birhen);


            }


        });

        ImageButton btnTops;
        //10.37017,123.8709617
        btnTops = (ImageButton) findViewById(R.id.imgbtnTops);
        btnTops.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("geo:10.37017,123.8709617")
                );

                startActivity(intent);

               // background2.setVisibility(View.GONE);

                background[0] = (ConstraintLayout) findViewById(R.id.FullLayout);
                background[0].setBackgroundResource(R.drawable.tops);

            }


        });

        ImageButton btnBukid;
        //8.1614534,123.6921844
        btnBukid = (ImageButton) findViewById(R.id.imgbtnView);
        btnBukid.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("geo:8.1614534,123.6921844")
                );

                startActivity(intent);

               // background2.setVisibility(View.GONE);

                background[0] = (ConstraintLayout) findViewById(R.id.FullLayout);
                background[0].setBackgroundResource(R.drawable.viewdeck);

            }


        });

        ImageButton btnPalaBeach;
        //11.1959404,119.2721486
        btnPalaBeach = (ImageButton) findViewById(R.id.imgbtnPala);
        btnPalaBeach.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("geo:11.1959404,119.2721486")
                );

                startActivity(intent);

               // background2.setVisibility(View.GONE);

                background[0] = (ConstraintLayout) findViewById(R.id.FullLayout);
                background[0].setBackgroundResource(R.drawable.secret_lagoon_el_nido_0265);


            }


        });

        ImageButton btnRandom;
        //35.7040744,139.5577317
        btnRandom = (ImageButton) findViewById(R.id.imgbtnRand);
        btnRandom.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("geo:35.7040744,139.5577317")
                );

                startActivity(intent);

                //background2.setVisibility(View.GONE);

                background[0] = (ConstraintLayout) findViewById(R.id.FullLayout);
                background[0].setBackgroundResource(R.drawable.o_japan_google_street_view_900);

            }


        });




    }
}