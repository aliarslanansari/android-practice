package com.aliarslan.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxJoker;
    private RadioGroup radioGroupMaritalStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxJoker = findViewById(R.id.checkboxJoker);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        radioGroupMaritalStatus = findViewById(R.id.radioButtonGroup);
        ProgressBar progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

        radioGroupMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this, "Hel111111111", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this, "Hell222222", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this, "Hel3333333", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });


        if(checkBoxHarry.isChecked()){
            Toast.makeText(MainActivity.this, "You've watched harry potter", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "You need to watch harry potter", Toast.LENGTH_SHORT).show();
        }

        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "You've watched harry potter", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "YOu need to watch harry potter", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}