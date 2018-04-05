package com.example.sir_c.animacion;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivAni;
    Button btnStart, btnStop;
    Button btnFade, btnZoom, btnRigth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent iReturn = new Intent(getApplicationContext(),ReturnActivity.class);
        ivAni = (ImageView)findViewById(R.id.ivAnimacion);
        ivAni.setBackgroundResource(R.drawable.frame);
        final AnimationDrawable adAnimacion = (AnimationDrawable) ivAni.getBackground();

        btnStart = (Button)findViewById(R.id.btnStart);
        btnStop = (Button)findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adAnimacion.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adAnimacion.stop();
            }
        });

        btnFade = (Button)findViewById(R.id.btnFade);
        btnZoom = (Button)findViewById(R.id.btnZoom);
        btnRigth = (Button)findViewById(R.id.btnRigth);

        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iReturn);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });

        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iReturn);
                overridePendingTransition(R.anim.zoom_foward_in, R.anim.zoom_foward_out);
            }
        });

        btnRigth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iReturn);
                overridePendingTransition(R.anim.left_in,R.anim.left_out);
            }
        });

    }
}
