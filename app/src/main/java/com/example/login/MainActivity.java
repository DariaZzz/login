package com.example.login;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.login.databinding.ActivityMainBinding;
import com.example.login.databinding.Login11Binding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.getN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person man = new Person(binding.name.getText().toString(), binding.last.getText().toString());
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("name", man.name);
                intent.putExtra("last_name", man.last_name);
                startActivity(intent);
                binding.name.getText().clear();
                binding.last.getText().clear();
            }
        });
        //SharedPreferences mPref = getPreferences(MODE_PRIVATE);



        /*LoginPresenter presenter = new LoginPresenter(this, binding, mPref);

        if(presenter.signInPref()){
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        }

        binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(presenter.signIn()){
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("LOGIN", binding.login.getText().toString());
                    intent.putExtra("PASSWORD", binding.password.getText().toString());
                    startActivity(intent);
                }
            }
        });*/

        /* String name = findViewById(R.id.name).toString();
        String last_name = findViewById(R.id.last_name).toString();
        Person person = new Person(name, last_name);

        Button button = findViewById(R.id.getN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });*/

    }

}