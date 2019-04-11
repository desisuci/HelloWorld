package com.desisuci.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending);

        //get intent
        Intent intent = getIntent();

        //get extra with bundle
        Bundle data = intent.getExtras();
        String pesanExtras = data.getString("hai");
        String nama = data.getString("desi");

        //give data to textView
        TextView txt = (TextView) findViewById(R.id.txtThird);
        txt.setText(pesanExtras);

        //give data to name
        TextView nm = (TextView) findViewById(R.id.txtFourth);
        nm.setText(nama);

    }
}
