package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GivigReview extends AppCompatActivity {
    TextView reg1,reg2,head;
    Context context;
    Resources resources;
    String lang,languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_givig_review);
        reg1=findViewById(R.id.reg1);
        reg2=findViewById(R.id.reg2);
        head=findViewById(R.id.head);
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        if(languages.equals("ENGLISH"))
        {
            context = LocalHelper.setLocale(GivigReview.this, "en");
            resources = context.getResources();
            head.setText("Common Questions");
            reg1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure that You must have place order for the selected Milk Man previously");
                    alert.setPositiveButton("OK", null);
                    alert.show();
                }

            });
            reg2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                    alert.setTitle("Here is Your Answer");
                    alert.setMessage("Make sure you are connected to the Internet");
                    alert.setPositiveButton("OK", null);
                    alert.show();


                }

            });
            lang="ENGLISH";
        }
        if(languages.equals("اردو")) {

            context = LocalHelper.setLocale(GivigReview.this, "an");
            resources = context.getResources();
            head.setText("عام سوالات");
            reg1.setText("جائزہ کا بٹن کام نہیں کررہا ہے");
            reg2.setText("یہ میرا جائزہ نہیں لے رہا ہے");

            reg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                    alert.setTitle("آپ کے سوال کا جواب       ");
                    alert.setMessage("اس بات کو یقینی بنائیں کہ آپ پہلے سے منتخب دودھ فروش کے لئے آرڈر دے چکے ہیں");
                    alert.setPositiveButton("ٹھیک ہے", null);
                    alert.show();
                }

            });
            reg2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(GivigReview.this);
                    alert.setTitle("آپ کے سوال کا جواب");
                    alert.setMessage("یقینی بنائیں کہ آپ انٹرنیٹ سے جڑے ہوئے ہیں");
                    alert.setPositiveButton("\"ٹھیک ہے", null);
                    alert.show();


                }

            });

            lang="اردو";

        }

    }

}