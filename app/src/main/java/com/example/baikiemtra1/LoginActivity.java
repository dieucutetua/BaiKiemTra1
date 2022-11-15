package com.example.baikiemtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    EditText editUserName, editPassword;
    ImageView  buttonSignIn;
    CheckBox checkBoxPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
        String checkbox = preferences.getString("remember","");
        if(checkbox.equals("true")){

        }else if(checkbox.equals("false")){
            Toast.makeText(this, "Vui lòng đăng nhập!", Toast.LENGTH_SHORT).show();
        }

        editUserName =(EditText)findViewById(R.id.txtUserName1);
        editPassword = (EditText) findViewById(R.id.txtPassword1);
        buttonSignIn = (ImageView) findViewById(R.id.btnSignin1);
        checkBoxPass = (CheckBox)findViewById(R.id.ckb_nhomk);


        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "1";
                String password = "1";
                if(editUserName.getText().toString().equals(username) && editPassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(), "Login successfully",Toast.LENGTH_SHORT).show();
                    rememberUser(username,password,checkBoxPass.isChecked());
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void rememberUser(String username, String pass, boolean status){
        SharedPreferences sharedPreferences = getSharedPreferences("USER_FILE.txt",MODE_PRIVATE);
        SharedPreferences.Editor editor  = sharedPreferences.edit();
        if(!status){
            editor.clear();
        }else{
            editor.putString("USERNAME",username);
            editor.putString("PASS", pass);
            editor.putBoolean("REMEMBER",status);
        }
        editor.commit();
    }
}