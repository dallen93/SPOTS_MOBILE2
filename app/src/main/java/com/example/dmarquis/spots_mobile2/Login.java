package com.example.dmarquis.spots_mobile2;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends FragmentActivity implements View.OnClickListener{

    Button bLogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;
    Button bDriverRegister;
    Button bHomeownerRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bDriverRegister = (Button) findViewById(R.id.bDriverRegister);
        bHomeownerRegister = (Button) findViewById(R.id.bHomeownerRegister);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);

        bLogin.setOnClickListener(this);
        bDriverRegister.setOnClickListener(this);
        bHomeownerRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:
                startActivity(new Intent(this, HomeScreen.class));
                break;

            case R.id.bDriverRegister:
                startActivity(new Intent(this, RegisterDriver.class));
                break;

            case R.id.bHomeownerRegister:
                startActivity(new Intent(this, RegisterHomeowner.class));
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
