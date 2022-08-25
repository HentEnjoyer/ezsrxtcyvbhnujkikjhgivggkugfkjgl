package com.example.ezsrxtcyvbhnujkikjhgivggkugfkjgl;

import static com.example.ezsrxtcyvbhnujkikjhgivggkugfkjgl.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonClick;
    TextView textView;
    static int Click = 0;
    int ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        getSupportActionBar().hide();
        getSupportActionBar().setTitle("idk");

        buttonClick = findViewById(R.id.clickButton);
        textView = findViewById(id.textView);

            buttonClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Click++;
                    buttonClick.setText(Click + "");

                    if (Click>=100){
                        textView.setText("пока");
                        Toast.makeText(getApplicationContext(), "эй, на коробле", Toast.LENGTH_LONG).show();
                    }
                }
            });

            //обработчик нажатия

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondMainActivity.class);
            startActivity(intent);
            }
        });


    }
}