package com.example.fragment_radio_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.fragment_radio_checkbox.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView setTime;

    ActivityMainBinding binding;

    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTime=findViewById(R.id.setTime);

        binding.male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.setTime.setText(""+binding.male.getText().toString());
            }
        });
        binding.female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.setTime.setText(""+binding.female.getText().toString());
            }
        });
        binding.java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.java.isChecked())
                {
                    list.add("Java/");
                    binding.setTime.setText(""+list.get(0));
                }
                else if(!binding.java.isChecked())
                {
                    list.remove("Java/");
                    binding.setTime.setText(""+list.get(0));
                }
                // binding.setTime.setText(""+binding.java.getText().toString());
            }
        });
        binding.kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(binding.kotlin.isChecked())
                {
                    list.add("Kotlin/");
                    binding.setTime.setText(""+list.get(1));
                }
                else if(!binding.kotlin.isChecked())
                {
                    list.remove("Kotlin/");
                    binding.setTime.setText(""+list.get(1));
                }
            }
        });
        binding.python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (binding.python.isChecked())
                {
                    list.add("Python/");
                    binding.setTime.setText("" + list.get(2));
                }
                else if (!binding.python.isChecked())
                {
                    list.remove("Python/");
                    binding.setTime.setText("" + list.get(2));
                }
            }
        });
        binding.setTime.setText(""+list);
    }
}