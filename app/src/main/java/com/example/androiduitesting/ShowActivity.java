package com.example.androiduitesting;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_show);


        TextView cityNameTextView = findViewById(R.id.textView_cityName);
        Button backButton = findViewById(R.id.button_back);

        // Get the Intent that was used to start this activity.
        Intent intent = getIntent();

        // Extract the city name string that was passed from MainActivity.
        String cityName = intent.getStringExtra("CITY_NAME");

        // Set the city name in the TextView so it's displayed on the screen.
        if (cityName != null) {
            cityNameTextView.setText(cityName);
        }

        // Set a click listener on the back button.
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish() is the command to close the current activity and go back.
                finish();
            }
        });
    }
}
