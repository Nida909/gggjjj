package com.example.chatting;

import android.content.Intent;
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
    String[] months={"Create My Account","Log In","Nearest Milk Man","Update Information","Chat Box Is Not Working","Giving Review", "Placing Order","Customer History","Rider Seletion"};
    ImageButton img;
    EditText question;
    ArrayList<String> user=new ArrayList<>();
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        img=(ImageButton) findViewById(R.id.search);
        question=(EditText) findViewById(R.id.searchbar) ;
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, months);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,months);
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
                        startActivity(new Intent(HelpActivity.this, MilkInfoIsNotUploading.class));
                        break;

                    case "Update Information":
                        /*startActivity(new Intent(HelpActivity.this, MilkInfoIsNotUploading.class));
                        break;*/
                }


            }
        });
    }
}