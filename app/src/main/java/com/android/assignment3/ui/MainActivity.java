package com.android.assignment3.ui;

import android.content.Intent;
import android.os.Bundle;

import com.android.assignment3.R;
import com.android.assignment3.controllerclass.controllerclass;


import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.assignment3.model.DataSet;
import com.android.assignment3.model.UserData;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText login, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = findViewById(R.id.btnlogin);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserData dataSet = new UserData();

                if (!TextUtils.isEmpty(login.getText().toString())) {
                    dataSet.setName(login.getText().toString());
                    if (!TextUtils.isEmpty(password.getText().toString())) {
                        dataSet.setPassword(password.getText().toString());

                        boolean result = new controllerclass().CheckUser(dataSet);
                        if (result) {
                            Intent intent = new Intent(MainActivity.this, MainWindow.class);
                            startActivity(intent);
                            login.setText("");
                            password.setText("");

                        } else {
                            Toast.makeText(MainActivity.this, "user name or password mistake",
                                    Toast.LENGTH_SHORT).show();

                        }
                    } else {
                        password.setError("please enter password");

                    }
                } else {
                    login.setError("please enter user name");


                }
            }
        });
    }
}
