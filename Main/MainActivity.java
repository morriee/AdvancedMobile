package com.example.papaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

    }

    //시계
    @Override
    protected void onStart(){
        super.onStart();
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(1000);
                    } catch (Throwable t) {
                    }
                }
            }
        });
        myThread.start();
    }

    Handler handler =new Handler(){
        //@Override
        public void handlerMessage(Message msg){ updateThread(); }
    };

    private void updateThread(){
        String currentTime = currentTime();
        text.setText(currentTime);
    }

    public String currentTime(){
        long current = System.currentTimeMillis();      //현재 시간 저장
        Date date = new Date(current);

        SimpleDateFormat sdfHour = new SimpleDateFormat("HH");
        String temp = sdfHour.format(date);
        String ampm = "";

        if(Integer.parseInt(temp) >= 12){
            temp = String.valueOf(Integer.parseInt(temp)-12);
            ampm =" PM";
        }else {
            ampm = "AM";
        }
        SimpleDateFormat sdfMin = new SimpleDateFormat("mm");
        String temp2 = sdfMin.format(date);
        temp = temp + ":" + temp2 +ampm;

        SimpleDateFormat sdfMon = new SimpleDateFormat("MM/DD");
        SimpleDateFormat sdfDate = new SimpleDateFormat("D");
        String month = sdfMon.format(date);
        String d = sdfDate.format(date);

        switch(d){
            case "월":
                d = " Mon ";
                break;
            case "화":
                d = " Tue ";
                break;
            case "수":
                d = " Wed ";
                break;
            case "목":
                d = " Thu ";
                break;
            case "금":
                d = " Fri ";
                break;
            case "토":
                d = " Sat ";
                break;
            case "일":
                d = " Sun ";
                break;
        }
        month = month + d + temp;
        return month;
    }
}
