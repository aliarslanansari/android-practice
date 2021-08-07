package com.aliarslan.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int i = 0;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHello:
                Toast.makeText(this,"Hello Button Clicked",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long Pressed", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }


}