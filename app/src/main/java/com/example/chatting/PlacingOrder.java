package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacingOrder extends AppCompatActivity {
    TextView reg1,reg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placing_order);

    reg1=findViewById(R.id.reg1);
    reg2=findViewById(R.id.reg2);
        reg1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            AlertDialog.Builder alert = new AlertDialog.Builder(PlacingOrder.this);
            alert.setTitle("Here is Your Answer");
            alert.setMessage("First login as a customer, then select Milkman, then click on place order button, then enter your drop off location, then continue withe flow.");
            alert.setPositiveButton("OK", null);
            alert.show();
        }

    });
        reg2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            AlertDialog.Builder alert = new AlertDialog.Builder(PlacingOrder.this);
            alert.setTitle("Here is Your Answer");
            alert.setMessage("Must enter your Milk quantity and milk quality then press show price button.");
            alert.setPositiveButton("OK", null);
            alert.show();


        }

    });
}

}