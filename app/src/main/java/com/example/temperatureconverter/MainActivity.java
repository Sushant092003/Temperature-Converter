package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button cbut,fbut;
    private TextView result;
    private EditText entertemp;

    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbut = findViewById(R.id.cbutton);
        fbut = findViewById(R.id.fbutton);
        result = findViewById(R.id.result);
        entertemp = findViewById(R.id.editTextText);

        cbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(entertemp.getText().toString());
                 result0 = (temp * 1.8) + 32;
                 result.setText(String.valueOf(result0));
            }
        });

        fbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(entertemp.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}