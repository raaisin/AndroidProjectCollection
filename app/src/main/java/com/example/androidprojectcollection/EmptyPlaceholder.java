package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmptyPlaceholder extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_placeholder);

        btn1 = (Button) findViewById(R.id.btnReturn);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent3 = new Intent(
                        EmptyPlaceholder.this, ButtonTestingActivity.class
                );

                startActivity(intent3);

            }


        });
    }
}