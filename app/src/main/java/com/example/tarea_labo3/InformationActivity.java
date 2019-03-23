package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarea_labo3.Utils.AppConstants;

public class InformationActivity extends AppCompatActivity {

    private Button share_button;
    private TextView v_nick, v_password, v_email, v_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Find_id_of_objects();
        Intent intento = this.getIntent();

        if (intento!=null) {
            v_nick.setText(intento.getStringExtra(AppConstants.TEXT_KEY_NICKNAME));
            v_password.setText(intento.getStringExtra(AppConstants.TEXT_KEY_PASSWORD));
            v_email.setText(intento.getStringExtra(AppConstants.TEXT_KEY_EMAIL));
            v_gender.setText(intento.getStringExtra(AppConstants.TEXT_KEY_GENDER));
        }

        share_button.setOnClickListener(v->{
            Intent intento_compartir = new Intent();
            intento_compartir.setAction(Intent.ACTION_SEND);
            intento_compartir.setType("text/plain");
            intento_compartir.putExtra(Intent.EXTRA_TEXT,v_nick.getText().toString()+"\n"+
                    v_password.getText().toString()+"\n"+v_email.getText().toString()+"\n"+v_gender.getText().toString());
            startActivity(intento_compartir);
        });
    }

    public void Find_id_of_objects(){
        share_button = findViewById(R.id.button_share);
        v_email = findViewById(R.id.view_email);
        v_nick = findViewById(R.id.view_nickname);
        v_gender = findViewById(R.id.view_gender);
        v_password = findViewById(R.id.view_password);
    }
}
