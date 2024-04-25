package com.example.myfirstmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.imageView1);

    }

    public void onClick(View view) {

        boolean checker = true;

        if(checker == true){
            ImageView img = (ImageView)findViewById(R.id.imageView1);
            img.setVisibility(View.VISIBLE);
            checker = false;
        }
        if(checker == false){
            ImageView img = (ImageView)findViewById(R.id.imageView1);
            img.setVisibility(View.INVISIBLE);
            checker = true;
        }


    }

    public void onShowHideButtonClick(View view){
        if(myImageView.getVisibility() == View.VISIBLE){
            myImageView.setVisibility(View.INVISIBLE);
        }
        else{
            myImageView.setVisibility(View.VISIBLE);
        }
    }

}

