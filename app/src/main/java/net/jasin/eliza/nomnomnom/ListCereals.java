package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListCereals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cereals);
    }

    public void darkcho(View v){
        Intent intent = new Intent(ListCereals.this, DarkChocolateGranola.class);
        startActivity(intent);
    }

    public void peanut(View v){
        Intent intent = new Intent(ListCereals.this, PeanutButterJamGranola.class);
        startActivity(intent);
    }

    public void orange(View v){
        Intent intent = new Intent(ListCereals.this, OrangMarmaladeGranola.class);
        startActivity(intent);
    }

    public void maple(View v){
        Intent intent = new Intent(ListCereals.this, MaplePecanGranola.class);
        startActivity(intent);
    }

    public void carrot(View v){
        Intent intent = new Intent(ListCereals.this, CarrotCakeGranola.class);
        startActivity(intent);
    }

    public void almond(View v){
        Intent intent = new Intent(ListCereals.this, AlmondRaisinGranola.class);
        startActivity(intent);
    }
}
