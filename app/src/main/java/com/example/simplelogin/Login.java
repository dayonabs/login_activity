package com.example.simplelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText et_username, et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login();
    }

    void Login(){
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_username.getText().toString().equals("zuri") && et_password.getText().toString().equals("zuri")){
                    Toast.makeText(Login.this, "LOGIN SUCCESSFUL!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent("com.example.simplelogin.User");
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
