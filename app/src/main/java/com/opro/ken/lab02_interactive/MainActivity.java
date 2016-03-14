package com.opro.ken.lab02_interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int mQuantity = 0;
    int mPrice = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display();
    }

    private void display() {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        int total = mPrice * mQuantity ;
        String myString = NumberFormat.getCurrencyInstance().format(total);
        tv2.setText(myString);


        if (mQuantity > 0) {
            String myString1 = NumberFormat.getCurrencyInstance().format(total);
            tv2.setText(myString1+ "\nThank you:)");

        }
        else if (mQuantity == 0) {
            String myString1 = NumberFormat.getCurrencyInstance().format(total);
            tv2.setText(myString1+ "\nFree!!!");
        }
    }

    public void incement(View view) {
        ++mQuantity;
        aa();

    }

    public void decement(View view) {
        if (mQuantity > 0) {
            mQuantity--;
            aa();
        }
    }

    private void aa() {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(String.valueOf(mQuantity));
    }
}