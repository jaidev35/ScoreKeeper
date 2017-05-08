package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outCountTeamA = 0;
    int outCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        outCountTeamA = 0;
        outCountTeamB = 0;
        display_score_team_A();
        display_score_team_B();
        display_out_team_A();
        display_out_team_B();
    }

    //Methods for team A
    public void display_score_team_A(){
        TextView score=(TextView)findViewById(R.id.team_a_score);
        score.setText(""+scoreTeamA);
    }
    public void display_out_team_A(){
        TextView outPlayers = (TextView)findViewById(R.id.team_a_out);
        outPlayers.setText(""+outCountTeamA);
    }

    public void oneRunTeamA(View view){
        scoreTeamA++; //increment by 1 runs
        display_score_team_A();
    }

    public void twoRunsTeamA(View view){
        scoreTeamA+= 2; //increment by 2 runs
        display_score_team_A();
    }

    public void threeRunsTeamA(View view){
        scoreTeamA+= 3; //increment by 3 runs
        display_score_team_A();
    }

    public void fourRunsTeamA(View view){
        scoreTeamA+= 4; //increment by 4 runs
        display_score_team_A();
    }

    public void sixRunsTeamA(View view){
        scoreTeamA+= 6; //increment by 6 runs
        display_score_team_A();

    }

    public void noBallTeamA(View view){
        scoreTeamA++;
        display_score_team_A();
    }
    public void wideBallTeamA(View view){
        scoreTeamA++;
        display_score_team_A();
    }

    public void outTeamA(View view){
        outCountTeamA = outCountTeamA + 1;
        TextView out = (TextView)findViewById(R.id.team_a_out);
        out.setText(""+outCountTeamA);

    }

    //Methods for team B
    public void display_score_team_B(){
        TextView score=(TextView)findViewById(R.id.team_b_score);
        score.setText(""+scoreTeamB);
    }
    public void display_out_team_B(){
        TextView outPlayers = (TextView)findViewById(R.id.team_b_out);
        outPlayers.setText(""+outCountTeamA);
    }

    public void oneRunTeamB(View view){
        scoreTeamB++; //increment by 1 runs
        display_score_team_B();
    }

    public void twoRunsTeamB(View view){
        scoreTeamB+= 2; //increment by 2 runs
        display_score_team_B();
    }

    public void threeRunsTeamB(View view){
        scoreTeamB+= 3; //increment by 3 runs
        display_score_team_B();
    }

    public void fourRunsTeamB(View view){
        scoreTeamB+= 4; //increment by 4 runs
        display_score_team_B();
    }

    public void sixRunsTeamB(View view){
        scoreTeamB+= 6; //increment by 6 runs
        display_score_team_B();
    }
    public void noBallTeamB(View view){
        scoreTeamB++;
        display_score_team_B();
    }
    public void wideBallTeamB(View view){
        scoreTeamB++;
        display_score_team_B();
    }

    public void outTeamB(View view){
        outCountTeamB = outCountTeamB + 1;
        TextView out = (TextView)findViewById(R.id.team_b_out);
        out.setText(""+outCountTeamB);
    }
}
