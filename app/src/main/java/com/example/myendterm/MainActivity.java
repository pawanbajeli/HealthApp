package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //code for the Consult page
    public void consultPage(View view)
    {
        Intent intent=new Intent(this,ConsultPage.class);
        startActivity(intent);

    }

    //code for the disease page
    public void diseasePage(View view)
    {
        Intent intent=new Intent(this,diseasePage.class);
        startActivity(intent);
    }


    //code for the activity page
    public void activityPage(View view)
    {
        Intent intent=new Intent(this,NearHospital.class);
        startActivity(intent);
    }


    //code for the emergency page
    public void emergencyPage(View view)
    {
       Intent intent=new Intent(this,EmergencyPage.class);
       startActivity(intent);

    }
}