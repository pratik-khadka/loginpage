package com.example.khadka.loginpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent receieve = getIntent();
        String un = receieve.getStringExtra("un");
        String pw = receieve.getStringExtra("pw");
        TextView text = (TextView) findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.button2);
        if (un.equals("admin") && pw.equals("admin")) {
            text.setText("Hello" + un);
            btn.setVisibility(View. GONE);


        } else {
            text.setText("INvalid Operation");
            btn.setVisibility(View.VISIBLE);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }
    }
}




