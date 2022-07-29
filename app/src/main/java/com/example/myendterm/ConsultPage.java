package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConsultPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_page);

    }

    //for the ent department
    public void entDep(View view)
    {
        Intent intent=new Intent(this,ENTDEP.class);
        startActivity(intent);
    }


    //for the dentist department
    public void denDep(View view)
    {
         Intent intent= new Intent(this,Dent.class);
         startActivity(intent);
    }

    //for the cardiologist dep
    public void carDep(View view)
    {
        Intent intent=new Intent(this,Cardio.class);
        startActivity(intent);

    }


//    //for the psych department
//    public void psyDep(View view)
//    {
//         Intent intent= new Intent(this,psych.class);
//         startActivity(intent);
//    }
//
//    //for the orth department
//    public void orthDep(View view)
//    {
//
//        Intent intent= new Intent(this,ortho.class);
//        startActivity(intent);
//    }
}