package com.example.papaya;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;




import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Locale;


import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainActivity extends AppCompatActivity {
    public  String ImagePath = null;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView times = (TextView)findViewById(R.id.Time);


        Calendar cal = Calendar.getInstance();

        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

        SimpleDateFormat AmPm = new SimpleDateFormat("a", Locale.US);

        Date today = new Date();
        String AmPmString = AmPm.format(today);

        String korDayOfWeek = null;
        switch (dayOfWeek){
            case 1:
                korDayOfWeek = "SUN";
                break;
            case 2:
                korDayOfWeek = "MON";
                break;
            case 3:
                korDayOfWeek = "TUE";
                break;
            case 4:
                korDayOfWeek = "WED";
                break;
            case 5:
                korDayOfWeek = "THU";
                break;
            case 6:
                korDayOfWeek = "FRI";
                break;
            case 7:
                korDayOfWeek = "SAT";
                break;
            default:
                break;
        }
        times.setText(month+"/"+date+"  "+korDayOfWeek+"  "+hour+":"+minute+"  "+AmPmString);


        TextView textView = (TextView)findViewById(R.id.Temperature);
        TextView textView1= (TextView)findViewById(R.id.Finedust);
        TextView textView2= (TextView)findViewById(R.id.Ozone);
        ImageView imageView= (ImageView)findViewById(R.id.WeatherImage);







        WeatherConnection weatherConnection = new WeatherConnection();
        FinedustConnection finedustConnection = new FinedustConnection();
        OzoneConnection ozoneConnection = new OzoneConnection();

        AsyncTask<String, String, String> result2 = finedustConnection.execute("","");
        AsyncTask<String, String, String> result3 = ozoneConnection.execute("","");

        try{



            AsyncTask<String, String, String> result1 = weatherConnection.execute("","");

            String msg1 = result1.get();
            String msg2 = result2.get();
            String msg3 = result3.get();



            if (msg1.matches(".*맑음*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l1.gif";

            } else if (msg1.matches(".*구름조금*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l2.gif";

            } else if (msg1.matches(".*흐림*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l3.gif";
            } else if (msg1.matches(".*비*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l4.gif";

            } else if (msg1.matches(".*눈*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l5.gif";

            } else if (msg1.matches(".*진눈깨비*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l6.gif";

            } else if (msg1.matches(".*소나기*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l7.gif";

            } else if (msg1.matches(".*소낙눈*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l8.gif";

            } else if (msg1.matches(".*안개*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l9.gif";

            } else if (msg1.matches(".*뇌우*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l10.gif";

            } else if (msg1.matches(".*흐려짐*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l11.gif";

            } else if (msg1.matches(".*흐려져뇌우*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l12.gif";

            } else if (msg1.matches(".*흐려져비*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l13.gif";

            } else if (msg1.matches(".*흐려져눈*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l14.gif";

            } else if (msg1.matches(".*흐려져진눈깨비*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l15.gif";

            } else if (msg1.matches(".*흐린후갬*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l16.gif";

            } else if (msg1.matches(".*뇌우후갬*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l17.gif";

            } else if (msg1.matches(".*비후갬*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l18.gif";

            } else if (msg1.matches(".*눈후갬*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l19.gif";

            } else if (msg1.matches(".*진눈깨비후갬*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l20.gif";

            } else if (msg1.matches(".*구름많음*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l21.gif";

            } else if (msg1.matches(".*황사*.")) {
                ImagePath = "https://ssl.pstatic.net/static/weather/images/w_icon/w_l22.gif";

            } else
                System.out.println("error");

            textView.setText(msg1.toString());
            textView1.setText("미세먼지   "+msg2.toString());
            textView2.setText("오존          "+msg3.toString());

            Thread mThread = new Thread(){
                @Override
                public void run(){
                    try{
                        URL url = new URL(ImagePath);
                        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        InputStream is = conn.getInputStream();
                        bitmap = BitmapFactory.decodeStream(is);

                    }catch(IOException ex) {

                    }

                }
            };
            mThread.start();
            try{
                mThread.join();
                imageView.setImageBitmap(bitmap);
            } catch (InterruptedException e){

            }


        }catch (Exception e){

        }


    }

    public void onClick(View v){
        switch(v.getId()) {
        }
    }



    public class WeatherConnection extends AsyncTask<String, String, String>{


        @Override
        protected String doInBackground(String... params) {



            try{

                String path = "https://weather.naver.com/rgn/townWetr.nhn?naverRgnCd=09290555";

                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("em");

                System.out.println(elements);

                Element targetElement = elements.get(2);

                String text = targetElement.text();

                System.out.println(text);

                return text;

            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }

    public class FinedustConnection extends AsyncTask<String, String, String>{


        @Override
        protected String doInBackground(String... params) {



            try{

                String path = "https://weather.naver.com/rgn/townWetr.nhn?naverRgnCd=09290555";

                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("em");

                System.out.println(elements);

                Element targetElement = elements.get(3);

                String text = targetElement.text();

                System.out.println(text);

                return text;

            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }

    public class OzoneConnection extends AsyncTask<String, String, String>{


        @Override
        protected String doInBackground(String... params) {


            try{

                String path = "https://weather.naver.com/rgn/townWetr.nhn?naverRgnCd=09290555";

                Document document = Jsoup.connect(path).get();

                Elements elements = document.select("em");

                System.out.println(elements);

                Element targetElement = elements.get(4);

                String text = targetElement.text();

                System.out.println(text);

                return text;

            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }
}
