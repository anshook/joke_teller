package com.udacity.ak.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView mTextViewJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        mTextViewJoke = (TextView) findViewById(R.id.tv_joke);
        String strJoke = getIntent().getStringExtra(getString(R.string.joke_extra));

        if (strJoke != null) {
            mTextViewJoke.setText(strJoke);
        } else {
            Toast.makeText(this, R.string.empty_joke_extra, Toast.LENGTH_SHORT).show();
        }
    }
}
