package com.example.hw_andfnd02p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private int c_ount=0;
private TextView count_value;
private String me_count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_value = (TextView)findViewById(R.id.count_text);
        // Restore the state for the count button
        if (savedInstanceState != null) {
            count_value.setText(savedInstanceState.getString("saved_count_value"));
        }
    }

    public void IncreaseCount(View view) {
        c_ount++;
        me_count = String.valueOf(c_ount);
        count_value.setText(me_count);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("saved_count_value",me_count);

    }
}