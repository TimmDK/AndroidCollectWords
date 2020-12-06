package com.example.collectwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CharSequence> _wordList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveWord(View view) {
        EditText et = findViewById(R.id.MainWordEditText);
        _wordList.add(et.getText().toString());

    }

    public void clearWord(View view) {
        _wordList.clear();
    }

    public void showWord(View view) {
        TextView tv = findViewById(R.id.MainResultTextView);
        tv.setText(_wordList.toString());
    }
}