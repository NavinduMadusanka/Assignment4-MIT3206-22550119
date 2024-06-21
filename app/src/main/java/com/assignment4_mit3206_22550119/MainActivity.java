package com.assignment4_mit3206_22550119;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1,number2;
    Button add,subtract;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView) findViewById(R.id.result);
        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        add=(Button) findViewById(R.id.add);
        subtract=(Button) findViewById(R.id.subtract);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });
    }
}