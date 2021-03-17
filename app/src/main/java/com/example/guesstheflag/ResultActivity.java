package com.example.guesstheflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.textViewTotalCorrect)
    TextView textViewTotalCorrect;
    @BindView(R.id.textViewTotalWrong)
    TextView textViewTotalWrong;
    @BindView(R.id.textViewTotalEmpty)
    TextView TextViewTotalEmpty;
    @BindView(R.id.textViewSuccess)
    TextView textViewSuccess;

    @BindView(R.id.buttonAgain)
    Button buttonAgain;
    @BindView(R.id.buttonExit)
    Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    @OnClick(R.id.buttonAgain)void buttonPlayAgain(){

    }

    @OnClick(R.id.buttonExit)void buttonExit(){

    }

}