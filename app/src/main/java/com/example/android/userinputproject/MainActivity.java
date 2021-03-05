package com.example.android.userinputproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String TeamA = "Team A";
    String TeamB = "Team B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_textview);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPoints3A(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void displayPoints2A(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void displayPoints1A(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_textview);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPoints3B(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayPoints2B(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void displayPoints1B(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        EditText teamA = (EditText) findViewById(R.id.team_a_textview);
        EditText teamB = (EditText) findViewById(R.id.team_b_textview);
        teamA.setText("Team A");
        teamB.setText("Team B");
    }
}