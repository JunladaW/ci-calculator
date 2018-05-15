package com.example.junlada.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_calculor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCalculator();
            }
        });
    }

    public void onCalculator() {
        TextView txvResult = findViewById(R.id.txt_result);
        EditText txvFirst = findViewById(R.id.edt_input1);
        EditText txvSecond = findViewById(R.id.edt_input2);

        int first = Integer.parseInt(txvFirst.getText().toString());
        int second = Integer.parseInt(txvSecond.getText().toString());
        Calculator calculator = new Calculator();
        int result = calculator.plus(first, second);

        txvResult.setText("Result = " + result);

    }
}