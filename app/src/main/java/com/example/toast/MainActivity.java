package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView kanth;
    Button toast,count;
    private int mCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toast =(Button)findViewById(R.id.toast);
        TextView kanth=findViewById(R.id.kanth);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "this is a counter number" +mCounter, Toast.LENGTH_SHORT).show();


            }

            });
        Button count =(Button)findViewById(R.id.count);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                kanth.setText(Integer.toString(mCounter));





            }
        });

    }


}