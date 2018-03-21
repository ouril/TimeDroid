package com.example.ouril.timedroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;

    private Question[] mQuestionBank = new Question[] {
            new Question(R.string.question_Canbera, true),
            new Question(R.string.question_Astana, false)
    };

    private int mCurrenIndex = 0;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionTextView = (TextView)findViewById(R.id.question);
        int question = mQuestionBank[mCurrenIndex].getTestResId();
        mQuestionTextView.setText(question);

        mNextButton = findViewById(R.id.next);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mCurrenIndex = (mCurrenIndex + 1) % mQuestionBank.length;
                int question = mQuestionBank[mCurrenIndex].getTestResId();
                mQuestionTextView.setText(question);
            }
        });


        mTrueButton = (Button) findViewById(R.id.True);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.falseBottom);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
