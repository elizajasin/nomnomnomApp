package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Intro extends AppCompatActivity {

    TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Toast.makeText(Intro.this, getResources().getString(R.string.sukses),Toast.LENGTH_LONG).show();

        nama = (TextView)findViewById(R.id.tvName);

        nama.setText(getIntent().getStringExtra("data"));
    }

    public void klikCereal(View v){
        Intent intent = new Intent(Intro.this, ListCereals.class);
        startActivity(intent);
    }

    public void logout(View v){
        Intent intent = new Intent(Intro.this, Login.class);
        startActivity(intent);
    }
}
