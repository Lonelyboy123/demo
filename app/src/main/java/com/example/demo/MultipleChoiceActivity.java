package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MultipleChoiceActivity extends AppCompatActivity {

    CheckBox option1, option2, option3, option4;
    Button submitMultipleChoiceButton;
    TextView questionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        Init();
        Event();
    }


    private void Event() {
            submitMultipleChoiceButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean correct = true;

                    if (!option1.isChecked() || !option2.isChecked() || !option4.isChecked() || option3.isChecked()) {
                        correct = false;
                    }

                    if (correct) {
                        Toast.makeText(MultipleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MultipleChoiceActivity.this,"Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }



    private void Init() {
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        submitMultipleChoiceButton = findViewById(R.id.submitMultipleChoiceButton);
        questionTextView = findViewById(R.id.questionTextView);
    }
}
