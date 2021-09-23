package com.alisherka7.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    Button btnP, btn10b, btn100b, btn1000b,btn10t, btn100t, btn1000t, btnReset;
    ToggleButton tgButton1, tgButton2;
    Switch switchBtn;
    FrameLayout frLayout1, frLayout2;
    String ddata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnP = (Button)findViewById(R.id.btnPlus);
        // 일 전
        btn10b = (Button)findViewById(R.id.btn10b);
        btn100b = (Button)findViewById(R.id.btn100b);
        btn1000b = (Button)findViewById(R.id.btn1000b);
        // 일 후
        btn10t = (Button)findViewById(R.id.btn10t);
        btn100t = (Button)findViewById(R.id.btn100t);
        btn1000t = (Button)findViewById(R.id.btn1000t);
        btnReset = (Button)findViewById(R.id.btnreset);
        //change color
        tgButton1 = (ToggleButton)findViewById(R.id.tgButton1);
        tgButton2 = (ToggleButton)findViewById(R.id.tgButton2);

        //switch
        switchBtn = (Switch) findViewById(R.id.switch1);

        //frame layout
        frLayout1 = (FrameLayout)findViewById(R.id.frLayout1);
        frLayout2 = (FrameLayout)findViewById(R.id.frLayout2);



        frLayout1.setVisibility(View.VISIBLE);
        frLayout2.setVisibility(View.GONE);
        frLayout1.setBackgroundResource(R.color.green);
        frLayout2.setBackgroundResource(R.color.pink);

        tv1 = (TextView) findViewById(R.id.textViewResult);
        et1 = (EditText) findViewById(R.id.editText);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



        // 일 후
        btn10t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){

                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, 10);
                        tv1.setText("10일후 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        btn100t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){


                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, 100);
                        tv1.setText("100일후 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        btn1000t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){

                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, 1000);
                        tv1.setText("1000일후 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });


        // 일 전
        btn10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){

                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, -10);
                        tv1.setText("10일 전 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        btn100b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){

                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, -100);
                        tv1.setText("100일 전 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        btn1000b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dateString = et1.getText().toString();
                try {
                    if(dateString.equals("")){

                    }else{
                        Date date = sdf.parse(dateString);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DATE, -1000);
                        tv1.setText("1000일 전 :" + sdf.format(calendar.getTime()));
                        et1.setText(sdf.format(calendar.getTime()));
                    };


                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
                tv1.setText("결과");
            }
        });

        // change color
        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    frLayout2.setVisibility(View.VISIBLE);
                    frLayout1.setVisibility(View.GONE);
                }
                else {
                    frLayout1.setVisibility(View.VISIBLE);
                    frLayout2.setVisibility(View.GONE);
                }

            }
        });

        tgButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    frLayout1.setBackgroundResource(R.color.red);
                }else{
                    frLayout1.setBackgroundResource(R.color.green);
                }
            }
        });

        tgButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    frLayout2.setBackgroundResource(R.color.yellow);
                } else {
                    frLayout2.setBackgroundResource(R.color.pink);
                }
            }
        });
    }
}