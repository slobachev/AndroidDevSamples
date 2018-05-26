package com.example.augustus.textapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment implements View.OnClickListener {
    private Button b;
    EditText etname,etemail,etpassword;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.activity_main, container, false);
        b=(Button)v.findViewById(R.id.button);
        tv=(TextView)v.findViewById(R.id.textView);

        b.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        etpassword=(EditText)this.getView().findViewById(R.id.editText);
        tv.setText("Your Input: \n"+etpassword.getText().toString()+"\nEnd.");
    }
}
