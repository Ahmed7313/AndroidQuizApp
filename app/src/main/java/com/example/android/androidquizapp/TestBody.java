package com.example.android.androidquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class TestBody extends AppCompatActivity {

    public double Score = 0;
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
                Intent intent = new Intent(TestBody.this, GetResult.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("Score", getScore());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }

    // calculate the score of the user and add 1 point for the correct answer
    public double Q1(View view) {


        RadioButton radioButton = findViewById(R.id.q1a1);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.q1a1:
                if (checked) {
                    Score++;

                    radioButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            clicked = true;
                        }

                    });
                    if (clicked) {

                        Score--;
                    }

                }
        }
        return Score;

    }

    // calculate the score of the user and add 1 point for the poth checkboxes chicked and add 0.5 point if just one clicked
    public double Q2(View view) {


        // Is the button now checked?

        CheckBox checkBox1Q2 = findViewById(R.id.q2a1);
        CheckBox checkBox3Q2 = findViewById(R.id.q2a3);

        //methode
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.q2a3:
                if (checked) {
                    Score = Score + 0.5;
                    checkBox3Q2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //change boolean value
                            clicked = true;
                        }
                    });

                    //make sure if he pressed on the button again it will not increment more than one
                    if (clicked) {
                        Score--;
                    }
                }
                break;

            case R.id.q2a1:

                if (checked) {
                    Score = Score + 0.5;
                    checkBox1Q2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //change boolean value
                            clicked = true;
                        }
                    });

                    //make sure if he pressed on the button again it will not increment more than one
                    if (clicked) {
                        Score--;
                    }
                }
                break;
        }

        return Score;
    }


    public double getScore() {
        return Score;
    }


    public void Q3(View view) {
        String answer1 = "int quantity;";
        String answer2 = "int Quantity;";

        EditText q3Answer = findViewById(R.id.q3);

        String userAnswer = q3Answer.getText().toString();

        if (answer1.equals(userAnswer)) {
            Score++;

            q3Answer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clicked = true;
                }
            });
            if (clicked) {
                Score--;
            }
        } else if (answer2.equals(userAnswer)) {
            Score++;
            q3Answer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clicked = true;
                }
            });
            if (clicked) {
                Score--;
            }
        }

    }

    public double Q4(View view) {


        RadioButton radioButton = findViewById(R.id.q4a2);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.q4a2:
                if (checked) {
                    Score++;

                    radioButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            clicked = true;
                        }

                    });
                    if (clicked) {

                        Score--;
                    }

                }
        }
        return Score;

    }

}
