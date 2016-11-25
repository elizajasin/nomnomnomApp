package net.jasin.eliza.nomnomnom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText uname;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname = (EditText)findViewById(R.id.etUsername);
        pass = (EditText)findViewById(R.id.etPassword);
        login = (Button)findViewById(R.id.bLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUname;
                String sPass;
                sUname = uname.getText().toString();
                sPass = pass.getText().toString();
                validate(sUname,sPass);
            }
        });
    }

    private void validate(String user, String pass){
        if (user.equals("eliza") && pass.equals("1234")){
            Intent intent = new Intent(Login.this, Intro.class);
            intent.putExtra("data", user);
            startActivity(intent);
        }else {
            Toast.makeText(Login.this, getResources().getString(R.string.failed),Toast.LENGTH_LONG).show();
        }
    }
}
