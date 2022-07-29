 package com.example.myendterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class diseaseinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseaseinfo);


        //printing the information

         String arr[]={"0","1","2","3","4","5"};

        Intent intent=getIntent();
        String i_d=intent.getStringExtra("problem");
        int index=3;
        for(int i=0;i<arr.length;i++)
        {
              if(i_d.equals(arr[i]))
              {
                  index=i;
                  break;
              }
        }
        TextView text1;
       // string array to print the info in the screen
        //here I will extract the id of the problem
        //String text[]={"cold.txt","fever.txt","vomit.txt","gas.txt","head.txt","stomach.txt"};
        //for cold
        if(index==0) {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.cold);
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
        //for fever
       else if(index==1) {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.fever);
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

      //for vomit
        else if(index==2) {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.vomit);
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

        //for gas
        else if(index==3) {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.gas);
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


        //for head
       else if(index==4) {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.head);
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
        else  {


            text1 = (TextView) findViewById(R.id.info_id);

            text1.setMovementMethod(new ScrollingMovementMethod());

            //input stream
            InputStream inputStream = this.getResources().openRawResource(R.raw.stomach);
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
}