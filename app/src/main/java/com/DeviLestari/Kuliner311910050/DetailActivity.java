package com.DeviLestari.Kuliner311910050;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {
    ImageView iv_detail_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_detail_foto = findViewById(R.id.iv_detail_foto);

        iv_detail_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, HomeFragment.class);
                startActivity(intent);
            }
        });





    }
}