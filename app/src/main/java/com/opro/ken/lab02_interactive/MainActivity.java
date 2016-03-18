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
    StringBuilder PriceMessage = new StringBuilder("NT$ " + mPrice);
    StringBuilder QuantityMessage = new StringBuilder(mQuantity);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayMessage();
    }

    private void displayMessage() {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(PriceMessage);
    }

    private void displayQuantity() {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        int start = 0;
        int end = QuantityMessage.length();
        QuantityMessage.delete(start, end).append(mQuantity);
        tv1.setText(QuantityMessage);
    }

    private void displayTotalPrice() {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        CheckBox toppings = (CheckBox) findViewById(R.id.toppings);
        int total = mPrice * mQuantity;
        String myString = NumberFormat.getCurrencyInstance().format(total);
        String message = "Name: " + name +
                "\n臭豆腐" + "\n加泡菜? " +
                toppings.isChecked() +
                "\nQuantity " + mQuantity + " \n"
                + myString + (mQuantity == 0 ?
                "\nFree!!!" : "\nThank you:)");
        tv2.setText(message);
    }

    public void submitOrder(View view) {
        displayTotalPrice();
    }

    public void incement(View view) {
        ++mQuantity;
        resetPriceMessage();
        displayMessage();
        displayQuantity();
    }

    public void decement(View view) {
        if (mQuantity > 0) {
            --mQuantity;
            resetPriceMessage();
            displayMessage();
            displayQuantity();

        }
    }

    public void add(View view) {
        resetPriceMessage();
        displayMessage();
    }

    private void clearPriceMessage() {
        int start = 0;
        int end = PriceMessage.length();
        PriceMessage.delete(start, end);
    }

    private void resetPriceMessage() {
        clearPriceMessage();
        PriceMessage.append("臭豆腐").append("NT$ ").append(mPrice);

    }

    public void mediator(View view) {
        if (view.getId() == R.id.b1)
            decement(view);
        if (view.getId() == R.id.b2)
            incement(view);
                if (view.getId() == R.id.toppings)
                    add(view);
                if (view.getId() == R.id.b3)
                    submitOrder(view);
            }

    }

