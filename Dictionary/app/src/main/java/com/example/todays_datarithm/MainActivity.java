package com.example.todays_datarithm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //데이터 받아 올 배열
    //ArrayList<String> arr_data = new ArrayList<String>();

    Button btn_board;
    Button btn_data_struct;
    Button btn_algorithm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //게시판 버튼 -> bulletin_board.class로 화면전환
        btn_board = findViewById(R.id.btn_board);
        btn_board.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, bulletin_board.class);
                startActivity(intent); //main->bulletin
            }
        });

        //자료구조 버튼 -> data_struct.class로 화면전환
        btn_data_struct = findViewById(R.id.btn_data_struct);
        btn_data_struct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, data_struct.class);
                startActivity(intent); //main->data_struct
            }
        });

        //알고리즘 버튼 -> algorithm.class로 화면전환
        btn_algorithm = findViewById(R.id.btn_algorithm);
        btn_algorithm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, algorithm.class);
                startActivity(intent); //main->algorithm
            }
        });
    }
}
