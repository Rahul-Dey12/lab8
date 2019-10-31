package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    String name,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
    }
    public void click(View view){
        name=e1.getText().toString();
        age=e2.getText().toString();
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("name",name);
        i.putExtra("age",age);
        startActivity(i);
    }
}
