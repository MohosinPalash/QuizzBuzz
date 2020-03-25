package com.example.quizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InstructionActivity extends AppCompatActivity implements View.OnClickListener {
    TextView CourseNo, CourseTitle, CourseTeacher, Topics, Note;
    ImageView back;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        CourseNo = (TextView) findViewById(R.id.textView);
        CourseTitle = (TextView) findViewById(R.id.textView2);
        CourseTeacher = (TextView) findViewById(R.id.textView3);
        Topics = (TextView) findViewById(R.id.textView4);
        Note = (TextView) findViewById(R.id.textView5);
        back = (ImageView) findViewById(R.id.imageView4);
        start = (Button) findViewById(R.id.button);

        back.setOnClickListener(this);
        start.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String CNo = bundle.getString("No");
            String CTitle = bundle.getString("Title");
            String CTeacher = bundle.getString("Teacher");
            String QTopic = bundle.getString("Topic");
            String QNote = bundle.getString("Note");
            CourseNo.setText(CNo);
            CourseTitle.setText(CTitle);
            CourseTeacher.setText(CTeacher);
            Topics.setText(QTopic);
            Note.setText(QNote);

        }

    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.imageView4){
            Intent inst_intent = new Intent(InstructionActivity.this, CourseListActivity.class);
            startActivity(inst_intent);
        }else if(view.getId()== R.id.button){
            Intent inst_intent2 = new Intent(InstructionActivity.this, QuestionActivity.class);
            startActivity(inst_intent2);
        }
    }
}
