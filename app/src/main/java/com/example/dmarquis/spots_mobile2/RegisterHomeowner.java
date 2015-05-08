package com.example.dmarquis.spots_mobile2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class RegisterHomeowner extends FragmentActivity implements View.OnClickListener {

    Button bRegister2;
    EditText etName, etAge, etUsername, etPassword;
    Spinner stateDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_homeowner);


        etName = (EditText) findViewById(R.id.etFirstName);
        etAge = (EditText) findViewById(R.id.etLastName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister2 = (Button) findViewById(R.id.bRegister2);
        bRegister2.setOnClickListener(this);

        stateDropdown = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter.createFromResource(this, R.array.states, android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateDropdown.setAdapter(staticAdapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bRegister2:
                Toast.makeText(getApplicationContext(), "Success! You are Registered!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register_homeowner, menu);
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
