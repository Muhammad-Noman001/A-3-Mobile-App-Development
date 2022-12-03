package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void changeView(View v){
        switch(v.getId()) {
            case R.id.txtForgot:
                Intent intentForgot = new Intent(this, ForgotActivity.class);
                startActivity(intentForgot);
                break;
            case R.id.btnSubmit:
                Intent intentLogin = new Intent(this, MainActivity.class);
                startActivity(intentLogin);
                break;
            case R.id.txtRedirect:
                Intent intentRegister = new Intent(this, RegistrationActivity.class);
                startActivity(intentRegister);
                break;
            default:
                break;
        }
    }

}