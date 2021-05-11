package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    TextView reg3,reg4,head;
    Context context;
    Resources resources;
    String lang,languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        reg3=findViewById(R.id.reg3);
        reg4=findViewById(R.id.reg4);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(LogIn.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");
            reg3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                    alert.setTitle("Here is Your Answer");

                    alert.setMessage("Make sure you are entering right name and password\nMake sure you have created your account on this app once\nIf you dont have an account, create your account first");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });
            reg4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Use your name used to create the account and your password to log in to your account.");
                    alert.setPositiveButton("OK", null);
                    alert.show();


                }

            });
            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(LogIn.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg3.setText("میں اپنے اکاؤنٹ میں لاگ ان نہیں ہو رہا ہوں");
            reg4.setText("میں اپنے اکاؤنٹ میں لاگ ان کیسے کروں؟");

            reg3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("یقینی بنائیں کہ آپ صحیح نام اور پاس ورڈ داخل کر رہے ہیں\n" +
                            "یقینی بنائیں کہ آپ نے اس ایپ پر ایک بار اپنا اکاؤنٹ تیار کرلیا ہے\n" +
                            "اگر آپ کا اکاؤنٹ نہیں ہے تو پہلے اپنا اکاؤنٹ بنائیں");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });
            reg4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                    alert.setTitle("آپ کے سوال کا جواب");
                    alert.setMessage("اپنے اکاؤنٹ میں لاگ ان کرنے کے لئے اپنے نام اور پاس ورڈ کا استعمال کریں جو آپ کا اکاؤنٹ بنانے کے لئے استعمال ہوا تھا");
                    alert.setPositiveButton("\"ٹھیک ہے", null);
                    alert.show();


                }

            });

            lang="اردو";

        }

    }
}