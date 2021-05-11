package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class milkinfoupdate extends AppCompatActivity {
    TextView reg6,head;
    Context context;
    Resources resources;
    String lang,languages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkinfoupdate);
        reg6=findViewById(R.id.reg6);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(milkinfoupdate.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");
            reg6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(milkinfoupdate.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure you are not leaving any field empty");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });

            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(milkinfoupdate.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg6.setText("میں اپنی دودھ کی معلومات اپ لوڈ نہیں کر سکتا");


            reg6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(milkinfoupdate.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("یقینی بنائیں کہ آپ کسی بھی فیلڈ کو خالی نہیں چھوڑ رہے ہیں ");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });

            lang="اردو";

        }

    }
}