package com.example.myhesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText number1;
    EditText number2;
    TextView result1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1 = findViewById(R.id.number1);
         number2 = findViewById(R.id.number2);
         result1 = findViewById(R.id.textView);




    }

     public void toplama(View view){
      if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
          result1.setText("Please enter a number");
          return;
      }
      int num1 = Integer.parseInt(number1.getText().toString());
      int num2 = Integer.parseInt(number2.getText().toString());
        int result = num1 + num2;
        result1.setText("Result: " + result);
    }
     public void çikarma(View view){
    if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
        result1.setText("Please enter a number");
        return;}
      int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
            int result = num1 - num2;
            result1.setText("Result: " + result);


     }

     public void car(View view){
             if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
                 result1.setText("Please enter a number");
                 return;
             }
             int num1 = Integer.parseInt(number1.getText().toString());
             int num2 = Integer.parseInt(number2.getText().toString());
             int result = num1 * num2;
             result1.setText("Result: " + result);
         }

     public void bolme(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result1.setText("Please enter a number");
            return;
        }

         int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
            int result = num1 / num2;
            result1.setText("Result: " + result);
     }









}