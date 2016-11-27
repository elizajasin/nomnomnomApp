package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListSoups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_soups);
    }

    public void savory(View v){
        Intent intent = new Intent(ListSoups.this, Savory.class);
        startActivity(intent);
    }

    public void japan(View v){
        Intent intent = new Intent(ListSoups.this, JapanMiso.class);
        startActivity(intent);
    }

    public void thai(View v){
        Intent intent = new Intent(ListSoups.this, ThaiKaoTom.class);
        startActivity(intent);
    }
}
