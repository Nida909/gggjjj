package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class riderselection extends AppCompatActivity {

    TextView reg6,head;
    Context context;
    Resources resources;
    String lang,languages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riderselection);
        reg6=findViewById(R.id.reg6);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(riderselection.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");
            reg6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(riderselection.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("if any rider will be available he will select you on this app, once he selected you, you will be informed by him");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });

            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(riderselection.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg6.setText("میں اپنے رائڈر کو کس طرح منتخب کرسکتا ہوں؟");


            reg6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(riderselection.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("اگر کوئی رائڈر دستیاب ہوگا تو وہ آپ کو اس ایپ پر منتخب کرے گا ، ایک بار جب اس نے آپ کا انتخاب کیا تو آپ کو اس کے ذریعہ آگاہ کردیا جائے گا ");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });

            lang="اردو";

        }

    }
}