package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        //info about the cardio doc
        TextView text1 = (TextView) findViewById(R.id.drmer);

        text1.setMovementMethod(new ScrollingMovementMethod());

        //input stream
        InputStream inputStream = this.getResources().openRawResource(R.raw.drmer);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        // create string buffer object
        StringBuffer stringBuffer = new StringBuffer();
        String strData = "";
        if (inputStream != null) {
            try {

                while ((strData = bufferedReader.readLine()) != null) {
                    stringBuffer.append(strData);
                }
                text1.setText(stringBuffer);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}