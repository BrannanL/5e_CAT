package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class classSelect extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_select);

        Intent raceToClass = getIntent();
        final Character player = (Character)raceToClass.getSerializableExtra("character");

        final List<CharClass> charClassSelectList = createCharClassList();

        Button buttArtificer = findViewById(R.id.artificerButton);
        buttArtificer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Artificer")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttBarbarian = findViewById(R.id.barbarianButton);
        buttBarbarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Barbarian")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttBard = findViewById(R.id.bardButton);
        buttBard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Bard")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttCleric = findViewById(R.id.clericButton);
        buttCleric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Cleric")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttDruid = findViewById(R.id.druidButton);
        buttDruid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Druid")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttFighter = findViewById(R.id.fighterButton);
        buttFighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Fighter")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttMonk = findViewById(R.id.monkButton);
        buttMonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Monk")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttPaladin = findViewById(R.id.paladinButton);
        buttPaladin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Paladin")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttRanger = findViewById(R.id.rangerButton);
        buttRanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Ranger")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttRogue = findViewById(R.id.rogueButton);
        buttRogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Rogue")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttSorcerer = findViewById(R.id.sorcererButton);
        buttSorcerer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Sorcerer")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttWarlock = findViewById(R.id.warlockButton);
        buttWarlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Warlock")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });

        Button buttWizard = findViewById(R.id.wizardButton);
        buttWizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                for (int i = 0; i < charClassSelectList.size(); i++) {
                    if (charClassSelectList.get(i).name.equals("Wizard")) {
                        player.characterClass = charClassSelectList.get(i);
                    }
                }
                Intent classToSubclass = new Intent(classSelect.this, SubclassSelect.class);
                classToSubclass.putExtra("character", player);
                startActivity(classToSubclass);
            }
        });




    }


    static String[] createArtificerSpellList() {

        String[] artificerSpellList = new String[]{"Acid Splash", "Create Bonfire", "Dancing Lights", "Fire Bolt", "Frostbite",
                "Guidance", "Light", "Mage Hand", "Magic Stone", "Message", "Poison Spray", "Prestidigitation", "Ray of Frost",
                "Resistance", "Shocking Grasp", "Spare the Dying", "Thorn Whip", "Thunderclap", "Absorb Elements", "Catapult",
                "Cure Wounds", "Detect Magic", "Disguise Self", "Expeditious Retreat", "Faerie Fire", "False Life", "Feather Fall",
                "Grease", "Jump", "Longstrider", "Purify Food and Drink", "Sanctuary", "Aid","Alter Self", "Arcane Lock", "Blur",
                "Continual Flame", "Darkvision", "Enhance Ability", "Enlarge/Reduce", "Heat Metal", "Invisibility",
                "Lesser Restoration", "Levitate", "Mgic Weapon", "Protection from Poison", "Pyrotechnics", "Rope Trick",
                "See Invisibility", "Skywrite", "Spider Climb", "Web", "Blink", "Catnap", "Create Food and Water", "Dispel Magic",
                "Elemental Weapon", "Flame Arrows", "Fly", "Glyph of Warding", "Haste", "Protection form Energy", "Revivify",
                "Water Breathing", "Water Walk", "Arcane Eye", "Elemental Bane", "Freedom of Movement", "Leomund\'s Secret Chest",
                "Mordenkainen\'s Faithful Hound", "Otiluke\'s Resilient Sphere", "Stone Shape", "Stoneskin", "Animate Objects",
                "Bigby\'s Hand", "Greater Restoration", "Skill Empowerment", "Transmute Rock", "Wall of Stone"};

        return artificerSpellList;
    };

    static String[] createBardSpellList() {

        String[] bardSpellList = new String[]{"Blade Ward", "Dancing Lights", "Friends", "Light", "Mage Hand", "Message",
                "Minor Illusion", "Prestidigitation", "Thunderclap", "True Strike", "Vicious Mockery", "Animal Friendship",
                "Bane", "Charm Person", "Comprehend Languages", "Cure Wounds", "Detect Magic", "Disguise Self",
                "Dissonant Whispers", "Earth Tremor", "Faerie Fire", "Feather Fall", "Healing Word", "Heroism", "Longstrider",
                "Silent Image", "Sleep", "Speak with Animals", "Tasha\'s Hideous Laughter", "Thunderwave", "Unseen Servant",
                "Animal Messenger", "Blindness/Deafness", "Calm Emotions", "Cloud of Daggers", "Crown of Madness",
                "Detect Thoughts", "Enhance Ability", "Enthrall", "Gift of Gab", "Heat Metal", "Hold Person", "Invisibility",
                "Knock", "Lesser Restoration", "Locate Animals or Plants", "Locate Object", "Phantasmal Force", "Pyrotechnics",
                "See Invisibility", "Shatter", "Silence", "Skywrite", "Suggestion", "Warding Wind", "Zone of Truth", "Bestow Curse",
                "Catnap", "Dispel Magic", "Enemies Abound", "Fast Friends", "Fear", "Feign Death", "Hypnotic Pattern",
                "Major Image", "Nondetection", "Plant Growth", "Sending", "Speak with Dead", "Speak with Plants", "Stinking Cloud",
                "Tongues", "Charm Monster", "Compulsion", "Confusion", "Dimension Door", "Freedom of Movement",
                "Greater Invisibility", "Locate Creature", "Polymorph", "Animate Objects", "Dominate Person", "Greater Restoration",
                "Hold Monster", "Mass Cure Wounds", "Mislead", "Modify Memory", "Seeming", "Skill Empowerment", "Synaptic Static",
                "Eyebite", "Mass Suggestion", "Otto\'s Irresistible Dance", "Programmed Illusion", "True Seeing", "Etherealness",
                "Forcecage", "Mordenkainen\'s Sword", "Project Image", "Teleport", "Dominate Monster", "Feeblemind", "Glibness",
                "Mind Blan", "Power Word Stun", "Mass Polymorph", "Mower Word Heal", "Power Word Kill", "Psychic Scream", "True Polymorph"};

        return bardSpellList;
    };

    static String[] createClericSpellList() {

        String[] clericSpellList = new String[]{"Guidance", "Light", "Resistance", "Sacred Flame", "Spare the Dying", "Thaumaturgy",
                "Toll the Dead", "Word of Radiance", "Bane", "Bless", "Command", "Create or Destroy Water", "Cure Wounds",
                "Detect Evil and Good", "Detect Magic", "Detect P{oison and Disease", "Guiding Bolt", "Healing Word",
                "Inflict Wounds", "Protection from Evil and Good", "Purify Food and Drink", "Sanctuary", "Shield of Faith", "Aid",
                "Blindness/Deafnesn", "Calm Emotions", "Continual Flame", "Enhance Ability", "Find Traps", "Gentle Repose",
                "Hold Person", "Lesser Restoration", "Locate Object", "Protection from Poison", "Silence", "Spiritual Weapon",
                "Warding Bond", "Zone of Truth", "Beacon of Hope", "Bestow Curse", "Create Food and Water", "Daylight",
                "Dispel Magic", "Fast Friends", "Feign Death", "Incite Greed", "Life Transference", "Mass Healing Word",
                "Meld into Stone", "Protection from Energy", "Remove Curse", "Revivify", "Sending", "Speak with Dead",
                "Spirit Guardians", "Tongues", "Water Walk", "Banishment", "Control Water", "Death Ward", "Divination",
                "Freedom of Movement", "Guardian of Faith", "Locate Creature", "Stone Shape", "Contagion", "Dawn",
                "Dispel Evil and Good", "Flame Strike", "Greater Restoration", "Holy Weapon", "Insect Plague", "Mass Cure Wounds",
                "Blade Barrier", "Harm", "Heal", "True Seeing", "Word of Recall", "Divine Word", "Etherealness", "Fire Storm",
                "Plane Shift", "Antimagic Field", "Earthquake", "Holy Aura", "Gate", "Mass Heal"};

        return clericSpellList;
    };

    static String[] createDruidSpellList() {

        String[] druidSpellList = new String[]{"Control Flames", "Create Bonfire", "Druidcraft", "Frostbite", "Guidance", "Gust",
                "Infestation", "Magic Stone", "Mold Earth", "Poison Spray", "Primal Savagery", "Produce Flame", "Resistance",
                "Shape Water", "Shillelagh", "Thorn Whip", "Thunderclap", "Absorb Elements", "Animal Friendship", "Beast Bond",
                "Charm Person", "Create or Destroy Water", "Cure Wounds", "Detect Magic", "Detect Poison", "Earth Tremor",
                "Entangle", "Faerie Fire", "Fog Cloud", "Goodberry", "Healing Word", "Ice Knife", "Jump", "Longstrider",
                "Purify Food and Drink", "Speak with Animals", "Thunderwave", "Animal Messenger", "Barkskin", "Beast Sense",
                "Darkvision", "Dust Devil", "Earthbind", "Enhance Ability", "Find Traps", "Flame Blade", "Flaming Sphere",
                "Gust of Wind", "Healing Spirit", "Heat Metal", "Hold Person", "Lesser Restoration", "Locate Animals or Plants",
                "Locate Object", "Moonbeam", "Pass without Trace", "Protection from Poison", "Skywrite", "Spike Growth",
                "Warding Wind", "Call Lightning", "Conjure Animals", "Daylight", "Dispel Magic", "Erupting Earth", "Feign Death",
                "Flame Arrows", "Meld into Stone", "Plant Growth", "Protection from Energy", "Sleet Storm", "Speak with Plants",
                "Tidal Wave", "Wall of Water", "Water Breathing", "Water Walk", "Wind Wall", "Blight", "Charm Monster", "Confusion",
                "Conjure Woodland Beings", "Control Water", "Dominate Beast", "Elemental BAne", "Freedom of Movement", "Giant Insect",
                "Grasping Vine", "Guardian of Nature", "Ice Storm", "Locate Creature", "Polymorph", "Stone Shape", "Stoneskin",
                "Wall of Fire", "Watery Sphere", "Antilife Shell", "Contagion", "Control Winds", "Greater Restoration", "Insect Plague",
                "Maelstrom", "MAss Cure Wounds", "Transmute Rock", "Tree Stride", "Wall of Stone", "Wrath of Nature", "Bones of the Earth",
                "Heal", "Investiture of Flame", "Investiture of Ice", "Investiture of Stone", "Investiture of Wind", "Move Earth",
                "Primordial Ward", "Sunbeam", "Transport via Plants", "Wall of Thorns", "Fire Storm", "Plane Shift", "Reverse Gravity",
                "Whirlwind", "Animal Shapes", "Earthquake", "Feeblemind", "Sunburst", "Shapechange", "Storm of Vengeance"};

        return druidSpellList;

    };

    static String[] createPaladinSpellList() {

        String[] paladinSpellList = new String[]{"Bless", "Command", "Compelled Duel", "Cure Wounds", "Detect Evil and Good",
                "Detect Magic", "Detect Poison and Disease", "Divine Favor", "Heroism", "Protection from Evil and Good",
                "Purify Food and Drink", "Searing SMite", "Shield of Faith", "Thunderous Smite", "Wrathful Smite", "Aid",
                "Branding Smite", "Lesser Restoration", "Locate Object", "Magic Weapon", "Protection from Poison", "Zone of Truth",
                "Aura of Vitality", "Blinding Smite", "Create Food and Water", "Crusader\'s Mantle", "Daylight", "Dispel Magic",
                "Elemental Weapon", "Remove Curse", "Revivify", "Aura of Life", "Aura of Purity", "Banishment", "Death Ward",
                "Locate Creature", "Staggering Smite", "Banishing Smite", "Circle of Power", "Destructive Wave", "Dispel Evil and Good", "Holy Weapon"};

        return paladinSpellList;
    };

    static String[] createRangerSpellList() {

      String[] rangerSpellList = new String[]{"Absorb Elements", "Animal Friendship", "Beast Bond", "Cure Wounds", "Detect Magic",
              "Detect Poison and Disease", "Ensnaring Strike", "Fog Cloud", "Goodberry", "Hail of Thorns", "Hunter\'s Mark", "Jump",
              "Longstrider", "Speak with Animals", "Zephyr Strike", "Animal Messenger", "Barkskin", "Beast Sense",
              "Cordon of Arrows", "Darkvision", "Find Traps", "Healing Spirit", "Lesser Restoration", "Locate Animals or Plants",
              "Locate Object", "Pass without Trace", "Protection from Poison", "Silence", "Spike Growth", "Conjure Animals",
              "Conjure Barrage", "Daylight", "Flame Arrows", "Lightning Arrow", "Nondetection", "Plant Growth",
              "Protection from Energy", "Speak with Plants", "Water Breathing", "Water Walk", "Wind WAll", "Conjure Woodland Beings",
              "Freedom of Movement", "Grasping Vine", "Guardian of Nature", "Locate Creature", "Stoneskin", "Conjure Volley",
              "Steel Wind Strike", "Swift Quiver", "Tree Stride", "Wrath of Nature"};

      return rangerSpellList;
    };

    static String[] createSorcererSpellList() {

        String[] sorcererSpellList = new String[]{"Acid Splash", "Blade Ward", "Booming Blade", "Chill Touch", "Control Flames",
                "Create Bonfire", "Dancing Lights", "Fire Bolt", "Friends", "Frostbite", "Green-Flame Blade", "Gust", "Infestation",
                "Light", "Lightning Lure", "Mage Hand", "Message", "Minor Illusion", "Mold Earth", "Poison Spray", "Prestidigitation",
                "Ray of Frost", "Shape Water", "Shocking Grasp", "Sword Burst", "Thunderclap", "True Strike", "Absorb Elements",
                "Burning Hands", "Catapult", "Chaos Bolt", "Charm Person", "Chromatic Orb", "Color Spray", "Comprehend Languages",
                "Detect Magic", "Disguise Self", "Earth Tremor", "Expeditious Retreat", "False Life", "Feather Fall", "Fog Cloud",
                "Ice Knife", "Jump", "Mage Armor", "Magic Missile", "Ray of Sickness", "Shield", "Silent Image", "Sleep",
                "Thunderwave", "Witch Bolt", "Aganazzar\'s Scorcher", "Alter Self", "Blindness/Deafness", "Blur", "Cloud of Daggers",
                "Crown of Madness", "Darkness", "Darkvision", "Detect Thoughts", "Dragon\'s Breath", "Dust Devil", "Earthbind",
                "Enhance Ability", "Enlarge/Reduce", "Gust of Wind", "Hold Person", "Invisibility", "Knock", "Levitate",
                "Maximilian\'s Earthen Grasp", "Mind Spike", "Mirror Image", "Misty Step", "Phantasmal Force", "Pyrotechnics",
                "Scorching Ray", "See Invisibility", "Shadow Blade", "Shatter", "Snilloc\'s Snowball Swarm", "Spider Climb",
                "Suggestion", "Warding Wind", "web", "Blink", "Catnap", "Counterspell", "Daylight", "Dispel Magic", "Enemies Abound",
                "Erupting Earth", "Fear", "Fireball", "Flame Arrows", "Fly", "Gaseous Form", "Haste", "Hypnotic Pattern",
                "Lightning Bolt", "Major Image", "Melf\'s Minute Meteors", "Protection from Energy", "Sleet Storm", "Slow",
                "Stinking Cloud", "Thunder Step", "tidal Wave", "Tongues", "Wall of Water", "Water Breathing", "Water Walk",
                "Banishment", "Blight", "Charm Monster", "Confusion", "Dimension Door", "Dominate Beast", "Greater Invisibility",
                "Ice Storm", "Polymorph", "Sickening Radiance", "Stoneskin", "Storm Sphere", "Vitriolic Sphere", "Wall of Fire",
                "Watery Sphere", "Animate Objects", "Cloudkill", "Cone of Cold", "Control Winds", "Dominate Person", "Enervation",
                "Far Step", "Hold Monster", "Immolation", "Insect Plague", "Seeming", "Skill Empowerment", "Synaptic Static",
                "Telekinesis", "Wall of Light", "Wall of Stone", "Arcane Gate", "Chain Lightning", "Circle of Death",
                "Disintegrate", "Eyebite", "Globe of Invulnerability", "Investiture of Flame", "Investiture of Ice",
                "Investiture of Stone", "Investiture of Wind", "Mass Suggestion", "Mental Prison", "Move Earth", "Scatter",
                "Sunbeam", "True Seeing", "Crown of Stars", "Delayed Blast Fireball", "Etherealness", "Finger of Death",
                "Fire Storm", "Plane Shift", "Power Word Pain", "Prismatic Spray", "Reverse Gravity", "Teleport", "Whirlwind",
                "Abit-Dalzim\'s Horrid Wilting", "Dominate Monster", "Earthquake", "Incendiary Could", "Power Word Stun",
                "Sunburst", "Gate", "Mass Polymorph", "Meteor Swarm", "Power Word Kill", "Psychic Scream", "Time Stop", "Wish"};

        return sorcererSpellList;
    };

    static String[] createWarlockSpellList() {

        String[] warlockSpellList = new String[]{"Blade Ward", "Booming Blade", "Chill Touch", "Create Bonfire", "Eldritch Blast",
                "Friends", "Frostbite", "Green-Flame Blade", "Infestation", "Lightning Lure", "Mage Hand", "Magic Stone",
                "Minor Illusion", "Poison Spray", "Prestidigitation", "Sword Burst", "Thunderclap", "Toll the Dead", "True Strike",
                "Armor of Agathys", "Arms of Hadar", "Cause Fear", "Charm Person", "Comprehend Languages", "Expeditious Retreat",
                "Hellish Rebuke", "Hex", "Protection from Evil and Good", "Unseen Servant", "Witch Bolt", "Cloud of Daggers",
                "Crown of Madness", "Darkness", "Earthbind", "Enthrall", "Hold Person", "Invisibility", "Mind Spike", "Mirror Image",
                "Misty Step", "Ray of Enfeeblement", "Shadow Blade", "Shatter", "Spider Climb", "Suggestion", "Counterspell",
                "Dispel Magic", "Enemies Abound", "Fear", "Fly", "Gaseous Form", "Hunger of Hadar", "Hypnotic Pattern",
                "Incite Greed", "Major Image", "Remove Curse", "Summon Lesser Demons", "Thunder Step", "Tongues",
                "Vampiric Touch", "Banishment", "Blight", "Charm Monster", "Dimension Door", "Elemental Bane", "Shadow of Moil",
                "Sickening Radiance", "Summon Greater Demon", "Danse Macabre", "Enervation", "Hold Monster",
                "Negative Energy Flood", "Synaptic Static", "Wall of Light", "Arcane Gate", "Circle of Death", "Eyebite",
                "Flesh to Stone", "Investiture of Flame", "Investiture of Ice", "Investiture of Stone", "Investiture of Wind",
                "Mass Suggestion", "Mental Prison", "Scatter", "Sould Cage", "True Seeing", "Crown of Stars", "Etherealness",
                "Finger of Death", "Forcecage", "Plane Shift", "Power Word Pain", "Demiplane", "Dominate Monster", "Feeblemind",
                "Glibness", "Maddening Darkness", "Power Word Stun", "Astral Projection", "Power Word Kill", "Psychic Scream", "True Polymorph"};

        return warlockSpellList;
    };

    static String[] createWizardSpellList() {

        String[] wizardSpellList = new String[]{"Acid Splash", "Blade Ward", "Booming Blade", "Chill Touch", "Control Flames",
                "Create Bonfire", "Dancing Lights", "Fire Bolt", "Friends", "Frostbite", "Green-Flame Blade", "Gust", "Infestation",
                "Light", "Lightning Lure", "Mage Hand", "Message", "Minor Illusion", "Mold Earth", "Poison Spray", "Prestidigitation",
                "Ray of Frost", "Shape Water", "Shocking Grasp", "Sword Burst", "Thunderclap", "Toll the Dead", "True Strike",
                "Absorb Elements", "Burning Hands", "Catapult", "Cause Fear", "Charm Person", "Chromatic Orb", "Color Spray",
                "Comprehend Languages", "Detect Magic", "Disguise Self", "Earth Tremor", "Expeditious Retreat", "False Life",
                "Feather Fall", "Fog Cloud", "Grease", "Ice Knife", "Jim\'s Magic Missile", "Jump", "Longstrider", "Mage Armor",
                "Magic Missile", "Protection from Evil and Good", "Ray of Sickness", "Shield", "Silent Image", "Sleep",
                "Tasha\'s Hideous Laughter", "Tenser\'s Floating Disk", "Thunderwave", "Unseen Servant", "Witch Bolt",
                "Aganazzar\'s Scorcher", "Alter Self", "Arcane Lock", "Blindness/Deafness", "Blur", "Cloud of Daggers",
                "Continual Flame", "Crown of Madness", "Darkness", "Darkvision", "Detect Thoughts", "Dragon\'s Breath", "Dust Devil",
                "Earthbind", "Enlarge/Reduce", "Flaming Sphere", "Gentle Repose", "Gift of Gab", "Gust of Wind", "Hold Person",
                "Invisibility", "Jim\'s Glowing Coin", "Knock", "Levitate", "Locate Object", "Magic Weapon",
                "Maximilian\'s Earthen Grasp", "Melf\'s Acid Arrow", "Mind Spike", "Mirror Image", "Misty Step",
                "Nystul\'s Magic Aura", "Phantasmal Force", "Pyrotechnics", "Ray of Enfeeblement", "Rope Trick", "Scorching Ray",
                "See Invisibility", "Shadow Blade", "Shatter", "Skywrite", "Snilloc\'s Snowball Swarm", "Spider Climb",
                "Suggestion", "Warding Wind", "Web", "Bestow Curse", "Blink", "Dispel Magic", "Enemies Abound", "Erupting Earth",
                "Fast Friends", "Fear", "Feign Death", "Fireball", "Flame Arrows", "Fly", "Gaseous Form", "Haste", "Hypnotic Pattern",
                "Incite Greed", "Life Transference", "Lightning Bolt", "Major Image", "Melf\'s Minute Meteors", "Nondetection",
                "Protection from Energy", "Remove Curse", "Sending", "Sleet Storm", "Slow", "Stinking Cloud", "Summon Lesser Demons",
                "Thunder Step", "Tidal Wave", "Tongues", "Vampiric Touch", "Wall of Sand", "Wall of Water", "Water Breathing",
                "Arcane Eye", "Banishment", "Blight", "Charm Monster", "Confusion", "Control Water", "Dimension Door",
                "Dlemental Bane", "Evard\'s Black Tentacles", "Fire Shield", "Greater Invisibility", "Ice Storm",
                "Leomund\'s Secret Chest", "Locate Creature", "Mordenkainen\'s Faithful Hound", "Otiluke\'s Resilient Sphere",
                "Phantasmal Killer", "Polymorph", "Sickening Radiance", "Stone Shape", "Stoneskin", "Storm Sphere",
                "Summon Greater Demon", "Vitriolic Sphere", "Wall of Fire", "Watery Sphere", "Animate Objects", "Bigby\'s Hand",
                "Cloudkill", "Cone of Cold", "Control Winds", "Danse Macabre", "Dawn", "Dominate Person", "Enervation", "Far Step",
                "Hold Monster", "Immolation", "Mislead", "Modify Memory", "Negative Energy Flood", "Passwall", "Rary\'s Telepathic Bond",
                "Seeming", "Skill Empowerment", "Steel Wind Strike", "Synaptic Static", "Telekinesis", "Transmute Rock", "Wall of Force",
                "Wall of Light", "Wall of Stone", "Arcane Gate", "Chain Lightning", "Circle of Death", "Disintegrate", "Eyebite", "Flesh to Stone",
                "Globe of Invulnerability", "Investiture of Flame", "Investiture of Ice", "Investiture of Stone", "Investiture of Wind",
                "Mass Suggestion", "Mental Prison", "Move Earth", "Otiluke\'s Freezing Sphere", "Otto\'s Irresistible Dance", "Programmed Illusion",
                "Scatter", "Soul Cage", "Sunbeam", "Tenser\'s Transformation", "True Seeing", "Wall of Ice", "Crown of Stars",
                "Delayed Blast Fireball", "Etherealness", "Finger of Death", "Forcecage", "Mordenkainen\'s Sword", "Plane Shift", "Power Word Pain",
                "Prismatic Spray", "Project Image", "Reverse Gravity", "Sequester", "Teleport", "Whirlwind", "Abi-Dalzim\'s Horrid Wilting",
                "Antimagic Field", "Demiplane", "Dominate Monster", "Feeblemind", "Illusory Dragon", "Incendiary Cloud", "Maddening Darkness",
                "Maze", "Mind Blank", "Power Word Stun", "Sunburst", "Telepathy", "Gate", "Invulnerability", "Mass Polymorph", "Meteor Swarm",
                "Power Word Kill", "Prismatic Wall", "Psychic Scream", "Shapechange", "Time Stop", "True Polymorph", "Weird", "Wish"};

        return wizardSpellList;
    };







}



