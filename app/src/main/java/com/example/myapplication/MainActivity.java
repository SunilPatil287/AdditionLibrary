package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ace.library_expone.AdditionClass;

public class MainActivity extends AppCompatActivity {

    AdditionClass additionClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        additionClass=new AdditionClass(5,6);

        Toast.makeText(getApplicationContext(),"Sum : "+additionClass.Additions(),Toast.LENGTH_LONG).show();

    }
}
