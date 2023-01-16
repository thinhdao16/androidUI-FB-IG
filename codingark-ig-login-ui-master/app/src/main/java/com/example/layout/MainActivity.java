package com.example.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagramlogin.R;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.buttonLogin);
    }
    public void onLogin(View view){
        Toast.makeText(MainActivity.this, "Bạn vừa ", Toast.LENGTH_SHORT).show();
    }
}
