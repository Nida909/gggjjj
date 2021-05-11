package com.example.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HelpActivity extends AppCompatActivity {
    String[] problems={"Create My Account","Log In","Nearest Milk Man","Chat Box Is Not Working","Giving Review", "Placing Order","Customer History","Rider Seletion","Update Information"};
    String[] problemsu={"اکاؤنٹ بنائیں کا مسئلہ","لاگ ان کا مسئلہ","قریب ترین دودھ کا آدمی نہیں مل رہا ہے","چیٹ باکس کام نہیں کررہا ہے","جائزہ دینے میں دشواری کا سامنا ہے", "بکنگ آرڈر میں دشواری","خریداروں کی تاریخ کو دیکھنے کے قابل نہیں ہوں","رائڈر کے انتخاب میں دشواری کا سامنا ہے","معلومات کی تازہ کاری میں مسئلہ"};
    Context context;
    Resources resources;
    String languages,lang;
    ImageButton img;
    EditText question;
    ArrayList<String> user=new ArrayList<>();
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        img=(ImageButton) findViewById(R.id.search);
        question=(EditText) findViewById(R.id.searchbar) ;
        Intent intent = getIntent();
        languages= intent.getExtras().getString("language");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, months);

        if(languages.equals("ENGLISH"))
        {

            context = LocalHelper.setLocale(HelpActivity.this, "en");
            resources = context.getResources();


            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,problems);
            ListView listView=(ListView)findViewById(R.id.mobile_list);
            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String s = listView.getItemAtPosition(position).toString();
                    switch (s) {

                        case "Create My Account":
                            startActivity(new Intent(HelpActivity.this, Registration.class));
                            break;
                        case "Log In":
                            startActivity(new Intent(HelpActivity.this, LogIn.class));
                            break;
                        case "Nearest Milk Man":
                            startActivity(new Intent(HelpActivity.this, CantFindNearestMilkMan.class));
                            break;
                        case "Chat Box Is Not Working":
                            startActivity(new Intent(HelpActivity.this, ChatBoxNotWorking.class));
                            break;
                        case "Giving Review":
                            startActivity(new Intent(HelpActivity.this, GivigReview.class));
                            break;

                        case "Placing Order":
                            startActivity(new Intent(HelpActivity.this, PlacingOrder.class));
                            break;


                    }

                }
            });

            lang="ENGLISH";

        }



        if(languages.equals("اردو"))
        {

            context = LocalHelper.setLocale(HelpActivity.this, "an");
            resources = context.getResources();


            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,problemsu);
            ListView listView=(ListView)findViewById(R.id.mobile_list);
            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String s = listView.getItemAtPosition(position).toString();
                    switch (s) {

                        case "اکاؤنٹ بنائیں کا مسئلہ":
                            startActivity(new Intent(HelpActivity.this, Registration.class));
                            break;
                        case "لاگ ان کا مسئلہ":
                            startActivity(new Intent(HelpActivity.this, LogIn.class));
                            break;
                        case "قریب ترین دودھ کا آدمی نہیں مل رہا ہے":
                            startActivity(new Intent(HelpActivity.this, CantFindNearestMilkMan.class));
                            break;
                        case "چیٹ باکس کام نہیں کررہا ہے":
                            startActivity(new Intent(HelpActivity.this, ChatBoxNotWorking.class));
                            break;
                        case "جائزہ دینے میں دشواری کا سامنا ہے":
                            startActivity(new Intent(HelpActivity.this, GivigReview.class));
                            break;

                        case "بکنگ آرڈر میں دشواری":
                            startActivity(new Intent(HelpActivity.this, PlacingOrder.class));
                            break;


                    }

                }
            });

            lang="اردو";

        }










    }
}