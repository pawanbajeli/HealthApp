package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Dent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dent);



        TextView text1;

        text1=(TextView) findViewById(R.id.dranisha);

        text1.setMovementMethod(new ScrollingMovementMethod());

        //input stream
        InputStream inputStream=this.getResources().openRawResource(R.raw.drsen);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        // create string buffer object
        StringBuffer stringBuffer=new StringBuffer();
        String strData="";
        if(inputStream!=null)
        {
            try {

                while( (strData=bufferedReader.readLine() )!= null) {
                    stringBuffer.append(strData);
                }
                text1.setText(stringBuffer);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }


    }
}