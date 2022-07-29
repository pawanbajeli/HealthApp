package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NearHospital extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_hospital);

        //this segment of code is for meditaion part;
        //to print things in the meditation part application
        text1=(TextView) findViewById(R.id.med);

        text1.setMovementMethod(new ScrollingMovementMethod());

        //input stream
        InputStream inputStream=this.getResources().openRawResource(R.raw.medidation);
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


//        //this segment of code is for running part;
//        //to print things in the running part application
        text2=(TextView) findViewById(R.id.run1);
        text2.setMovementMethod(new ScrollingMovementMethod());

        //input stream
        InputStream inputStream2=this.getResources().openRawResource(R.raw.ruuning);
        BufferedReader bufferedReader2=new BufferedReader(new InputStreamReader(inputStream2));
        // create string buffer object
        StringBuffer stringBuffer2=new StringBuffer();
        String strData2="";
        if(inputStream2!=null)
        {
            try {

                while( (strData2=bufferedReader2.readLine() )!= null) {
                    stringBuffer2.append(strData2);
                }
                text2.setText(stringBuffer2);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }


        //this segment of code is for sports part;
        //to print things in the running part application
//        text3=(TextView) findViewById(R.id.med);
//
//        //input stream
//        InputStream inputStream3=this.getResources().openRawResource(R.raw.spo);
//        BufferedReader bufferedReader3=new BufferedReader(new InputStreamReader(inputStream3));
//        // create string buffer object
//        StringBuffer stringBuffer3=new StringBuffer();
//        String strData3="";
//        if(inputStream!=null)
//        {
//            try {
//
//                while( (strData3=bufferedReader.readLine() )!= null) {
//                    stringBuffer.append(strData3);
//                }
//                text1.setText(stringBuffer3);
//
//            }
//            catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//        }



    }
}