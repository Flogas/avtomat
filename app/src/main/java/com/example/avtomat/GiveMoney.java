package com.example.avtomat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GiveMoney extends AppCompatActivity {

    TextView tvPoints;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poproshaika);
        int points = getIntent().getExtras().getInt("points");
        tvPoints = findViewById(R.id.tvPoints);
        tvPoints.setText("" + points);

    }
    public void restart(View view) {
        Intent intent = new Intent(GiveMoney.this, StartUp.class);
        startActivity(intent);
        finish();
    }



    public void exit(View view) {
        finish();
    }
}
