package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ENTDEP extends AppCompatActivity {
      TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_n_t_d_e_p);


        //doctor's details
        text1=(TextView) findViewById(R.id.entdr);
        text1.setMovementMethod(new ScrollingMovementMethod());




        InputStream inputStream=this.getResources().openRawResource(R.raw.drpandey);
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