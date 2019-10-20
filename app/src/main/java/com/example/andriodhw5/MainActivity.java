package com.example.andriodhw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputyear = (EditText) findViewById(R.id.inputyear);
        final EditText inputmonth = (EditText) findViewById(R.id.inputmonth);
        final EditText inputday = (EditText) findViewById(R.id.inputday);
        final EditText houredit = (EditText) findViewById(R.id.houredit);
        final EditText minedit = (EditText) findViewById(R.id.minedit);
        final EditText secedit = (EditText) findViewById(R.id.secedit);
        TextView ouputtext = (TextView) findViewById(R.id.outputtext);
        Button displaytime = (Button) findViewById(R.id.displaytime);

        displaytime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!("".equals(inputyear.getText().toString())) &&
                        "".equals(inputmonth.getText().toString()) &&
                        "".equals(inputday.getText().toString()) &&
                        "".equals(houredit.getText().toString()) &&
                        "".equals(minedit.getText().toString()) &&
                        "".equals(secedit.getText().toString())) {



                }
            }
        });
    }
}
