package com.example.guesstheflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class GameActivity extends AppCompatActivity {

    @BindView(R.id.buttonA)
    Button buttonA;
    @BindView(R.id.buttonB)
    Button buttonB;
    @BindView(R.id.buttonC)
    Button buttonC;
    @BindView(R.id.buttonD)
    Button buttonD;
    @BindView(R.id.textViewCorrect)
    TextView textViewCorrect;
    @BindView(R.id.textViewQuestion)
    TextView textViewQuestion;
    @BindView(R.id.textViewWrong)
    TextView textViewWrong;
    @BindView(R.id.imageViewFlag)
    ImageView imageViewFlag;
    @BindView(R.id.imageViewNext)
    ImageView imageViewNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    @OnClick(R.id.buttonA) void setButtonA(){
        
    }

    @OnClick(R.id.buttonB) void setButtonB(){

    }

    @OnClick(R.id.buttonC) void setButtonC(){

    }

    @OnClick(R.id.buttonD) void setButtonD(){

    }
}