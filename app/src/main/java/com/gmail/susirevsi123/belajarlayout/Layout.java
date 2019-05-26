package com.gmail.susirevsi123.belajarlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
//button dari layout dijadikan object dari Java (nama object-nya tombol, nama dari layout button)
        Button tombol = (Button) findViewById(R.id.button);
        tombol.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence text = "Hello toast!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
        );
    }
}
