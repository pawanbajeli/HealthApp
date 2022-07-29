package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmergencyPage extends AppCompatActivity {



    //call to the ambulance
    public void callAmbulance( View view)
    {
        TextView edittext1;
        edittext1=(TextView) findViewById(R.id.callambu);
        String number=edittext1.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+number));
        startActivity(callIntent);

    }

    //call to the fire
    public void callFire(View view)
    {
        TextView edittext1;
        edittext1=(TextView) findViewById(R.id.callfire);
        String number=edittext1.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+number));
        startActivity(callIntent);

    }

    //call to the police
    public void callPolice(View view){
        TextView edittext1;
        edittext1=(TextView) findViewById(R.id.callpolic);
        String number=edittext1.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+number));
        startActivity(callIntent);


    }


    //call relative
    public void callRelative(View view)
    {
        EditText edittext1;
        edittext1=(EditText)findViewById(R.id.real);
        String number=edittext1.getText().toString();
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+number));
        startActivity(callIntent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_page);

        
    }

}