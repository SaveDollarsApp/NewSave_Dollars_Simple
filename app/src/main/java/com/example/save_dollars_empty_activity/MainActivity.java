package com.example.save_dollars_empty_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText Income, Expenses;
    Button add, subtract;

    float result_num;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        Income = (EditText)findViewById(R.id.Income);
        Expenses = (EditText)findViewById(R.id.Expenses);

        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(Income.getText().toString());
                num2 = Integer.parseInt(Expenses.getText().toString());
                result_num = num1 - num2;

                result.setText(String.valueOf(result_num));

            }
        });

    }
}
