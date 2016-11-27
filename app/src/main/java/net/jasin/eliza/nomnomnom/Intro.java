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

    public void klikSandwich(View v){
        Intent intent = new Intent(Intro.this, ListSandwich.class);
        startActivity(intent);
    }

    public void klikDrink(View v){
        Intent intent = new Intent(Intro.this, ListDrinks.class);
        startActivity(intent);
    }

    public void klikSoup(View v){
        Intent intent = new Intent(Intro.this, ListSoups.class);
        startActivity(intent);
    }

    public void klikCookie(View v){
        Intent intent = new Intent(Intro.this, ListCookies.class);
        startActivity(intent);
    }

    public void klikSalad(View v){
        Intent intent = new Intent(Intro.this, ListSalads.class);
        startActivity(intent);
    }

    public void klikBread(View v){
        Intent intent = new Intent(Intro.this, ListBreads.class);
        startActivity(intent);
    }

    public void klikIce(View v){
        Intent intent = new Intent(Intro.this, ListIces.class);
        startActivity(intent);
    }

    public void klikCake(View v){
        Intent intent = new Intent(Intro.this, ListCakes.class);
        startActivity(intent);
    }

    public void logout(View v){
        Intent intent = new Intent(Intro.this, Login.class);
        startActivity(intent);
    }
}
