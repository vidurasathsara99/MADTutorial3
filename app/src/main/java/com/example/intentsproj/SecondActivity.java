package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    String number1,number2;
    int n1,n2;
    TextView lblSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        lblSum=findViewById(R.id.lblSum);

        Intent intent = getIntent();

        number1=intent.getStringExtra("n1");
        number2=intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1= Integer.parseInt(number1);
        n2= Integer.parseInt(number2);

    }
    public void add(View view){
        lblSum.setText(number1+" + "+number2+" = "+(n1+n2));
    }

    public void substraction(View view){
        lblSum.setText(number1+" - "+number2+" = "+(n1-n2));
    }

    public void multiplication(View view){
        lblSum.setText(number1+" x "+number2+" = "+(n1*n2));
    }

    public void divition(View view){
        lblSum.setText(number1+" / "+number2+" = "+(n1/n2));
    }

}