package com.example.quizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {
    EditText name, id, semester;
    Button submit;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.editText3);
        id = (EditText) findViewById(R.id.editText4);
        semester = (EditText) findViewById(R.id.editText5);
        submit = (Button) findViewById(R.id.submit_btn);
        back = (ImageView) findViewById(R.id.imageView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent course_intent = new Intent(RegisterActivity.this, CourseListActivity.class);
                startActivity(course_intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent course_intent2 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(course_intent2);
            }
        });


    }
}
