package com.example.acpha.fortuneteller;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){
        TextView text = (TextView) findViewById(R.id.fortuneText);
        Resources res = getResources();
        String[] fortunes = res.getStringArray(R.array.fortune_array);
        String rand = (fortunes[new Random().nextInt(fortunes.length)]);
        text.setText(rand);
    }
}
