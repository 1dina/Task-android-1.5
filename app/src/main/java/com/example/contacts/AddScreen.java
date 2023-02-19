package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_screen);
        EditText firstText =findViewById(R.id.firstname);
        EditText secondText=findViewById(R.id.secondname);
        EditText fullNumber=findViewById(R.id.number);
        Button AddContact=findViewById(R.id.FinalAdd);

        AddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number =fullNumber.getText().toString();
                String FullName =(firstText.getText().toString())+" "+(secondText.getText().toString());
                Intent intent=new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.NAME,FullName);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,Number);
                startActivity(intent);


            }
        });

    }
}