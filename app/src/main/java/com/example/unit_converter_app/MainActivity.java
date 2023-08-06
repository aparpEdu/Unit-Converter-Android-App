package com.example.unit_converter_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView resultText;
    private EditText value;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.result);
        Button convertButton = findViewById(R.id.button);
        value = findViewById(R.id.editText);
        radioGroup = findViewById(R.id.radioGroup);

       convertButton.setOnClickListener(view -> {
           double sum;
           String finalValue;
           double inputNumber = Double.parseDouble(String.valueOf(value.getText()));
           if(radioGroup.getCheckedRadioButtonId() == R.id.radio_kgs){
               sum = inputNumber * 2.20462;
                finalValue = Math.floor(sum * 100) / 100 + "lbs";
               resultText.setText(finalValue);
           }else {
               sum = inputNumber * 0.453592;
               finalValue = Math.floor(sum * 100) / 100 + "kgs";
               resultText.setText(finalValue);
           }
       });
}
}