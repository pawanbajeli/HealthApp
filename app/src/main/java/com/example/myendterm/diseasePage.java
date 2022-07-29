package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Arrays;


public class diseasePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_page);
    }

    public void infoMath(View view)
    {
        //passing the tapped button
        Button b=(Button) view;
        String  pos=b.getTag().toString();
        Intent intent=new Intent(this,diseaseinfo.class);
        intent.putExtra("problem",pos);
        startActivity(intent);

    }
}