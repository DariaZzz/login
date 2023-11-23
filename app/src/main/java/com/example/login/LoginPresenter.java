package com.example.login;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.login.databinding.Login11Binding;

public class LoginPresenter {
    private static String TRUELOGIN = "1234";
    private static String TRUEPASSWORD = "1234";
    private Login11Binding binding;
    private Context context;
    private SharedPreferences mPref;
    public LoginPresenter(Context context, Login11Binding binding, SharedPreferences mPref){
        this.binding = binding;
        this.context = context;
        this.mPref = mPref;
    }

    public boolean signInPref(){
        SharedPreferences.Editor edit = mPref.edit();
        String loginPref = mPref.getString("LOGIN", "");
        String passwordPref = mPref.getString("PASSWORD", "");

        if(loginPref.equals(TRUELOGIN) && passwordPref.equals(TRUEPASSWORD)){
            return true;
        }
        return false;
    }

    public boolean signIn(){
        SharedPreferences.Editor edit = mPref.edit();


        String login = binding.login.getText().toString();
        String password = binding.password.getText().toString();


        if(login.equals(TRUELOGIN) && password.equals(TRUEPASSWORD)){

            edit.putString("LOGIN", login);
            edit.putString("PASSWORD", password);
            edit.commit();

            return true;
        }
        return false;
    }
}


