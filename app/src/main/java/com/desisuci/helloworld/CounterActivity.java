package com.desisuci.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }

    public void goToSend(View view){

        //get pesan dari from edit text
        EditText edit = (EditText) findViewById(R.id.txt_message);
        String pesan = edit.getText().toString();

        //create object intent
        Intent intent = new Intent (this, SendingActivity.class);

        //put data
        intent.setData(Uri.parse(pesan));

        //start activity
        startActivity(intent);
    }

    public void sendExtras(View view){
        //get data from input
        EditText nm = (EditText) findViewById(R.id.txt_name);
        String nama = nm.getText().toString();
        EditText input = (EditText)findViewById(R.id.txt_message);
        String pesan = input.getText().toString();

        //create object intent
        Intent intent = new Intent (this, SendingActivity.class);

        //put extra
        intent.putExtra("hai",pesan); //put extra (key,value)
        intent.putExtra("desi",nama);

        //start activity
        startActivity(intent);
    }

//    public void sendExtrasBundle(View view){
//        EditText nm = (EditText) findViewById(R.id.txt_name);
//        String nama = nm.getText().toString();
//        EditText input = (EditText)findViewById(R.id.txt_message);
//        String pesan = input.getText().toString();
//
//        //create object intent
//        Intent intent = new Intent (this, SendingActivity.class);
//
//        //create bundle
//        Bundle data =  new Bundle();
//        data.putString("desi",nama);
//        data.putString("hai",pesan);
//
//        //put extra
//        intent.putExtra(data);
//
//        //start activity
//        startActivity(intent);
//
//    }
}
