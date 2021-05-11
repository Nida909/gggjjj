package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChatBoxNotWorking extends AppCompatActivity {
    TextView reg7;
    TextView reg8,head;
    Context context;
    Resources resources;
    String lang,languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_box_not_working);
        reg7=findViewById(R.id.reg7);
        reg8=findViewById(R.id.reg8);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(ChatBoxNotWorking.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");

            reg7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure that you have a strong internet connection");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });
            reg8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure you are connected to Internet, otherwise you will not get OTP");
                    alert.setPositiveButton("OK", null);
                    alert.show();


                }

            });
            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(ChatBoxNotWorking.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg7.setText("ایپ چیٹ کے مقصد کے لئے میرا پروفائل نہیں تشکیل دے رہی ہے");
            reg8.setText(" او ٹی پی نہیں مل رہا ہے ");

            reg7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("اس بات کو یقینی بنائیں کہ آپ کا مضبوط انٹرنیٹ کنیکشن ہے");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });
            reg8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                    alert.setTitle("آپ کے سوال کا جواب");
                    alert.setMessage("اس بات کو یقینی بنائیں کہ آپ انٹرنیٹ سے جڑے ہوئے ہیں ، ورنہ آپ کو او ٹی پی نہیں ملے گا");
                    alert.setPositiveButton("\"ٹھیک ہے", null);
                    alert.show();


                }

            });

            lang="اردو";

        }
    }
}