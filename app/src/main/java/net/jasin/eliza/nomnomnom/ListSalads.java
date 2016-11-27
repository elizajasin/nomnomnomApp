package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListSalads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_salads);
    }

    public void water(View v){
        Intent intent = new Intent(ListSalads.this, WatermelonBenedict.class);
        startActivity(intent);
    }

    public void crumble(View v){
        Intent intent = new Intent(ListSalads.this, Crumble.class);
        startActivity(intent);
    }

    public void usa(View v){
        Intent intent = new Intent(ListSalads.this, UsaBreakfastParfaits.class);
        startActivity(intent);
    }
}
