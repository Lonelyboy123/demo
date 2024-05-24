package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SingleChoiceActivity extends AppCompatActivity {

    RadioGroup optionsRadioGroup;
    Button submitSingleChoiceButton;
    TextView questionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choice);
    Init();
    Event();

    }

    private void Event() {
        submitSingleChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = optionsRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);

                if (selectedRadioButton != null) {
                    String answer = selectedRadioButton.getText().toString();
                    if (answer.equals("Spider")) {
                        Toast.makeText(SingleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(SingleChoiceActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(SingleChoiceActivity.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Init() {

        optionsRadioGroup = findViewById(R.id.optionsRadioGroup);
        submitSingleChoiceButton = findViewById(R.id.submitSingleChoiceButton);
        questionTextView = findViewById(R.id.questionTextView);
    }
}