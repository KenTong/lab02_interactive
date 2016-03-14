package com.opro.ken.lab02_interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(i);
    }

    private void display(int num2) {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        int total = 50 * num2;
        String myString = NumberFormat.getCurrencyInstance().format(total);
        tv2.setText(myString);


        if (num2 > 0) {
            String myString1 = NumberFormat.getCurrencyInstance().format(total);
            tv2.setText(myString1+ "\nThank you:)");
        }
        else if (num2 == 0) {
            String myString1 = NumberFormat.getCurrencyInstance().format(total);
            tv2.setText(myString1+ "\nFree!!!");
        }
    }

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