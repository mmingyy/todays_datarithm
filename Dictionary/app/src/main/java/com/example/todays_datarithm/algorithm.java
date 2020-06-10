package com.example.todays_datarithm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class algorithm extends AppCompatActivity {
    Button btn_al1;
    Button btn_al2;
    Button btn_al3;
    Button btn_al4;
    Button btn_al5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm);

        //al1버튼 -> al1.class로 화면전환
        btn_al1 = findViewById(R.id.btn_al1);
        btn_al1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(algorithm.this, al1.class);
                startActivity(intent); //algorithm->al1
            }
        });

        //al2버튼 -> al2.class로 화면전환
        btn_al2 = findViewById(R.id.btn_al2);
        btn_al2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(algorithm.this, al2.class);
                startActivity(intent); //algorithm->al2
            }
        });

        //al3버튼 -> al3.class로 화면전환
        btn_al3 = findViewById(R.id.btn_al3);
        btn_al3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(algorithm.this, al3.class);
                startActivity(intent); //algorithm->al3
            }
        });

        //al4버튼 -> al4.class로 화면전환
        btn_al4 = findViewById(R.id.btn_al4);
        btn_al4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(algorithm.this, al4.class);
                startActivity(intent); //algorithm->al4
            }
        });

        //al5버튼 -> al5.class로 화면전환
        btn_al5 = findViewById(R.id.btn_al5);
        btn_al5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(algorithm.this, al5.class);
                startActivity(intent); //algorithm->al5
            }
        });
    }
}
