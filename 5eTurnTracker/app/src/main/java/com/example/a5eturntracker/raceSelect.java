package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class raceSelect extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_select);

        // Create player from Class Character
        final Character player = originatePlayerCharacter();
        createSpellSelectionList();
        final List<Race> raceList = createRaceList();

        //Assign variables to their buttons

        Button buttDragonborn = (Button) findViewById(R.id.dragonbornButton);
        buttDragonborn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Dragonborn")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttDwarfHill = (Button) findViewById(R.id.dwarfHillButton);
        buttDwarfHill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Dwarf (Hill)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttElfDrow = (Button) findViewById(R.id.elfDrowButton);
        buttElfDrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Elf (Drow)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttElfHigh = (Button) findViewById(R.id.elfHighButton);
        buttElfHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Elf (High)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);

            }
        });
        Button buttElfWood = (Button) findViewById(R.id.elfWoodButton);
        buttElfWood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Elf (Wood)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttGenasiWater = (Button) findViewById(R.id.genasiWaterButton);
        buttGenasiWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Genasi (Water)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttGnomeDeep = (Button) findViewById(R.id.gnomeDeepButton);
        buttGnomeDeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Gnome (Deep)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttGnomeForest = (Button) findViewById(R.id.gnomeForestButton);
        buttGnomeForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Gnome (Forest)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });

        Button buttHalfElf = (Button) findViewById(R.id.halfElfButton);
        buttHalfElf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Half-Elf")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttHalfOrc = (Button) findViewById(R.id.halfOrcButton);
        buttHalfOrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Half-Orc")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttHalflingLight = (Button) findViewById(R.id.halflingLightfootButton);
        buttHalflingLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Halfling (Lightfoot)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttHuman = (Button) findViewById(R.id.humanButton);
        buttHuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Human")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttHumanVariant = (Button) findViewById(R.id.humanVariantButton);
        buttHumanVariant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Human (Variant)")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttOrc = (Button) findViewById(R.id.orcButton);
        buttOrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Orc")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
        Button buttTiefling = (Button) findViewById(R.id.tieflingButton);
        buttTiefling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < raceList.size(); i++) {
                    if (raceList.get(i).name.equals("Tiefling")) {
                        player.characterRace = raceList.get(i);
                    }
                }
                Intent raceToClass = new Intent(raceSelect.this, classSelect.class);
                raceToClass.putExtra("character", player);
                startActivity(raceToClass);
            }
        });
    }
}
