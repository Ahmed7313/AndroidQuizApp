package com.example.android.androidquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

        import org.w3c.dom.Text;

public class TestBody extends AppCompatActivity {

    public int Score = 0;
    boolean clicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_body);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Button showScoer = findViewById(R.id.show_score);
        showScoer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){

                display(Score);
            }
        });
    }

    // calculate the score of the user and add 1 point for the correct answer
    public int Q1(View view) {

        RadioButton button1 = findViewById(R.id.q1a1);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.q1a1:
                if (checked) {
                    Score++;
                }

        }
        return Score;
    }

    // calculate the score of the user and add 1 point for the poth checkboxes chicked and add 0.5 point if just one clicked
    public int Q2(View view) {
        CheckBox checkBox1 = findViewById(R.id.q2a1);
        CheckBox checkBox3 = findViewById(R.id.q2a3);

        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.q2a1 & R.id.q2a3:
                if (checked) {
                    Score++;
                }

            case R.id.q2a3:
                if (checked) {
                    Score ++;
                }

        }
        return Score;
    }


    public int getScore() {
        return Score;
    }

    private void display (int score){
        TextView textView =(TextView) findViewById(R.id.score);
        textView.setText(""+ score);
    }
}
