
package com.example.wellness_assistance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WorkoutPage extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_page);

        Button buttonAbs = findViewById(R.id.buttonAbs);
        Button buttonBack = findViewById(R.id.buttonBack);
        Button buttonBiceps = findViewById(R.id.buttonBiceps);
        Button buttonChest = findViewById(R.id.buttonChest);
        Button buttonLegs = findViewById(R.id.buttonLegs);
        Button buttonShoulder = findViewById(R.id.buttonShoulder);
        Button buttonTriceps = findViewById(R.id.buttonTriceps);

        buttonAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, abs.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Abs clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, back.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Back clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, biceps.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Biceps clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, chest.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Chest clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, legs.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Legs clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, sholder.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Shoulder clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutPage.this, trieceps.class);
                startActivity(intent);
                Toast.makeText(WorkoutPage.this, "Triceps clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
