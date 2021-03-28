package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView setText;
    private Button btn,imAndTextBtn;
    private ImageButton imBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setText = findViewById(R.id.textId);
        btn = findViewById(R.id.buttonId);
        imBtn = findViewById(R.id.imageButtonId);

        btn.setOnClickListener(this);

       imBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonId)
            setText.setText("Welcome!! Button");
        if(v.getId() == R.id.imageButtonId)
            setText.setText("Welcome!! imageButton");
    }
}