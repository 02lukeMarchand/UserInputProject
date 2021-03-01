package com.example.android.userinputproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(3);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_textview);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPoints3(){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void displayPoints2(){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void displayPoints1(){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
}