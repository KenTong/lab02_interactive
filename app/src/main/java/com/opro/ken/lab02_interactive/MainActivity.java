package com.opro.ken.lab02_interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int mQuantity = 0;
    int mPrice = 50;
    String name = "Ken";
    boolean ck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayTotalPrice();
    }

    private void displayTotalPrice() {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        int total = mPrice * mQuantity;
        String myString = NumberFormat.getCurrencyInstance().format(total);
        String message ="Name: "+name+"\n臭豆腐"+"\n加泡菜? "+ ck+"\nQuantity "+mQuantity+" \n"
                + myString+ (mQuantity == 0 ? "\nFree!!!" : "\nThank you:)");
        tv2.setText(message);
    }

    public void incement(View view) {
        ++mQuantity;
        displayQuantity();


    }

    public void decement(View view) {
        if (mQuantity > 0) {
            --mQuantity;
            displayQuantity();

        }
    }
    public void Check(){
        final CheckBox toppings = (CheckBox) findViewById(R.id.toppings);
        if (toppings.isChecked())
        {
            toppings.setChecked(false);
            ck=(true);
        }
    }


    //private void resetTotalPrice() {
        //TextView tv1 = (TextView) findViewById(R.id.tv1);
        //tv1.setText("");
    //}

    private void displayQuantity() {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(String.valueOf(mQuantity));

    }
    public void add(View view) {
        final CheckBox toppings = (CheckBox) findViewById(R.id.toppings);
        toppings.setChecked(true);
        ck=(true);
    }
}