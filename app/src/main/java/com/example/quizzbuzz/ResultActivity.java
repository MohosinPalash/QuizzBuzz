package com.example.quizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView corr_ans, wro_ans, sco, comment;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        corr_ans = (TextView) findViewById(R.id.textView6);
        wro_ans = (TextView) findViewById(R.id.textView7);
        sco = (TextView) findViewById(R.id.textView8);
        comment = (TextView) findViewById(R.id.textView9);
        home = (Button) findViewById(R.id.button7);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct answers: " + QuestionActivity.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Wrong Answers: " + QuestionActivity.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + QuestionActivity.correct + "\n");
        corr_ans.setText(sb);
        wro_ans.setText(sb2);
        sco.setText(sb3);

        if(QuestionActivity.correct==10){
            comment.setText("Excellent Performance!");
        }else if(QuestionActivity.correct>=8 && QuestionActivity.correct < 10){
            comment.setText("Good Performance!");
        }else if(QuestionActivity.correct>=5 && QuestionActivity.correct < 8){
            comment.setText("Better Luck Next time!");
        }else{
            comment.setText("Study hard...");
        }

        QuestionActivity.correct=0;
        QuestionActivity.wrong=0;





        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result_intent = new Intent(ResultActivity.this, CourseListActivity.class);
                startActivity(result_intent);
            }
        });

    }
}
