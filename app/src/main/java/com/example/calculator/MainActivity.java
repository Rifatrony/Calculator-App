package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addButton, subButton, mulButton, divButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);

        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);
        mulButton = findViewById(R.id.mulButtonId);
        divButton = findViewById(R.id.divButtonId);

        resultTextView = findViewById(R.id.resultTextViewId);


        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();

        //converting to double
        try{
            double num1 = Double.parseDouble(value1);
            double num2 = Double.parseDouble(value2);
            if(v.getId()==R.id.addButtonId){
                double result = num1+num2;
                resultTextView.setText("Result is: "+result);
            }
            if(v.getId()==R.id.subButtonId){
                double result = num1-num2;
                resultTextView.setText("Result is: "+result);
            }
            if(v.getId()==R.id.mulButtonId){
                double result = num1*num2;
                resultTextView.setText("Result is: "+result);
            }
            if(v.getId()==R.id.divButtonId) {
                double result = num1/num2;
                resultTextView.setText("Result is: "+result);
            }
        }
        catch(Exception e){
            Toast.makeText(MainActivity.this,"Please enter some value",Toast.LENGTH_SHORT).show();
        }
    }
}