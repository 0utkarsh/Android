package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Calculate, Mode;
    private EditText e1, e2;
    private TextView e3;
    int i = 0;
    double a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Calculate = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        e3 = (TextView) findViewById(R.id.et3);
        Mode = (Button) findViewById(R.id.bt4);

    }
        public void mode_select (View view)
        {
            try {

                i++;
                if (i == 1) {
                    add(view);
                    Mode.setText("ADDITION");
                } else if (i == 2) {
                    sub(view);
                    Mode.setText("SUBTRACTION");
                } else if (i == 3) {
                    mul(view);
                    Mode.setText("MULTIPLICATION");
                } else {
                    div(view);
                    Mode.setText("DIVISION");
                    i = 0;
                }
            } catch (Exception e) {
                Toast.makeText(this, "Enter a Number", Toast.LENGTH_SHORT).show();
            }
        }

        public void add(View view)
        {
            e1.getText().toString();
            e2.getText().toString();
            double a1 = Double.valueOf(e1.getText().toString());
            double a2 = Double.valueOf(e2.getText().toString());
            a3 = a1 + a2;

        }
        public void sub(View view)
        {
            e1.getText().toString();
            e2.getText().toString();
            double a1 = Double.valueOf(e1.getText().toString());
            double a2 = Double.valueOf(e2.getText().toString());
            a3 = a1 - a2;

        }
        public void mul(View view)
        {
            e1.getText().toString();
            e2.getText().toString();
            double a1 = Double.valueOf(e1.getText().toString());
            double a2 = Double.valueOf(e2.getText().toString());
            a3= a1 * a2;

        }
        public void div(View view)
        {
            e1.getText().toString();
            e2.getText().toString();
            double a1 = Double.valueOf(e1.getText().toString());
            double a2 = Double.valueOf(e2.getText().toString());
            a3 = a1 / a2;

        }



    public void disp(View view) throws Exception {
        try {
            e3.setText(Double.toString(a3));
        } catch (Exception e) {
            Toast.makeText(this, "Press Mode Button", Toast.LENGTH_SHORT).show();
        }
    }

  }
