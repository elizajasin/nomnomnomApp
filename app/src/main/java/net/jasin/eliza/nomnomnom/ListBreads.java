package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListBreads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_breads);
    }

    public void apple(View v){
        Intent intent = new Intent(ListBreads.this, Apple.class);
        startActivity(intent);
    }

    public void carrotcake(View v){
        Intent intent = new Intent(ListBreads.this, CarrotCake.class);
        startActivity(intent);
    }

    public void chocchip(View v){
        Intent intent = new Intent(ListBreads.this, ChocoChipPumpkin.class);
        startActivity(intent);
    }
}
