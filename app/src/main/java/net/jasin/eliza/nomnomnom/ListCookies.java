package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListCookies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cookies);
    }

    public void darkcho(View v){
        Intent intent = new Intent(ListCookies.this, DarkChocolateGranola.class);
        startActivity(intent);
    }

    public void wafer(View v){
        Intent intent = new Intent(ListCookies.this, VanillaWafer.class);
        startActivity(intent);
    }

    public void nobake(View v){
        Intent intent = new Intent(ListCookies.this, NoBakeChoco.class);
        startActivity(intent);
    }
}
