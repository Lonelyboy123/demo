package com.example.demo;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.Account;

import java.util.ArrayList;

public class DemoLV_SP extends AppCompatActivity {
    ArrayList<Account> arr = new ArrayList<>();
    ListView lv;
    ArrayAdapter<Account> adap;
    EditText name, pass;
    TextView tvid;

    //    String [] arrsp=new String[]{"LT HDT","LT thủ tục","LT Event"};
//    Spinner sp;
//    ArrayAdapter<String> adapsp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_spinner);
        ListviewEvent();
//        SpinnerEvent();
    }

    private void ListviewEvent() {
//        B1 Tạo nguồn data
        arr.add(new Account(1,"Rong Long Nong","buu12u4inef1245"));
        arr.add(new Account(3,"asd","c%acsbfq"));



//        Binding View
        lv = (ListView) findViewById(R.id.lv);
        tvid = findViewById(R.id.tvid);
        name = findViewById(R.id.edtname);
        pass = findViewById(R.id.edtpass);
//        B3 Khai báo khởi tạo adapter, kết nối với nguồn dữ liệu
        adap = new ArrayAdapter<Account>(DemoLV_SP.this, android.R.layout.simple_list_item_1, arr);
//        B3.2 Đẩy dữ liệu lên view
        lv.setAdapter(adap);
//        B4 Viết event
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Account tk=arr.get(position);
                tvid.setText(tk.getId()+"");
                name.setText(tk.getName()+"");
                pass.setText(tk.getPassword()+"");
                Toast.makeText(DemoLV_SP.this, "b click " + position + ": " + tk.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

//    private void SpinnerEvent() {
//        //        B1 Tạo nguồn data
////        Binding View
//        sp = findViewById(R.id.sp);
////        B3 Khai báo khởi tạo adapter, kết nối với nguồn dữ liệu
//        adapsp = new ArrayAdapter<String>(DemoLV_SP.this, android.R.layout.simple_list_item_1, arrsp);
////        B3.2 Đẩy dữ liệu lên view
//        sp.setAdapter(adapsp);
////        B4 Viết event
//        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//Toast.makeText(DemoLV_SP.this,"b click "+position+": "+arrsp[position],Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }

}