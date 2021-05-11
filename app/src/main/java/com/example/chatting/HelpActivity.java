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
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HelpActivity extends AppCompatActivity {
    String[] problems={"Create My Account","Log In","Nearest Milk Man","Chat Box Is Not Working","Giving Review", "Placing Order","Customer History","Rider Selection","Update Information"};
    String[] problemsu={"اکاؤنٹ بنائیں کا مسئلہ","لاگ ان کا مسئلہ","قریب ترین دودھ کا آدمی نہیں مل رہا ہے","چیٹ باکس کام نہیں کررہا ہے","جائزہ دینے میں دشواری کا سامنا ہے", "بکنگ آرڈر میں دشواری","خریداروں کی تاریخ کو دیکھنے کے قابل نہیں ہوں","رائڈر کے انتخاب میں دشواری کا سامنا ہے","معلومات کی تازہ کاری میں مسئلہ"};
    Context context;
    Resources resources;
    String languages,lang;
    ImageButton img;
    EditText question;
    TextView text;
    ArrayList<String> user=new ArrayList<>();
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        img=(ImageButton) findViewById(R.id.search);
        question=(EditText) findViewById(R.id.searchbar) ;
        text=findViewById(R.id.text);
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
                            Intent inten = new Intent(HelpActivity.this, Registration.class);
                            lang="ENGLISH";
                            inten.putExtra("language",lang);
                            startActivity(inten);
                            break;
                        case "Log In":
                            Intent intent = new Intent(HelpActivity.this, LogIn.class);
                            lang="ENGLISH";
                            intent.putExtra("language",lang);
                            startActivity(intent);
                            break;
                        case "Nearest Milk Man":
                            Intent intent6 = new Intent(HelpActivity.this, CantFindNearestMilkMan.class);
                            lang="ENGLISH";
                            intent6.putExtra("language",lang);
                            startActivity(intent6);
                            break;
                        case "Chat Box Is Not Working":
                            Intent inten7 = new Intent(HelpActivity.this, ChatBoxNotWorking.class);
                            lang="ENGLISH";
                            inten7.putExtra("language",lang);
                            startActivity(inten7);
                            break;
                        case "Giving Review":
                            Intent inte = new Intent(HelpActivity.this, GivigReview.class);
                            lang="ENGLISH";
                            inte.putExtra("language",lang);
                            startActivity(inte);
                            break;

                        case "Placing Order":
                            Intent intentt = new Intent(HelpActivity.this, PlacingOrder.class);
                            lang="ENGLISH";
                            intentt.putExtra("language",lang);
                            startActivity(intentt);
                            break;

                        case "Update Information":
                            Intent intenttt = new Intent(HelpActivity.this, milkinfoupdate.class);
                            lang="ENGLISH";
                            intenttt.putExtra("language",lang);
                            startActivity(intenttt);
                            break;


                    }

                }
            });



        }



        if(languages.equals("اردو"))
        {

            context = LocalHelper.setLocale(HelpActivity.this, "an");
            resources = context.getResources();
question.setHint("یہاں تلاش کریں");
            text.setText("آپ کو کس پریشانی کا سامنا ہے؟");

            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,problemsu);
            ListView listView=(ListView)findViewById(R.id.mobile_list);
            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String s = listView.getItemAtPosition(position).toString();
                    switch (s) {

                        case "اکاؤنٹ بنائیں کا مسئلہ":
                            Intent inten = new Intent(HelpActivity.this, Registration.class);
                            lang="اردو";
                            inten.putExtra("language",lang);
                            startActivity(inten);
                            break;
                        case "لاگ ان کا مسئلہ":
                            Intent intent = new Intent(HelpActivity.this, LogIn.class);
                            lang="اردو";
                            intent.putExtra("language",lang);
                            startActivity(intent);
                            break;
                        case "قریب ترین دودھ کا آدمی نہیں مل رہا ہے":
                            Intent intent2 = new Intent(HelpActivity.this, CantFindNearestMilkMan.class);
                            lang="اردو";
                            intent2.putExtra("language",lang);
                            startActivity(intent2);
                            break;
                        case "چیٹ باکس کام نہیں کررہا ہے":
                            Intent intent3 = new Intent(HelpActivity.this, ChatBoxNotWorking.class);
                            lang="اردو";
                            intent3.putExtra("language",lang);
                            startActivity(intent3);
                            break;
                        case "جائزہ دینے میں دشواری کا سامنا ہے":
                            Intent intent4 = new Intent(HelpActivity.this, GivigReview.class);
                            lang="اردو";
                            intent4.putExtra("language",lang);
                            startActivity(intent4);
                            break;

                        case "بکنگ آرڈر میں دشواری":
                            Intent intent5 = new Intent(HelpActivity.this, PlacingOrder.class);
                            lang="اردو";
                            intent5.putExtra("language",lang);
                            startActivity(intent5);
                            break;

                        case "معلومات کی تازہ کاری میں مسئلہ":
                            Intent intenttt = new Intent(HelpActivity.this, milkinfoupdate.class);
                            lang="اردو";
                            intenttt.putExtra("language",lang);
                            startActivity(intenttt);
                            break;


                    }

                }
            });



        }



    }
}