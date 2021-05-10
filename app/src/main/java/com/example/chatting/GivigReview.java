package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GivigReview extends AppCompatActivity {
    TextView reg1,reg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_givig_review);
        reg1=findViewById(R.id.reg1);
        reg2=findViewById(R.id.reg2);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure that You must have place order for the selected Milk Man previously.");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("The edit text Field must not be empty. Write atleast one word.");
                alert.setPositiveButton("OK", null);
                alert.show();


            }

        });
    }

}