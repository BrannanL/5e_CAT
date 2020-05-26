package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class WarlockSubclass extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warlock_subclass);

        Intent classToSubclass = getIntent();
        final Character player = (Character)classToSubclass.getSerializableExtra("character");
        final List<SubClass> subClassList = createWarlockSubClassList();


        // Warlock Subclasses
        Button archfeyButt = findViewById(R.id.archfeyButton);
        archfeyButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Archfey")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button celestialButt = findViewById(R.id.celestialButton);
        celestialButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Celestial")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button fiendButt = findViewById(R.id.fiendButton);
        fiendButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Fiend")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button greatOldOneButt = findViewById(R.id.greatOldOneButton);
        greatOldOneButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Great Old One")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button hexbladeButt = findViewById(R.id.hexbladeButton);
        hexbladeButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Hexblade")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button undyingButt = findViewById(R.id.undyingButton);
        undyingButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Undying")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(WarlockSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });
    }
}
