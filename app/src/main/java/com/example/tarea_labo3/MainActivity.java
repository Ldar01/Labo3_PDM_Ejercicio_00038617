package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarea_labo3.Utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText nick,password, email, gender;
    private Button send_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Find_id_of_objects();

        send_button.setOnClickListener(v->{
            Intent intento = new Intent(MainActivity.this, InformationActivity.class);
            intento.putExtra(AppConstants.TEXT_KEY_NICKNAME,nick.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_PASSWORD,password.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_EMAIL, email.getText().toString());
            intento.putExtra(AppConstants.TEXT_KEY_GENDER, gender.getText().toString());
            startActivity(intento);
        });

    }

    public void Find_id_of_objects(){
        nick = findViewById(R.id.nickname);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);
        send_button = findViewById(R.id.button_send);
    }
}
