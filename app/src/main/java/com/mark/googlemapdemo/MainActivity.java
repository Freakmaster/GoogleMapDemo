package com.mark.googlemapdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mark.maplibrary.MapActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        if (view.getId() == R.id.button) {
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
        }
    }
}
