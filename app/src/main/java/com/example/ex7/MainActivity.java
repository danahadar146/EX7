package com.example.ex7;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iVMain;
    Button btn;
    Random random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        iVMain = findViewById(R.id.iVMain);

        btn = findViewById(R.id.btn);

        random = new Random();
    }

    public void clicked(View view) {
        int num=random.nextInt(3)+1;

        if (num==1){
            btn.setText("1");
            iVMain.setImageResource(R.drawable.cutecat);
        }
        if (num==2){
            btn.setText("2");
            iVMain.setImageResource(R.drawable.cuteahmster);
        }
        if (num == 3) {
            btn.setText("3");
            iVMain.setImageResource(R.drawable.cutedog);
        }
    }
}