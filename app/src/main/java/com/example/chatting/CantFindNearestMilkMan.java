package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CantFindNearestMilkMan extends AppCompatActivity {
TextView reg5,head;
    Context context;
    Resources resources;
    String lang,languages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cant_find_nearest_milk_man);
        reg5=findViewById(R.id.reg5);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(CantFindNearestMilkMan.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");
            reg5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(CantFindNearestMilkMan.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure you are connected to the Internet\\nMake sure your GPS is enabled on your device");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });

            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(CantFindNearestMilkMan.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg5.setText("مجھے اپنے قریب کے دودھ فروش نہیں مل رہے ہیں");


            reg5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(CantFindNearestMilkMan.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("اس بات کو یقینی بنائیں کہ آپ انٹرنیٹ سے جڑے ہوئے ہیں اس بات کو یقینی بنائیں کہ آپ کے موبائل پر آپ کا جی پی ایس فعال ہے ");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });

            lang="اردو";

        }

    }
}