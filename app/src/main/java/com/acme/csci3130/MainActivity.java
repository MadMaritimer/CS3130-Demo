package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPress(View view) {
        TextView hello = (TextView) findViewById(R.id.helloText);
        EditText input  = (EditText) findViewById(R.id.userText);
        hello.setText(input.getText());
        input.setText("");
    }
}
