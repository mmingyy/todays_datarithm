package com.example.todays_datarithm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class data_struct extends AppCompatActivity {
    Button btn_ds1;
    Button btn_ds2;
    Button btn_ds3;
    Button btn_ds4;
    Button btn_ds5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_struct);

        //ds1버튼 -> ds1.class로 화면전환
        btn_ds1 = findViewById(R.id.btn_ds1);
        btn_ds1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(data_struct.this, ds1.class);
                startActivity(intent); //data_struct->ds1
            }
        });

        //ds2버튼 -> ds2.class로 화면전환
        btn_ds2 = findViewById(R.id.btn_ds2);
        btn_ds2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(data_struct.this, ds2.class);
                startActivity(intent); //data_struct->ds2
            }
        });

        //ds3버튼 -> ds3.class로 화면전환
        btn_ds3 = findViewById(R.id.btn_ds3);
        btn_ds3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(data_struct.this, ds3.class);
                startActivity(intent); //data_struct->ds3
            }
        });

        //ds4버튼 -> ds4.class로 화면전환
        btn_ds4 = findViewById(R.id.btn_ds4);
        btn_ds4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(data_struct.this, ds4.class);
                startActivity(intent); //data_struct->ds4
            }
        });

        //ds5버튼 -> ds5.class로 화면전환
        btn_ds5 = findViewById(R.id.btn_ds5);
        btn_ds5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(data_struct.this, ds5.class);
                startActivity(intent); //data_struct->ds5
            }
        });
    }
}
