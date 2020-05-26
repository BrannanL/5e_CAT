package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class BarbarianSubclass extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbarian_subclass);

        Intent classToSubclass = getIntent();
        final Character player = (Character)classToSubclass.getSerializableExtra(("character"));
        final List<SubClass> subClassList = createBarbarianSubClassList();




        // Barbarian Subclasses

        Button ancestralGuardianButt = findViewById(R.id.ancestralGuardianButton);
        ancestralGuardianButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Ancestral Guardian")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button battleRagerButt = findViewById(R.id.battleragerButton);
        battleRagerButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Battlerager")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button berserkerButt = findViewById(R.id.berserkerButton);
        berserkerButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Berserker")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button stormHeraldButt = findViewById(R.id.stormHeraldButton);
        stormHeraldButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Storm Herald")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button totemWarriorButt = findViewById(R.id.totemWarriorButton);
        totemWarriorButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Totem Warrior")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button zealotButt = findViewById(R.id.zealotButton);
        zealotButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Zealot")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(BarbarianSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

    }
}
