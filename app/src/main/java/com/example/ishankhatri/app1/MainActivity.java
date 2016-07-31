package com.example.ishankhatri.app1;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(MainActivity.this,"Message sent to Timbuktu",Toast.LENGTH_LONG).show();
    }

    //Send Message method
    /*public void sendMessage(View view){
        //Do something when the button is pressed
        Toast.makeText(MainActivity.this,"Message sent to Timbuktu",Toast.LENGTH_LONG).show();
    }*/

    Button button = (Button) findViewById(R.id.send_button);
    View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
            Toast.makeText(MainActivity.this,"Message sent to Timbuktu",Toast.LENGTH_LONG).show();
        }
    };
    button.setOnClickListener(myListener);
}
