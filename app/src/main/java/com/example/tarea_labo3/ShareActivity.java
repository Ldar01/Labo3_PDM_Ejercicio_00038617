package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView text_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        text_v = findViewById(R.id.share_text);
        Intent intento = this.getIntent();

        if (intento!=null) {
            text_v.setText(intento.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
