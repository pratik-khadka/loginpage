package com.example.khadka.loginpage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.button);
        final EditText un = (EditText) findViewById(R.id.editText);
        final EditText pw = (EditText) findViewById(R.id.editText2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = un.getText().toString();
                String pass = pw.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("un", user);
                intent.putExtra("pw", pass);
                startActivity(intent);


            }

        });




}
}


