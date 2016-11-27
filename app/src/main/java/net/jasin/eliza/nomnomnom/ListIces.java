package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListIces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ices);
    }

    public void vanilla(View v){
        Intent intent = new Intent(ListIces.this, Vanilla.class);
        startActivity(intent);
    }

    public void chocereal(View v){
        Intent intent = new Intent(ListIces.this, ChocholateChipCereal.class);
        startActivity(intent);
    }

    public void pebble(View v){
        Intent intent = new Intent(ListIces.this, PebblesCereal.class);
        startActivity(intent);
    }
}
