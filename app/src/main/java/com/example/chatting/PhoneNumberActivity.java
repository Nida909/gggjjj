package com.example.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatting.databinding.ActivityPhoneNumberBinding;
import com.google.firebase.auth.FirebaseAuth;

public class PhoneNumberActivity extends AppCompatActivity {
    ActivityPhoneNumberBinding binding;
    Button continueBtn;
    EditText phoneBox;
    String str,str1;
    FirebaseAuth auth;
    String languages;
    TextView verifynum,id11;
    Context context;
    Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        verifynum=findViewById(R.id.verify);
        id11=findViewById(R.id.id1);
        phoneBox=findViewById(R.id.phoneBox);
        continueBtn=findViewById(R.id.continueBtn);

        Intent inten=getIntent();
        languages = inten.getExtras().getString("language");

        if(languages.equals("اردو")) {


            context = LocalHelper.setLocale(PhoneNumberActivity.this, "an");
            resources = context.getResources();


            binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            binding.phoneBox.requestFocus();
            continueBtn = findViewById(R.id.continueBtn);
            phoneBox = findViewById(R.id.phoneBox);
            auth = FirebaseAuth.getInstance();
            getSupportActionBar().hide();
            verifynum.setText(resources.getString(R.string.verify1));
            id11.setText(resources.getString(R.string.otp1));
            phoneBox.setHint(resources.getString(R.string.phone1));
            continueBtn.setText(resources.getString(R.string.continue1));
            str1="اردو";


        }
        if(languages.equals("ENGLISH")) {


            context = LocalHelper.setLocale(PhoneNumberActivity.this, "en");
            resources = context.getResources();


            binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            binding.phoneBox.requestFocus();
            continueBtn = findViewById(R.id.continueBtn);
            phoneBox = findViewById(R.id.phoneBox);
            auth = FirebaseAuth.getInstance();
            getSupportActionBar().hide();
            verifynum.setText(resources.getString(R.string.verify1));
            id11.setText(resources.getString(R.string.otp1));
            phoneBox.setHint(resources.getString(R.string.phone1));
            continueBtn.setText(resources.getString(R.string.continue1));
            str1="ENGLISH";

        }
       if(auth.getCurrentUser()!=null)
        {
            Intent intent=new Intent(PhoneNumberActivity.this, MainActivity.class);
            inten.putExtra("language",str1);
            startActivity(intent);
            finish();
        }



    }
    public void func(View view)
    {
        str=phoneBox.getText().toString();
        Intent intent=new Intent(this,OTP.class);
        intent.putExtra("val",str);
        intent.putExtra("language",str1);
        startActivity(intent);




    }
}