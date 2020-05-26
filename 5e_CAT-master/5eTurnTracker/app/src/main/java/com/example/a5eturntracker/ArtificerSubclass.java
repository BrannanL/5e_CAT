package com.example.a5eturntracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ArtificerSubclass extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificer_select);

        Intent classToSubclass = getIntent();
        final Character player = (Character)classToSubclass.getSerializableExtra("character");
        final List<SubClass> subClassList = createArtificerSubClassList();
        

        // Artificer Subclasses

        Button alchemistButt = findViewById(R.id.alchemistButton);
        alchemistButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Alchemist")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(ArtificerSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });

        Button artilleristButt = findViewById(R.id.artilleristButton);
        artilleristButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Artillerist")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(ArtificerSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });


        Button battleSmithButt = findViewById(R.id.battleSmithButton);
        battleSmithButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < subClassList.size(); i++) {
                    if (subClassList.get(i).name.equals("Battle Smith")) {
                        player.characterSubClass = subClassList.get(i);
                    }
                }
                Intent subclassToFeats = new Intent(ArtificerSubclass.this, FeatSelect.class);
                subclassToFeats.putExtra("character", player);
                startActivity(subclassToFeats);
            }
        });
    }
}
