package com.example.pruebatcnicalogin.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.pruebatcnicalogin.Activity.WebViewActivity;
import com.example.pruebatcnicalogin.R;
import com.example.pruebatcnicalogin.util.Singleton;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class LoginFragment extends Fragment {

    private Button btnLogin;
    private EditText etDocumento,tiPass;
    Singleton singleton;


    public static Fragment newInstance(){
        return new LoginFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_login, container, false);


        btnLogin = view.findViewById(R.id.btnLogin);
        etDocumento = view.findViewById(R.id.etDocumento);
        tiPass = view.findViewById(R.id.text_password);

        singleton = Singleton.getInstance();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = etDocumento.getText().toString();
                final String password = tiPass.getText().toString();
                singleton.setUsuario(username);
                singleton.setPassword(password);
                Intent intent = new Intent(getContext(), WebViewActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
