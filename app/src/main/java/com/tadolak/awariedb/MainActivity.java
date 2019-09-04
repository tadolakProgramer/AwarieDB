package com.tadolak.awariedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UserNameEt;
    EditText PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserNameEt = (EditText)findViewById(R.id.edName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);
    }

    public void OnLogin(View view){
        String userName = UserNameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "Login";

        AsyncWorker asyncWorker = new AsyncWorker(this);
        asyncWorker.execute(type, userName, password);
    }
}
