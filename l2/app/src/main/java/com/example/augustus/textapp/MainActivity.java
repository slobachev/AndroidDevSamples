package com.example.augustus.textapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_fragment);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b=(Button)findViewById(R.id.button);
//        tv=(TextView)findViewById(R.id.textView);
//        tv.setMovementMethod(new ScrollingMovementMethod());
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                etpassword=(EditText)findViewById(R.id.editText);
//                tv.setText("Your Input: \n"+etpassword.getText().toString()+"\nEnd.");
//            }
//        });
//    }
}
