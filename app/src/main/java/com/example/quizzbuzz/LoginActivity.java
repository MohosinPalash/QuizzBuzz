package com.example.quizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button login_btn;
    TextView err_msg;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        login_btn = (Button) findViewById(R.id.login_btn2);
        err_msg = (TextView) findViewById(R.id.invalid);
        back = (ImageView) findViewById(R.id.imageView2);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email_add = email.getText().toString();
                String pass = password.getText().toString();
                if (email_add.equals("abc123@gmail.com") && pass.equals("abcd1234")){
                    Intent register_intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(register_intent);
                }else{
                    err_msg.setText("Invalid email or password");
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register_intent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(register_intent2);
            }
        });
    }
}
