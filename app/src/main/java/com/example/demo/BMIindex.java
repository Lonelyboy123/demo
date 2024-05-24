package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BMIindex extends AppCompatActivity {
    Button btnbmi;
    EditText edtcancang, edtchieucao;

    TextView tvbmi, tvdanhgia;
    float chieucao, cannang, bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        Init();
        Event();
    }

    private void Event() {
        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chieucao = Float.parseFloat(edtchieucao.getText().toString());
                cannang = Float.parseFloat(edtcancang.getText().toString());
                bmi = cannang / (chieucao* chieucao);
                tvbmi.setText(bmi + "");
                if (bmi < 18.5) {
                    tvdanhgia.setText("GẦY - thiếu cân");
                } else if (bmi <= 24.9) {
                    tvdanhgia.setText("BÌNH THƯỜNG");
                } else tvdanhgia.setText("BÉO - thừa cân");
            }
        });


    }

    private void Init() {
        btnbmi = findViewById(R.id.btn_bmi);
        edtcancang = findViewById(R.id.edt_cannang);
        edtchieucao = findViewById(R.id.edt_chieucao);
        tvbmi = findViewById(R.id.tv_bmi);
        tvdanhgia = findViewById(R.id.tv_danhgia);
    }

}
