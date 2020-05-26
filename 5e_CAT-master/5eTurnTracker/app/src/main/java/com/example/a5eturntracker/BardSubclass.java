package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class BardSubclass extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bard_subclass);

        Intent classToSubclass = getIntent();
        final Character player = (Character)classToSubclass.getSerializableExtra("character");
        final List<SubClass> subClassList = createBardSubClassList();



        // Bard Subclasses

        Button glamourButt = findViewById(R.id.glamourButton);
        glamourButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Glamour")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BardSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button loreButt = findViewById(R.id.loreButton);
        loreButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Lore")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BardSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button swordsButt = findViewById(R.id.swordsButton);
        swordsButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Swords")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BardSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button valorButt = findViewById(R.id.valorButton);
        valorButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Valor")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BardSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button whispersButt = findViewById(R.id.whispersButton);
        whispersButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Whispers")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BardSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

    }
}
