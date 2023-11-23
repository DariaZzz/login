package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.login.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Activity2Binding binding = Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String s = getIntent().getStringExtra("name") + " " +getIntent().getStringExtra("last_name");
        binding.TV1.setText(s);

        binding.B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person.name="";
                Person.last_name="";
                Toast.makeText(getApplicationContext(), "Вы вышли", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
