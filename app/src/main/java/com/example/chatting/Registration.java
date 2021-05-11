package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    TextView reg1,reg2,head;
    Context context;
    Resources resources;
    String languages,lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg1=findViewById(R.id.reg1);
        reg2=findViewById(R.id.reg2);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(Registration.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg1.setText("ایپ میرا پاس ورڈ نہیں لے رہی ہے");
            reg2.setText("میں اپنا اکاؤنٹ بنانے کے قابل نہیں ہوں");

            reg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("پاس ورڈ کمزور نہیں ہونا چاہئے ، اس میں 1 بڑے حرف ، 1 چھوٹے کا حرف ، 1 ہندسہ اور 1 خصوصی حرف ہونا ضروری ہے");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });
            reg2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                    alert.setTitle("آپ کے سوال کا جواب");
                    alert.setMessage("محتاط رہیں کہ آپ ہمیں تمام مطلوبہ معلومات فراہم کر رہے ہیں");
                    alert.setPositiveButton("\"ٹھیک ہے", null);
                    alert.show();


                }

            });

            lang="اردو";

        }
        if(languages.equals("ENGLISH"))
        {
            reg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Password should  not be weak, it must have 1 uppercase letter, 1 lowercase letter, 1 digit and 1 special letter");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });
            reg2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Be Careful that you provide us all the required Information");
                    alert.setPositiveButton("OK", null);
                    alert.show();


                }

            });
            lang="ENGLISH";
        }

    }
    }
