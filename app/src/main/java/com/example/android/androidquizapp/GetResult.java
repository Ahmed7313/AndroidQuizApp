package com.example.android.androidquizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;

public class GetResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_result);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .8));

        TextView textView = findViewById(R.id.Scoreid);
        Bundle bundle = getIntent().getExtras();
        double Score = bundle.getDouble("Score");
        textView.setText("Your Score is :" + Score);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String text = "Cograts for finishing the test your Score is " + Score;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}