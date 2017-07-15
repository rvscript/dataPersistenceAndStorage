package com.example.rv193.datapersistanceandstorage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
    }
    public void save(View view){
        SharedPreferences sharedPreferences= getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",userName.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.commit();
        Toast.makeText(this, "Data was saved ok",Toast.LENGTH_LONG).show();
    }
    public void next(View view){
        Toast.makeText(this, "Next", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
