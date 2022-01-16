package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

TextView text;
EditText n1, n2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= findViewById(R.id.text);
       n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
button = findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
        text.setText("Sum is " + sum);
    }
});


    }
}