package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (item.getItemId() == R.id.menuChange) {
            Toast.makeText(this, "Edit Object Item is Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.menuReset) {
            Toast.makeText(this, "Reset Object Item is Clicked", Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundColor(getColor(R.color.purple_500));
            btnChanger.setText("");
            btnChanger.setScaleX(1);
            btnChanger.setScaleY(1);
            btnChanger.setVisibility(View.VISIBLE);

        }
        else if (item.getItemId() == R.id.menuExit) {
            finish();
        }

        ////////////////new state

        else if(item.getItemId() == R.id.menuColor){
            int color = 0;
            if(color == 0){
                btnChanger.setBackgroundColor(Color.BLUE);
                color = 1;
            }
            else if(color == 1){
                btnChanger.setBackgroundColor(Color.GREEN);
                color = 0;
            }

        }
        else if(item.getItemId() == R.id.menuSize){

            btnChanger.setScaleX(2);
            btnChanger.setScaleY(2);

        }
        else if(item.getItemId() == R.id.menuText){
            btnChanger.setText("B O O O");
        }
        else if(item.getItemId() == R.id.menuTextColor){
            btnChanger.setText("B O O O");
            btnChanger.setTextColor(Color.BLACK);
        }
        else if(item.getItemId() == R.id.menuVisibility){
            btnChanger.setVisibility(View.GONE);
        }

        return true;
    }

}