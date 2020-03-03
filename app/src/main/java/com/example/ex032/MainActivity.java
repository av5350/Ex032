package com.example.ex032;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button cancelBtn;

    TextView tv;

    Button clickBtn;

    Random rnd = new Random();

    int randomNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancelBtn =(Button)findViewById(R.id.cancelBtn);
        tv =(TextView) findViewById(R.id.tv);
        clickBtn =(Button)findViewById(R.id.clickBtn);
    }

    public void randomNum(View view) {
        randomNum = rnd.nextInt(3)+1;

        tv.setText("Number=" + randomNum);
    }

    public void cancel(View view) {
        tv.setText("Number not found");
    }
}
