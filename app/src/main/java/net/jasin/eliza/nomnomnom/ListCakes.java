package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListCakes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cakes);
    }

    public void oatmeal(View v){
        Intent intent = new Intent(ListCakes.this, Oatmeal.class);
        startActivity(intent);
    }

    public void blueberry(View v){
        Intent intent = new Intent(ListCakes.this, Blueberry.class);
        startActivity(intent);
    }

    public void coffee(View v){
        Intent intent = new Intent(ListCakes.this, CoffeeFlop.class);
        startActivity(intent);
    }
}
