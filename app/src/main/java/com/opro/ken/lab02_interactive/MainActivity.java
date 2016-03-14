package com.opro.ken.lab02_interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(i * 50);
    }

    private void display(int num2) {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(String.valueOf(num2));
        if (num2 > 0) {
            tv2.setText(String.valueOf(num2 + "Thank you:)"));
        }
        if (num2 == 0) {
            tv2.setText(String.valueOf(num2 + "Free!!!"));
        }
    }
    int i = 0;

    public void a(View view) {
        aa(++i);
    }

    public void b(View view) {
        if (i > 0) {
            i--;
            aa(i);
        }
    }

    private void aa(int num1) {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(String.valueOf(num1));
    }
}