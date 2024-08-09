package com.example.calculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button2, button3, button4;
    TextView t1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });


        button = findViewById(R.id.add);
        button2 = findViewById(R.id.sub);
        button3 = findViewById(R.id.mul);
        button4 = findViewById(R.id.div);
        t1 = findViewById(R.id.textView);
        e1 = findViewById(R.id.editTextNumber);
        e2 = findViewById(R.id.editTextNumber2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                t1.setText("The Addition: " + (a + b));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(e1.getText().toString());
                int d = Integer.parseInt(e2.getText().toString());
                t1.setText("The subtraction: " + (c - d));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int e = Integer.parseInt(e1.getText().toString());
                int f = Integer.parseInt(e2.getText().toString());
                t1.setText("The Multiplication: " + (e * f));
            }
        });
        button4.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        int g = Integer.parseInt(e1.getText().toString());
        int h = Integer.parseInt(e2.getText().toString());
        t1.setText("The Division: " + (g / h));
    }
    });
}
    @Override
    public void onClick(View view) {

    }
}