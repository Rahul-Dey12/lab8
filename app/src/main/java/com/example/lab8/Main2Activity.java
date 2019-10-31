package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t=findViewById(R.id.textView5);

        Intent i=getIntent();
        t.setText(i.getStringExtra("name")+i.getStringExtra("age"));
    }

    public  void click2(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
