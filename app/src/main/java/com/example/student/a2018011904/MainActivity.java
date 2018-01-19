package com.example.student.a2018011904;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new AFragment());
        ft.commit();
    }

    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1, new BFragment());
        ft.commit();
    }
}
