package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        final LinearLayout ll = new LinearLayout(this);
        final TextView a = new TextView(this);
        Button green = new Button(this);
        green.setText("Green");
        Button yellow = new Button(this);
        yellow.setText("Yellow");
        Button red = new Button(this);
        red.setText("Red");
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        a.setLayoutParams(params);
        green.setLayoutParams(params);
        yellow.setLayoutParams(params);
        red.setLayoutParams(params);
        ll.addView(a);
        ll.addView(green);
        ll.addView(yellow);
        ll.addView(red);
        setContentView(ll);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("Green");
                ll.setBackgroundColor(Color.GREEN);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("Yellow");
                ll.setBackgroundColor(Color.YELLOW);

            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("Red");
                ll.setBackgroundColor(Color.RED);
            }
        });

    }
}