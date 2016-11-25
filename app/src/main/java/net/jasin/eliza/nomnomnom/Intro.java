package net.jasin.eliza.nomnomnom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Toast.makeText(Intro.this, getIntent().getStringExtra("data"),Toast.LENGTH_LONG).show();
    }
}
