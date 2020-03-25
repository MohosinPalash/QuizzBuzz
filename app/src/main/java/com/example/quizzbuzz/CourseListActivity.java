package com.example.quizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CourseListActivity extends AppCompatActivity implements View.OnClickListener{


    Button NM, Algo, DEPT, CA, MATH;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        NM = (Button) findViewById(R.id.button2);
        Algo = (Button) findViewById(R.id.button3);
        DEPT = (Button) findViewById(R.id.button4);
        CA = (Button) findViewById(R.id.button5);
        MATH = (Button) findViewById(R.id.button6);

        back = (ImageView) findViewById(R.id.imageView3);

        NM.setOnClickListener(this);
        Algo.setOnClickListener(this);
        DEPT.setOnClickListener(this);
        CA.setOnClickListener(this);
        MATH.setOnClickListener(this);
        back.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.imageView3){
            Intent course_intent = new Intent(CourseListActivity.this, RegisterActivity.class);
            startActivity(course_intent);
        }else if (view.getId()== R.id.button2){
            Intent course_intent2 = new Intent(CourseListActivity.this, InstructionActivity.class);
            course_intent2.putExtra("No","CSE 2201");
            course_intent2.putExtra("Title","Numerical Methods");
            course_intent2.putExtra("Teacher","Ms. Raqeebir Rab");
            course_intent2.putExtra("Topic","1. Bisection Method\n" +
                                                        "2.All possible Roots\n"+
                                                        "3.Error");
            course_intent2.putExtra("Note","1. This quiz contains 10 questions.\n" +
                                                        "2.Each question conatins 2 marks\n"+
                                                        "3.Best three quizes will be counted");

            startActivity(course_intent2);
        }else if (view.getId()== R.id.button3){
            Intent course_intent2 = new Intent(CourseListActivity.this, InstructionActivity.class);
            course_intent2.putExtra("No","CSE 2207");
            course_intent2.putExtra("Title","Algorithms");
            course_intent2.putExtra("Teacher","Mr. Khairul Hasan (Paris)");
            course_intent2.putExtra("Topic","1. BST, PQ, NP\n" +
                    "2.BFS, DFS, Top Sort\n"+
                    "3.Shortest Paths");
            course_intent2.putExtra("Note","1. This quiz contains 10 questions.\n" +
                    "2.Each question conatins 2 marks\n"+
                    "3.Best three quizes will be counted");

            startActivity(course_intent2);
        } else if (view.getId()== R.id.button4){
            Intent course_intent2 = new Intent(CourseListActivity.this, InstructionActivity.class);
            course_intent2.putExtra("No","CSE 2209");
            course_intent2.putExtra("Title","Digital Elec. & Pulse Tech.");
            course_intent2.putExtra("Teacher","Mr. Shoeb M Shahriar");
            course_intent2.putExtra("Topic","1. TTl NAND Gate\n" +
                    "2.MOSFET");
            course_intent2.putExtra("Note","1. This quiz contains 10 questions.\n" +
                    "2.Each question conatins 2 marks\n"+
                    "3.Best three quizes will be counted");

            startActivity(course_intent2);
        } else if (view.getId()== R.id.button5){
            Intent course_intent2 = new Intent(CourseListActivity.this, InstructionActivity.class);
            course_intent2.putExtra("No","CSE 2213");
            course_intent2.putExtra("Title","Computer Architecture");
            course_intent2.putExtra("Teacher","Ms. Fatema Mirza");
            course_intent2.putExtra("Topic","1. Byte Addressability (Ch.2)\n" +
                    "2.I/O Devices (Ch.4)\n");
            course_intent2.putExtra("Note","1. This quiz contains 10 questions.\n" +
                    "2.Each question conatins 2 marks\n"+
                    "3.Best three quizes will be counted");

            startActivity(course_intent2);
        }  else if (view.getId()== R.id.button6){
            Intent course_intent2 = new Intent(CourseListActivity.this, InstructionActivity.class);
            course_intent2.putExtra("No","MATH 2203");
            course_intent2.putExtra("Title","Mathematics IV");
            course_intent2.putExtra("Teacher","Unknown");
            course_intent2.putExtra("Topic","1. Eigen Values\n" +
                    "2.Similar Matrices\n"+
                    "3.Vector Analysis");
            course_intent2.putExtra("Note","1. This quiz contains 10 questions.\n" +
                    "2.Each question conatins 2 marks\n"+
                    "3.Best three quizes will be counted");

            startActivity(course_intent2);
        }




}
}
