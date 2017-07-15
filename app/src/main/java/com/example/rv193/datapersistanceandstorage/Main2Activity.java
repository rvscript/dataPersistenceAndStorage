package com.example.rv193.datapersistanceandstorage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public static final String DEFAULT="N/A";
    EditText un, passwordet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        un = (EditText)findViewById(R.id.editText3);
        passwordet=(EditText)findViewById(R.id.editText4);
    }
    public void load(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name", DEFAULT);
        String password = sharedPreferences.getString("password", DEFAULT);
        if(name.equals(DEFAULT)|| password.equals(DEFAULT))
        {
            Toast.makeText(this, "No Data was Found", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Data loaded ok", Toast.LENGTH_SHORT).show();
            un.setText(name);
            passwordet.setText(password);
        }
    }

    public void previous(View view){
        Toast.makeText(this, "Previous", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
