package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputValue;
    private RadioGroup conversionType;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        conversionType = findViewById(R.id.conversionType);
        resultText = findViewById(R.id.resultText);
        Button convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    private void convert() {
        String inputStr = inputValue.getText().toString().trim();
        if (inputStr.isEmpty()) {
            resultText.setText("Please enter a value to convert");
            return;
        }

        double input = Double.parseDouble(inputStr);
        double result;

        int selectedId = conversionType.getCheckedRadioButtonId();
        if (selectedId == R.id.celsiusToFahrenheit) {
            result = Converter.celsiusToFahrenheit(input);
            resultText.setText(String.format("%.2f Celsius = %.2f Fahrenheit", input, result));
        } else if (selectedId == R.id.fahrenheitToCelsius) {
            result = Converter.fahrenheitToCelsius(input);
            resultText.setText(String.format("%.2f Fahrenheit = %.2f Celsius", input, result));
        }
    }
}
