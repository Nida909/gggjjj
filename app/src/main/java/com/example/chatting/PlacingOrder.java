package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacingOrder extends AppCompatActivity {
    TextView reg1,reg2,head;
    Context context;
    Resources resources;
    String lang,languages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placing_order);

    reg1=findViewById(R.id.reg1);
    reg2=findViewById(R.id.reg2);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(PlacingOrder.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");

            reg1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(PlacingOrder.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("First login as a customer, then select Milkman, then click on place order button, then enter your drop off location, then continue with flow.");
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
            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(PlacingOrder.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg1.setText("آرڈر کیسے دیں؟");
            reg2.setText("ایپ میرے آرڈر کی قیمت نہیں دکھا رہی ہے");

            reg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(PlacingOrder.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("پہلے بطور صارف لاگ ان کریں ، پھر ملک مین منتخب کریں ، پھر پلیس آرڈر کے بٹن پر کلک کریں ، پھر اپنا ڈراپ آف لوکیشن داخل کریں ، پھر بہاؤ کے ساتھ جاری رکھیں");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });
            reg2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(PlacingOrder.this);
                    alert.setTitle("آپ کے سوال کا جواب");
                    alert.setMessage("آپ کو دودھ کی مقدار اور دودھ کا معیار داخل کرنا ہوگا پھر قیمت دکھائیں کے بٹن کو دبائیں");
                    alert.setPositiveButton("\"ٹھیک ہے", null);
                    alert.show();


                }

            });

            lang="اردو";

        }

}

}