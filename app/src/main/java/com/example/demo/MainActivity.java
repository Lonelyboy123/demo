package com.example.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

//public class MainActivity extends AppCompatActivity {
//    EditText num1, num2;
//    Button cal;
//    TextView total;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.bmi);
//        Init();
//        Event();
//    }
//
//    private void Init() {
//        num1 = findViewById(R.id.so1);
//        num2 = findViewById(R.id.so2);
//        total = findViewById(R.id.ketqua);
//        cal = findViewById(R.id.button);
//    }
//
//    private void Event() {
//        cal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    double a = Double.parseDouble(num1.getText().toString());
//                    double b = Double.parseDouble(num2.getText().toString());
//                    double c = a + b;
//                    total.setText(String.valueOf(c));
//                } catch (NumberFormatException e) {
//                    total.setText("Invalid input");
//                }
//            }
//        });
//    }
//
//}

//public class MainActivity extends AppCompatActivity {
//
//    Button singleChoiceButton, multipleChoiceButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.question_main);
//
//        Init();
//        singleChoiceButtonPress();
//        multipleChoiceButtonPress();
//
//
//    }
//
//    private void multipleChoiceButtonPress() {
//        multipleChoiceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MultipleChoiceActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    private void singleChoiceButtonPress() {
//        singleChoiceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SingleChoiceActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    private void Init() {
//        singleChoiceButton = findViewById(R.id.singleChoiceButton);
//        multipleChoiceButton = findViewById(R.id.multipleChoiceButton);
//    }
//}
//package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

//public class MainActivity extends AppCompatActivity {
//
//    ListView foodListView;
//    Button orderButton;
//    ArrayList<String> selectedFoods = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.orderactivitymain);
//
//        foodListView = findViewById(R.id.foodListView);
//        orderButton = findViewById(R.id.orderButton);
//
//        final String[] foods = {"Burger", "Pizza", "Fries", "Salad", "Soda"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, foods);
//        foodListView.setAdapter(adapter);
//        foodListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//
//        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String selectedFood = (String) foodListView.getItemAtPosition(position);
//                if (selectedFoods.contains(selectedFood)) {
//                    selectedFoods.remove(selectedFood);
//                } else {
//                    selectedFoods.add(selectedFood);
//                }
//            }
//        });
//
//        orderButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
//                intent.putStringArrayListExtra("selectedFoods", selectedFoods);
//                startActivity(intent);
//            }
//        });
//    }
//}
//package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    Button a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_main);
        a = findViewById(R.id.singleChoiceButton);
        b = findViewById(R.id.multipleChoiceButton);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ac = new Intent(MainActivity.this, DemoLV_SP.class);
                startActivity(ac);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd = new Intent(MainActivity.this, MultipleChoiceActivity.class);
                startActivity(bd);
            }
        });
    }
}