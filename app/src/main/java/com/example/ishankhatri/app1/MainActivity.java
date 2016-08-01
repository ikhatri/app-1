package com.example.ishankhatri.app1;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    //Constants
    //Key for a string stored in an intent
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //Name of a file where data is stored
    public final static String FILENAME = "hello_file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Send Message method
    public void saveMessage(View view) throws IOException{
        //Do something when the button is pressed
        FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        fos.write(editText.getText().toString().getBytes());
        fos.close();
        Toast.makeText(MainActivity.this,"Message sent to Timbuktu",Toast.LENGTH_LONG).show();
    }

    public void openMessage(View view) throws IOException {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        FileInputStream fis = openFileInput(FILENAME);
        byte[]b=new byte[1024];
        fis.read(b);
        String message= new String(b);
        fis.close();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
