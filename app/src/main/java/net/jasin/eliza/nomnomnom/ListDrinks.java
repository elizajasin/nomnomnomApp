package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drinks);
    }

    public void peppermint(View v){
        Intent intent = new Intent(ListDrinks.this, PeppermintCappucino.class);
        startActivity(intent);
    }

    public void anti(View v){
        Intent intent = new Intent(ListDrinks.this, Antioxidant.class);
        startActivity(intent);
    }

    public void banana(View v){
        Intent intent = new Intent(ListDrinks.this, BananaOatmeal.class);
        startActivity(intent);
    }
}
