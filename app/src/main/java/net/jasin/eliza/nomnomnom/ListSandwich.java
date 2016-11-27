package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListSandwich extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sandwich);
    }

    public void beef(View v){
        Intent intent = new Intent(ListSandwich.this, BeefSandwich.class);
        startActivity(intent);
    }

    public void ham(View v){
        Intent intent = new Intent(ListSandwich.this, HamburgerBreakfast.class);
        startActivity(intent);
    }

    public void big(View v){
        Intent intent = new Intent(ListSandwich.this, BigTexas.class);
        startActivity(intent);
    }
}
