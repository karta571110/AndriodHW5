package com.example.andriodhw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    String h0 = "";
    String m0 = "";
    String s0 = "";

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
        final TextView ouputtext = (TextView) findViewById(R.id.outputtext);
        Button displaytime = (Button) findViewById(R.id.displaytime);
        final TextView leapyn = (TextView) findViewById(R.id.leapyn);
        displaytime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!("".equals(inputyear.getText().toString())) &&
                        !("".equals(inputmonth.getText().toString())) &&
                        !("".equals(inputday.getText().toString())) &&
                        !("".equals(houredit.getText().toString())) &&
                        !("".equals(minedit.getText().toString())) &&
                        !("".equals(secedit.getText().toString()))) {
                    Double iy = Double.parseDouble(inputyear.getEditableText().toString());
                    Double im = Double.parseDouble(inputmonth.getEditableText().toString());
                    Double id = Double.parseDouble(inputday.getEditableText().toString());
                    Double he = Double.parseDouble(houredit.getEditableText().toString());
                    Double me = Double.parseDouble(minedit.getEditableText().toString());
                    Double se = Double.parseDouble(secedit.getEditableText().toString());
                    if (im > 12 || id > 31 || he > 23 || me > 59 || se > 59 || im < 0 || id < 0 || he < 0 || me < 0 || se < 0) {
                        Toast back = Toast.makeText(MainActivity.this, "你確定這種時間存在?", Toast.LENGTH_LONG);
                        back.show();
                        return;
                    }
                    if (im % 2 == 0 && id > 30 && im < 7) {
                        Toast back = Toast.makeText(MainActivity.this, "你確定這種時間存在?", Toast.LENGTH_LONG);
                        back.show();
                        return;
                    }
                    if (im % 2 == 1 && id > 30 && im > 8) {
                        Toast back = Toast.makeText(MainActivity.this, "你確定這種時間存在?", Toast.LENGTH_LONG);
                        back.show();
                        return;
                    }
                    if (im == 2 && id > 28 && iy % 4 != 0) {
                        Toast back = Toast.makeText(MainActivity.this, "你確定這種時間存在?", Toast.LENGTH_LONG);
                        back.show();
                        return;
                    }
                    if (im == 2 && id > 29 && iy % 4 == 0) {
                        Toast back = Toast.makeText(MainActivity.this, "你確定這種時間存在?", Toast.LENGTH_LONG);
                        back.show();
                        return;
                    }
                    BigDecimal iy1 = new BigDecimal(iy);
                    BigDecimal im1 = new BigDecimal(im);
                    BigDecimal id1 = new BigDecimal(id);
                    BigDecimal he1 = new BigDecimal(he);
                    BigDecimal me1 = new BigDecimal(me);
                    BigDecimal se1 = new BigDecimal(se);
                    if (he < 10) {
                        h0 = "0";
                    }
                    if (me < 10) {
                        m0 = "0";
                    }
                    if (se < 10) {
                        s0 = "0";
                    }
                    ouputtext.setText(iy1 + "/" + im1 + "/" + id1 + "  " + h0 + he1 + ":" + h0 + me1 + ":" + s0 + se1);
                    if (iy % 4 == 0) {
                        leapyn.setText("閏年:是");
                    } else if (iy % 4 != 0) {
                        leapyn.setText("閏年:否");
                    }


                }
            }
        });
    }
}
