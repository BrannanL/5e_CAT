package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class DruidSubclass extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druid_subclass);

        Intent classToSubclass = getIntent();
        final Character player = (Character)classToSubclass.getSerializableExtra("character");
        final List<SubClass> subClassList = createDruidSubClassList();



        // Druid Subclasses
        Button dreamsButt = findViewById(R.id.dreamsButton);
        dreamsButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Dreams")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(DruidSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button landButt = findViewById(R.id.landButton);
        landButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Land")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(DruidSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button moonButt = findViewById(R.id.moonButton);
        moonButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Moon")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(DruidSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button shepardButt = findViewById(R.id.shepardButton);
        shepardButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Shepard")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(DruidSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button sporesButt = findViewById(R.id.sporesButton);
        sporesButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Spores")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(DruidSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });
    }
}
