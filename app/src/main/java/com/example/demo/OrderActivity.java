package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    TextView orderSummaryTextView;
    Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderactivity);

        orderSummaryTextView = findViewById(R.id.orderSummaryTextView);
        confirmButton = findViewById(R.id.confirmButton);

        ArrayList<String> selectedFoods = getIntent().getStringArrayListExtra("selectedFoods");
        StringBuilder orderSummary = new StringBuilder("You have ordered:\n\n");
        for (String food : selectedFoods) {
            orderSummary.append(food).append("\n");
        }
        orderSummaryTextView.setText(orderSummary.toString());

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle order confirmation here
                // For now, we just close the activity
                finish();
            }
        });
    }
}
