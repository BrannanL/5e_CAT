package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSpellSelectionList();


    }

    class Character implements Serializable {
        /*
            An iteration of Character will be where most of the user info is stored while using the app
         */
        classSelect.CharClass characterClass;
        classSelect.SubClass characterSubClass;
        classSelect.Background characterBackground;
        classSelect.Race characterRace;


        int charLevel;  // affects which abilities and spells are available
        int movementUsed; // rather than include the movement speed as a variable, it will instead just count upwards

        boolean hasAction;
        boolean hasBonusAction;     // All these booleans affect what actions will be shown as available to the user
        boolean hasReaction;
        boolean hasItemAction;

        List<classSelect.Ability> actions;          // The users available actions, bonus actions, and reactions for a turn
        List<classSelect.Ability> bonusActions;
        List<classSelect.Ability> reactions;

        int level0, level1, level2, level3, level4, level5, level6, level7, level8, level9;  // User's available spells in each spell level

    }

    class CharClass {
        String name;
        List<classSelect.Ability> classAbilityList;  // Abilities and feats that come with a character class
        List<Ability> possibleSpells;
    }
    class SubClass {
        String name;
        String parentName;  // The CharClass containing the Subclass
        List<classSelect.Ability> subclassAbilityList;  // Abilities and feats that come with a character subclass
        List<Ability> possibleSpells;
    }
    class Background {
        String name;
        List<classSelect.Ability> backgroundAbilityList;  // Abilities and feats that come with a character background
    }
    class Race {
        String name;
        String[] raceAbilityList;  // Abilities and feats that come with a character race
    }
    class Ability {
        String name;
        String actionType;
        String description;
        String recharge;
        int spellLevel;
        int requiredLevel;
    }

    static Character originatePlayerCharacter() { //Creates a blank player character which will be added to by the user

        //Basic Character Data
        Character p = null;
        p.characterClass = null;
        p.characterSubClass = null;
        p.characterBackground = null;
        p.characterRace = null;
        p.charLevel = 0;

        //Combat Data
        p.movementUsed = 0;
        p.hasAction = true;
        p.hasBonusAction = true;
        p.hasReaction = true;
        p.hasItemAction = true;

        //Spell Availability Data
        p.level0 = 0;
        p.level1 = 0;
        p.level2 = 0;
        p.level3 = 0;
        p.level4 = 0;
        p.level5 = 0;
        p.level6 = 0;
        p.level7 = 0;
        p.level8 = 0;
        p.level9 = 0;

        return p;
    }
    static List<Ability> createSpellSelectionList() {
        /*
            Looking back, I'm sure there was a better way to do this. But for now I'll leave as is
            Will look at improving how the data is initialized, stored, and used after I have a working version
         */
        List<Ability> abilityList = null;

        Ability acidSplash = null;
        acidSplash.name = "Acid Splash";
        acidSplash.actionType = "Action";
        acidSplash.description = "You hurl a bubble of acid. Choose one creature you can see within range, or choose two creatures you can see within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.";
        acidSplash.spellLevel = 0;
        acidSplash.recharge = "Long";
        abilityList.add(acidSplash);


        Ability bladeWard = null;
        bladeWard.name = "Blade Ward";
        bladeWard.actionType = "Action";
        bladeWard.description = "You extend your hand and trace a sigil of warding in the air. Until the end of your next turn, you have resistance against bludgeoning, piercing, and slashing damage dealt by weapon attacks.";
        bladeWard.spellLevel = 0;
        bladeWard.recharge = "Long";
        abilityList.add(bladeWard);

        Ability boomingBlade = null;
        boomingBlade.name = "Booming Blade";
        boomingBlade.actionType = "Action";
        boomingBlade.description = "eAs part of the action used to cast this spell, you must make a melee attack with a weapon against one creature within the spell's range, otherwise the spell fails. On a hit, the target suffers the attack's normal effects, and it becomes sheathed in booming energy until the start of your next turn. If the target willingly moves before then, it immediately takes 1d8 thunder damage, and the spell ends.";
        boomingBlade.spellLevel = 0;
        boomingBlade.recharge = "Long";
        abilityList.add(boomingBlade);

        Ability chillTouch = null;
        chillTouch.name = "Chill Touch";
        chillTouch.actionType = "Action";
        chillTouch.description = "You create a ghostly, skeletal hand in the space of a creature within range. Make a ranged spell attack against the creature to assail it with the chill of the grave. On a hit, the target takes 1d8 necrotic damage, and it can't regain hit points until the start of your next turn. Until then, the hand clings to the target. If you hit an undead target, it also has disadvantage on attack rolls against you until the end of your next turn.";
        chillTouch.spellLevel = 0;
        chillTouch.recharge = "Long";
        abilityList.add(chillTouch);

        Ability controlFlames = null;
        controlFlames.name = "Control Flames";
        controlFlames.actionType = "Action";
        controlFlames.description = "You choose a nonmagical flame that you can see within range and that fits within a 5-foot cube";
        controlFlames.spellLevel = 0;
        controlFlames.recharge = "Long";
        abilityList.add(controlFlames);

        Ability createBonfire = null;
        createBonfire.name = "Create Bonfire";
        createBonfire.actionType = "Action";
        createBonfire.description = "You create a bonfire on ground that you can see within range. Until the spell ends, the magic bonfire fills a 5-foot cube. Any creature in the bonfire's space when you cast the spell must succeed on a Dexterity saving throw or take 1d8 fire damage. A creature must also make the saving throw when it moves into the bonfire's space for the first time on a turn or ends its turn there.";
        createBonfire.spellLevel = 0;
        createBonfire.recharge = "Long";
        abilityList.add(createBonfire);

        Ability dancingLights = null;
        dancingLights.name = "Dancing Lights";
        dancingLights.actionType = "Action";
        dancingLights.description = "You create up to four torch-sized lights within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10-foot radius.";
        dancingLights.spellLevel = 0;
        dancingLights.recharge = "Long";
        abilityList.add(dancingLights);

        Ability druidcraft = null;
        druidcraft.name = "Druidcraft";
        druidcraft.actionType = "Action";
        druidcraft.description = "Do Druid Stuff";
        druidcraft.spellLevel = 0;
        druidcraft.recharge = "Long";
        abilityList.add(druidcraft);

        Ability eldritchBlast = null;
        eldritchBlast.name = "Eldritch Blast";
        eldritchBlast.actionType = "Action";
        eldritchBlast.description = "A beam of crackling energy streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 force damage.";
        eldritchBlast.spellLevel = 0;
        eldritchBlast.recharge = "Long";
        abilityList.add(eldritchBlast);

        Ability encodeThoughts = null;
        encodeThoughts.name = "Encode Thoughts";
        encodeThoughts.actionType = "Action";
        encodeThoughts.description = "Putting a finger to your head, you pull a memory, an idea, or a message from your mind and transform it into a tangible string of glowing energy called a thought strand, which persists for the duration or until you cast this spell again. The thought strand appears in an unoccupied space within 5 feet of you as a Tiny, weightless, semisolid object that can be held and carried like a ribbon. It is otherwise stationary.";
        encodeThoughts.spellLevel = 0;
        encodeThoughts.recharge = "Long";
        abilityList.add(encodeThoughts);

        Ability fireBolt = null;
        fireBolt.name = "Fire Bolt";
        fireBolt.actionType = "Action";
        fireBolt.description = "You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. A flammable object hit by this spell ignites if it isn't being worn or carried.";
        fireBolt.spellLevel = 0;
        fireBolt.recharge = "Long";
        abilityList.add(fireBolt);

        Ability friends = null;
        friends.name = "Friends";
        friends.actionType = "Action";
        friends.description = "For the duration, you have advantage on all Charisma checks directed at one creature of your choice that isn't hostile toward you. When the spell ends, the creature realizes that you used magic to influence its mood and becomes hostile toward you. A creature prone to violence might attack you. Another creature might seek retribution in other ways (at the DM's discretion), depending on the nature of your interaction with it.";
        friends.spellLevel = 0;
        friends.recharge = "Long";
        abilityList.add(friends);

        Ability frostbite = null;
        frostbite.name = "Frostbite";
        frostbite.actionType = "Action";
        frostbite.description = "You cause numbing frost to form on one creature that you can see within range. The target must make a Constitution saving throw. On a failed save, the target takes 1d6 cold damage, and it has disadvantage on the next weapon attack roll it makes before the end of its next turn.";
        frostbite.spellLevel = 0;
        frostbite.recharge = "Long";
        abilityList.add(frostbite);

        Ability greenFlameBlade = null;
        greenFlameBlade.name = "Green-Flame Blade";
        greenFlameBlade.actionType = "Action";
        greenFlameBlade.description = "As part of the action used to cast this spell, you must make a melee attack with a weapon against one creature within the spell's range, otherwise the spell fails. On a hit, the target suffers the attack's normal effects, and green fire leaps from the target to a different creature of your choice that you can see within 5 feet of it. The second creature takes fire damage equal to your spellcasting ability modifier.";
        greenFlameBlade.spellLevel = 0;
        greenFlameBlade.recharge = "Long";
        abilityList.add(greenFlameBlade);

        Ability guidance = null;
        guidance.name = "Guidance";
        guidance.actionType = "Action";
        guidance.description = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.";
        guidance.spellLevel = 0;
        guidance.recharge = "Long";
        abilityList.add(guidance);

        Ability gust = null;
        gust.name = "Gust";
        gust.actionType = "Action";
        gust.description = "You seize the air and compel it";
        gust.spellLevel = 0;
        gust.recharge = "Long";
        abilityList.add(gust);

        Ability infestation = null;
        infestation.name = "Infestation";
        infestation.actionType = "Action";
        infestation.description = "You cause a cloud of mites, fleas, and other parasites to appear momentarily on one creature you can see within range. The target must succeed on a Constitution saving throw, or it takes 1d6 poison damage and moves 5 feet in a random direction if it can move and its speed is at least 5 feet. Roll a d4 for the direction: 1, north; 2, south; 3, east; or 4, west. This movement doesn't provoke opportunity attacks, and if the direction rolled is blocked, the target doesn't move.";
        infestation.spellLevel = 0;
        infestation.recharge = "Long";
        abilityList.add(infestation);

        Ability light = null;
        light.name = "Light";
        light.actionType = "Action";
        light.description = "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.";
        light.spellLevel = 0;
        light.recharge = "Long";
        abilityList.add(light);

        Ability lightningLure = null;
        lightningLure.name = "Lightning Lure";
        lightningLure.actionType = "Action";
        lightningLure.description = "You create a lash of lightning energy that strikes at one creature of your choice that you can see within range. The target must succeed on a Strength saving throw or be pulled up to 10 feet in a straight line toward you and then take 1d8 lightning damage if it is within 5 feet of you.";
        lightningLure.spellLevel = 0;
        lightningLure.recharge = "Long";
        abilityList.add(lightningLure);

        Ability mageHand = null;
        mageHand.name = "Mage Hand";
        mageHand.actionType = "Action";
        mageHand.description = "A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand vanishes if it is ever more than 30 feet away from you or if you cast this spell again. You can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each time you use it.";
        mageHand.spellLevel = 0;
        mageHand.recharge = "Long";
        abilityList.add(mageHand);

        Ability magicStone = null;
        magicStone.name = "Magic Stone";
        magicStone.actionType = "Bonus";
        magicStone.description = "You touch one to three pebbles and imbue them with magic. You or someone else can make a ranged spell attack with one of the pebbles by throwing it or hurling it with a sling. If thrown, a pebble has a range of 60 feet. If someone else attacks with a pebble, that attacker adds your spellcasting ability modifier, not the attacker's, to the attack roll. On a hit, the target takes bludgeoning damage equal to 1d6 + your spellcasting ability modifier. Whether the attack hits or misses, the spell then ends on the stone.";
        magicStone.spellLevel = 0;
        magicStone.recharge = "Long";
        abilityList.add(magicStone);

        Ability message = null;
        message.name = "Message";
        message.actionType = "Action";
        message.description = "You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear.";
        message.spellLevel = 0;
        message.recharge = "Long";
        abilityList.add(message);

        Ability minorIllusion = null;
        minorIllusion.name = "Minor Illusion";
        minorIllusion.actionType = "Action";
        minorIllusion.description = "You create a sound or an image of an object within range that lasts for the duration. The illusion also ends if you dismiss it as an action or cast this spell again.";
        minorIllusion.spellLevel = 0;
        minorIllusion.recharge = "Long";
        abilityList.add(minorIllusion);

        Ability moldEarth = null;
        moldEarth.name = "Mold Earth";
        moldEarth.actionType = "Action";
        moldEarth.description = "You choose a portion of dirt or stone that you can see within range and that fits within a 5-foot cube. You manipulate it in one of the following ways:";
        moldEarth.spellLevel = 0;
        moldEarth.recharge = "Long";
        abilityList.add(moldEarth);

        Ability poisonSpray = null;
        poisonSpray.name = "Poison Spray";
        poisonSpray.actionType = "Action";
        poisonSpray.description = "You extend your hand toward a creature you can see within range and project a puff of noxious gas from your palm. The creature must succeed on a Constitution saving throw or take 1d12 poison damage.";
        poisonSpray.spellLevel = 0;
        poisonSpray.recharge = "Long";
        abilityList.add(poisonSpray);

        Ability prestidigitation = null;
        prestidigitation.name = "Prestidigitation";
        prestidigitation.actionType = "Action";
        prestidigitation.description = "Do Magic Stuff";
        prestidigitation.spellLevel = 0;
        prestidigitation.recharge = "Long";
        abilityList.add(prestidigitation);

        Ability primalSavagery = null;
        primalSavagery.name = "Primal Savagery";
        primalSavagery.actionType = "Action";
        primalSavagery.description = "You channel primal magic to cause your teeth or fingernails to sharpen, ready to deliver a corrosive attack. Make a melee spell attack against one creature within 5 feet of you. On a hit, the target takes 1d10 acid damage. After you make the attack, your teeth or fingernails return to normal.";
        primalSavagery.spellLevel = 0;
        primalSavagery.recharge = "Long";
        abilityList.add(primalSavagery);

        Ability produceFlame = null;
        produceFlame.name = "Produce Flame";
        produceFlame.actionType = "Action";
        produceFlame.description = "A flickering flame appears in your hand. The flame remains there for the duration and harms neither you nor your equipment. The flame sheds bright light in a 10-foot radius and dim light for an additional 10 feet. The spell ends if you dismiss it as an action or if you cast it again.";
        produceFlame.spellLevel = 0;
        produceFlame.recharge = "Long";
        abilityList.add(produceFlame);

        Ability rayOfFrost = null;
        rayOfFrost.name = "Ray of Frost";
        rayOfFrost.actionType = "Action";
        rayOfFrost.description = "A frigid beam of blue-white light streaks toward a creature within range. Make a ranged spell attack against the target. On a hit, it takes 1d8 cold damage, and its speed is reduced by 10 feet until the start of your next turn.";
        rayOfFrost.spellLevel = 0;
        rayOfFrost.recharge = "Long";
        abilityList.add(rayOfFrost);

        Ability resistance = null;
        resistance.name = "Resistance";
        resistance.actionType = "Action";
        resistance.description = "You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one saving throw of its choice. It can roll the die before or after making the saving throw. The spell then ends.";
        resistance.spellLevel = 0;
        resistance.recharge = "Long";
        abilityList.add(resistance);

        Ability sacredFlame = null;
        sacredFlame.name = "Sacred Flame";
        sacredFlame.actionType = "Action";
        sacredFlame.description = "Flame-like radiance descends on a creature that you can see within range. The target must succeed on a Dexterity saving throw or take 1d8 radiant damage. The target gains no benefit from cover for this saving throw.";
        sacredFlame.spellLevel = 0;
        sacredFlame.recharge = "Long";
        abilityList.add(sacredFlame);

        Ability shapeWater = null;
        shapeWater.name = "Shape Water";
        shapeWater.actionType = "Action";
        shapeWater.description = "Do Water Stuff";
        shapeWater.spellLevel = 0;
        shapeWater.recharge = "Long";
        abilityList.add(shapeWater);

        Ability shillelagh = null;
        shillelagh.name = "Shillelagh";
        shillelagh.actionType = "Bonus";
        shillelagh.description = "The wood of a club or quarterstaff you are holding is imbued with nature's power. For the duration, you can use your spellcasting ability instead of Strength for the attack and damage rolls of melee attacks using that weapon, and the weapon's damage die becomes a d8. The weapon also becomes magical, if it isn't already. The spell ends if you cast it again or if you let go of the weapon.";
        shillelagh.spellLevel = 0;
        shillelagh.recharge = "Long";
        abilityList.add(shillelagh);

        Ability shockingGrasp = null;
        shockingGrasp.name = "Shocking Grasp";
        shockingGrasp.actionType = "Action";
        shockingGrasp.description = "Lightning springs from your hand to deliver a shock to a creature you try to touch. Make a melee spell attack against the target. You have advantage on the attack roll if the target is wearing armor made of metal. On a hit, the target takes 1d8 lightning damage, and it can't take reactions until the start of its next turn.";
        shockingGrasp.spellLevel = 0;
        shockingGrasp.recharge = "Long";
        abilityList.add(shockingGrasp);

        Ability spareTheDying = null;
        spareTheDying.name = "Spare the Dying";
        spareTheDying.actionType = "Action";
        spareTheDying.description = "You touch a living creature that has 0 hit points. The creature becomes stable. This spell has no effect on undead or constructs.";
        spareTheDying.spellLevel = 0;
        spareTheDying.recharge = "Long";
        abilityList.add(spareTheDying);

        Ability swordBurst = null;
        swordBurst.name = "Sword Burst";
        swordBurst.actionType = "Action";
        swordBurst.description = "You create a momentary circle of spectral blades that sweep around you. Each creature within range, other than you, must succeed on a Dexterity saving throw or take 1d6 force damage.";
        swordBurst.spellLevel = 0;
        swordBurst.recharge = "Long";
        abilityList.add(swordBurst);

        Ability thaumaturgy = null;
        thaumaturgy.name = "Thaumaturgy";
        thaumaturgy.actionType = "Action";
        thaumaturgy.description = "You manifest a minor wonder, a sign of supernatural power, within range.";
        thaumaturgy.spellLevel = 0;
        thaumaturgy.recharge = "Long";
        abilityList.add(thaumaturgy);

        Ability thornWhip = null;
        thornWhip.name = "Thorn Whip";
        thornWhip.actionType = "Action";
        thornWhip.description = "You create a long, vine-like whip covered in thorns that lashes out at your command toward a creature in range. Make a melee spell attack against the target. If the attack hits, the creature takes 1d6 piercing damage, and if the creature is Large or smaller, you pull the creature up to 10 feet closer to you.";
        thornWhip.spellLevel = 0;
        thornWhip.recharge = "Long";
        abilityList.add(thornWhip);

        Ability thunderclap = null;
        thunderclap.name = "Thunderclap";
        thunderclap.actionType = "Action";
        thunderclap.description = "You create a burst of thunderous sound that can be heard up to 100 feet away. Each creature within range, other than you, must make a Constitution saving throw or take 1d6 thunder damage.";
        thunderclap.spellLevel = 0;
        thunderclap.recharge = "Long";
        abilityList.add(thunderclap);

        Ability tollTheDead = null;
        tollTheDead.name = "Toll The Dead";
        tollTheDead.actionType = "Action";
        tollTheDead.description = "You point at one creature you can see within range, and the sound of a dolorous bell fills the air around it for a moment. The target must succeed on a Wisdom saving throw or take 1d8 necrotic damage. If the target is missing any of its hit points, it instead takes 1d12 necrotic damage.";
        tollTheDead.spellLevel = 0;
        tollTheDead.recharge = "Long";
        abilityList.add(tollTheDead);

        Ability trueStrike = null;
        trueStrike.name = "True Strike";
        trueStrike.actionType = "Action";
        trueStrike.description = "You extend your hand and point a finger at a target in range. Your magic grants you a brief insight into the target's defenses. On your next turn, you gain advantage on your first attack roll against the target, provided that this spell hasn't ended.";
        trueStrike.spellLevel = 0;
        trueStrike.recharge = "Long";
        abilityList.add(trueStrike);

        Ability viciousMockery = null;
        viciousMockery.name = "Vicious Mockery";
        viciousMockery.actionType = "Action";
        viciousMockery.description = "You unleash a string of insults laced with subtle enchantments at a creature you can see within range. If the target can hear you (though it need not understand you), it must succeed on a Wisdom saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its next turn.";
        viciousMockery.spellLevel = 0;
        viciousMockery.recharge = "Long";
        abilityList.add(viciousMockery);

        Ability wordOfRadiance = null;
        wordOfRadiance.name = "Word of Radiance";
        wordOfRadiance.actionType = "Action";
        wordOfRadiance.description = "You utter a divine word, and burning radiance erupts from you. Each creature of your choice that you can see within range must succeed on a Constitution saving throw or take 1d6 radiant damage.";
        wordOfRadiance.spellLevel = 0;
        wordOfRadiance.recharge = "Long";
        abilityList.add(wordOfRadiance);

        // Level 1 Spells

        Ability absorbElements = null;
        absorbElements.name = "Absorb Elements";
        absorbElements.actionType = "Reaction";
        absorbElements.description = "The spell captures some of the incoming energy, lessening its effect on you and storing it for your next melee attack. You have resistance to the triggering damage type until the start of your next turn. Also, the first time you hit with a melee attack on your next turn, the target takes an extra 1d6 damage of the triggering type, and the spell ends.";
        absorbElements.spellLevel = 1;
        absorbElements.recharge = "Long";
        abilityList.add(absorbElements);

        Ability animalFriendship = null;
        animalFriendship.name = "Animal Friendship";
        animalFriendship.actionType = "Action";
        animalFriendship.description = "This spell lets you convince a beast that you mean it no harm. Choose a beast that you can see within range. It must see and hear you. If the beast's Intelligence is 4 or higher, the spell fails. Otherwise, the beast must succeed on a Wisdom saving throw or be charmed by you for the spell's duration. If you or one of your companions harms the target, the spell ends.";
        animalFriendship.spellLevel = 1;
        animalFriendship.recharge = "Long";
        abilityList.add(animalFriendship);

        Ability armorOfAgathys = null;
        armorOfAgathys.name = "Armor of Agathys";
        armorOfAgathys.actionType = "Action";
        armorOfAgathys.description = "A protective magical force surrounds you, manifesting as a spectral frost that covers you and your gear. You gain 5 temporary hit points for the duration. If a creature hits you with a melee attack while you have these hit points, the creature takes 5 cold damage.";
        armorOfAgathys.spellLevel = 1;
        armorOfAgathys.recharge = "Long";
        abilityList.add(armorOfAgathys);

        Ability armsOfHadar = null;
        armsOfHadar.name = "Arms of Hadar";
        armsOfHadar.actionType = "Action";
        armsOfHadar.description = "You invoke the power of Hadar, the Dark Hunger. Tendrils of dark energy erupt from you and batter all creatures within 10 feet of you. Each creature in that area must make a Strength saving throw. On a failed save, a target takes 2d6 necrotic damage and can't take reactions until its next turn. On a successful save, the creature takes half damage, but suffers no other effect.";
        armsOfHadar.spellLevel = 1;
        armsOfHadar.recharge = "Long";
        abilityList.add(armsOfHadar);

        Ability bane = null;
        bane.name = "Bane";
        bane.actionType = "Action";
        bane.description = "Up to three creatures of your choice that you can see within range must make Charisma saving throws. Whenever a target that fails this saving throw makes an attack roll or a saving throw before the spell ends, the target must roll a d4 and subtract the number rolled from the attack roll or saving throw.";
        bane.spellLevel = 1;
        bane.recharge = "Long";
        abilityList.add(bane);

        Ability beastBond = null;
        beastBond.name = "Beast Bond";
        beastBond.actionType = "Action";
        beastBond.description = "You establish a telepathic link with one beast you touch that is friendly to you or charmed by you. The spell fails if the beast's Intelligence score is 4 or higher. Until the spell ends, the link is active while you and the beast are within line of sight of each other. Through the link, the beast can understand your telepathic messages to it, and it can telepathically communicate simple emotions and concepts back to you. While the link is active, the beast gains advantage on attack rolls against any creature within 5 feet of you that you can see.";
        beastBond.spellLevel = 1;
        beastBond.recharge = "Long";
        abilityList.add(beastBond);

        Ability bless = null;
        bless.name = "Bless";
        bless.actionType = "Action";
        bless.description = "You bless up to three creatures of your choice within range. Whenever a target makes an attack roll or a saving throw before the spell ends, the target can roll a d4 and add the number rolled to the attack roll or saving throw.";
        bless.spellLevel = 1;
        bless.recharge = "Long";
        abilityList.add(bless);

        Ability burningHands = null;
        burningHands.name = "Burning Hands";
        burningHands.actionType = "Action";
        burningHands.description = "As you hold your hands with thumbs touching and fingers spread, a thin sheet of flames shoots forth from your outstretched fingertips. Each creature in a 15-foot cone must make a Dexterity saving throw. A creature takes 3d6 fire damage on a failed save, or half as much damage on a successful one.";
        burningHands.spellLevel = 1;
        burningHands.recharge = "Long";
        abilityList.add(burningHands);

        Ability catapult = null;
        catapult.name = "Catapult";
        catapult.actionType = "Action";
        catapult.description = "Choose one object weighing 1 to 5 pounds within range that isn't being worn or carried. The object flies in a straight line up to 90 feet in a direction you choose before falling to the ground, stopping early if it impacts against a solid surface. If the object would strike a creature, that creature must make a Dexterity saving throw. On a failed save, the object strikes the target and stops moving. When the object strikes something, the object and what it strikes each take 3d8 bludgeoning damage.";
        catapult.spellLevel = 1;
        catapult.recharge = "Long";
        abilityList.add(catapult);

        Ability causeFear = null;
        causeFear.name = "Cause Fear";
        causeFear.actionType = "Action";
        causeFear.description = "You awaken the sense of mortality in one creature you can see within range. A construct or an undead is immune to this effect. The target must succeed on a Wisdom saving throw or become frightened of you until the spell ends. The frightened target can repeat the saving throw at the end of each of its turns, ending the effect on itself on a success.";
        causeFear.spellLevel = 1;
        causeFear.recharge = "Long";
        abilityList.add(causeFear);

        Ability chaosBolt = null;
        chaosBolt.name = "Chaos Bolt";
        chaosBolt.actionType = "Action";
        chaosBolt.description = "You hurl an undulating, warbling mass of chaotic energy at one creature in range. Make a ranged spell attack against the target. On a hit, the target takes 2d8 + 1d6 damage. Choose one of the d8s. The number rolled on that die determines the attack's damage type, as shown below.";
        chaosBolt.spellLevel = 1;
        chaosBolt.recharge = "Long";
        abilityList.add(chaosBolt);

        Ability charmPerson = null;
        charmPerson.name = "Charm Person";
        charmPerson.actionType = "Action";
        charmPerson.description = "You hurl an undulating, warbling mass of chaotic energy at one creature in range. Make a ranged spell attack against the target. On a hit, the target takes 2d8 + 1d6 damage. Choose one of the d8s. The number rolled on that die determines the attack's damage type, as shown below.";
        charmPerson.spellLevel = 1;
        charmPerson.recharge = "Long";
        abilityList.add(charmPerson);

        Ability chromaticOrb = null;
        chromaticOrb.name = "Chromatic Orb";
        chromaticOrb.actionType = "Action";
        chromaticOrb.description = "You hurl a 4-inch-diameter sphere of energy at a creature that you can see within range. You choose acid, cold, fire, lightning, poison, or thunder for the type of orb you create, and then make a ranged spell attack against the target. If the attack hits, the creature takes 3d8 damage of the type you chose.";
        chromaticOrb.spellLevel = 1;
        chromaticOrb.recharge = "Long";
        abilityList.add(chromaticOrb);

        Ability colorSpray = null;
        colorSpray.name = "Color Spray";
        colorSpray.actionType = "Action";
        colorSpray.description = "A dazzling array of flashing, colored light springs from your hand. Roll 6d10; the total is how many hit points of creatures this spell can effect. Creatures in a 15-foot cone originating from you are affected in ascending order of their current hit points (ignoring unconscious creatures and creatures that can't see).";
        colorSpray.spellLevel = 1;
        colorSpray.recharge = "Long";
        abilityList.add(colorSpray);

        Ability command = null;
        command.name = "Command";
        command.actionType = "Action";
        command.description = "You speak a one-word command to a creature you can see within range. The target must succeed on a Wisdom saving throw or follow the command on its next turn. The spell has no effect if the target is undead, if it doesn't understand your language, or if your command is directly harmful to it.";
        command.spellLevel = 1;
        command.recharge = "Long";
        abilityList.add(command);

        Ability compelledDuel = null;
        compelledDuel.name = "Compelled Duel";
        compelledDuel.actionType = "Bonus";
        compelledDuel.description = "You attempt to compel a creature into a duel. One creature that you can see within range must make a Wisdom saving throw. On a failed save, the creature is drawn to you, compelled by your divine demand. For the duration, it has disadvantage on attack rolls against creatures other than you, and must make a Wisdom saving throw each time it attempts to move to a space that is more than 30 feet away from you; if it succeeds on this saving throw, this spell doesn't restrict the target's movement for that turn.";
        compelledDuel.spellLevel = 1;
        compelledDuel.recharge = "Long";
        abilityList.add(compelledDuel);

        Ability comprehendLanguages = null;
        comprehendLanguages.name = "Comprehend Languages";
        comprehendLanguages.actionType = "Action";
        comprehendLanguages.description = "For the duration, you understand the literal meaning of any spoken language that you hear. You also understand any written language that you see, but you must be touching the surface on which the words are written. It takes about 1 minute to read one page of text.";
        comprehendLanguages.spellLevel = 1;
        comprehendLanguages.recharge = "Long";
        abilityList.add(comprehendLanguages);

        Ability createDestroyWater = null;
        createDestroyWater.name = "Create or Destroy Water";
        createDestroyWater.actionType = "Action";
        createDestroyWater.description = "You either create or destroy water.";
        createDestroyWater.spellLevel = 1;
        createDestroyWater.recharge = "Long";
        abilityList.add(createDestroyWater);

        Ability cureWounds = null;
        cureWounds.name = "Cure Wounds";
        cureWounds.actionType = "Action";
        cureWounds.description = "A creature you touch regains a number of hit points equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        cureWounds.spellLevel = 1;
        abilityList.add(cureWounds);

        Ability detectEvilGood = null;
        detectEvilGood.name = "Detect Evil and Good";
        detectEvilGood.actionType = "Action";
        detectEvilGood.description = "For the duration, you know if there is an aberration, celestial, elemental, fey, fiend, or undead within 30 feet of you, as well as where the creature is located. Similarly, you know if there is a place or object within 30 feet of you that has been magically consecrated or desecrated.";
        detectEvilGood.spellLevel = 1;
        abilityList.add(detectEvilGood);

        Ability detectMagic = null;
        detectMagic.name = "Detect Magic";
        detectMagic.actionType = "Action";
        detectMagic.description = "For the duration, you sense the presence of magic within 30 feet of you. If you sense magic in this way, you can use your action to see a faint aura around any visible creature or object in the area that bears magic, and you learn its school of magic, if any.";
        detectMagic.spellLevel = 1;
        abilityList.add(detectMagic);

        Ability detectPoisonDisease = null;
        detectPoisonDisease.name = "Detect Poison and Disease";
        detectPoisonDisease.actionType = "Action";
        detectPoisonDisease.description = "For the duration, you can sense the presence and location of poisons, poisonous creatures, and diseases within 30 feet of you. You also identify the kind of poison, poisonous creature, or disease in each case.";
        detectPoisonDisease.spellLevel = 1;
        abilityList.add(detectPoisonDisease);

        Ability disguiseSelf = null;
        disguiseSelf.name = "Disguise Self";
        disguiseSelf.actionType = "Action";
        disguiseSelf.description = "You make yourself—including your clothing, armor, weapons, and other belongings on your person—look different until the spell ends or until you use your action to dismiss it. You can seem 1 foot shorter or taller and can appear thin, fat, or in between. You can't change your body type, so you must adopt a form that has the same basic arrangement of limbs. Otherwise, the extent of the illusion is up to you.";
        disguiseSelf.spellLevel = 1;
        abilityList.add(disguiseSelf);

        Ability dissonantWhispers = null;
        dissonantWhispers.name = "Dissonant Whispers";
        dissonantWhispers.actionType = "Action";
        dissonantWhispers.description = "You whisper a discordant melody that only one creature of your choice within range can hear, wracking it with terrible pain. The target must make a Wisdom saving throw. On a failed save, it takes 3d6 psychic damage and must immediately use its reaction, if available, to move as far as its speed allows away from you. The creature doesn't move into obviously dangerous ground, such as a fire or a pit. On a successful save, the target takes half as much damage and doesn't have to move away. A deafened creature automatically succeeds on the save.";
        dissonantWhispers.spellLevel = 1;
        abilityList.add(dissonantWhispers);

        Ability divineFavor = null;
        divineFavor.name = "Divine Favor";
        divineFavor.actionType = "Bonus";
        divineFavor.description = "Your prayer empowers you with divine radiance. Until the spell ends, your weapon attacks deal an extra 1d4 radiant damage on a hit.";
        divineFavor.spellLevel = 1;
        abilityList.add(divineFavor);

        Ability earthTremor = null;
        earthTremor.name = "Earth Tremor";
        earthTremor.actionType = "Action";
        earthTremor.description = "You cause a tremor in the ground within range. Each creature other than you in that area must make a Dexterity saving throw. On a failed save, a creature takes 1d6 bludgeoning damage and is knocked prone. If the ground in that area is loose earth or stone, it becomes difficult terrain until cleared, with each 5-foot-diameter portion requiring at least 1 minute to clear by hand.";
        earthTremor.spellLevel = 1;
        abilityList.add(earthTremor);

        Ability ensnaringStrike = null;
        ensnaringStrike.name = "Ensnaring Strike";
        ensnaringStrike.actionType = "Action";
        ensnaringStrike.description = "The next time you hit a creature with a weapon attack before this spell ends, a writhing mass of thorny vines appears at the point of impact, and the target must succeed on a Strength saving throw or be restrained by the magical vines until the spell ends. A Large or larger creature has advantage on this saving throw. If the target succeeds on the save, the vines shrivel away.";
        ensnaringStrike.spellLevel = 1;
        abilityList.add(ensnaringStrike);

        Ability entangle = null;
        entangle.name = "Entangle";
        entangle.actionType = "Actioni";
        entangle.description = "Grasping weeds and vines sprout from the ground in a 20-foot square starting from a point within range. For the duration, these plants turn the ground in the area into difficult terrain.";
        entangle.spellLevel = 1;
        abilityList.add(entangle);

        Ability expeditiousRetreat = null;
        expeditiousRetreat.name = "Expeditious Retreat";
        expeditiousRetreat.actionType = "Bonus";
        expeditiousRetreat.description = "This spell allows you to move at an incredible pace. When you cast this spell, and then as a bonus action on each of your turns until the spell ends, you can take the Dash action.";
        expeditiousRetreat.spellLevel = 1;
        abilityList.add(expeditiousRetreat);

        Ability faerieFire = null;
        faerieFire.name = "Faerie Fire";
        faerieFire.actionType = "Action";
        faerieFire.description = "Each object in a 20-foot cube within range is outlined in blue, green, or violet light (your choice). Any creature in the area when the spell is cast is also outlined in light if it fails a Dexterity saving throw. For the duration, objects and affected creatures shed dim light in a 10-foot radius.";
        faerieFire.spellLevel = 1;
        abilityList.add(faerieFire);

        Ability falseLife = null;
        falseLife.name = "False Life";
        falseLife.actionType = "Action";
        falseLife.description = "Each object in a 20-foot cube within range is outlined in blue, green, or violet light (your choice). Any creature in the area when the spell is cast is also outlined in light if it fails a Dexterity saving throw. For the duration, objects and affected creatures shed dim light in a 10-foot radius.";
        falseLife.spellLevel = 1;
        abilityList.add(falseLife);

        Ability featherFall = null;
        featherFall.name = "Feather Fall";
        featherFall.actionType = "Reaction";
        featherFall.description = "Choose up to five falling creatures within range. A falling creature's rate of descent slows to 60 feet per round until the spell ends. If the creature lands before the spell ends, it takes no falling damage and can land on its feet, and the spell ends for that creature.";
        featherFall.spellLevel = 1;
        abilityList.add(featherFall);

        Ability fogCloud = null;
        fogCloud.name = "Fog Cloud";
        fogCloud.actionType = "Action";
        fogCloud.description = "You create a 20-foot-radius sphere of fog centered on a point within range. The sphere spreads around corners, and its area is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it.";
        fogCloud.spellLevel = 1;
        abilityList.add(fogCloud);

        Ability goodberry = null;
        goodberry.name = "Goodberry";
        goodberry.actionType = "Action";
        goodberry.description = "Up to ten berries appear in your hand and are infused with magic for the duration. A creature can use its action to eat one berry. Eating a berry restores 1 hit point, and the berry provides enough nourishment to sustain a creature for one day.";
        goodberry.spellLevel = 1;
        abilityList.add(goodberry);

        Ability grease = null;
        grease.name = "Grease";
        grease.actionType = "Action";
        grease.description = "Slick grease covers the ground in a 10-foot square centered on a point within range and turns it into difficult terrain for the duration.";
        grease.spellLevel = 1;
        abilityList.add(grease);

        Ability guidingBolt = null;
        guidingBolt.name = "Guiding Bolt";
        guidingBolt.actionType = "Action";
        guidingBolt.description = "A flash of light streaks toward a creature of your choice within range. Make a ranged spell attack against the target. On a hit, the target takes 4d6 radiant damage, and the next attack roll made against this target before the end of your next turn has advantage, thanks to the mystical dim light glittering on the target until then.";
        guidingBolt.spellLevel = 1;
        abilityList.add(guidingBolt);

        Ability hailOfThorns = null;
        hailOfThorns.name = "Hail of Thorns";
        hailOfThorns.actionType = "Bonus";
        hailOfThorns.description = "The next time you hit a creature with a ranged weapon attack before the spell ends, this spell creates a rain of thorns that sprouts from your ranged weapon or ammunition. In addition to the normal effect of the attack, the target of the attack and each creature within 5 feet of it must make a Dexterity saving throw. A creature takes 1d10 piercing damage on a failed save, or half as much damage on a successful one.";
        hailOfThorns.spellLevel = 1;
        abilityList.add(hailOfThorns);

        Ability healingWord = null;
        healingWord.name = "Healing Word";
        healingWord.actionType = "Action";
        healingWord.description = "A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        healingWord.spellLevel = 1;
        abilityList.add(healingWord);

        Ability hellishRebuke = null;
        hellishRebuke.name = "Hellish Rebuke";
        hellishRebuke.actionType = "Reaction";
        hellishRebuke.description = "You point your finger, and the creature that damaged you is momentarily surrounded by hellish flames. The creature must make a Dexterity saving throw. It takes 2d10 fire damage on a failed save, or half as much damage on a successful one.";
        hellishRebuke.spellLevel = 1;
        abilityList.add(hellishRebuke);

        Ability heroism = null;
        heroism.name = "Heroism";
        heroism.actionType = "Action";
        heroism.description = "A willing creature you touch is imbued with bravery. Until the spell ends, the creature is immune to being frightened and gains temporary hit points equal to your spellcasting ability modifier at the start of each of its turns. When the spell ends, the target loses any remaining temporary hit points from this spell.";
        heroism.spellLevel = 1;
        abilityList.add(heroism);

        Ability hex = null;
        hex.name = "Hex";
        hex.actionType = "Bonus";
        hex.description = "You place a curse on a creature that you can see within range. Until the spell ends, you deal an extra 1d6 necrotic damage to the target whenever you hit it with an attack. Also, choose one ability when you cast the spell. The target has disadvantage on ability checks made with the chosen ability.";
        hex.spellLevel = 1;
        abilityList.add(hex);

        Ability huntersMark = null;
        huntersMark.name = "Hunter\'s Mark";
        huntersMark.actionType = "Bonus";
        huntersMark.description = "You choose a creature you can see within range and mystically mark it as your quarry. Until the spell ends, you deal an extra 1d6 damage to the target whenever you hit it with a weapon attack, and you have advantage on any Wisdom (Perception) or Wisdom (Survival) check you make to find it. If the target drops to 0 hit points before this spell ends, you can use a bonus action on a subsequent turn of yours to mark a new creature.";
        huntersMark.spellLevel = 1;
        abilityList.add(huntersMark);

        Ability iceKnife = null;
        iceKnife.name = "Ice Knife";
        iceKnife.actionType = "Action";
        iceKnife.description = "You create a shard of ice and fling it at one creature within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 piercing damage. Hit or miss, the shard then explodes. The target and each creature within 5 feet of it must succeed on a Dexterity saving throw or take 2d6 cold damage.";
        iceKnife.spellLevel = 1;
        abilityList.add(iceKnife);

        Ability inflictWounds = null;
        inflictWounds.name = "Inflict Wounds";
        inflictWounds.actionType = "Action";
        inflictWounds.description = "Make a melee spell attack against a creature you can reach. On a hit, the target takes 3d10 necrotic damage.";
        inflictWounds.spellLevel = 1;
        abilityList.add(inflictWounds);

        Ability jimsMagicMissile = null;
        jimsMagicMissile.name = "Jim\'s Magic Missile";
        jimsMagicMissile.actionType = "Action";
        jimsMagicMissile.description = "You create three twisting, whistling, hypoallergenic, gluten-free darts of magical force. Each dart targets a creature of your choice that you can see within range. Make a ranged spell attack for each missile. On a hit, a missile deals 2d4 force damage to its target.";
        jimsMagicMissile.spellLevel = 1;
        abilityList.add(jimsMagicMissile);

        Ability jump = null;
        jump.name = "Jump";
        jump.actionType = "Action";
        jump.description = "You touch a creature. The creature's jump distance is tripled until the spell ends.";
        jump.spellLevel = 1;
        abilityList.add(jump);

        Ability longstrider = null;
        longstrider.name = "Longstrider";
        longstrider.actionType = "Action";
        longstrider.description = "You touch a creature. The target's speed increases by 10 feet until the spell ends.";
        longstrider.spellLevel = 1;
        abilityList.add(longstrider);

        Ability mageArmor = null;
        mageArmor.name = "Mage Armor";
        mageArmor.actionType = "Action";
        mageArmor.description = "You touch a willing creature who isn't wearing armor, and a protective magical force surrounds it until the spell ends. The target's base AC becomes 13 + its Dexterity modifier. The spell ends if the target dons armor or if you dismiss the spell as an action.";
        mageArmor.spellLevel = 1;
        abilityList.add(mageArmor);

        Ability magicMissile = null;
        magicMissile.name = "Magic Missile";
        magicMissile.actionType = "Action";
        magicMissile.description = "You create three glowing darts of magical force. Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several.";
        magicMissile.spellLevel = 1;
        abilityList.add(magicMissile);

        Ability protEvilGood = null;
        protEvilGood.name = "Protect from Evil and Good";
        protEvilGood.actionType = "Action";
        protEvilGood.description = "Until the spell ends, one willing creature you touch is protected against certain types of creatures: aberrations, celestials, elementals, fey, fiends, and undead.";
        protEvilGood.spellLevel = 1;
        abilityList.add(protEvilGood);

        Ability pureFoodDrink = null;
        pureFoodDrink.name = "Purify Food and Drink";
        pureFoodDrink.actionType = "Action";
        pureFoodDrink.description = "All nonmagical food and drink within a 5-foot-radius sphere centered on a point of your choice within range is purified and rendered free of poison and disease.";
        pureFoodDrink.spellLevel = 1;
        abilityList.add(pureFoodDrink);

        Ability rayOfSickness = null;
        rayOfSickness.name = "Ray of Sickness";
        rayOfSickness.actionType = "Action";
        rayOfSickness.description = "A ray of sickening greenish energy lashes out toward a creature within range. Make a ranged spell attack against the target. On a hit, the target takes 2d8 poison damage and must make a Constitution saving throw. On a failed save, it is also poisoned until the end of your next turn.";
        rayOfSickness.spellLevel = 1;
        abilityList.add(rayOfSickness);

        Ability sanctuary = null;
        sanctuary.name = "Sanctuary";
        sanctuary.actionType = "Bonus";
        sanctuary.description = "You ward a creature within range against attack. Until the spell ends, any creature who targets the warded creature with an attack or a harmful spell must first make a Wisdom saving throw. On a failed save, the creature must choose a new target or lose the attack or spell. This spell doesn't protect the warded creature from area effects, such as the explosion of a fireball.";
        sanctuary.spellLevel = 1;
        abilityList.add(sanctuary);

        Ability searingSmite = null;
        searingSmite.name = "Searing Smite";
        searingSmite.actionType = "Bonus";
        searingSmite.description = "The next time you hit a creature with a melee weapon attack during the spell's duration, your weapon flares with white-hot intensity, and the attack deals an extra 1d6 fire damage to the target and causes the target to ignite in flames. At the start of each of its turns until the spell ends, the target must make a Constitution saving throw. On a failed save, it takes 1d6 fire damage. On a successful save, the spell ends. If the target or a creature within 5 feet of it uses an action to put out the flames, or if some other effect douses the flames (such as the target being submerged in water), the spell ends.";
        searingSmite.spellLevel = 1;
        abilityList.add(searingSmite);

        Ability shield = null;
        shield.name = "Shield";
        shield.actionType = "Reaction";
        shield.description = "An invisible barrier of magical force appears and protects you. Until the start of your next turn, you have a +5 bonus to AC, including against the triggering attack, and you take no damage from magic missile.";
        shield.spellLevel = 1;
        abilityList.add(shield);

        Ability shieldOfFaith = null;
        shieldOfFaith.name = "Shield of Faith";
        shieldOfFaith.actionType = "Bonus";
        shieldOfFaith.description = "An invisible barrier of magical force appears and protects you. Until the start of your next turn, you have a +5 bonus to AC, including against the triggering attack, and you take no damage from magic missile.";
        shieldOfFaith.spellLevel = 1;
        abilityList.add(shieldOfFaith);

        Ability silentImage = null;
        silentImage.name = "Silent Image";
        silentImage.actionType = "Action";
        silentImage.description = "You create the image of an object, a creature, or some other visible phenomenon that is no larger than a 15-foot cube. The image appears at a spot within range and lasts for the duration. The image is purely visual; it isn't accompanied by sound, smell, or other sensory effects.";
        silentImage.spellLevel = 1;
        abilityList.add(silentImage);

        Ability sleep = null;
        sleep.name = "Sleep";
        sleep.actionType = "Action";
        sleep.description = "This spell sends creatures into a magical slumber. Roll 5d8; the total is how many hit points of creatures this spell can affect. Creatures within 20 feet of a point you choose within range are affected in ascending order of their current hit points (ignoring unconscious creatures).";
        sleep.spellLevel = 1;
        abilityList.add(sleep);

        Ability speakWithAnimals = null;
        speakWithAnimals.name = "Speak with Animals";
        speakWithAnimals.actionType = "Action";
        speakWithAnimals.description = "ou gain the ability to comprehend and verbally communicate with beasts for the duration. The knowledge and awareness of many beasts is limited by their intelligence, but at minimum, beasts can give you information about nearby locations and monsters, including whatever they can perceive or have perceived within the past day. You might be able to persuade a beast to perform a small favor for you, at the DM's discretion.";
        speakWithAnimals.spellLevel = 1;
        abilityList.add(speakWithAnimals);

        Ability tashasLaughter = null;
        tashasLaughter.name = "Tasha\'s Hideous Laughter";
        tashasLaughter.actionType = "Action";
        tashasLaughter.description = "A creature of your choice that you can see within range perceives everything as hilariously funny and falls into fits of laughter if this spell affects it. The target must succeed on a Wisdom saving throw or fall prone, becoming incapacitated and unable to stand up for the duration. A creature with an Intelligence score of 4 or less isn't affected";
        tashasLaughter.spellLevel = 1;
        abilityList.add(tashasLaughter);

        Ability tensersDisk = null;
        tensersDisk.name = "Tenser\'s Floating Disk";
        tensersDisk.actionType = "Action";
        tensersDisk.description = "This spell creates a circular, horizontal plane of force, 3 feet in diameter and 1 inch thick, that floats 3 feet above the ground in an unoccupied space of your choice that you can see within range. The disk remains for the duration, and can hold up to 500 pounds. If more weight is placed on it, the spell ends, and everything on the disk falls to the ground.";
        tensersDisk.spellLevel = 1;
        abilityList.add(tensersDisk);

        Ability thunderousSmite = null;
        thunderousSmite.name = "Thunderous Smite";
        thunderousSmite.actionType = "Bonus";
        thunderousSmite.description = "The first time you hit with a melee weapon attack during this spell's duration, your weapon rings with thunder that is audible within 300 feet of you, and the attack deals an extra 2d6 thunder damage to the target. Additionally, if the target is a creature, it must succeed on a Strength saving throw or be pushed 10 feet away from you and knocked prone.";
        thunderousSmite.spellLevel = 1;
        abilityList.add(thunderousSmite);

        Ability thunderwave = null;
        thunderwave.name = "Thunderwave";
        thunderwave.actionType = "Action";
        thunderwave.description = "A wave of thunderous force sweeps out from you. Each creature in a 15-foot cube originating from you must make a Constitution saving throw. On a failed save, a creature takes 2d8 thunder damage and is pushed 10 feet away from you. On a successful save, the creature takes half as much damage and isn't pushed.";
        thunderwave.spellLevel = 1;
        abilityList.add(thunderwave);

        Ability unseenServant = null;
        unseenServant.name = "Unseen Servant";
        unseenServant.actionType = "Action";
        unseenServant.description = "This spell creates an invisible, mindless, shapeless, Medium force that performs simple tasks at your command until the spell ends. The servant springs into existence in an unoccupied space on the ground within range. It has AC 10, 1 hit point, and a Strength of 2, and it can't attack. If it drops to 0 hit points, the spell ends.";
        unseenServant.spellLevel = 1;
        abilityList.add(unseenServant);

        Ability witchBolt = null;
        witchBolt.name = "Witch Bolt";
        witchBolt.actionType = "Action";
        witchBolt.description = "A beam of crackling, blue energy lances out toward a creature within range, forming a sustained arc of lightning between you and the target. Make a ranged spell attack against that creature. On a hit, the target takes 1d12 lightning damage, and on each of your turns for the duration, you can use your action to deal 1d12 lightning damage to the target automatically. The spell ends if you use your action to do anything else. The spell also ends if the target is ever outside the spell's range or if it has total cover from you.";
        witchBolt.spellLevel = 1;
        abilityList.add(witchBolt);

        Ability wrathfulSmite = null;
        wrathfulSmite.name = "Wrathful Smite";
        wrathfulSmite.actionType = "Bonus";
        wrathfulSmite.description = "The next time you hit with a melee weapon attack during this spell's duration, your attack deals an extra 1d6 psychic damage. Additionally, if the target is a creature, it must make a Wisdom saving throw or be frightened of you until the spell ends. As an action, the creature can make a Wisdom check against your spell save DC to steel its resolve and end this spell.";
        wrathfulSmite.spellLevel = 1;
        abilityList.add(wrathfulSmite);

        Ability zephyrStrike = null;
        zephyrStrike.name = "Zephyr Strike";
        zephyrStrike.actionType = "Bonus";
        zephyrStrike.description = "You move like the wind. Until the spell ends, your movement doesn't provoke opportunity attacks. Once before the spell ends, you can give yourself advantage on one weapon attack roll on your turn. That attack deals an extra 1d8 force damage on a hit. Whether you hit or miss, your walking speed increases by 30 feet until the end of that turn.";
        zephyrStrike.spellLevel = 1;
        abilityList.add(zephyrStrike);


        // Level 2 Spells

        Ability aganazzarsScorcher = null;
        aganazzarsScorcher.name = "Aganazzar\'s Scorcher";
        aganazzarsScorcher.actionType = "Action";
        aganazzarsScorcher.description = "A line of roaring flame 30 feet long and 5 feet wide emanates from you in a direction you choose. Each creature in the line must make a Dexterity saving throw. A creature takes 3d8 fire damage on a failed save, or half as much damage on a successful one.";
        aganazzarsScorcher.spellLevel = 2;
        abilityList.add(aganazzarsScorcher);

        Ability aid = null;
        aid.name = "Aid";
        aid.actionType = "Action";
        aid.description = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target's hit point maximum and current hit points increase by 5 for the duration.";
        aid.spellLevel = 2;
        abilityList.add(aid);

        Ability alterSelf = null;
        alterSelf.name = "Alter Self";
        alterSelf.actionType = "Action";
        alterSelf.description = "You assume a different form. When you cast the spell, choose one of the following options, the effects of which last for the duration of the spell. While the spell lasts, you can end one option as an action to gain the benefits of a different one.";
        alterSelf.spellLevel = 2;
        abilityList.add(alterSelf);

        Ability animalMessenger = null;
        animalMessenger.name = "Animal Messenger";
        animalMessenger.actionType = "Action";
        animalMessenger.description = "By means of this spell, you use an animal to deliver a message. Choose a Tiny beast you can see within range, such as a squirrel, a blue jay, or a bat. You specify a location, which you must have visited, and a recipient who matches a general description, such as \"a man or woman dressed in the uniform of the town guard\" or \"a red-haired dwarf wearing a pointed hat.\" You also speak a message of up to twenty-five words. The target beast travels for the duration of the spell toward the specified location, covering about 50 miles per 24 hours for a flying messenger, or 25 miles for other animals.";
        animalMessenger.spellLevel = 2;
        abilityList.add(animalMessenger);

        Ability arcaneLock = null;
        arcaneLock.name = "Arcane Lock";
        arcaneLock.actionType = "Action";
        arcaneLock.description = "You touch a closed door, window, gate, chest, or other entryway, and it becomes locked for the duration. You and the creatures you designate when you cast this spell can open the object normally. You can also set a password that, when spoken within 5 feet of the object, suppresses this spell for 1 minute. Otherwise, it is impassable until it is broken or the spell is dispelled or suppressed. Casting knock on the object suppresses arcane lock for 10 minutes.";
        arcaneLock.spellLevel = 2;
        abilityList.add(arcaneLock);

        Ability barkskin = null;
        barkskin.name = "Barkskin";
        barkskin.actionType = "Action";
        barkskin.description = "You touch a willing creature. Until the spell ends, the target's skin has a rough, bark-like appearance, and the target's AC can't be less than 16, regardless of what kind of armor it is wearing.";
        barkskin.spellLevel = 2;
        abilityList.add(barkskin);

        Ability beastSense = null;
        beastSense.name = "Beast Sense";
        beastSense.actionType = "Action";
        beastSense.description = "You touch a willing beast. For the duration of the spell, you can use your action to see through the beast's eyes and hear what it hears, and continue to do so until you use your action to return to your normal senses. While perceiving through the beast's senses, you gain the benefits of any special senses possessed by that creature, though you are blinded and deafened to your own surroundings.";
        beastSense.spellLevel = 2;
        abilityList.add(beastSense);

        Ability blindnessDeafness = null;
        blindnessDeafness.name = "Blindness/Deafness";
        blindnessDeafness.actionType = "Action";
        blindnessDeafness.description = "You can blind or deafen a foe. Choose one creature that you can see within range to make a Constitution saving throw. If it fails, the target is either blinded or deafened (your choice) for the duration. At the end of each of its turns, the target can make a Constitution saving throw. On a success, the spell ends.";
        blindnessDeafness.spellLevel = 2;
        abilityList.add(blindnessDeafness);

        Ability blur = null;
        blur.name = "Blur";
        blur.actionType = "Action";
        blur.description = "Your body becomes blurred, shifting and wavering to all who can see you. For the duration, any creature has disadvantage on attack rolls against you. An attacker is immune to this effect if it doesn't rely on sight, as with blindsight, or can see through illusions, as with truesight.";
        blur.spellLevel = 2;
        abilityList.add(blur);

        Ability brandingSmite = null;
        brandingSmite.name = "Branding Smite";
        brandingSmite.actionType = "Bonus";
        brandingSmite.description = "The next time you hit a creature with a weapon attack before this spell ends, the weapon gleams with astral radiance as you strike. The attack deals an extra 2d6 radiant damage to the target, which becomes visible if it's invisible, and the target sheds dim light in a 5-foot radius and can't become invisible until the spell ends.";
        brandingSmite.spellLevel = 2;
        abilityList.add(brandingSmite);

        Ability calmEmotions = null;
        calmEmotions.name = "Calm Emotions";
        calmEmotions.actionType = "Action";
        calmEmotions.description = "You attempt to suppress strong emotions in a group of people. Each humanoid in a 20-foot-radius sphere centered on a point you choose within range must make a Charisma saving throw; a creature can choose to fail this saving throw if it wishes. If a creature fails its saving throw, choose one of the following two effects.";
        calmEmotions.spellLevel = 2;
        abilityList.add(calmEmotions);

        Ability cloudOfDaggers = null;
        cloudOfDaggers.name = "Cloud of Daggers";
        cloudOfDaggers.actionType = "Action";
        cloudOfDaggers.description = "You fill the air with spinning daggers in a cube 5 feet on each side, centered on a point you choose within range. A creature takes 4d4 slashing damage when it enters the spell's area for the first time on a turn or starts its turn there.";
        cloudOfDaggers.spellLevel = 2;
        abilityList.add(cloudOfDaggers);

        Ability continualFlame = null;
        continualFlame.name = "Continual Flame";
        continualFlame.actionType = "Action";
        continualFlame.description = "A flame, equivalent in brightness to a torch, springs forth from an object that you touch. The effect looks like a regular flame, but it creates no heat and doesn't use oxygen. A continual flame can be covered or hidden but not smothered or quenched.";
        continualFlame.spellLevel = 2;
        abilityList.add(continualFlame);

        Ability cordonOfArrows = null;
        cordonOfArrows.name = "Cordon of Arrows";
        cordonOfArrows.actionType = "Action";
        cordonOfArrows.description = "You plant four pieces of nonmagical ammunition—arrows or crossbow bolts—in the ground within range and lay magic upon them to protect an area. Until the spell ends, whenever a creature other than you comes within 30 feet of the ammunition for the first time on a turn or ends its turn there, one piece of ammunition flies up to strike it. The creature must succeed on a Dexterity saving throw or take 1d6 piercing damage. The piece of ammunition is then destroyed. The spell ends when no ammunition remains.";
        cordonOfArrows.spellLevel = 2;
        abilityList.add(cordonOfArrows);

        Ability crownOfMadness = null;
        crownOfMadness.name = "Crown of Madness";
        crownOfMadness.actionType = "Action";
        crownOfMadness.description = "One humanoid of your choice that you can see within range must succeed on a Wisdom saving throw or become charmed by you for the duration. While the target is charmed in this way, a twisted crown of jagged iron appears on its head, and a madness glows in its eyes.";
        crownOfMadness.spellLevel = 2;
        abilityList.add(crownOfMadness);

        Ability darkness = null;
        darkness.name = "Darkness";
        darkness.actionType = "Action";
        darkness.description = "Magical darkness spreads from a point you choose within range to fill a 15-foot-radius sphere for the duration. The darkness spreads around corners. A creature with darkvision can't see through this darkness, and nonmagical light can't illuminate it.";
        darkness.spellLevel = 2;
        abilityList.add(darkness);

        Ability darkvision = null;
        darkvision.name = "Darkvision";
        darkvision.actionType = "Action";
        darkvision.description = "Action";
        darkvision.spellLevel = 2;
        abilityList.add(darkvision);

        Ability detectThoughts = null;
        detectThoughts.name = "Detect Thoughts";
        detectThoughts.actionType = "Action";
        detectThoughts.description = "For the duration, you can read the thoughts of certain creatures. When you cast the spell and as your action on each turn until the spell ends, you can focus your mind on any one creature that you can see within 30 feet of you. If the creature you choose has an Intelligence of 3 or lower or doesn't speak any language, the creature is unaffected";
        detectThoughts.spellLevel = 2;
        abilityList.add(detectThoughts);

        Ability dragonsBreath = null;
        dragonsBreath.name = "Dragon\'s Breath";
        dragonsBreath.actionType = "Bonus";
        dragonsBreath.description = "You touch one willing creature and imbue it with the power to spew magical energy from its mouth, provided it has one. Choose acid, cold, fire, lightning, or poison. Until the spell ends, the creature can use an action to exhale energy of the chosen type in a 15-foot cone. Each creature in that area must make a Dexterity saving throw, taking 3d6 damage of the chosen type on a failed save, or half as much damage on a successful one.";
        dragonsBreath.spellLevel = 2;
        abilityList.add(dragonsBreath);

        Ability dustDevil = null;
        dustDevil.name = "Dust Devil";
        dustDevil.actionType = "Action";
        dustDevil.description = "Choose an unoccupied 5-foot cube of air that you can see within range. An elemental force that resembles a dust devil appears in the cube and lasts for the spell's duration";
        dustDevil.spellLevel = 2;
        abilityList.add(dustDevil);

        Ability earthbind = null;
        earthbind.name = "Earthbind";
        earthbind.actionType = "Action";
        earthbind.description = "Choose one creature you can see within range. Yellow strips of magical energy loop around the creature. The target must succeed on a Strength saving throw, or its flying speed (if any) is reduced to 0 feet for the spell's duration. An airborne creature affected by this spell safely descends at 60 feet per round until it reaches the ground or the spell ends.";
        earthbind.spellLevel = 2;
        abilityList.add(earthbind);

        Ability enhanceAbility = null;
        enhanceAbility.name = "Enhance Ability";
        enhanceAbility.actionType = "Action";
        enhanceAbility.description = "You touch a creature and bestow upon it a magical enhancement. Choose one of the following effects; the target gains that effect until the spell ends.";
        enhanceAbility.spellLevel = 2;
        abilityList.add(enhanceAbility);

        Ability enlargeReduce = null;
        enlargeReduce.name = "Enlarge/Reduce";
        enlargeReduce.actionType = "Action";
        enlargeReduce.description = "You cause a creature or an object you can see within range to grow larger or smaller for the duration. Choose either a creature or an object that is neither worn nor carried. If the target is unwilling, it can make a Constitution saving throw. On a success, the spell has no effect.";
        enlargeReduce.spellLevel = 2;
        abilityList.add(enlargeReduce);

        Ability enthrall = null;
        enthrall.name = "Enthrall";
        enthrall.actionType = "Action";
        enthrall.description = "You weave a distracting string of words, causing creatures of your choice that you can see within range and that can hear you to make a Wisdom saving throw. Any creature that can't be charmed succeeds on this saving throw automatically, and if you or your companions are fighting a creature, it has advantage on the save. On a failed save, the target has disadvantage on Wisdom (Perception) checks made to perceive any creature other than you until the spell ends or until the target can no longer hear you. The spell ends if you are incapacitated or can no longer speak.";
        enthrall.spellLevel = 2;
        abilityList.add(enthrall);

        Ability findTraps = null;
        findTraps.name = "Find Traps";
        findTraps.actionType = "Action";
        findTraps.description = "You sense the presence of any trap within range that is within line of sight. A trap, for the purpose of this spell, includes anything that would inflict a sudden or unexpected effect you consider harmful or undesirable, which was specifically intended as such by its creator. Thus, the spell would sense an area affected by the alarm spell, a glyph of warding, or a mechanical pit trap, but it would not reveal a natural weakness in the floor, an unstable ceiling, or a hidden sinkhole.";
        findTraps.spellLevel = 2;
        abilityList.add(findTraps);

        Ability flameBlade = null;
        flameBlade.name = "Flame Blade";
        flameBlade.actionType = "Bonus";
        flameBlade.description = "You evoke a fiery blade in your free hand. The blade is similar in size and shape to a scimitar, and it lasts for the duration. If you let go of the blade, it disappears, but you can evoke the blade again as a bonus action.";
        flameBlade.spellLevel = 2;
        abilityList.add(flameBlade);

        Ability flamingSphere = null;
        flamingSphere.name = "Flaming Sphere";
        flamingSphere.actionType = "Action";
        flamingSphere.description = "A 5-foot-diameter sphere of fire appears in an unoccupied space of your choice within range and lasts for the duration. Any creature that ends its turn within 5 feet of the sphere must make a Dexterity saving throw. The creature takes 2d6 fire damage on a failed save, or half as much damage on a successful one.";
        flameBlade.spellLevel = 2;
        abilityList.add(flamingSphere);

        Ability gentleRepose = null;
        gentleRepose.name = "Gentle Repose";
        gentleRepose.actionType = "Action";
        gentleRepose.description = "You touch a corpse or other remains. For the duration, the target is protected from decay and can't become undead.";
        gentleRepose.spellLevel = 2;
        abilityList.add(gentleRepose);

        Ability giftOfGab = null;
        giftOfGab.name = "Gift of Gab";
        giftOfGab.actionType = "Reaction";
        giftOfGab.description = "When you cast this spell, you skillfully reshape the memories of listeners in your immediate area, so that each creature of your choice within 5 feet of you forgets everything you said within the last 6 seconds. Those creatures then remember that you actually said the words you speak as the verbal component of the spell.";
        giftOfGab.spellLevel = 2;
        abilityList.add(giftOfGab);

         Ability gustOfWind = null;
         gustOfWind.name = "Gust of Wind";
         gustOfWind.actionType = "Action";
         gustOfWind.description = "A line of strong wind 60 feet long and 10 feet wide blasts from you in a direction you choose for the spell's duration. Each creature that starts its turn in the line must succeed on a Strength saving throw or be pushed 15 feet away from you in a direction following the line.";
         gustOfWind.spellLevel = 2;
        abilityList.add(gustOfWind);

         Ability healingSpirit = null;
         healingSpirit.name = "Healing Spirit";
         healingSpirit.actionType = "Bonus";
         healingSpirit.description = "Until the spell ends, whenever you or a creature you can see moves into the spirit's space for the first time on a turn or starts its turn there, you can cause the spirit to restore 1d6 hit points to that creature (no action required). The spirit can't heal constructs or undead.";
         healingSpirit.spellLevel = 2;
        abilityList.add(healingSpirit);

         Ability heatMetal = null;
         heatMetal.name = "Heat Metal";
         heatMetal.actionType = "Action";
         heatMetal.description = "Choose a manufactured metal object, such as a metal weapon or a suit of heavy or medium metal armor, that you can see within range. You cause the object to glow red-hot. Any creature in physical contact with the object takes 2d8 fire damage when you cast the spell. Until the spell ends, you can use a bonus action on each of your subsequent turns to cause this damage again.";
         heatMetal.spellLevel = 2;
        abilityList.add(heatMetal);

         Ability holdPerson = null;
         holdPerson.name = "Hold Person";
         holdPerson.actionType = "Action";
         holdPerson.description = "Choose a humanoid that you can see within range. The target must succeed on a Wisdom saving throw or be paralyzed for the duration. At the end of each of its turns, the target can make another Wisdom saving throw. On a success, the spell ends on the target.";
         holdPerson.spellLevel = 2;
        abilityList.add(holdPerson);

         Ability invisibility = null;
         invisibility.name = "Invisibility";
         invisibility.actionType = "Action";
         invisibility.description = "A creature you touch becomes invisible until the spell ends. Anything the target is wearing or carrying is invisible as long as it is on the target's person. The spell ends for a target that attacks or casts a spell.";
         invisibility.spellLevel = 2;
        abilityList.add(invisibility);

         Ability jimsGlowingCoin = null;
         jimsGlowingCoin.name = "Jim\'s Glowing Coin";
         jimsGlowingCoin.actionType = "Action";
         jimsGlowingCoin.description = "When you cast the spell, you hurl the coin that is the spell's material component to any spot within range. The coin lights up as if under the effect of a light spell. Each creature of your choice that you can see within 30 feet of the coin must succeed on a Wisdom saving throw or be distracted for the duration. While distracted, a creature has disadvantage on Wisdom (Perception) checks and initiative rolls.";
         jimsGlowingCoin.spellLevel = 2;
        abilityList.add(jimsGlowingCoin);

         Ability knock = null;
         knock.name = "Knock";
         knock.actionType = "Action";
         knock.description = "Choose an object that you can see within range. The object can be a door, a box, a chest, a set of manacles, a padlock, or another object that contains a mundane or magical means that prevents access.";
         knock.spellLevel = 2;
        abilityList.add(knock);

         Ability lesserRestoration = null;
         lesserRestoration.name = "Lesser Restoration";
         lesserRestoration.actionType = "Action";
         lesserRestoration.description = "You touch a creature and can end either one disease or one condition afflicting it. The condition can be blinded, deafened, paralyzed, or poisoned.";
         lesserRestoration.spellLevel = 2;
         abilityList.add(lesserRestoration);

         Ability levitate = null;
         levitate.name = "Levitate";
         levitate.actionType = "Action";
         levitate.description = "One creature or loose object of your choice that you can see within range rises vertically, up to 20 feet, and remains suspended there for the duration. The spell can levitate a target that weighs up to 500 pounds. An unwilling creature that succeeds on a Constitution saving throw is unaffected.";
         levitate.spellLevel = 2;
         abilityList.add(levitate);

         Ability locateAnimalsPlants = null;
         locateAnimalsPlants.name = "Locate Animals or Plants";
         locateAnimalsPlants.actionType = "Action";
         locateAnimalsPlants.description = "Describe or name a specific kind of beast or plant. Concentrating on the voice of nature in your surroundings, you learn the direction and distance to the closest creature or plant of that kind within 5 miles, if any are present.";
         locateAnimalsPlants.spellLevel = 2;
         abilityList.add(locateAnimalsPlants);

         Ability locateObject = null;
         locateObject.name = "Locate Object";
         locateObject.actionType = "Action";
         locateObject.description = "Describe or name an object that is familiar to you. You sense the direction to the object's location, as long as that object is within 1,000 feet of you. If the object is in motion, you know the direction of its movement.";
         locateObject.spellLevel = 2;
        abilityList.add(locateObject);

         Ability magicWeapon = null;
         magicWeapon.name = "Magic Weapon";
         magicWeapon.actionType = "Bonus";
         magicWeapon.description = "You touch a nonmagical weapon. Until the spell ends, that weapon becomes a magic weapon with a +1 bonus to attack rolls and damage rolls.";
         magicWeapon.spellLevel = 2;
        abilityList.add(magicWeapon);

         Ability maximiliansEarthenGrasp = null;
         maximiliansEarthenGrasp.name = "Maximilian\'s Earthen Grasp";
         maximiliansEarthenGrasp.actionType = "Action";
         maximiliansEarthenGrasp.description = "You choose a 5-foot-square unoccupied space on the ground that you can see within range. A Medium hand made from compacted soil rises there and reaches for one creature you can see within 5 feet of it. The target must make a Strength saving throw. On a failed save, the target takes 2d6 bludgeoning damage and is restrained for the spell's duration.";
         maximiliansEarthenGrasp.spellLevel = 2;
        abilityList.add(maximiliansEarthenGrasp);

         Ability melfsAcidArrow = null;
         melfsAcidArrow.name = "Melf\'s Acid Arrow";
         melfsAcidArrow.actionType = "Action";
         melfsAcidArrow.description = "A shimmering green arrow streaks toward a target within range and bursts in a spray of acid. Make a ranged spell attack against the target. On a hit, the target takes 4d4 acid damage immediately and 2d4 acid damage at the end of its next turn. On a miss, the arrow splashes the target with acid for half as much of the initial damage and no damage at the end of its next turn.";
         melfsAcidArrow.spellLevel = 2;
        abilityList.add(melfsAcidArrow);

         Ability mindSpike = null;
         mindSpike.name = "Mind Spike";
         mindSpike.actionType = "Action";
         mindSpike.description = "You reach into the mind of one creature you can see within range. The target must make a Wisdom saving throw, taking 3d8 psychic damage on a failed save, or half as much damage on a successful one. On a failed save, you also always know the target's location until the spell ends, but only while the two of you are on the same plane of existence. While you have this knowledge, the target can't become hidden from you, and if it's invisible, it gains no benefit from that condition against you.";
         mindSpike.spellLevel = 2;
        abilityList.add(mindSpike);

         Ability mirrorImage = null;
         mirrorImage.name = "Mirror Image";
         mirrorImage.actionType = "Action";
         mirrorImage.description = "Three illusory duplicates of yourself appear in your space. Until the spell ends, the duplicates move with you and mimic your actions, shifting position so it's impossible to track which image is real. You can use your action to dismiss the illusory duplicates.";
         mirrorImage.spellLevel = 2;
        abilityList.add(mirrorImage);

         Ability mistyStep = null;
         mistyStep.name = "Misty Step";
         mistyStep.actionType = "Bonus";
         mistyStep.description = "Briefly surrounded by silvery mist, you teleport up to 30 feet to an unoccupied space that you can see.";
         mistyStep.spellLevel = 2;
        abilityList.add(mistyStep);

         Ability moonbeam = null;
         moonbeam.name = "Moonbeam";
         moonbeam.actionType = "Action";
         moonbeam.description = "A silvery beam of pale light shines down in a 5-foot-radius, 40-foot-high cylinder centered on a point within range. Until the spell ends, dim light fills the cylinder.";
         moonbeam.spellLevel = 2;
        abilityList.add(moonbeam);

         Ability nystulsMagicAura = null;
         nystulsMagicAura.name = "Nystul\'s Magic Aura";
         nystulsMagicAura.actionType = "Action";
         nystulsMagicAura.description = "You place an illusion on a creature or an object you touch so that divination spells reveal false information about it. The target can be a willing creature or an object that isn't being carried or worn by another creature.";
         nystulsMagicAura.spellLevel = 2;
        abilityList.add(nystulsMagicAura);

         Ability passWithoutTrace = null;
         passWithoutTrace.name = "Pass without Trace";
         passWithoutTrace.actionType = "Action";
         passWithoutTrace.description = "A veil of shadows and silence radiates from you, masking you and your companions from detection. For the duration, each creature you choose within 30 feet of you (including you) has a +10 bonus to Dexterity (Stealth) checks and can't be tracked except by magical means. A creature that receives this bonus leaves behind no tracks or other traces of its passage.";
         passWithoutTrace.spellLevel = 2;
        abilityList.add(passWithoutTrace);

         Ability phantasmalForce = null;
         phantasmalForce.name = "Phantasmal Force";
         phantasmalForce.actionType = "Action";
         phantasmalForce.description = "You craft an illusion that takes root in the mind of a creature that you can see within range. The target must make an Intelligence saving throw. On a failed save, you create a phantasmal object, creature, or other visible phenomenon of your choice that is no larger than a 10-foot cube and that is perceivable only to the target for the duration. This spell has no effect on undead or constructs.";
         phantasmalForce.spellLevel = 2;
        abilityList.add(phantasmalForce);

         Ability protectionFromPoison = null;
         protectionFromPoison.actionType = "Action";
         protectionFromPoison.name = "Protection From Poison";
         protectionFromPoison.description = "You touch a creature. If it is poisoned, you neutralize the poison. If more than one poison afflicts the target, you neutralize one poison that you know is present, or you neutralize one at random.";
         protectionFromPoison.spellLevel = 2;
        abilityList.add(protectionFromPoison);

         Ability pyrotechnics = null;
         pyrotechnics.name = "Pyrotechnics";
         pyrotechnics.actionType = "Action";
         pyrotechnics.description = "Choose an area of nonmagical flame that you can see and that fits within a 5-foot cube within range. You can extinguish the fire in that area, and you create either fireworks or smoke when you do so.";
         pyrotechnics.spellLevel = 2;
        abilityList.add(pyrotechnics);

         Ability rayOfEnfeeblement = null;
         rayOfEnfeeblement.name = "Ray of Enfeeblement";
         rayOfEnfeeblement.actionType = "Action";
         rayOfEnfeeblement.description = "A black beam of enervating energy springs from your finger toward a creature within range. Make a ranged spell attack against the target. On a hit, the target deals only half damage with weapon attacks that use Strength until the spell ends.";
         rayOfEnfeeblement.spellLevel = 2;
        abilityList.add(rayOfEnfeeblement);

         Ability ropeTrick = null;
         ropeTrick.name = "Rope Trick";
         ropeTrick.actionType = "Action";
         ropeTrick.description = "You touch a length of rope that is up to 60 feet long. One end of the rope then rises into the air until the whole rope hangs perpendicular to the ground. At the upper end of the rope, an invisible entrance opens to an extradimensional space that lasts until the spell ends.";
         ropeTrick.spellLevel = 2;
        abilityList.add(ropeTrick);

         Ability scorchingRay = null;
         scorchingRay.name = "Scorching Ray";
         scorchingRay.actionType = "Action";
         scorchingRay.description = "You create three rays of fire and hurl them at targets within range. You can hurl them at one target or several. Make a ranged spell attack for each ray. On a hit, the target takes 2d6 fire damage.";
         scorchingRay.spellLevel = 2;
        abilityList.add(scorchingRay);

         Ability seeInvisibility = null;
         seeInvisibility.name = "See Invisibility";
         seeInvisibility.actionType = "Action";
         seeInvisibility.description = "For the duration, you see invisible creatures and objects as if they were visible, and you can see into the Ethereal Plane. Ethereal creatures and objects appear ghostly and translucent.";
         seeInvisibility.spellLevel = 2;
        abilityList.add(seeInvisibility);

         Ability shadowBlade = null;
         shadowBlade.name = "Shadow Blade";
         shadowBlade.actionType = "Bonus";
         shadowBlade.description = "You weave together threads of shadow to create a sword of solidified gloom in your hand. This magic sword lasts until the spell ends. It counts as a simple melee weapon with which you are proficient. It deals 2d8 psychic damage on a hit and has the finesse, light, and thrown properties (range 20/60). In addition, when you use the sword to attack a target that is in dim light or darkness, you make the attack roll with advantage.";
         shadowBlade.spellLevel = 2;
        abilityList.add(shadowBlade);

         Ability shatter = null;
         shatter.name = "Shatter";
         shatter.actionType = "Action";
         shatter.description = "A sudden loud ringing noise, painfully intense, erupts from a point of your choice within range. Each creature in a 10-foot-radius sphere centered on that point must make a Constitution saving throw. A creature takes 3d8 thunder damage on a failed save, or half as much damage on a successful one. A creature made of inorganic material such as stone, crystal, or metal has disadvantage on this saving throw.";
         shatter.spellLevel = 2;
        abilityList.add(shatter);

         Ability silence = null;
         silence.name = "Silence";
         silence.actionType = "Action";
         silence.description = "For the duration, no sound can be created within or pass through a 20-foot-radius sphere centered on a point you choose within range. Any creature or object entirely inside the sphere is immune to thunder damage, and creatures are deafened while entirely inside it. Casting a spell that includes a verbal component is impossible there.";
         silence.spellLevel = 2;
        abilityList.add(silence);

         Ability skywrite = null;
         skywrite.name = "Skywrite";
         skywrite.actionType = "Action";
         skywrite.description = "You cause up to ten words to form in a part of the sky you can see. The words appear to be made of cloud and remain in place for the spell's duration. The words dissipate when the spell ends. A strong wind can disperse the clouds and end the spell early.";
         skywrite.spellLevel = 2;
        abilityList.add(skywrite);

         Ability snillocsSnowballSwarm = null;
         snillocsSnowballSwarm.name = "Snilloc\'s Snowball Swarm";
         snillocsSnowballSwarm.actionType = "Action";
         snillocsSnowballSwarm.description = "A flurry of magic snowballs erupts from a point you choose within range. Each creature in a 5-foot-radius sphere centered on that point must make a Dexterity saving throw. A creature takes 3d6 cold damage on a failed save, or half as much damage on a successful one.";
         snillocsSnowballSwarm.spellLevel = 2;
        abilityList.add(snillocsSnowballSwarm);

         Ability spiderClimb = null;
         spiderClimb.name = "Spider Climb";
         spiderClimb.actionType = "Action";
         spiderClimb.description = "Until the spell ends, one willing creature you touch gains the ability to move up, down, and across vertical surfaces and upside down along ceilings, while leaving its hands free. The target also gains a climbing speed equal to its walking speed.";
         spiderClimb.spellLevel = 2;
        abilityList.add(spiderClimb);

         Ability spikeGrowth = null;
         spikeGrowth.name = "Spike Growth";
         spikeGrowth.actionType = "Action";
         spikeGrowth.description = "The ground in a 20-foot radius centered on a point within range twists and sprouts hard spikes and thorns. The area becomes difficult terrain for the duration. When a creature moves into or within the area, it takes 2d4 piercing damage for every 5 feet it travels.";
         spikeGrowth.spellLevel = 2;
        abilityList.add(spikeGrowth);

         Ability spiritualWeapon = null;
         spiritualWeapon.name = "Spiritual Weapon";
         spiritualWeapon.actionType = "Bonus";
         spiritualWeapon.description = "You create a floating, spectral weapon within range that lasts for the duration or until you cast this spell again. When you cast the spell, you can make a melee spell attack against a creature within 5 feet of the weapon. On a hit, the target takes force damage equal to 1d8 + your spellcasting ability modifier.";
         spiritualWeapon.spellLevel = 2;
        abilityList.add(spiritualWeapon);

         Ability suggestion = null;
         suggestion.name = "Suggestion";
         suggestion.actionType = "Action";
         suggestion.description = "You suggest a course of activity (limited to a sentence or two) and magically influence a creature you can see within range that can hear and understand you. Creatures that can't be charmed are immune to this effect. The suggestion must be worded in such a manner as to make the course of action sound reasonable. Asking the creature to stab itself, throw itself onto a spear, immolate itself, or do some other obviously harmful act ends the spell.";
         suggestion.spellLevel = 2;
        abilityList.add(suggestion);

         Ability wardingBond = null;
         wardingBond.name = "Warding Bond";
         wardingBond.actionType = "Action";
         wardingBond.description = "This spell wards a willing creature you touch and creates a mystic connection between you and the target until the spell ends. While the target is within 60 feet of you, it gains a +1 bonus to AC and saving throws, and it has resistance to all damage. Also, each time it takes damage, you take the same amount of damage.";
         wardingBond.spellLevel = 2;
        abilityList.add(wardingBond);

         Ability wardingWind = null;
         wardingWind.name = "Warding Wind";
         wardingWind.actionType = "Action";
         wardingWind.description = "A strong wind (20 miles per hour) blows around you in a 10-foot radius and moves with you, remaining centered on you. The wind lasts for the spell's duration.";
         wardingWind.spellLevel = 2;
        abilityList.add(wardingWind);

         Ability web = null;
         web.name = "Web";
         web.actionType = "Action";
         web.description = "You conjure a mass of thick, sticky webbing at a point of your choice within range. The webs fill a 20-foot cube from that point for the duration. The webs are difficult terrain and lightly obscure their area.";
         web.spellLevel = 2;
        abilityList.add(web);

         Ability zoneOfTruth = null;
         zoneOfTruth.name = "Zone of Truth";
         zoneOfTruth.actionType = "Action";
         zoneOfTruth.description = "You create a magical zone that guards against deception in a 15-foot-radius sphere centered on a point of your choice within range. Until the spell ends, a creature that enters the spell's area for the first time on a turn or starts its turn there must make a Charisma saving throw. On a failed save, a creature can't speak a deliberate lie while in the radius. You know whether each creature succeeds or fails on its saving throw.";
         zoneOfTruth.spellLevel = 2;
        abilityList.add(zoneOfTruth);


         // Level 3 Spells

        Ability auraOfVitality = null;
        auraOfVitality.name = "Aura of Vitality";
        auraOfVitality.actionType = "Action";
        auraOfVitality.description = "Healing energy radiates from you in an aura with a 30-foot radius. Until the spell ends, the aura moves with you, centered on you. You can use a bonus action to cause one creature in the aura (including you) to regain 2d6 hit points.";
        auraOfVitality.spellLevel = 3;
        abilityList.add(auraOfVitality);

        Ability beaconOfHope = null;
        beaconOfHope.name = "Beacon of Hope";
        beaconOfHope.actionType = "Action";
        beaconOfHope.description = "This spell bestows hope and vitality. Choose any number of creatures within range. For the duration, each target has advantage on Wisdom saving throws and death saving throws, and regains the maximum number of hit points possible from any healing.";
        beaconOfHope.spellLevel = 3;
        abilityList.add(beaconOfHope);

        Ability bestowCurse = null;
        bestowCurse.name = "Bestow Curse";
        bestowCurse.actionType = "Action";
        bestowCurse.description = "You touch a creature, and that creature must succeed on a Wisdom saving throw or become cursed for the duration of the spell.";
        bestowCurse.spellLevel = 3;
        abilityList.add(bestowCurse);

        Ability blindingSmite = null;
        blindingSmite.name = "Blinding Smite";
        blindingSmite.actionType = "Bonus";
        blindingSmite.description = "The next time you hit a creature with a melee weapon attack during this spell's duration, your weapon flares with bright light, and the attack deals an extra 3d8 radiant damage to the target. Additionally, the target must succeed on a Constitution saving throw or be blinded until the spell ends.";
        blindingSmite.spellLevel = 3;
        abilityList.add(blindingSmite);

        Ability blink = null;
        blink.name = "Blink";
        blink.actionType = "Action";
        blink.description = "Roll a d20 at the end of each of your turns for the duration of the spell. On a roll of 11 or higher, you vanish from your current plane of existence and appear in the Ethereal Plane (the spell fails and the casting is wasted if you were already on that plane). At the start of your next turn, and when the spell ends if you are on the Ethereal Plane, you return to an unoccupied space of your choice that you can see within 10 feet of the space you vanished from. If no unoccupied space is available within that range, you appear in the nearest unoccupied space (chosen at random if more than one space is equally near). You can dismiss this spell as an action.";
        blink.spellLevel = 3;
        abilityList.add(blink);

        Ability callLightning = null;
        callLightning.name = "Call Lightning";
        callLightning.actionType = "Action";
        callLightning.description = "A storm cloud appears in the shape of a cylinder that is 10 feet tall with a 60-foot radius, centered on a point you can see within range directly above you. The spell fails if you can't see a point in the air where the storm cloud could appear (for example, if you are in a room that can't accommodate the cloud).";
        callLightning.spellLevel = 3;
        abilityList.add(callLightning);

        Ability catnap = null;
        catnap.name = "Catnap";
        catnap.actionType = "Action";
        catnap.description = "You make a calming gesture, and up to three willing creatures of your choice that you can see within range fall unconscious for the spell's duration. The spell ends on a target early if it takes damage or someone uses an action to shake or slap it awake. If a target remains unconscious for the full duration, that target gains the benefit of a short rest, and it can't be affected by this spell again until it finishes a long rest.";
        catnap.spellLevel = 3;
        abilityList.add(catnap);

        Ability conjureAnimals = null;
        conjureAnimals.name = "Conjure Animals";
        conjureAnimals.actionType = "Action";
        conjureAnimals.description = "You create an invisible sensor within range in a location familiar to you (a place you have visited or seen before) or in an obvious location that is unfamiliar to you (such as behind a door, around a corner, or in a grove of trees). The sensor remains in place for the duration, and it can't be attacked or otherwise interacted with.";
        conjureAnimals.spellLevel = 3;
        abilityList.add(conjureAnimals);

        Ability conjureBarrage = null;
        conjureBarrage.name = "Conjure Barrage";
        conjureBarrage.actionType = "Action";
        conjureBarrage.description = "You throw a nonmagical weapon or fire a piece of nonmagical ammunition into the air to create a cone of identical weapons that shoot forward and then disappear. Each creature in a 60-foot cone must succeed on a Dexterity saving throw. A creature takes 3d8 damage on a failed save, or half as much damage on a successful one. The damage type is the same as that of the weapon or ammunition used as a component.";
        conjureBarrage.spellLevel = 3;
        abilityList.add(conjureBarrage);

        Ability counterspell = null;
        counterspell.name = "Counterspell";
        counterspell.actionType = "Reaction";
        counterspell.description = "You attempt to interrupt a creature in the process of casting a spell. If the creature is casting a spell of 3rd level or lower, its spell fails and has no effect. If it is casting a spell of 4th level or higher, make an ability check using your spellcasting ability. The DC equals 10 + the spell's level. On a success, the creature's spell fails and has no effect.";
        counterspell.spellLevel = 3;
        abilityList.add(counterspell);

        Ability createFoodWater = null;
        createFoodWater.name = "Create Food and Water";
        createFoodWater.actionType = "Action";
        createFoodWater.description = "You create 45 pounds of food and 30 gallons of water on the ground or in containers within range, enough to sustain up to fifteen humanoids or five steeds for 24 hours. The food is bland but nourishing, and spoils if uneaten after 24 hours. The water is clean and doesn't go bad.";
        createFoodWater.spellLevel = 3;
        abilityList.add(createFoodWater);

        Ability crusadersMantle = null;
        crusadersMantle.name = "Crusader\'s Mantle";
        crusadersMantle.actionType = "Action";
        crusadersMantle.description = "Holy power radiates from you in an aura with a 30-foot radius, awakening boldness in friendly creatures. Until the spell ends, the aura moves with you, centered on you. While in the aura, each nonhostile creature in the aura (including you) deals an extra 1d4 radiant damage when it hits with a weapon attack.";
        crusadersMantle.spellLevel = 3;
        abilityList.add(crusadersMantle);

        Ability daylight = null;
        daylight.name = "Daylight";
        daylight.actionType = "Action";
        daylight.description = "A 60-foot-radius sphere of light spreads out from a point you choose within range. The sphere is bright light and sheds dim light for an additional 60 feet.";
        daylight.spellLevel = 3;
        abilityList.add(daylight);

        Ability dispelMagic = null;
        dispelMagic.name = "Dispel Magic";
        dispelMagic.actionType = "Action";
        dispelMagic.description = "Choose one creature, object, or magical effect within range. Any spell of 3rd level or lower on the target ends. For each spell of 4th level or higher on the target, make an ability check using your spellcasting ability. The DC equals 10 + the spell's level. On a successful check, the spell ends.";
        dispelMagic.spellLevel = 3;
        abilityList.add(dispelMagic);

        Ability elementalWeapon = null;
        elementalWeapon.name = "Elemental Weapon";
        elementalWeapon.actionType = "Action";
        elementalWeapon.description = "A nonmagical weapon you touch becomes a magic weapon. Choose one of the following damage types: acid, cold, fire, lightning, or thunder. For the duration, the weapon has a +1 bonus to attack rolls and deals an extra 1d4 damage of the chosen type when it hits.";
        elementalWeapon.spellLevel = 3;
        abilityList.add(elementalWeapon);

        Ability enemiesAbound = null;
        enemiesAbound.name = "Enemies Abound";
        enemiesAbound.actionType = "Action";
        enemiesAbound.description = "You reach into the mind of one creature you can see and force it to make an Intelligence saving throw. A creature automatically succeeds if it is immune to being frightened. On a failed save, the target loses the ability to distinguish friend from foe, regarding all creatures it can see as enemies until the spell ends. Each time the target takes damage, it can repeat the saving throw, ending the effect on itself on a success.";
        enemiesAbound.spellLevel = 3;
        abilityList.add(enemiesAbound);

        Ability eruptingEarth = null;
        eruptingEarth.name = "Erupting Earth";
        eruptingEarth.actionType = "Action";
        eruptingEarth.description = "Choose a point you can see on the ground within range. A fountain of churned earth and stone erupts in a 20-foot cube centered on that point. Each creature in that area must make a Dexterity saving throw. A creature takes 3d12 bludgeoning damage on a failed save, or half as much damage on a successful one. Additionally, the ground in that area becomes difficult terrain until cleared. Each 5-foot-square portion of the area requires at least 1 minute to clear by hand.";
        eruptingEarth.spellLevel = 3;
        abilityList.add(eruptingEarth);

        Ability fastFriends = null;
        fastFriends.name = "Fast Friends";
        fastFriends.actionType = "Action";
        fastFriends.description = "When you need to make sure something gets done, you can't rely on vague promises, sworn oaths, or binding contracts of employment. When you cast this spell, choose one humanoid within range that can see and hear you, and that can understand you. The creature must succeed on a Wisdom saving throw or become charmed by you for the duration. While the creature is charmed in this way, it undertakes to perform any services or activities you ask of it in a friendly manner, to the best of its ability.";
        fastFriends.spellLevel = 3;
        abilityList.add(fastFriends);

        Ability fear = null;
        fear.name = "Fear";
        fear.actionType = "Action";
        fear.description = "You project a phantasmal image of a creature's worst fears. Each creature in a 30-foot cone must succeed on a Wisdom saving throw or drop whatever it is holding and become frightened for the duration.";
        fear.spellLevel = 3;
        abilityList.add(fear);

        Ability feignDeath = null;
        feignDeath.name = "Feign Death";
        feignDeath.actionType = "Action";
        feignDeath.description = "You touch a willing creature and put it into a cataleptic state that is indistinguishable from death.";
        feignDeath.spellLevel = 3;
        abilityList.add(feignDeath);

        Ability fireball = null;
        fireball.name = "Fireball";
        fireball.actionType = "Action";
        fireball.description = "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one.";
        fireball.spellLevel = 3;
        abilityList.add(fireball);

        Ability flameArrow = null;
        flameArrow.name = "Flame Arrow";
        flameArrow.actionType = "Action";
        flameArrow.description = "You touch a quiver containing arrows or bolts. When a target is hit by a ranged weapon attack using a piece of ammunition drawn from the quiver, the target takes an extra 1d6 fire damage. The spell's magic ends on a piece of ammunition when it hits or misses, and the spell ends when twelve pieces of ammunition have been drawn from the quiver.";
        flameArrow.spellLevel = 3;
        abilityList.add(flameArrow);

        Ability fly = null;
        fly.name = "Fly";
        fly.actionType = "Action";
        fly.description = "You touch a willing creature. The target gains a flying speed of 60 feet for the duration. When the spell ends, the target falls if it is still aloft, unless it can stop the fall.";
        fly.spellLevel = 3;
        abilityList.add(fly);

        Ability gaseousForm = null;
        gaseousForm.name = "Gaseous Form";
        gaseousForm.actionType = "Action";
        gaseousForm.description = "You transform a willing creature you touch, along with everything it's wearing and carrying, into a misty cloud for the duration. The spell ends if the creature drops to 0 hit points. An incorporeal creature isn't affected.";
        gaseousForm.spellLevel = 3;
        abilityList.add(gaseousForm);

        Ability haste = null;
        haste.name = "Haste";
        haste.actionType = "Action";
        haste.description = "Choose a willing creature that you can see within range. Until the spell ends, the target's speed is doubled, it gains a +2 bonus to AC, it has advantage on Dexterity saving throws, and it gains an additional action on each of its turns. That action can be used only to take the Attack (one weapon attack only), Dash, Disengage, Hide, or Use an Object action.";
        haste.spellLevel = 3;
        abilityList.add(haste);

        Ability hungerOfHadar = null;
        hungerOfHadar.name = "Hunger of Hadar";
        hungerOfHadar.actionType = "Action";
        hungerOfHadar.description = "You open a gateway to the dark between the stars, a region infested with unknown horrors. A 20-foot-radius sphere of blackness and bitter cold appears, centered on a point within range and lasting for the duration. This void is filled with a cacophony of soft whispers and slurping noises that can be heard up to 30 feet away. No light, magical or otherwise, can illuminate the area, and creatures fully within the area are blinded.";
        hungerOfHadar.spellLevel = 3;
        abilityList.add(hungerOfHadar);

        Ability hypnoticPattern = null;
        hypnoticPattern.name = "Hypnotic Pattern";
        hypnoticPattern.actionType = "Action";
        hypnoticPattern.description = "You create a twisting pattern of colors that weaves through the air inside a 30-foot cube within range. The pattern appears for a moment and vanishes. Each creature in the area who sees the pattern must make a Wisdom saving throw. On a failed save, the creature becomes charmed for the duration. While charmed by this spell, the creature is incapacitated and has a speed of 0.";
        hypnoticPattern.spellLevel = 3;
        abilityList.add(hypnoticPattern);

        Ability inciteGreed = null;
        inciteGreed.name = "Incite Greed";
        inciteGreed.actionType = "Action";
        inciteGreed.description = "When you cast this spell, you present the gem used as the material component and choose any number of creatures within range that can see you. Each target must succeed on a Wisdom saving throw or be charmed by you until the spell ends, or until you or your companions do anything harmful to it. While charmed in this way, a creature can do nothing but use its movement to approach you in a safe manner. While an affected creature is within 5 feet of you, it cannot move, but simply stares greedily at the gem you present.";
        inciteGreed.spellLevel = 3;
        abilityList.add(inciteGreed);

        Ability lifeTransference = null;
        lifeTransference.name = "Life Transference";
        lifeTransference.actionType = "Action";
        lifeTransference.description = "When you cast this spell, you present the gem used as the material component and choose any number of creatures within range that can see you. Each target must succeed on a Wisdom saving throw or be charmed by you until the spell ends, or until you or your companions do anything harmful to it. While charmed in this way, a creature can do nothing but use its movement to approach you in a safe manner. While an affected creature is within 5 feet of you, it cannot move, but simply stares greedily at the gem you present.";
        lifeTransference.spellLevel = 3;
        abilityList.add(lifeTransference);

        Ability lightningArrow = null;
        lightningArrow.name = "Lightning Arrow";
        lightningArrow.actionType = "Bonus";
        lightningArrow.description = "The next time you make a ranged weapon attack during the spell's duration, the weapon's ammunition, or the weapon itself if it's a thrown weapon, transforms into a bolt of lightning. Make the attack roll as normal. The target takes 4d8 lightning damage on a hit, or half as much damage on a miss, instead of the weapon's normal damage.";
        lightningArrow.spellLevel = 3;
        abilityList.add(lightningArrow);

        Ability lightningBolt = null;
        lightningBolt.name = "Lightning Bolt";
        lightningBolt.actionType = "Action";
        lightningBolt.description = "A stroke of lightning forming a line 100 feet long and 5 feet wide blasts out from you in a direction you choose. Each creature in the line must make a Dexterity saving throw. A creature takes 8d6 lightning damage on a failed save, or half as much damage on a successful one.";
        lightningBolt.spellLevel = 3;
        abilityList.add(lightningBolt);

        Ability majorImage = null;
        majorImage.name = "Major Image";
        majorImage.actionType = "Action";
        majorImage.description = "You create the image of an object, a creature, or some other visible phenomenon that is no larger than a 20-foot cube. The image appears at a spot that you can see within range and lasts for the duration. It seems completely real, including sounds, smells, and temperature appropriate to the thing depicted. You can't create sufficient heat or cold to cause damage, a sound loud enough to deal thunder damage or deafen a creature, or a smell that might sicken a creature (like a troglodyte's stench).";
        majorImage.spellLevel = 3;
        abilityList.add(majorImage);

        Ability massHealingWord = null;
        massHealingWord.name = "Mass Healing Word";
        massHealingWord.actionType = "Bonus";
        massHealingWord.description = "As you call out words of restoration, up to six creatures of your choice that you can see within range regain hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        massHealingWord.spellLevel = 3;
        abilityList.add(massHealingWord);

        Ability meldIntoStone = null;
        meldIntoStone.name = "Meld into Stone";
        meldIntoStone.actionType = "Action";
        meldIntoStone.description = "As you call out words of restoration, up to six creatures of your choice that you can see within range regain hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        meldIntoStone.spellLevel = 3;
        abilityList.add(meldIntoStone);

        Ability melfsMinuteMeteors = null;
        melfsMinuteMeteors.name = "Melf\'s Minute Meteors";
        melfsMinuteMeteors.actionType = "Action";
        melfsMinuteMeteors.description = "You create six tiny meteors in your space. They float in the air and orbit you for the spell's duration. When you cast the spell—and as a bonus action on each of your turns thereafter—you can expend one or two of the meteors, sending them streaking toward a point or points you choose within 120 feet of you. Once a meteor reaches its destination or impacts against a solid surface, the meteor explodes. Each creature within 5 feet of the point where the meteor explodes must make a Dexterity saving throw. A creature takes 2d6 fire damage on a failed save, or half as much damage on a successful one.";
        melfsMinuteMeteors.spellLevel = 3;
        abilityList.add(melfsMinuteMeteors);


        Ability nondetection = null;
        nondetection.name = "Nondetection";
        nondetection.actionType = "Action";
        nondetection.description = "For the duration, you hide a target that you touch from divination magic. The target can be a willing creature or a place or an object no larger than 10 feet in any dimension. The target can't be targeted by any divination magic or perceived through magical scrying sensors.";
        nondetection.spellLevel = 3;
        abilityList.add(nondetection);


        Ability plantGrowth = null;
        plantGrowth.name = "Plant Growth";
        plantGrowth.actionType = "Action";
        plantGrowth.description = "This spell channels vitality into plants within a specific area. There are two possible uses for the spell, granting either immediate or long-term benefits.";
        plantGrowth.spellLevel = 3;
        abilityList.add(plantGrowth);

        Ability protectionFromEnergy = null;
        protectionFromEnergy.name = "Protection from Energy";
        protectionFromEnergy.actionType = "Action";
        protectionFromEnergy.description = "For the duration, the willing creature you touch has resistance to one damage type of your choice: acid, cold, fire, lightning, or thunder.";
        protectionFromEnergy.spellLevel = 3;
        abilityList.add(protectionFromEnergy);

        Ability removeCurse = null;
        removeCurse.name = "Remove Curse";
        removeCurse.actionType = "Action";
        removeCurse.description = "At your touch, all curses affecting one creature or object end. If the object is a cursed magic item, its curse remains, but the spell breaks its owner's attunement to the object so it can be removed or discarded.";
        removeCurse.spellLevel = 3;
        abilityList.add(removeCurse);

        Ability revivify = null;
        revivify.name = "Revivify";
        revivify.actionType = "Action";
        revivify.description = "You touch a creature that has died within the last minute. That creature returns to life with 1 hit point. This spell can't return to life a creature that has died of old age, nor can it restore any missing body parts.";
        revivify.spellLevel = 3;
        abilityList.add(revivify);

        Ability sending = null;
        sending.name = "Sending";
        sending.actionType = "Action";
        sending.description = "You send a short message of twenty-five words or less to a creature with which you are familiar. The creature hears the message in its mind, recognizes you as the sender if it knows you, and can answer in a like manner immediately. The spell enables creatures with Intelligence scores of at least 1 to understand the meaning of your message.";
        sending.spellLevel = 3;
        abilityList.add(sending);

        Ability sleetStorm = null;
        sleetStorm.name = "Sleet Storm";
        sleetStorm.actionType = "Action";
        sleetStorm.description = "Until the spell ends, freezing rain and sleet fall in a 20-foot-tall cylinder with a 40-foot radius centered on a point you choose within range. The area is heavily obscured, and exposed flames in the area are doused.";
        sleetStorm.spellLevel = 3;
        abilityList.add(sleetStorm);

        Ability slow = null;
        slow.name = "Slow";
        slow.actionType = "Action";
        slow.description = "You alter time around up to six creatures of your choice in a 40-foot cube within range. Each target must succeed on a Wisdom saving throw or be affected by this spell for the duration.";
        slow.spellLevel = 3;
        abilityList.add(slow);

        Ability speakWithDead = null;
        speakWithDead.name = "Speak with Dead";
        speakWithDead.actionType = "Acton";
        speakWithDead.description = "You grant the semblance of life and intelligence to a corpse of your choice within range, allowing it to answer the questions you pose. The corpse must still have a mouth and can't be undead. The spell fails if the corpse was the target of this spell within the last 10 days.";
        speakWithDead.spellLevel = 3;
        abilityList.add(speakWithDead);

        Ability speakWithPlants = null;
        speakWithPlants.name = "Speak with Plants";
        speakWithPlants.actionType = "Action";
        speakWithPlants.description = "You imbue plants within 30 feet of you with limited sentience and animation, giving them the ability to communicate with you and follow your simple commands. You can question plants about events in the spell's area within the past day, gaining information about creatures that have passed, weather, and other circumstances.";
        speakWithPlants.spellLevel = 3;
        abilityList.add(speakWithPlants);

        Ability spiritGuardians = null;
        spiritGuardians.name = "Spirit Guardians";
        spiritGuardians.actionType = "Action";
        spiritGuardians.description = "You call forth spirits to protect you. They flit around you to a distance of 15 feet for the duration. If you are good or neutral, their spectral form appears angelic or fey (your choice). If you are evil, they appear fiendish.";
        spiritGuardians.spellLevel = 3;
        abilityList.add(spiritGuardians);

        Ability stinkingCloud = null;
        stinkingCloud.name = "Stinking Cloud";
        stinkingCloud.actionType = "Action";
        stinkingCloud.description = "You create a 20-foot-radius sphere of yellow, nauseating gas centered on a point within range. The cloud spreads around corners, and its area is heavily obscured. The cloud lingers in the air for the duration.";
        stinkingCloud.spellLevel = 3;
        abilityList.add(stinkingCloud);

        Ability summonLesserDemons = null;
        summonLesserDemons.name = "Summon Lesser Demons";
        summonLesserDemons.actionType = "Action";
        summonLesserDemons.description = "You utter foul words, summoning demons from the chaos of the Abyss.";
        summonLesserDemons.spellLevel = 3;
        abilityList.add(summonLesserDemons);

        Ability thunderStep = null;
        thunderStep.name = "Thunder Step";
        thunderStep.actionType = "Action";
        thunderclap.description = "You teleport yourself to an unoccupied space you can see within range. Immediately after you disappear, a thunderous boom sounds, and each creature within 10 feet of the space you left must make a Constitution saving throw, taking 3d10 thunder damage on a failed save, or half as much damage on a successful one. The thunder can be heard from up to 300 feet away.";
        thunderclap.spellLevel = 3;
        abilityList.add(thunderStep);

        Ability tidalWave = null;
        tidalWave.name = "Tidal Wave";
        tidalWave.actionType = "Action";
        tidalWave.description = "You conjure up a wave of water that crashes down on an area within range. The area can be up to 30 feet long, up to 10 feet wide, and up to 10 feet tall. Each creature in that area must make a Dexterity saving throw. On a failed save, a creature takes 4d8 bludgeoning damage and is knocked prone. On a successful save, a creature takes half as much damage and isn't knocked prone. The water then spreads out across the ground in all directions, extinguishing unprotected flames in its area and within 30 feet of it, and then it vanishes.";
        tidalWave.spellLevel = 3;
        abilityList.add(tidalWave);

        Ability tongues = null;
        tongues.name = "Tongues";
        tongues.actionType = "Action";
        tongues.description = "This spell grants the creature you touch the ability to understand any spoken language it hears. Moreover, when the target speaks, any creature that knows at least one language and can hear the target understands what it says.";
        tongues.spellLevel = 3;
        abilityList.add(tongues);

        Ability vampiricTouch = null;
        vampiricTouch.name = "Vampiric Touch";
        vampiricTouch.actionType = "Action";
        vampiricTouch.description = "The touch of your shadow-wreathed hand can siphon life force from others to heal your wounds. Make a melee spell attack against a creature within your reach. On a hit, the target takes 3d6 necrotic damage, and you regain hit points equal to half the amount of necrotic damage dealt. Until the spell ends, you can make the attack again on each of your turns as an action.";
        vampiricTouch.spellLevel = 3;
        abilityList.add(vampiricTouch);

        Ability wallOfSand = null;
        wallOfSand.name = "Wall of Sand";
        wallOfSand.actionType = "Action";
        wallOfSand.description = "You create a wall of swirling sand on the ground at a point you can see within range. You can make the wall up to 30 feet long, 10 feet high, and 10 feet thick, and it vanishes when the spell ends. It blocks line of sight but not movement. A creature is blinded while in the wall's space and must spend 3 feet of movement for every 1 foot it moves there.";
        wallOfSand.spellLevel = 3;
        abilityList.add(wallOfSand);

        Ability wallOfWater = null;
        wallOfWater.name = "Wall of Water";
        wallOfWater.actionType = "Action";
        wallOfWater.description = "ou create a wall of water on the ground at a point you can see within range. You can make the wall up to 30 feet long, 10 feet high, and 1 foot thick, or you can make a ringed wall up to 20 feet in diameter, 20 feet high, and 1 foot thick. The wall vanishes when the spell ends. The wall's space is difficult terrain.";
        wallOfWater.spellLevel = 3;
        abilityList.add(wallOfWater);

        Ability waterBreathing = null;
        waterBreathing.name = "Water Breathing";
        waterBreathing.actionType = "Action";
        waterBreathing.description = "This spell grants up to ten willing creatures you can see within range the ability to breathe underwater until the spell ends. Affected creatures also retain their normal mode of respiration.";
        waterBreathing.spellLevel = 3;
        abilityList.add(waterBreathing);

        Ability waterWalk = null;
        waterWalk.name = "Water Walk";
        waterWalk.actionType = "Action";
        waterWalk.description = "This spell grants the ability to move across any liquid surface—such as water, acid, mud, snow, quicksand, or lava—as if it were harmless solid ground (creatures crossing molten lava can still take damage from the heat). Up to ten willing creatures you can see within range gain this ability for the duration.";
        waterWalk.spellLevel = 3;
        abilityList.add(waterWalk);

        Ability windWall = null;
        windWall.name = "Wind Wall";
        windWall.actionType = "Action";
        windWall.description = "A wall of strong wind rises from the ground at a point you choose within range. You can make the wall up to 50 feet long, 15 feet high, and 1 foot thick. You can shape the wall in any way you choose so long as it makes one continuous path along the ground. The wall lasts for the duration.";
        windWall.spellLevel = 3;
        abilityList.add(windWall);


        // Level 4 Spells

        Ability arcaneEye = null;
        arcaneEye.name = "Arcane Eye";
        arcaneEye.actionType = "Action";
        arcaneEye.description = "You create an invisible, magical eye within range that hovers in the air for the duration.";
        arcaneEye.spellLevel = 4;
        abilityList.add(arcaneEye);

        Ability auraOfLife = null;
        auraOfLife.name = "Aura of Life";
        auraOfLife.actionType = "Action";
        auraOfLife.description = "Life-preserving energy radiates from you in an aura with a 30-foot radius. Until the spell ends, the aura moves with you, centered on you. Each nonhostile creature in the aura (including you) has resistance to necrotic damage, and its hit point maximum can't be reduced. In addition, a nonhostile, living creature regains 1 hit point when it starts its turn in the aura with 0 hit points.";
        auraOfLife.spellLevel = 4;
        abilityList.add(auraOfLife);

        Ability auraOfPurity = null;
        auraOfPurity.name = "Aura of Purity";
        auraOfPurity.actionType = "Action";
        auraOfPurity.description = "Purifying energy radiates from you in an aura with a 30-foot radius. Until the spell ends, the aura moves with you, centered on you. Each nonhostile creature in the aura (including you) can't become diseased, has resistance to poison damage, and has advantage on saving throws against effects that cause any of the following conditions: blinded, charmed, deafened, frightened, paralyzed, poisoned, and stunned.";
        auraOfPurity.spellLevel = 4;
        abilityList.add(auraOfPurity);

        Ability banishment = null;
        banishment.name = "Banishment";
        banishment.actionType = "Action";
        banishment.description = "You attempt to send one creature that you can see within range to another plane of existence. The target must succeed on a Charisma saving throw or be banished.";
        banishment.spellLevel = 4;
        abilityList.add(banishment);

        Ability blight = null;
        blight.name = "Blight";
        blight.actionType = "Action";
        blight.description = "Necromantic energy washes over a creature of your choice that you can see within range, draining moisture and vitality from it. The target must make a Constitution saving throw. The target takes 8d8 necrotic damage on a failed save, or half as much damage on a successful one. This spell has no effect on undead or constructs.";
        blight.spellLevel = 4;
        abilityList.add(blight);

        Ability charmMonster = null;
        charmMonster.name = "Charm Monster";
        charmMonster.actionType = "Action";
        charmMonster.description = "You attempt to charm a creature you can see within range. It must make a Wisdom saving throw, and it does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature is friendly to you. When the spell ends, the creature knows it was charmed by you.";
        charmMonster.spellLevel = 4;
        abilityList.add(charmMonster);

        Ability compulsion = null;
        compulsion.name = "Compulsion";
        compulsion.actionType = "Action";
        compulsion.description = "Creatures of your choice that you can see within range and that can hear you must make a Wisdom saving throw. A target automatically succeeds on this saving throw if it can't be charmed. On a failed save, a target is affected by this spell. Until the spell ends, you can use a bonus action on each of your turns to designate a direction that is horizontal to you. Each affected target must use as much of its movement as possible to move in that direction on its next turn. It can take its action before it moves. After moving in this way, it can make another Wisdom saving throw to try to end the effect.";
        compulsion.spellLevel = 4;
        abilityList.add(compulsion);

        Ability confusion = null;
        confusion.name = "Confusion";
        confusion.actionType = "Action";
        confusion.description = "This spell assaults and twists creatures' minds, spawning delusions and provoking uncontrolled action. Each creature in a 10-foot-radius sphere centered on a point you choose within range must succeed on a Wisdom saving throw when you cast this spell or be affected by it.";
        confusion.spellLevel = 4;
        abilityList.add(confusion);

        Ability conjureWoodlandBeings = null;
        conjureWoodlandBeings.name = "Conjure Woodland Beings";
        conjureWoodlandBeings.actionType = "Action";
        conjureWoodlandBeings.description = "You summon fey creatures that appear in unoccupied spaces that you can see within range.";
        conjureWoodlandBeings.spellLevel = 4;
        abilityList.add(conjureWoodlandBeings);

        Ability controlWater = null;
        controlWater.name = "Control Water";
        controlWater.actionType = "Action";
        controlWater.description = "Until the spell ends, you control any freestanding water inside an area you choose that is a cube up to 100 feet on a side.";
        controlWater.spellLevel = 4;
        abilityList.add(controlWater);

        Ability deathWard = null;
        deathWard.name = "Death Ward";
        deathWard.actionType = "Action";
        deathWard.description = "You touch a creature and grant it a measure of protection from death.";
        deathWard.spellLevel = 4;
        abilityList.add(deathWard);

        Ability dimensionDoor = null;
        dimensionDoor.name = "Dimension Door";
        dimensionDoor.actionType = "Action";
        dimensionDoor.description = "You teleport yourself from your current location to any other spot within range. You arrive at exactly the spot desired. It can be a place you can see, one you can visualize, or one you can describe by stating distance and direction.";
        dimensionDoor.spellLevel = 4;
        abilityList.add(dimensionDoor);

        Ability divination = null;
        divination.name = "Divination";
        divination.actionType = "Action";
        divination.description = "Your magic and an offering put you in contact with a god or a god's servants. You ask a single question concerning a specific goal, event, or activity to occur within 7 days. The DM offers a truthful reply. The reply might be a short phrase, a cryptic rhyme, or an omen.";
        divination.spellLevel = 4;
        abilityList.add(divination);

        Ability dominateBeast = null;
        dominateBeast.name = "Dominate Beast";
        dominateBeast.actionType = "Action";
        dominateBeast.description = "You attempt to beguile a beast that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are fighting it, it has advantage on the saving throw.";
        dominateBeast.spellLevel = 4;
        abilityList.add(dominateBeast);

        Ability elementalBane = null;
        elementalBane.name = "Elemental Name";
        elementalBane.actionType = "Action";
        elementalBane.description = "Choose one creature you can see within range, and choose one of the following damage types: acid, cold, fire, lightning, or thunder. The target must succeed on a Constitution saving throw or be affected by the spell for its duration. The first time each turn the affected target takes damage of the chosen type, the target takes an extra 2d6 damage of that type. Moreover, the target loses any resistance to that damage type until the spell ends.";
        elementalBane.spellLevel = 4;
        abilityList.add(elementalBane);

        Ability evardsBlackTentacles = null;
        evardsBlackTentacles.name = "Evard\'s Black Tentacles";
        evardsBlackTentacles.actionType = "Action";
        evardsBlackTentacles.description = "Squirming, ebony tentacles fill a 20-foot square on ground that you can see within range. For the duration, these tentacles turn the ground in the area into difficult terrain.";
        evardsBlackTentacles.spellLevel = 4;
        abilityList.add(evardsBlackTentacles);

        Ability fireShield = null;
        fireShield.name = "Fire Shield";
        fireShield.actionType = "Action";
        fireShield.description = "Thin and wispy flames wreathe your body for the duration, shedding bright light in a 10-foot radius and dim light for an additional 10 feet. You can end the spell early by using an action to dismiss it.";
        fireShield.spellLevel = 4;
        abilityList.add(fireShield);

        Ability freedomOfMovement = null;
        freedomOfMovement.name = "Freedom of Movement";
        freedomOfMovement.actionType = "Action";
        freedomOfMovement.description = "You touch a willing creature. For the duration, the target's movement is unaffected by difficult terrain, and spells and other magical effects can neither reduce the target's speed nor cause the target to be paralyzed or restrained.";
        freedomOfMovement.spellLevel = 4;
        abilityList.add(freedomOfMovement);

        Ability giantInsect = null;
        giantInsect.name = "Giant Insect";
        giantInsect.actionType = "Action";
        giantInsect.description = "You transform up to ten centipedes, three spiders, five wasps, or one scorpion within range into giant versions of their natural forms for the duration. A centipede becomes a giant centipede, a spider becomes a giant spider, a wasp becomes a giant wasp, and a scorpion becomes a giant scorpion.";
        giantInsect.spellLevel = 4;
        abilityList.add(giantInsect);

        Ability graspingVine = null;
        graspingVine.name = "Grasping Vine";
        graspingVine.actionType = "Bonus";
        graspingVine.description = "You conjure a vine that sprouts from the ground in an unoccupied space of your choice that you can see within range. When you cast this spell, you can direct the vine to lash out at a creature within 30 feet of it that you can see. That creature must succeed on a Dexterity saving throw or be pulled 20 feet directly toward the vine.";
        graspingVine.spellLevel = 4;
        abilityList.add(graspingVine);

        Ability greaterInvisibility = null;
        greaterInvisibility.name = "Greater Invisibility";
        greaterInvisibility.actionType = "Action";
        greaterInvisibility.description = "You or a creature you touch becomes invisible until the spell ends. Anything the target is wearing or carrying is invisible as long as it is on the target's person.";
        greaterInvisibility.spellLevel = 4;
        abilityList.add(greaterInvisibility);

        Ability guardianOfFaith = null;
        guardianOfFaith.name = "Guardian of Faith";
        guardianOfFaith.actionType = "Action";
        guardianOfFaith.description = "A Large spectral guardian appears and hovers for the duration in an unoccupied space of your choice that you can see within range. The guardian occupies that space and is indistinct except for a gleaming sword and shield emblazoned with the symbol of your deity.";
        guardianOfFaith.spellLevel = 4;
        abilityList.add(guardianOfFaith);

        Ability guardianOfNature = null;
        guardianOfNature.name = "Guardian of Nature";
        guardianOfNature.actionType = "Bonus";
        guardianOfNature.description = "A nature spirit answers your call and transforms you into a powerful guardian. The transformation lasts until the spell ends";
        guardianOfNature.spellLevel = 4;
        abilityList.add(guardianOfNature);

        Ability iceStorm = null;
        iceStorm.name = "Ice Storm";
        iceStorm.actionType = "Action";
        iceStorm.description = "A hail of rock-hard ice pounds to the ground in a 20-foot-radius, 40-foot-high cylinder centered on a point within range. Each creature in the cylinder must make a Dexterity saving throw. A creature takes 2d8 bludgeoning damage and 4d6 cold damage on a failed save, or half as much damage on a successful one.";
        iceStorm.spellLevel = 4;
        abilityList.add(iceStorm);

        Ability leomundsSecretChest = null;
        leomundsSecretChest.name = "Leomund\'s Secret Chest";
        leomundsSecretChest.actionType = "Action";
        leomundsSecretChest.description = "You hide a chest, and all its contents, on the Ethereal Plane. You must touch the chest and the miniature replica that serves as a material component for the spell. The chest can contain up to 12 cubic feet of nonliving material (3 feet by 2 feet by 2 feet).";
        leomundsSecretChest.spellLevel = 4;
        abilityList.add(leomundsSecretChest);

        Ability locateCreature = null;
        locateCreature.name = "Locate Creature";
        locateCreature.actionType = "Action";
        locateCreature.description = "Describe or name a creature that is familiar to you. You sense the direction to the creature's location, as long as that creature is within 1,000 feet of you. If the creature is moving, you know the direction of its movement.";
        locateCreature.spellLevel = 4;
        abilityList.add(locateCreature);

        Ability mordenkainensFaithfulHound = null;
        mordenkainensFaithfulHound.name = "Mordenkainen\'s Faithful Hound";
        mordenkainensFaithfulHound.actionType = "Action";
        mordenkainensFaithfulHound.description = "You conjure a phantom watchdog in an unoccupied space that you can see within range, where it remains for the duration, until you dismiss it as an action, or until you move more than 100 feet away from it.";
        mordenkainensFaithfulHound.spellLevel = 4;
        abilityList.add(mordenkainensFaithfulHound);

        Ability otilukesResilientSphere = null;
        otilukesResilientSphere.name = "Otiluke\'s Resilient Sphere";
        otilukesResilientSphere.actionType = "Action";
        otilukesResilientSphere.description = "A sphere of shimmering force encloses a creature or object of Large size or smaller within range. An unwilling creature must make a Dexterity saving throw. On a failed save, the creature is enclosed for the duration.";
        otilukesResilientSphere.spellLevel = 4;
        abilityList.add(otilukesResilientSphere);

        Ability phantasmalKiller = null;
        phantasmalKiller.name = "Phantasmal Killer";
        phantasmalKiller.actionType = "Action";
        phantasmalKiller.description = "You tap into the nightmares of a creature you can see within range and create an illusory manifestation of its deepest fears, visible only to that creature. The target must make a Wisdom saving throw. On a failed save, the target becomes frightened for the duration. At the end of each of the target's turns before the spell ends, the target must succeed on a Wisdom saving throw or take 4d10 psychic damage. On a successful save, the spell ends.";
        phantasmalKiller.spellLevel = 4;
        abilityList.add(phantasmalKiller);

        Ability polymorph = null;
        polymorph.name = "Polymorph";
        polymorph.actionType = "Action";
        polymorph.description = "This spell transforms a creature that you can see within range into a new form. An unwilling creature must make a Wisdom saving throw to avoid the effect. The spell has no effect on a shapechanger or a creature with 0 hit points.";
        polymorph.spellLevel = 4;
        abilityList.add(polymorph);

        Ability shadowOfMoil = null;
        shadowOfMoil.name = "Shadow of Moil";
        shadowOfMoil.actionType = "Action";
        shadowOfMoil.description = "Flame-like shadows wreathe your body until the spell ends, causing you to become heavily obscured to others. The shadows turn dim light within 10 feet of you into darkness, and bright light in the same area to dim light.";
        shadowOfMoil.spellLevel = 4;
        abilityList.add(shadowOfMoil);

        Ability sickeningRadiance = null;
        sickeningRadiance.name = "Sickening Radiance";
        sickeningRadiance.actionType = "Action";
        sickeningRadiance.description = "Dim, greenish light spreads within a 30-foot-radius sphere centered on a point you choose within range. The light spreads around corners, and it lasts until the spell ends.";
        sickeningRadiance.spellLevel = 4;
        abilityList.add(sickeningRadiance);

        Ability staggeringSmite = null;
        staggeringSmite.name = "Staggering Smite";
        staggeringSmite.actionType = "Bonus";
        staggeringSmite.description = "The next time you hit a creature with a melee weapon attack during this spell's duration, your weapon pierces both body and mind, and the attack deals an extra 4d6 psychic damage to the target. The target must make a Wisdom saving throw. On a failed save, it has disadvantage on attack rolls and ability checks, and can't take reactions, until the end of its next turn.";
        staggeringSmite.spellLevel = 4;
        abilityList.add(staggeringSmite);

        Ability stoneShape = null;
        stoneShape.name = "Stone Shape";
        stoneShape.actionType = "Action";
        stoneShape.description = "You touch a stone object of Medium size or smaller or a section of stone no more than 5 feet in any dimension and form it into any shape that suits your purpose. So, for example, you could shape a large rock into a weapon, idol, or coffer, or make a small passage through a wall, as long as the wall is less than 5 feet thick. You could also shape a stone door or its frame to seal the door shut. The object you create can have up to two hinges and a latch, but finer mechanical detail isn't possible.";
        stoneShape.spellLevel = 4;
        abilityList.add(stoneShape);

        Ability stoneskin = null;
        stoneskin.name = "Stoneskin";
        stoneskin.actionType = "Action";
        stoneskin.description = "This spell turns the flesh of a willing creature you touch as hard as stone. Until the spell ends, the target has resistance to nonmagical bludgeoning, piercing, and slashing damage.";
        stoneskin.spellLevel = 4;
        abilityList.add(stoneskin);

        Ability stormSphere = null;
        stormSphere.name = "Storm Sphere";
        stormSphere.actionType = "Action";
        stormSphere.description = "A 20-foot-radius sphere of whirling air springs into existence, centered on a point you choose within range. The sphere remains for the spell's duration. Each creature in the sphere when it appears or that ends its turn there must succeed on a Strength saving throw or take 2d6 bludgeoning damage. The sphere's space is difficult terrain.";
        stormSphere.spellLevel = 4;
        abilityList.add(stormSphere);

        Ability summonGreaterDemon = null;
        summonGreaterDemon.name = "Summon Greater Demons";
        summonGreaterDemon.actionType = "Action";
        summonGreaterDemon.description = "You utter foul words, summoning one demon from the chaos of the Abyss. You choose the demon's type, which must be one of challenge rating 5 or lower, such as a shadow demon or a barlgura. The demon appears in an unoccupied space you can see within range, and the demon disappears when it drops to 0 hit points or when the spell ends.";
        summonGreaterDemon.spellLevel = 4;
        abilityList.add(summonGreaterDemon);

        Ability vitriolicSphere = null;
        vitriolicSphere.name = "Vitriolic Sphere";
        vitriolicSphere.actionType = "Action";
        vitriolicSphere.description = "You point at a location within range, and a glowing 1-foot-diameter ball of emerald acid streaks there and explodes in a 20-foot-radius sphere. Each creature in that area must make a Dexterity saving throw. On a failed save, a creature takes 10d4 acid damage and another 5d4 acid damage at the end of its next turn. On a successful save, a creature takes half the initial damage and no damage at the end of its next turn.";
        vitriolicSphere.spellLevel = 4;
        abilityList.add(vitriolicSphere);

        Ability wallOfFire = null;
        wallOfFire.name = "Wall of Fire";
        wallOfFire.actionType = "Action";
        wallOfFire.description = "You create a wall of fire on a solid surface within range. You can make the wall up to 60 feet long, 20 feet high, and 1 foot thick, or a ringed wall up to 20 feet in diameter, 20 feet high, and 1 foot thick. The wall is opaque and lasts for the duration.";
        wallOfFire.spellLevel = 4;
        abilityList.add(wallOfFire);

        Ability waterySphere = null;
        waterySphere.name = "Watery Sphere";
        waterySphere.actionType = "Action";
        waterySphere.description = "You conjure up a sphere of water with a 5-foot radius at a point you can see within range. The sphere can hover but no more than 10 feet off the ground. The sphere remains for the spell's duration.";
        waterySphere.spellLevel = 4;
        abilityList.add(waterySphere);


        // Level 5 Spells



        Ability animateObjects = null;
        animateObjects.name = "Animate Objects";
        animateObjects.actionType = "Action";
        animateObjects.description = "Objects come to life at your command. Choose up to ten nonmagical objects within range that are not being worn or carried. Medium targets count as two objects, Large targets count as four objects, Huge targets count as eight objects. You can't animate any object larger than Huge. Each target animates and becomes a creature under your control until the spell ends or until reduced to 0 hit points.";
        animateObjects.spellLevel = 5;
        abilityList.add(animateObjects);

        Ability antilifeShells = null;
        antilifeShells.name = "Antilife Shells";
        antilifeShells.actionType = "Action";
        antilifeShells.description = "A shimmering barrier extends out from you in a 10-foot radius and moves with you, remaining centered on you and hedging out creatures other than undead and constructs. The barrier lasts for the duration.";
        antilifeShells.spellLevel = 5;
        abilityList.add(antilifeShells);

        Ability banishingSmite = null;
        banishingSmite.name = "Banishing Smite";
        banishingSmite.actionType = "Bonus";
        banishingSmite.description = "The next time you hit a creature with a weapon attack before this spell ends, your weapon crackles with force, and the attack deals an extra 5d10 force damage to the target. Additionally, if this attack reduces the target to 50 hit points or fewer, you banish it. If the target is native to a different plane of existence than the one you're on, the target disappears, returning to its home plane. If the target is native to the plane you're on, the creature vanishes into a harmless demiplane. While there, the target is incapacitated. It remains there until the spell ends, at which point the target reappears in the space it left or in the nearest unoccupied space if that space is occupied.";
        banishingSmite.spellLevel = 5;
        abilityList.add(banishingSmite);

        Ability bigbysHand = null;
        bigbysHand.name = "Bigby\'s Hand";
        bigbysHand.actionType = "Action";
        bigbysHand.description = "You create a Large hand of shimmering, translucent force in an unoccupied space that you can see within range. The hand lasts for the spell's duration, and it moves at your command, mimicking the movements of your own hand.";
        bigbysHand.spellLevel = 5;
        abilityList.add(bigbysHand);

        Ability circleOfPower = null;
        circleOfPower.name = "Circle of Power";
        circleOfPower.actionType = "Action";
        circleOfPower.description = "Divine energy radiates from you, distorting and diffusing magical energy within 30 feet of you. Until the spell ends, the sphere moves with you, centered on you. For the duration, each friendly creature in the area (including you) has advantage on saving throws against spells and other magical effects. Additionally, when an affected creature succeeds on a saving throw made against a spell or magical effect that allows it to make a saving throw to take only half damage, it instead takes no damage if it succeeds on the saving throw.";
        circleOfPower.spellLevel = 5;
        abilityList.add(circleOfPower);

        Ability cloudkill = null;
        cloudkill.name = "Cloudkill";
        cloudkill.actionType = "Action";
        cloudkill.description = "V";
        cloudkill.spellLevel = 5;
        abilityList.add(cloudkill);

        Ability coneOfCold = null;
        coneOfCold.name = "Cone of Cold";
        coneOfCold.actionType = "Action";
        coneOfCold.description = "A blast of cold air erupts from your hands. Each creature in a 60-foot cone must make a Constitution saving throw. A creature takes 8d8 cold damage on a failed save, or half as much damage on a successful one.";
        coneOfCold.spellLevel = 5;
        abilityList.add(coneOfCold);

        Ability conjureVolley = null;
        conjureVolley.name = "Conjure Volley";
        conjureVolley.actionType = "Action";
        conjureVolley.description = "You fire a piece of nonmagical ammunition from a ranged weapon or throw a nonmagical weapon into the air and choose a point within range. Hundreds of duplicates of the ammunition or weapon fall in a volley from above and then disappear. Each creature in a 40-foot-radius, 20-foot-high cylinder centered on that point must make a Dexterity saving throw. A creature takes 8d8 damage on a failed save, or half as much damage on a successful one. The damage type is the same as that of the ammunition or weapon.";
        conjureVolley.spellLevel = 5;
        abilityList.add(conjureVolley);

        Ability contagion = null;
        contagion.name = "Contagion";
        contagion.actionType = "Action";
        contagion.description = "Your touch inflicts disease. Make a melee spell attack against a creature within your reach. On a hit, the target is poisoned.";
        contagion.spellLevel = 5;
        abilityList.add(contagion);

        Ability controlWinds = null;
        controlWinds.name = "Control Winds";
        controlWinds.actionType = "Action";
        controlWinds.description = "You take control of the air in a 100-foot cube that you can see within range.";
        controlWinds.spellLevel = 5;
        abilityList.add(controlWinds);

        Ability danseMacabre = null;
        danseMacabre.name = "Danse Macabre";
        danseMacabre.description = "Threads of dark power leap from your fingers to pierce up to five Small or Medium corpses you can see within range. Each corpse immediately stands up and becomes undead. You decide whether it is a zombie or a skeleton (the statistics for zombies and skeletons are in the Monster Manual), and it gains a bonus to its attack and damage rolls equal to your spellcasting ability modifier.";
        danseMacabre.actionType = "Action";
        danseMacabre.spellLevel = 5;
        abilityList.add(danseMacabre);

        Ability dawn = null;
        dawn.name = "Dawn";
        dawn.actionType = "Action";
        dawn.description = "The light of dawn shines down on a location you specify within range. Until the spell ends, a 30-foot-radius, 40-foot-high cylinder of bright light glimmers there. This light is sunlight.";
        dawn.spellLevel = 5;
        abilityList.add(dawn);

        Ability destructiveWave = null;
        destructiveWave.name = "Destructive Wave";
        destructiveWave.actionType = "Action";
        destructiveWave.description = "You strike the ground, creating a burst of divine energy that ripples outward from you. Each creature you choose within 30 feet of you must succeed on a Constitution saving throw or take 5d6 thunder damage, as well as 5d6 radiant or necrotic damage (your choice), and be knocked prone. A creature that succeeds on its saving throw takes half as much damage and isn't knocked prone.";
        destructiveWave.spellLevel = 5;
        abilityList.add(destructiveWave);

        Ability dispelEvilGood = null;
        dispelEvilGood.name = "Dispel Evil and Good";
        dispelEvilGood.actionType = "Action";
        dispelEvilGood.description = "Shimmering energy surrounds and protects you from fey, undead, and creatures originating from beyond the Material Plane. For the duration, celestials, elementals, fey, fiends, and undead have disadvantage on attack rolls against you.";
        dispelEvilGood.spellLevel = 5;
        abilityList.add(dispelEvilGood);

        Ability dominatePerson = null;
        dominatePerson.name = "Dominate Person";
        dominatePerson.actionType = "Action";
        dominatePerson.description = "You attempt to beguile a humanoid that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are fighting it, it has advantage on the saving throw.";
        dominatePerson.spellLevel = 5;
        abilityList.add(dominatePerson);

        Ability enervation = null;
        enervation.name = "Enervation";
        enervation.actionType = "Action";
        enervation.description = "A tendril of inky darkness reaches out from you, touching a creature you can see within range to drain life from it. The target must make a Dexterity saving throw. On a successful save, the target takes 2d8 necrotic damage, and the spell ends. On a failed save, the target takes 4d8 necrotic damage, and until the spell ends, you can use your action on each of your turns to automatically deal 4d8 necrotic damage to the target. The spell ends if you use your action to do anything else, if the target is ever outside the spell's range, or if the target has total cover from you.";
        enervation.spellLevel = 5;
        abilityList.add(enervation);

        Ability farStep = null;
        farStep.name = "Far Step";
        farStep.actionType = "Bonus";
        farStep.description = "You teleport up to 60 feet to an unoccupied space you can see. On each of your turns before the spell ends, you can use a bonus action to teleport in this way again.";
        farStep.spellLevel = 5;
        abilityList.add(farStep);

        Ability flameStrike = null;
        flameStrike.name = "Flame Strike";
        flameStrike.actionType = "Action";
        flameStrike.description = "A vertical column of divine fire roars down from the heavens in a location you specify. Each creature in a 10-foot-radius, 40-foot-high cylinder centered on a point within range must make a Dexterity saving throw. A creature takes 4d6 fire damage and 4d6 radiant damage on a failed save, or half as much damage on a successful one.";
        flameStrike.spellLevel = 5;
        abilityList.add(flameStrike);

        Ability greaterRestoration = null;
        greaterRestoration.name = "Greater Restoration";
        greaterRestoration.actionType = "Action";
        greaterRestoration.description = "You imbue a creature you touch with positive energy to undo a debilitating effect.";
        greaterRestoration.spellLevel = 5;
        abilityList.add(greaterRestoration);

        Ability holdMonster = null;
        holdMonster.name = "Hold Monster";
        holdMonster.actionType = "Action";
        holdMonster.description = "Choose a creature that you can see within range. The target must succeed on a Wisdom saving throw or be paralyzed for the duration. This spell has no effect on undead. At the end of each of its turns, the target can make another Wisdom saving throw. On a success, the spell ends on the target.";
        holdMonster.spellLevel = 5;
        abilityList.add(holdMonster);

        Ability holyWeapon = null;
        holyWeapon.name = "Holy Weapon";
        holyWeapon.actionType = "Bonus";
        holyWeapon.description = "You imbue a weapon you touch with holy power. Until the spell ends, the weapon emits bright light in a 30-foot radius and dim light for an additional 30 feet. In addition, weapon attacks made with it deal an extra 2d8 radiant damage on a hit. If the weapon isn't already a magic weapon, it becomes one for the duration.";
        holyWeapon.spellLevel = 5;
        abilityList.add(holyWeapon);

        Ability immolation = null;
        immolation.name = "Immolation";
        immolation.actionType = "Action";
        immolation.description = "Flames wreathe one creature you can see within range. The target must make a Dexterity saving throw. It takes 8d6 fire damage on a failed save, or half as much damage on a successful one. On a failed save, the target also burns for the spell's duration. The burning target sheds bright light in a 30-foot radius and dim light for an additional 30 feet. At the end of each of its turns, the target repeats the saving throw. It takes 4d6 fire damage on a failed save, and the spell ends on a successful one. These magical flames can't be extinguished by nonmagical means.";
        immolation.spellLevel = 5;
        abilityList.add(immolation);

        Ability insectPlague = null;
        insectPlague.name = "Insect Plague";
        insectPlague.actionType = "Action";
        insectPlague.description = "Swarming, biting locusts fill a 20-foot-radius sphere centered on a point you choose within range. The sphere spreads around corners. The sphere remains for the duration, and its area is lightly obscured. The sphere's area is difficult terrain.";
        insectPlague.spellLevel = 5;
        abilityList.add(insectPlague);

        Ability maelstrom = null;
        maelstrom.name = "Maelstrom";
        maelstrom.actionType = "Action";
        maelstrom.description = "A swirling mass of 5-foot-deep water appears in a 30-foot radius centered on a point you can see within range. The point must be on the ground or in a body of water. Until the spell ends, that area is difficult terrain, and any creature that starts its turn there must succeed on a Strength saving throw or take 6d6 bludgeoning damage and be pulled 10 feet toward the center.";
        maelstrom.spellLevel = 5;
        abilityList.add(maelstrom);

        Ability massCureWounds = null;
        massCureWounds.name = "Mass Cure Wounds";
        massCureWounds.actionType = "Action";
        massCureWounds.description = "A wave of healing energy washes out from a point of your choice within range. Choose up to six creatures in a 30-foot-radius sphere centered on that point. Each target regains hit points equal to 3d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.";
        massCureWounds.spellLevel = 5;
        abilityList.add(massCureWounds);

        Ability mislead = null;
        mislead.name = "Mislead";
        mislead.actionType = "Action";
        mislead.description = "You become invisible at the same time that an illusory double of you appears where you are standing. The double lasts for the duration, but the invisibility ends if you attack or cast a spell.";
        mislead.spellLevel = 5;
        abilityList.add(mislead);

        Ability modifyMemory = null;
        modifyMemory.name = "Modify Memory";
        modifyMemory.actionType = "Action";
        modifyMemory.description = "You attempt to reshape another creature's memories. One creature that you can see must make a Wisdom saving throw. If you are fighting the creature, it has advantage on the saving throw. On a failed save, the target becomes charmed by you for the duration. The charmed target is incapacitated and unaware of its surroundings, though it can still hear you. If it takes any damage or is targeted by another spell, this spell ends, and none of the target's memories are modified.";
        modifyMemory.spellLevel = 5;
        abilityList.add(modifyMemory);

        Ability negativeEnergyFlood = null;
        negativeEnergyFlood.name = "Negative Energy Flood";
        negativeEnergyFlood.actionType = "Action";
        negativeEnergyFlood.description = "You send ribbons of negative energy at one creature you can see within range. Unless the target is undead, it must make a Constitution saving throw, taking 5d12 necrotic damage on a failed save, or half as much damage on a successful one. A target killed by this damage rises up as a zombie at the start of your next turn. The zombie pursues whatever creature it can see that is closest to it. Statistics for the zombie are in the Monster Manual.";
        negativeEnergyFlood.spellLevel = 5;
        abilityList.add(negativeEnergyFlood);

        Ability passwall = null;
        passwall.name = "Passwall";
        passwall.actionType = "Action";
        passwall.description = "A passage appears at a point of your choice that you can see on a wooden, plaster, or stone surface (such as a wall, a ceiling, or a floor) within range, and lasts for the duration. You choose the opening's dimensions: up to 5 feet wide, 8 feet tall, and 20 feet deep. The passage creates no instability in a structure surrounding it.";
        passwall.spellLevel = 5;
        abilityList.add(passwall);

        Ability rarysTelepathicBond = null;
        rarysTelepathicBond.name = "Rary\'s Telepathic Bond";
        rarysTelepathicBond.actionType = "Action";
        rarysTelepathicBond.description = "You forge a telepathic link among up to eight willing creatures of your choice within range, psychically linking each creature to all the others for the duration. Creatures with Intelligence scores of 2 or less aren't affected by this spell.";
        rarysTelepathicBond.spellLevel = 5;
        abilityList.add(rarysTelepathicBond);

        Ability seeming = null;
        seeming.name = "Seeming";
        seeming.actionType = "Action";
        seeming.description = "This spell allows you to change the appearance of any number of creatures that you can see within range. You give each target you choose a new, illusory appearance. An unwilling target can make a Charisma saving throw, and if it succeeds, it is unaffected by this spell.";
        seeming.spellLevel = 5;
        abilityList.add(seeming);

        Ability skillEmpowerment = null;
        skillEmpowerment.name = "Skill Empowerment";
        skillEmpowerment.actionType = "Action";
        skillEmpowerment.description = "Your magic deepens a creature's understanding of its own talent. You touch one willing creature and give it expertise in one skill of your choice; until the spell ends, the creature doubles its proficiency bonus for ability checks it makes that use the chosen skill.";
        skillEmpowerment.spellLevel = 5;
        abilityList.add(skillEmpowerment);

        Ability steelWindStrike = null;
        steelWindStrike.name = "Steel Wind Strike";
        steelWindStrike.actionType = "Action";
        steelWindStrike.description = "You flourish the weapon used in the casting and then vanish to strike like the wind. Choose up to five creatures you can see within range. Make a melee spell attack against each target. On a hit, a target takes 6d10 force damage.";
        steelWindStrike.spellLevel = 5;
        abilityList.add(steelWindStrike);

        Ability swiftQuiver = null;
        swiftQuiver.name = "Swift Quiver";
        swiftQuiver.actionType = "Bonus";
        swiftQuiver.description = "You transmute your quiver so it produces an endless supply of nonmagical ammunition, which seems to leap into your hand when you reach for it.";
        swiftQuiver.spellLevel = 5;
        abilityList.add(swiftQuiver);

        Ability synapticStatic = null;
        synapticStatic.name = "Synaptic Static";
        synapticStatic.actionType = "Action";
        synapticStatic.description = "You choose a point within range and cause psychic energy to explode there. Each creature in a 20-foot-radius sphere centered on that point must make an Intelligence saving throw. A creature with an Intelligence score of 2 or lower can't be affected by this spell. A target takes 8d6 psychic damage on a failed save, or half as much damage on a successful one.";
        synapticStatic.spellLevel = 5;
        abilityList.add(synapticStatic);

        Ability telekinesis = null;
        telekinesis.name = "Telekinesis";
        telekinesis.actionType = "Action";
        telekinesis.description = "You gain the ability to move or manipulate creatures or objects by thought. When you cast the spell, and as your action each round for the duration, you can exert your will on one creature or object that you can see within range, causing the appropriate effect below. You can affect the same target round after round, or choose a new one at any time. If you switch targets, the prior target is no longer affected by the spell.";
        telekinesis.spellLevel = 5;
        abilityList.add(telekinesis);

        Ability transmuteRock = null;
        transmuteRock.name = "Transmute Rock";
        transmuteRock.actionType = "Action";
        transmuteRock.description = "Transmute Rock to Mud or Transmute Mud to Rock";
        transmuteRock.spellLevel = 5;
        abilityList.add(transmuteRock);

        Ability treeStride = null;
        treeStride.name = "Tree Stride";
        treeStride.actionType = "Action";
        treeStride.description = "You gain the ability to enter a tree and move from inside it to inside another tree of the same kind within 500 feet. Both trees must be living and at least the same size as you. You must use 5 feet of movement to enter a tree. You instantly know the location of all other trees of the same kind within 500 feet and, as part of the move used to enter the tree, can either pass into one of those trees or step out of the tree you're in. You appear in a spot of your choice within 5 feet of the destination tree, using another 5 feet of movement. If you have no movement left, you appear within 5 feet of the tree you entered.";
        treeStride.spellLevel = 5;
        abilityList.add(treeStride);

        Ability wallOfForce = null;
        wallOfForce.name = "Wall of Force";
        wallOfForce.actionType = "Action";
        wallOfForce.description = "An invisible wall of force springs into existence at a point you choose within range. The wall appears in any orientation you choose, as a horizontal or vertical barrier or at an angle. It can be free floating or resting on a solid surface. You can form it into a hemispherical dome or a sphere with a radius of up to 10 feet, or you can shape a flat surface made up of ten 10-foot-by-10-foot panels. Each panel must be contiguous with another panel. In any form, the wall is 1/4 inch thick. It lasts for the duration. If the wall cuts through a creature's space when it appears, the creature is pushed to one side of the wall (your choice which side).";
        wallOfForce.spellLevel = 5;
        abilityList.add(wallOfForce);

        Ability wallOfLight = null;
        wallOfLight.name = "Wall of Light";
        wallOfLight.actionType = "Action";
        wallOfLight.description = "A shimmering wall of bright light appears at a point you choose within range. The wall appears in any orientation you choose: horizontally, vertically, or diagonally. It can be free floating, or it can rest on a solid surface. The wall can be up to 60 feet long, 10 feet high, and 5 feet thick. The wall blocks line of sight, but creatures and objects can pass through it. It emits bright light out to 120 feet and dim light for an additional 120 feet.";
        wallOfLight.spellLevel = 5;
        abilityList.add(wallOfLight);

        Ability wallOfStone = null;
        wallOfStone.name = "Wall of Stone";
        wallOfStone.actionType = "Action";
        wallOfStone.description = "A nonmagical wall of solid stone springs into existence at a point you choose within range. The wall is 6 inches thick and is composed of ten 10-foot-by-10-foot panels. Each panel must be contiguous with at least one other panel. Alternatively, you can create 10-foot-by-20-foot panels that are only 3 inches thick.";
        wallOfStone.spellLevel = 5;
        abilityList.add(wallOfStone);

        Ability wallOfNature = null;
        wallOfNature.name = "Wall of Nature";
        wallOfNature.actionType = "Action";
        wallOfNature.description = "You call out to the spirits of nature to rouse them against your enemies. Choose a point you can see within range. The spirits cause trees, rocks, and grasses in a 60-foot cube centered on that point to become animated until the spell ends.";
        wallOfNature.spellLevel = 5;
        abilityList.add(wallOfNature);



        // Level 6 Spells

        Ability arcaneGate = null;
        arcaneGate.name = "Arcane Gate";
        arcaneGate.actionType = "Action";
        arcaneGate.description = "You create linked teleportation portals that remain open for the duration. Choose two points on the ground that you can see, one point within 10 feet of you and one point within 500 feet of you. A circular portal, 10 feet in diameter, opens over each point. If the portal would open in the space occupied by a creature, the spell fails, and the casting is lost.";
        arcaneGate.spellLevel = 6;
        abilityList.add(arcaneGate);

        Ability bladeBarrier = null;
        bladeBarrier.name = "Blade Barrier";
        bladeBarrier.actionType = "Action";
        bladeBarrier.description = "You create a vertical wall of whirling, razor-sharp blades made of magical energy. The wall appears within range and lasts for the duration. You can make a straight wall up to 100 feet long, 20 feet high, and 5 feet thick, or a ringed wall up to 60 feet in diameter, 20 feet high, and 5 feet thick. The wall provides three-quarters cover to creatures behind it, and its space is difficult terrain.";
        bladeBarrier.spellLevel = 6;
        abilityList.add(bladeBarrier);

        Ability bonesOfEarth = null;
        bonesOfEarth.name = "Bones of the Earth";
        bonesOfEarth.actionType = "Action";
        bonesOfEarth.description = "You cause up to six pillars of stone to burst from places on the ground that you can see within range. Each pillar is a cylinder that has a diameter of 5 feet and a height of up to 30 feet. The ground where a pillar appears must be wide enough for its diameter, and you can target the ground under a creature if that creature is Medium or smaller. Each pillar has AC 5 and 30 hit points. When reduced to 0 hit points, a pillar crumbles into rubble, which creates an area of difficult terrain with a 10-foot radius that lasts until the rubble is cleared. Each 5-foot-diameter portion of the area requires at least 1 minute to clear by hand.";
        bonesOfEarth.spellLevel = 6;
        abilityList.add(bonesOfEarth);

        Ability chainLightning = null;
        chainLightning.name = "Chain Lightning";
        chainLightning.actionType = "Action";
        chainLightning.description = "You create a bolt of lightning that arcs toward a target of your choice that you can see within range. Three bolts then leap from that target to as many as three other targets, each of which must be within 30 feet of the first target. A target can be a creature or an object and can be targeted by only one of the bolts.";
        chainLightning.spellLevel = 6;
        abilityList.add(chainLightning);

        Ability circleOfDeath = null;
        circleOfDeath.name = "Circle of Death";
        circleOfDeath.actionType = "Action";
        circleOfDeath.description = "A sphere of negative energy ripples out in a 60-foot-radius sphere from a point within range. Each creature in that area must make a Constitution saving throw. A target takes 8d6 necrotic damage on a failed save, or half as much damage on a successful one.";
        circleOfDeath.spellLevel = 6;
        abilityList.add(circleOfDeath);

        Ability disintegrate = null;
        disintegrate.name = "Disintegrate";
        disintegrate.actionType  = "Action";
        disintegrate.description = "A thin green ray springs from your pointing finger to a target that you can see within range. The target can be a creature, an object, or a creation of magical force, such as the wall created by wall of force.";
        disintegrate.spellLevel = 6;
        abilityList.add(disintegrate);

        Ability eyebite = null;
        eyebite.name = "Eyebite";
        eyebite.actionType = "Action";
        eyebite.description = "For the spell's duration, your eyes become an inky void imbued with dread power. One creature of your choice within 60 feet of you that you can see must succeed on a Wisdom saving throw or be affected by one of the following effects of your choice for the duration. On each of your turns until the spell ends, you can use your action to target another creature but can't target a creature again if it has succeeded on a saving throw against this casting of eyebite.";
        eyebite.spellLevel = 6;
        abilityList.add(eyebite);

        Ability fleshToStone = null;
        fleshToStone.name = "Flesh to Stone";
        fleshToStone.actionType = "Action";
        fleshToStone.description = "You attempt to turn one creature that you can see within range into stone. If the target's body is made of flesh, the creature must make a Constitution saving throw. On a failed save, it is restrained as its flesh begins to harden. On a successful save, the creature isn't affected.";
        fleshToStone.spellLevel = 6;
        abilityList.add(fleshToStone);

        Ability globeOfInvulnerability = null;
        globeOfInvulnerability.name = "Globe of Invulnerability";
        globeOfInvulnerability.actionType = "Action";
        globeOfInvulnerability.description = "An immobile, faintly shimmering barrier springs into existence in a 10-foot radius around you and remains for the duration.";
        globeOfInvulnerability.spellLevel = 6;
        abilityList.add(globeOfInvulnerability);

        Ability harm = null;
        harm.name = "Harm";
        harm.actionType = "Action";
        harm.description = "You unleash a virulent disease on a creature that you can see within range. The target must make a Constitution saving throw. On a failed save, it takes 14d6 necrotic damage, or half as much damage on a successful save. The damage can't reduce the target's hit points below 1. If the target fails the saving throw, its hit point maximum is reduced for 1 hour by an amount equal to the necrotic damage it took. Any effect that removes a disease allows a creature's hit point maximum to return to normal before that time passes.";
        harm.spellLevel = 6;
        abilityList.add(harm);

        Ability heal = null;
        heal.name = "Heal";
        heal.actionType = "Action";
        heal.description = "Choose a creature that you can see within range. A surge of positive energy washes through the creature, causing it to regain 70 hit points. This spell also ends blindness, deafness, and any diseases affecting the target. This spell has no effect on constructs or undead.";
        heal.spellLevel = 6;
        abilityList.add(heal);

        Ability investitureOfFlame = null;
        investitureOfFlame.name = "Investiture of Flame";
        investitureOfFlame.actionType = "Action";
        investitureOfFlame.description = "Flames race across your body, shedding bright light in a 30-foot radius and dim light for an additional 30 feet for the spell's duration. The flames don't harm you.";
        investitureOfFlame.spellLevel = 6;
        abilityList.add(investitureOfFlame);

        Ability investitureOfIce = null;
        investitureOfIce.name = "Investiture of Ice";
        investitureOfIce.actionType = "Action";
        investitureOfIce.description = "Until the spell ends, ice rimes your body.";
        investitureOfIce.spellLevel = 6;
        abilityList.add(investitureOfIce);

        Ability investitureOfStone = null;
        investitureOfStone.name = "Investiture of Stone";
        investitureOfStone.actionType = "Action";
        investitureOfStone.description = "Until the spell ends, bits of rock spread across your body.";
        investitureOfStone.spellLevel = 6;
        abilityList.add(investitureOfStone);

        Ability investitureOfWind = null;
        investitureOfWind.name = "Investiture of Wind";
        investitureOfWind.actionType = "Action";
        investitureOfWind.description = "Until the spell ends, wind whirls around you";
        investitureOfWind.spellLevel = 6;
        abilityList.add(investitureOfWind);

        Ability massSuggestion = null;
        massSuggestion.name = "Mass Suggestion";
        massSuggestion.actionType = "Action";
        massSuggestion.description = "You suggest a course of activity (limited to a sentence or two) and magically influence up to twelve creatures of your choice that you can see within range and that can hear and understand you. Creatures that can't be charmed are immune to this effect. The suggestion must be worded in such a manner as to make the course of action sound reasonable. Asking the creature to stab itself, throw itself onto a spear, immolate itself, or do some other obviously harmful act automatically negates the effect of the spell.";
        massSuggestion.spellLevel = 6;
        abilityList.add(massSuggestion);

        Ability mentalPrison = null;
        mentalPrison.name = "Mental Prison";
        mentalPrison.actionType = "Action";
        mentalPrison.description = "You attempt to bind a creature within an illusory cell that only it perceives. One creature you can see within range must make an Intelligence saving throw. The target succeeds automatically if it is immune to being charmed. On a successful save, the target takes 5d10 psychic damage, and the spell ends. On a failed save, the target takes 5d10 psychic damage, and you make the area immediately around the target's space appear dangerous to it in some way. You might cause the target to perceive itself as being surrounded by fire, floating razors, or hideous maws filled with dripping teeth. Whatever form the illusion takes, the target can't see or hear anything beyond it and is restrained for the spell's duration. If the target is moved out of the illusion, makes a melee attack through it, or reaches any part of its body through it, the target takes 10d10 psychic damage, and the spell ends.";
        mentalPrison.spellLevel = 6;
        abilityList.add(mentalPrison);

        Ability moveEarth = null;
        moveEarth.name = "Move Earth";
        moveEarth.actionType = "Action";
        moveEarth.description = "Choose an area of terrain no larger than 40 feet on a side within range. You can reshape dirt, sand, or clay in the area in any manner you choose for the duration. You can raise or lower the area's elevation, create or fill in a trench, erect or flatten a wall, or form a pillar. The extent of any such changes can't exceed half the area's largest dimension. So, if you affect a 40-foot square, you can create a pillar up to 20 feet high, raise or lower the square's elevation by up to 20 feet, dig a trench up to 20 feet deep, and so on. It takes 10 minutes for these changes to complete.";
        moveEarth.spellLevel = 6;
        abilityList.add(moveEarth);

        Ability otilukesFreezingSphere = null;
        otilukesFreezingSphere.name = "Otiluke\'s Freezing Sphere";
        otilukesFreezingSphere.actionType = "Action";
        otilukesFreezingSphere.description = "A frigid globe of cold energy streaks from your fingertips to a point of your choice within range, where it explodes in a 60-foot-radius sphere. Each creature within the area must make a Constitution saving throw. On a failed save, a creature takes 10d6 cold damage. On a successful save, it takes half as much damage.";
        otilukesFreezingSphere.spellLevel = 6;
        abilityList.add(otilukesFreezingSphere);

        Ability ottosIrresistibleDance = null;
        ottosIrresistibleDance.name = "Otto\'s Irresistible Dance";
        ottosIrresistibleDance.actionType = "Action";
        ottosIrresistibleDance.description = "Choose one creature that you can see within range. The target begins a comic dance in place: shuffling, tapping its feet, and capering for the duration. Creatures that can't be charmed are immune to this spell.";
        ottosIrresistibleDance.spellLevel = 6;
        abilityList.add(ottosIrresistibleDance);

        Ability primordialWard = null;
        primordialWard.name = "Primordial Ward";
        primordialWard.actionType = "Action";
        primordialWard.description = "You have resistance to acid, cold, fire, lightning, and thunder damage for the spell's duration.";
        primordialWard.spellLevel = 6;
        abilityList.add(primordialWard);

        Ability programmedIllusion = null;
        programmedIllusion.name = "Programmed Illusion";
        programmedIllusion.actionType = "Action";
        programmedIllusion.description = "You create an illusion of an object, a creature, or some other visible phenomenon within range that activates when a specific condition occurs. The illusion is imperceptible until then. It must be no larger than a 30-foot cube, and you decide when you cast the spell how the illusion behaves and what sounds it makes. This scripted performance can last up to 5 minutes.";
        programmedIllusion.spellLevel = 6;
        abilityList.add(programmedIllusion);

        Ability scatter = null;
        scatter.name = "Scatter";
        scatter.actionType = "Action";
        scatter.description = "The air quivers around up to five creatures of your choice that you can see within range. An unwilling creature must succeed on a Wisdom saving throw to resist this spell. You teleport each affected target to an unoccupied space that you can see within 120 feet of you. That space must be on the ground or on a floor.";
        scatter.spellLevel = 6;
        abilityList.add(scatter);

        Ability soulCage = null;
        soulCage.name = "Soul Cage";
        soulCage.actionType = "Reaction";
        soulCage.description = "This spell snatches the soul of a humanoid as it dies and traps it inside the tiny cage you use for the material component. A stolen soul remains inside the cage until the spell ends or until you destroy the cage, which ends the spell. While you have a soul inside the cage, you can exploit it in any of the ways described below. You can use a trapped soul up to six times. Once you exploit a soul for the sixth time, it is released, and the spell ends. While a soul is trapped, the dead humanoid it came from can't be revived.";
        soulCage.spellLevel = 6;
        abilityList.add(soulCage);

        Ability sunbeam = null;
        sunbeam.name = "Sunbeam";
        sunbeam.actionType = "Action";
        sunbeam.description = "A beam of brilliant light flashes out from your hand in a 5-foot-wide, 60-foot-long line. Each creature in the line must make a Constitution saving throw. On a failed save, a creature takes 6d8 radiant damage and is blinded until your next turn. On a successful save, it takes half as much damage and isn't blinded by this spell. Undead and oozes have disadvantage on this saving throw.";
        sunbeam.spellLevel = 6;
        abilityList.add(sunbeam);

        Ability tensersTransformation = null;
        tensersTransformation.name = "Tenser\'s Transformation";
        tensersTransformation.actionType = "Action";
        tensersTransformation.description = "You endow yourself with endurance and martial prowess fueled by magic.";
        tensersTransformation.spellLevel = 6;
        abilityList.add(tensersTransformation);

        Ability transportViaPlants = null;
        transportViaPlants.name= "Transport via Plants";
        transportViaPlants.actionType = "Action";
        transportViaPlants.description = "This spell creates a magical link between a Large or larger inanimate plant within range and another plant, at any distance, on the same plane of existence. You must have seen or touched the destination plant at least once before. For the duration, any creature can step into the target plant and exit from the destination plant by using 5 feet of movement.";
        transportViaPlants.spellLevel = 6;
        abilityList.add(transportViaPlants);

        Ability trueSeeing = null;
        trueSeeing.name = "True Seeing";
        trueSeeing.actionType = "Action";
        trueSeeing.description = "This spell gives the willing creature you touch the ability to see things as they actually are. For the duration, the creature has truesight, notices secret doors hidden by magic, and can see into the Ethereal Plane, all out to a range of 120 feet.";
        trueSeeing.spellLevel = 6;
        abilityList.add(trueSeeing);

        Ability wallOfIce = null;
        wallOfIce.name = "Wall of Ice";
        wallOfIce.actionType = "Action";
        wallOfIce.description = "You create a wall of ice on a solid surface within range. You can form it into a hemispherical dome or a sphere with a radius of up to 10 feet, or you can shape a flat surface made up of ten 10-foot-square panels. Each panel must be contiguous with another panel. In any form, the wall is 1 foot thick and lasts for the duration.";
        wallOfIce.spellLevel = 6;
        abilityList.add(wallOfIce);

        Ability wallOfThorns = null;
        wallOfThorns.name = "Wall of Thorns";
        wallOfThorns.actionType = "Action";
        wallOfThorns.description = "You create a wall of tough, pliable, tangled brush bristling with needle-sharp thorns. The wall appears within range on a solid surface and lasts for the duration. You choose to make the wall up to 60 feet long, 10 feet high, and 5 feet thick or a circle that has a 20-foot diameter and is up to 20 feet high and 5 feet thick. The wall blocks line of sight.";
        wallOfThorns.spellLevel = 6;
        abilityList.add(wallOfThorns);

        Ability wordOfRecall = null;
        wordOfRecall.name = "Word of Recall";
        wordOfRecall.actionType = "Action";
        wordOfRecall.description = "You and up to five willing creatures within 5 feet of you instantly teleport to a previously designated sanctuary. You and any creatures that teleport with you appear in the nearest unoccupied space to the spot you designated when you prepared your sanctuary (see below). If you cast this spell without first preparing a sanctuary, the spell has no effect.";
        wordOfRecall.spellLevel = 6;
        abilityList.add(wordOfRecall);


        // Level 7 Spells


        Ability crownOfStars = null;
        crownOfStars.name = "Crown of Stars";
        crownOfStars.actionType = "Action";
        crownOfStars.description = "Seven star-like motes of light appear and orbit your head until the spell ends. You can use a bonus action to send one of the motes streaking toward one creature or object within 120 feet of you. When you do so, make a ranged spell attack. On a hit, the target takes 4d12 radiant damage. Whether you hit or miss, the mote is expended. The spell ends early if you expend the last mote.";
        crownOfStars.spellLevel = 7;
        abilityList.add(crownOfStars);

        Ability delayedBlastFireball = null;
        delayedBlastFireball.name = "Delayed Blast Fireball";
        delayedBlastFireball.actionType = "Action";
        delayedBlastFireball.description = "A beam of yellow light flashes from your pointing finger, then condenses to linger at a chosen point within range as a glowing bead for the duration. When the spell ends, either because your concentration is broken or because you decide to end it, the bead blossoms with a low roar into an explosion of flame that spreads around corners. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A creature takes fire damage equal to the total accumulated damage on a failed save, or half as much damage on a successful one.";
        delayedBlastFireball.spellLevel = 7;
        abilityList.add(delayedBlastFireball);

        Ability divineWord = null;
        divineWord.name = "Divine Word";
        divineWord.actionType = "Bonus";
        divineWord.description = "You utter a divine word, imbued with the power that shaped the world at the dawn of creation. Choose any number of creatures you can see within range. Each creature that can hear you must make a Charisma saving throw. On a failed save, a creature suffers an effect based on its current hit points";
        divineWord.spellLevel = 7;
        abilityList.add(divineWord);

        Ability etherealness = null;
        etherealness.name = "Etherealness";
        etherealness.actionType = "Action";
        etherealness.description = "You step into the border regions of the Ethereal Plane, in the area where it overlaps with your current plane. You remain in the Border Ethereal for the duration or until you use your action to dismiss the spell. During this time, you can move in any direction. If you move up or down, every foot of movement costs an extra foot. You can see and hear the plane you originated from, but everything there looks gray, and you can't see anything more than 60 feet away.";
        etherealness.spellLevel = 7;
        abilityList.add(etherealness);

        Ability fingerOfDeath = null;
        fingerOfDeath.name = "Finger of Death";
        fingerOfDeath.actionType = "Action";
        fingerOfDeath.description = "You send negative energy coursing through a creature that you can see within range, causing it searing pain. The target must make a Constitution saving throw. It takes 7d8 + 30 necrotic damage on a failed save, or half as much damage on a successful one.";
        fingerOfDeath.spellLevel = 7;
        abilityList.add(fingerOfDeath);

        Ability firestorm = null;
        firestorm.name = "Firestorm";
        firestorm.actionType = "Action";
        firestorm.description = "A storm made up of sheets of roaring flame appears in a location you choose within range. The area of the storm consists of up to ten 10-foot cubes, which you can arrange as you wish. Each cube must have at least one face adjacent to the face of another cube. Each creature in the area must make a Dexterity saving throw. It takes 7d10 fire damage on a failed save, or half as much damage on a successful one.";
        firestorm.spellLevel = 7;
        abilityList.add(firestorm);

        Ability forcecage = null;
        forcecage.name = "Forcecage";
        forcecage.actionType = "Action";
        forcecage.description = "An immobile, invisible, cube-shaped prison composed of magical force springs into existence around an area you choose within range. The prison can be a cage or a solid box as you choose.";
        forcecage.spellLevel = 7;
        abilityList.add(forcecage);

        Ability mordenkainensSword = null;
        mordenkainensSword.name = "Mordenkainen\'s Sword";
        mordenkainensSword.actionType = "Action";
        mordenkainensSword.description = "You create a sword-shaped plane of force that hovers within range. It lasts for the duration. When the sword appears, you make a melee spell attack against a target of your choice within 5 feet of the sword. On a hit, the target takes 3d10 force damage. Until the spell ends, you can use a bonus action on each of your turns to move the sword up to 20 feet to a spot you can see and repeat this attack against the same target or a different one.";
        mordenkainensSword.spellLevel = 7;
        abilityList.add(mordenkainensSword);

        Ability planeShift = null;
        planeShift.name = "Planeshift";
        planeShift.actionType = "Action";
        planeShift.description = "You and up to eight willing creatures who link hands in a circle are transported to a different plane of existence. You can specify a target destination in general terms, such as the City of Brass on the Elemental Plane of Fire or the palace of Dispater on the second level of the Nine Hells, and you appear in or near that destination. If you are trying to reach the City of Brass, for example, you might arrive in its Street of Steel, before its Gate of Ashes, or looking at the city from across the Sea of Fire, at the DM's discretion.";
        planeShift.spellLevel = 7;
        abilityList.add(planeShift);

        Ability powerWordPain = null;
        powerWordPain.name = "Power Word Pain";
        powerWordPain.actionType = "Action";
        powerWordPain.description = "You speak a word of power that causes waves of intense pain to assail one creature you can see within range. If the target has 100 hit points or fewer, it is subject to crippling pain. Otherwise, the spell has no effect on it. A target is also unaffected if it is immune to being charmed.";
        powerWordPain.spellLevel = 7;
        abilityList.add(powerWordPain);

        Ability prismaticSpray = null;
        prismaticSpray.name = "Prismatic Spray";
        prismaticSpray.actionType = "Action";
        prismaticSpray.description = "Eight multicolored rays of light flash from your hand. Each ray is a different color and has a different power and purpose. Each creature in a 60-foot cone must make a Dexterity saving throw. For each target, roll a d8 to determine which color ray affects it.";
        prismaticSpray.spellLevel = 7;
        abilityList.add(prismaticSpray);

        Ability projectImage = null;
        projectImage.name = "Project Image";
        projectImage.actionType = "Action";
        projectImage.description = "You create an illusory copy of yourself that lasts for the duration. The copy can appear at any location within range that you have seen before, regardless of intervening obstacles. The illusion looks and sounds like you but is intangible. If the illusion takes any damage, it disappears, and the spell ends.";
        projectImage.spellLevel = 7;
        abilityList.add(projectImage);

        Ability reverseGravity = null;
        reverseGravity.name = "Reverse Gravity";
        reverseGravity.actionType = "Action";
        reverseGravity.description = "This spell reverses gravity in a 50-foot-radius, 100-foot high cylinder centered on a point within range. All creatures and objects that aren't somehow anchored to the ground in the area fall upward and reach the top of the area when you cast this spell. A creature can make a Dexterity saving throw to grab onto a fixed object it can reach, thus avoiding the fall.";
        reverseGravity.spellLevel = 7;
        abilityList.add(reverseGravity);

        Ability sequester = null;
        sequester.name = "Sequester";
        sequester.actionType = "Action";
        sequester.description = "By means of this spell, a willing creature or an object can be hidden away, safe from detection for the duration. When you cast the spell and touch the target, it becomes invisible and can't be targeted by divination spells or perceived through scrying sensors created by divination spells.";
        sequester.spellLevel = 7;
        abilityList.add(sequester);

        Ability teleport = null;
        teleport.name = "Teleport";
        teleport.actionType = "Action";
        teleport.description = "This spell instantly transports you and up to eight willing creatures of your choice that you can see within range, or a single object that you can see within range, to a destination you select. If you target an object, it must be able to fit entirely inside a 10-foot cube, and it can't be held or carried by an unwilling creature.";
        teleport.spellLevel = 7;
        abilityList.add(teleport);

        Ability whirlwind = null;
        whirlwind.name = "Whirlwind";
        whirlwind.actionType = "Action";
        whirlwind.description = "A whirlwind howls down to a point that you can see on the ground within range. The whirlwind is a 10-foot-radius, 30-foot-high cylinder centered on that point. Until the spell ends, you can use your action to move the whirlwind up to 30 feet in any direction along the ground. The whirlwind sucks up any Medium or smaller objects that aren't secured to anything and that aren't worn or carried by anyone.";
        whirlwind.spellLevel = 7;
        abilityList.add(whirlwind);


        // Level 8 Spells


        Ability abidalzimsHorridWilting = null;
        abidalzimsHorridWilting.name = "Abi-Dalzim\'s Horrid Wilting";
        abidalzimsHorridWilting.actionType = "Action";
        abidalzimsHorridWilting.description = "You draw the moisture from every creature in a 30-foot cube centered on a point you choose within range. Each creature in that area must make a Constitution saving throw. Constructs and undead aren't affected, and plants and water elementals make this saving throw with disadvantage. A creature takes 12d8 necrotic damage on a failed save, or half as much damage on a successful one.";
        abidalzimsHorridWilting.spellLevel = 8;
        abilityList.add(abidalzimsHorridWilting);

        Ability animalShapes = null;
        animalShapes.name = "Animal Shapes";
        animalShapes.actionType = "Action";
        animalShapes.description = "Your magic turns others into beasts. Choose any number of willing creatures that you can see within range. You transform each target into the form of a Large or smaller beast with a challenge rating of 4 or lower. On subsequent turns, you can use your action to transform affected creatures into new forms.";
        animalShapes.spellLevel = 8;
        abilityList.add(animalShapes);

        Ability antimagicField = null;
        antimagicField.name = "Antimagic Field";
        antimagicField.actionType = "Action";
        antimagicField.description = "A 10-foot-radius invisible sphere of antimagic surrounds you. This area is divorced from the magical energy that suffuses the multiverse. Within the sphere, spells can't be cast, summoned creatures disappear, and even magic items become mundane. Until the spell ends, the sphere moves with you, centered on you.";
        antimagicField.spellLevel = 8;
        abilityList.add(antimagicField);

        Ability demiplane = null;
        demiplane.name = "Demiplane";
        demiplane.actionType = "Action";
        demiplane.description = "You create a shadowy door on a flat solid surface that you can see within range. The door is large enough to allow Medium creatures to pass through unhindered. When opened, the door leads to a demiplane that appears to be an empty room 30 feet in each dimension, made of wood or stone. When the spell ends, the door disappears, and any creatures or objects inside the demiplane remain trapped there, as the door also disappears from the other side.";
        demiplane.spellLevel = 8;
        abilityList.add(demiplane);

        Ability dominateMonster = null;
        dominateMonster.name = "Dominate Monster";
        dominateMonster.actionType = "Action";
        dominateMonster.description = "You attempt to beguile a creature that you can see within range. It must succeed on a Wisdom saving throw or be charmed by you for the duration. If you or creatures that are friendly to you are fighting it, it has advantage on the saving throw.";
        dominateMonster.spellLevel = 8;
        abilityList.add(dominateMonster);

        Ability earthquake = null;
        earthquake.name = "Earthquake";
        earthquake.actionType = "Action";
        earthquake.description = "You create a seismic disturbance at a point on the ground that you can see within range. For the duration, an intense tremor rips through the ground in a 100-foot-radius circle centered on that point and shakes creatures and structures in contact with the ground in that area.";
        earthquake.spellLevel = 8;
        abilityList.add(earthquake);

        Ability feeblemind = null;
        feeblemind.name = "Feeblemind";
        feeblemind.actionType = "Action";
        feeblemind.description = "You blast the mind of a creature that you can see within range, attempting to shatter its intellect and personality. The target takes 4d6 psychic damage and must make an Intelligence saving throw.";
        feeblemind.spellLevel = 8;
        abilityList.add(feeblemind);

        Ability glibness = null;
        glibness.name = "Glibness";
        glibness.actionType = "Action";
        glibness.description = "Until the spell ends, when you make a Charisma check, you can replace the number you roll with a 15. Additionally, no matter what you say, magic that would determine if you are telling the truth indicates that you are being truthful.";
        glibness.spellLevel = 8;
        abilityList.add(glibness);

        Ability holyAura = null;
        holyAura.name = "Holy Aura";
        holyAura.actionType = "Action";
        holyAura.description = "Divine light washes out from you and coalesces in a soft radiance in a 30-foot radius around you. Creatures of your choice in that radius when you cast this spell shed dim light in a 5-foot radius and have advantage on all saving throws, and other creatures have disadvantage on attack rolls against them until the spell ends. In addition, when a fiend or an undead hits an affected creature with a melee attack, the aura flashes with brilliant light. The attacker must succeed on a Constitution saving throw or be blinded until the spell ends.";
        holyAura.spellLevel = 8;
        abilityList.add(holyAura);

        Ability illusoryDragon = null;
        illusoryDragon.name = "Illusory Dragon";
        illusoryDragon.actionType = "Action";
        illusoryDragon.description = "By gathering threads of shadow material from the Shadowfell, you create a Huge shadowy dragon in an unoccupied space that you can see within range. The illusion lasts for the spell's duration and occupies its space, as if it were a creature.";
        illusoryDragon.spellLevel = 8;
        abilityList.add(illusoryDragon);

        Ability incendiaryCloud = null;
        incendiaryCloud.name = "Incendiary Cloud";
        incendiaryCloud.actionType = "Action";
        incendiaryCloud.description = "A swirling cloud of smoke shot through with white-hot embers appears in a 20-foot-radius sphere centered on a point within range. The cloud spreads around corners and is heavily obscured. It lasts for the duration or until a wind of moderate or greater speed (at least 10 miles per hour) disperses it.";
        incendiaryCloud.spellLevel = 8;
        abilityList.add(incendiaryCloud);

        Ability maddeningDarkness = null;
        maddeningDarkness.name = "Maddening Darkness";
        maddeningDarkness.actionType = "Action";
        maddeningDarkness.description = "Magical darkness spreads from a point you choose within range to fill a 60-foot-radius sphere until the spell ends. The darkness spreads around corners. A creature with darkvision can't see through this darkness. Non-magical light, as well as light created by spells of 8th level or lower, can't illuminate the area.";
        maddeningDarkness.spellLevel = 8;
        abilityList.add(maddeningDarkness);

        Ability maze = null;
        maze.name = "Maze";
        maze.actionType = "Action";
        maze.description = "You banish a creature that you can see within range into a labyrinthine demiplane. The target remains there for the duration or until it escapes the maze.";
        maze.spellLevel = 8;
        abilityList.add(maze);

        Ability mindBlank = null;
        mindBlank.name = "Mind Blank";
        mindBlank.actionType = "Action";
        mindBlank.description = "Until the spell ends, one willing creature you touch is immune to psychic damage, any effect that would sense its emotions or read its thoughts, divination spells, and the charmed condition. The spell even foils wish spells and spells or effects of similar power used to affect the target's mind or to gain information about the target.";
        mindBlank.spellLevel = 8;
        abilityList.add(mindBlank);

        Ability powerWordStun = null;
        powerWordStun.name = "Power Word Stun";
        powerWordStun.description = "You speak a word of power that can overwhelm the mind of one creature you can see within range, leaving it dumbfounded. If the target has 150 hit points or fewer, it is stunned. Otherwise, the spell has no effect.";
        powerWordStun.actionType = "Action";
        powerWordStun.spellLevel = 8;
        abilityList.add(powerWordStun);

        Ability sunburst = null;
        sunburst.name = "Sunburst";
        sunburst.actionType = "Action";
        sunburst.description = "Brilliant sunlight flashes in a 60-foot radius centered on a point you choose within range. Each creature in that light must make a Constitution saving throw. On a failed save, a creature takes 12d6 radiant damage and is blinded for 1 minute. On a successful save, it takes half as much damage and isn't blinded by this spell. Undead and oozes have disadvantage on this saving throw.";
        sunburst.spellLevel = 8;
        abilityList.add(sunburst);

        Ability telepathy = null;
        telepathy.name = "Telepathy";
        telepathy.actionType = "Action";
        telepathy.description = "You create a telepathic link between yourself and a willing creature with which you are familiar. The creature can be anywhere on the same plane of existence as you. The spell ends if you or the target are no longer on the same plane.";
        telepathy.spellLevel = 8;
        abilityList.add(telepathy);


        // Level 9 Spells


        Ability gate = null;
        gate.name = "Gate";
        gate.actionType = "Action";
        gate.description = "You conjure a portal linking an unoccupied space you can see within range to a precise location on a different plane of existence. The portal is a circular opening, which you can make 5 to 20 feet in diameter. You can orient the portal in any direction you choose. The portal lasts for the duration.";
        gate.spellLevel = 9;
        abilityList.add(gate);

        Ability invulnerability = null;
        invulnerability.name = "Invulnerabiliity";
        invulnerability.actionType = "Action";
        invulnerability.description = "You are immune to all damage until the spell ends.";
        invulnerability.spellLevel = 9;
        abilityList.add(invulnerability);

        Ability massHeal = null;
        massHeal.name = "Mass Heal";
        massHeal.actionType = "Action";
        massHeal.description = "A flood of healing energy flows from you into injured creatures around you. You restore up to 700 hit points, divided as you choose among any number of creatures that you can see within range. Creatures healed by this spell are also cured of all diseases and any effect making them blinded or deafened. This spell has no effect on undead or constructs.";
        massHeal.spellLevel = 9;
        abilityList.add(massHeal);

        Ability massPolymorph = null;
        massPolymorph.name = "Mass Polymorph";
        massPolymorph.actionType = "Action";
        massPolymorph.description = "You transform up to ten creatures of your choice that you can see within range. An unwilling target must succeed on a Wisdom saving throw to resist the transformation. An unwilling shapechanger automatically succeeds on the save.";
        massPolymorph.spellLevel = 9;
        abilityList.add(massPolymorph);

        Ability meteorSwarm = null;
        meteorSwarm.name = "Meteor Swarm";
        meteorSwarm.actionType = "Action";
        meteorSwarm.description = "Blazing orbs of fire plummet to the ground at four different points you can see within range. Each creature in a 40-foot-radius sphere centered on each point you choose must make a Dexterity saving throw. The sphere spreads around corners. A creature takes 20d6 fire damage and 20d6 bludgeoning damage on a failed save, or half as much damage on a successful one. A creature in the area of more than one fiery burst is affected only once.";
        meteorSwarm.spellLevel = 9;
        abilityList.add(meteorSwarm);

        Ability powerWordHeal = null;
        powerWordHeal.name = "Power Word Heal";
        powerWordHeal.actionType = "Action";
        powerWordHeal.description = "A wave of healing energy washes over the creature you touch. The target regains all its hit points. If the creature is charmed, frightened, paralyzed, or stunned, the condition ends. If the creature is prone, it can use its reaction to stand up. This spell has no effect on undead or constructs.";
        powerWordHeal.spellLevel = 9;
        abilityList.add(powerWordHeal);

        Ability powerWordKill = null;
        powerWordKill.name = "Power Word Kill";
        powerWordKill.actionType = "Action";
        powerWordKill.description = "You utter a word of power that can compel one creature you can see within range to die instantly. If the creature you choose has 100 hit points or fewer, it dies. Otherwise, the spell has no effect.";
        powerWordKill.spellLevel = 9;
        abilityList.add(powerWordKill);

        Ability prismaticWall = null;
        prismaticWall.name = "Prismatic Wall";
        prismaticWall.actionType = "Action";
        prismaticWall.description = "A shimmering, multicolored plane of light forms a vertical opaque wall—up to 90 feet long, 30 feet high, and 1 inch thick—centered on a point you can see within range. Alternatively, you can shape the wall into a sphere up to 30 feet in diameter centered on a point you choose within range. The wall remains in place for the duration. If you position the wall so that it passes through a space occupied by a creature, the spell fails, and your action and the spell slot are wasted.";
        prismaticWall.spellLevel = 9;
        abilityList.add(prismaticWall);

        Ability psychicScream = null;
        psychicScream.name = "Phychic Scream";
        psychicScream.actionType = "Action";
        psychicScream.description = "You unleash the power of your mind to blast the intellect of up to ten creatures of your choice that you can see within range. Creatures that have an Intelligence score of 2 or lower are unaffected.";
        psychicScream.spellLevel = 9;
        abilityList.add(psychicScream);

        Ability shapechange = null;
        shapechange.name = "Shape Change";
        shapechange.actionType = "Action";
        shapechange.description = "You assume the form of a different creature for the duration. The new form can be of any creature with a challenge rating equal to your level or lower. The creature can't be a construct or an undead, and you must have seen the sort of creature at least once. You transform into an average example of that creature, one without any class levels or the Spellcasting trait.";
        shapechange.spellLevel = 9;
        abilityList.add(shapechange);

        Ability stormOfVengeance = null;
        stormOfVengeance.name = "Storm of Vengeance";
        stormOfVengeance.actionType = "Action";
        stormOfVengeance.description = "A churning storm cloud forms, centered on a point you can see and spreading to a radius of 360 feet. Lightning flashes in the area, thunder booms, and strong winds roar. Each creature under the cloud (no more than 5,000 feet beneath the cloud) when it appears must make a Constitution saving throw. On a failed save, a creature takes 2d6 thunder damage and becomes deafened for 5 minutes.";
        stormOfVengeance.spellLevel = 9;
        abilityList.add(stormOfVengeance);

        Ability timeStop = null;
        timeStop.name = "Time Stop";
        timeStop.actionType = "Action";
        timeStop.description = "You briefly stop the flow of time for everyone but yourself. No time passes for other creatures, while you take 1d4 + 1 turns in a row, during which you can use actions and move as normal.";
        timeStop.spellLevel = 9;
        abilityList.add(timeStop);

        Ability truePolymorph = null;
        truePolymorph.name = "True Polymorph";
        truePolymorph.actionType = "Action";
        truePolymorph.description = "Choose one creature or nonmagical object that you can see within range. You transform the creature into a different creature, the creature into a nonmagical object, or the object into a creature (the object must be neither worn nor carried by another creature). The transformation lasts for the duration, or until the target drops to 0 hit points or dies. If you concentrate on this spell for the full duration, the transformation lasts until it is dispelled.";
        truePolymorph.spellLevel = 9;
        abilityList.add(truePolymorph);

        Ability weird = null;
        weird.name = "Weird";
        weird.actionType = "Action";
        weird.description = "Drawing on the deepest fears of a group of creatures, you create illusory creatures in their minds, visible only to them. Each creature in a 30-foot-radius sphere centered on a point of your choice within range must make a Wisdom saving throw. On a failed save, a creature becomes frightened for the duration. The illusion calls on the creature's deepest fears, manifesting its worst nightmares as an implacable threat. At the end of each of the frightened creature's turns, it must succeed on a Wisdom saving throw or take 4d10 psychic damage. On a successful save, the spell ends for that creature.";
        weird.spellLevel = 9;
        abilityList.add(weird);

        Ability wish = null;
        wish.name = "Wish";
        wish.actionType = "Action";
        wish.description = "Wish is the mightiest spell a mortal creature can cast. By simply speaking aloud, you can alter the very foundations of reality in accord with your desires.";
        wish.spellLevel = 9;
        abilityList.add(wish);

        return abilityList;
    }
    static List<Race> createRaceList() {

        List<Race> racelist = null;

        Race dragonborn = null;
        dragonborn.name = "Dragonborn";
        dragonborn.raceAbilityList = new String[]{"Breath Weapon"};
        racelist.add(dragonborn);

        Race dwarfHill = null;
        dwarfHill.name = "Dwarf (Hill)";
        dwarfHill.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(dwarfHill);


        Race dwarfMount = null;
        dwarfMount.name = "Dwarf (Mountain)";
        dwarfMount.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(dwarfMount);

        Race elfDrow = null;
        elfDrow.name = "Elf (Drow)";
        elfDrow.raceAbilityList = new String[]{"Dancing Lights", "Faerie Fire", "Darkness"};
        racelist.add(elfDrow);

        Race elfHigh = null;
        elfHigh.name = "Elf (High)";
        elfHigh.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(elfHigh);

        Race elfWood = null;
        elfWood.name = "Elf (Wood)";
        elfWood.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(elfWood);

        Race genasiWater = null;
        genasiWater.name = "Genasi (Water)";
        genasiWater.raceAbilityList = new String[]{"Shape Water", "Create or Destroy Water"};
        racelist.add(genasiWater);

        Race gnomeForest = null;
        gnomeForest.name = "Gnome (Forest)";
        gnomeForest.raceAbilityList = new String[]{"Minor Illusion"};
        racelist.add(gnomeForest);

        Race gnomeRock = null;
        gnomeRock.name = "Gnome (Rock)";
        gnomeRock.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(gnomeRock);

        Race halfElf = null;
        halfElf.name = "Half-Elf";
        halfElf.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(halfElf);

        Race halfOrc = null;
        halfOrc.name = "Half-Orc";
        halfOrc.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(halfOrc);

        Race halflingLightfoot = null;
        halflingLightfoot.name = "Halfling (Lightfoot)";
        halflingLightfoot.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(halflingLightfoot);

        Race halflingStout = null;
        halflingStout.name = "Halfling (Stout)";
        halflingStout.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(halflingStout);

        Race human = null;
        human.name = "Human";
        human.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(human);

        Race humanVariant = null;
        humanVariant.name = "Human (Variant)";
        humanVariant.raceAbilityList = new String[]{"NoAddedAbilities"};
        racelist.add(humanVariant);

        Race tiefling = null;
        tiefling.name = "Tiefling";
        tiefling.raceAbilityList = new String[]{"Thaumaturgy", "Hellish Rebuke", "Darkness"};
        racelist.add(tiefling);

        return racelist;
    }
    static List<CharClass> createCharClassList() {
        List<CharClass> charClassList = null;


        CharClass artificer = null;
        artificer.name = "Artificer";

        Ability flashOfGenius = null;
        flashOfGenius.name = "Flash of Genius";
        flashOfGenius.actionType = "Reaction";
        flashOfGenius.description = "Starting at 7th level, you gain the ability to come up with solutions under pressure. When you or another creature you can see within 30 feet of you makes an ability check or a saving throw, you can use your reaction to add your Intelligence modifier to the roll.";
        flashOfGenius.recharge = "None";
        flashOfGenius.spellLevel = 0;
        flashOfGenius.requiredLevel = 7;
        artificer.classAbilityList.add(flashOfGenius);

        charClassList.add(artificer);


        CharClass barbarian = null;
        barbarian.name = "Barbarian";

        Ability rage = null;
        rage.name = "Rage";
        rage.actionType = "Bonus";
        rage.description = "In battle, you fight with primal ferocity.";
        rage.recharge = "None";
        rage.spellLevel = 0;
        rage.requiredLevel = 1;
        barbarian.classAbilityList.add(rage);

        Ability recklessAttack = null;
        recklessAttack.name = "Reckless Attack";
        recklessAttack.actionType = "Free";
        recklessAttack.description = "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn.";
        recklessAttack.recharge = "None";
        recklessAttack.spellLevel = 0;
        recklessAttack.requiredLevel = 2;
        barbarian.classAbilityList.add(recklessAttack);

        Ability extraAttack = null;
        extraAttack.name = "Extra Attack";
        extraAttack.actionType = "Free";
        extraAttack.description = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        extraAttack.recharge = "Turn";
        extraAttack.spellLevel = 0;
        extraAttack.requiredLevel = 5;
        barbarian.classAbilityList.add(extraAttack);

        charClassList.add(barbarian);



        CharClass bard = null;
        bard.name = "Bard";

        Ability bardicInspiration = null;
        bardicInspiration.name = "Bardic Inspiration";
        bardicInspiration.actionType = "Bonus";
        bardicInspiration.description = "You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.";
        bardicInspiration.recharge = "Turn";
        bardicInspiration.spellLevel = 0;
        bardicInspiration.requiredLevel = 1;
        bard.classAbilityList.add(bardicInspiration);

        Ability countercharm = null;
        countercharm.name = "Countercharm";
        countercharm.actionType = "Action";
        countercharm.description = "At 6th level, you gain the ability to use musical notes or words of power to disrupt mind-influencing effects. As an action, you can start a performance that lasts until the end of your next turn. During that time, you and any friendly creatures within 30 feet of you have advantage on saving throws against being frightened or charmed. A creature must be able to hear you to gain this benefit. The performance ends early if you are incapacitated or silenced or if you voluntarily end it (no action required).";
        countercharm.recharge = "Turn";
        countercharm.spellLevel = 0;
        countercharm.requiredLevel = 6;
        bard.classAbilityList.add(countercharm);

        charClassList.add(bard);


        CharClass cleric = null;
        cleric.name = "Cleric";

        Ability turnUndead = null;
        turnUndead.name = "Turn Undead";
        turnUndead.actionType = "Action";
        turnUndead.description = "As an action, you present your holy symbol and speak a prayer censuring the undead. Each undead that can see or hear you within 30 feet of you must make a Wisdom saving throw. If the creature fails its saving throw, it is turned for 1 minute or until it takes any damage.";
        turnUndead.recharge = "Turn";
        turnUndead.spellLevel = 0;
        turnUndead.requiredLevel = 1;
        cleric.classAbilityList.add(turnUndead);

        Ability divineIntervention = null;
        divineIntervention.name = "Divine Intervention";
        divineIntervention.actionType = "Action";
        divineIntervention.description = "Beginning at 10th level, you can call on your deity to intervene on your behalf when your need is great.";
        divineIntervention.recharge = "Long";
        divineIntervention.spellLevel = 0;
        divineIntervention.requiredLevel = 10;
        cleric.classAbilityList.add(divineIntervention);

        charClassList.add(cleric);


        CharClass druid = null;
        druid.name = "Druid";

        Ability wildShape = null;
        wildShape.name = "Wild Shape";
        wildShape.actionType = "Action";
        wildShape.description = "Starting at 2nd level, you can use your action to magically assume the shape of a beast that you have seen before. You can use this feature twice. You regain expended uses when you finish a short or long rest.";
        wildShape.recharge = "Turn";
        wildShape.spellLevel = 0;
        wildShape.requiredLevel = 2;
        druid.classAbilityList.add(wildShape);

        charClassList.add(druid);


        CharClass fighter = null;
        fighter.name = "Fighter";

        Ability secondWind = null;
        secondWind.name = "Second Wind";
        secondWind.actionType = "Bonus";
        secondWind.description = "You have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level.";
        secondWind.recharge = "Short";
        secondWind.spellLevel = 0;
        secondWind.requiredLevel = 1;
        fighter.classAbilityList.add(secondWind);

        Ability actionSurge = null;
        actionSurge.name = "Action Surge";
        actionSurge.actionType = "Free";
        actionSurge.description = "Starting at 2nd level, you can push yourself beyond your normal limits for a moment. On your turn, you can take one additional action.";
        actionSurge.recharge = "Short";
        actionSurge.spellLevel = 0;
        actionSurge.requiredLevel = 2;
        fighter.classAbilityList.add(actionSurge);

        Ability indomitable = null;
        indomitable.name = "Indomitable";
        indomitable.actionType = "Free";
        indomitable.description = "Beginning at 9th level, you can reroll a saving throw that you fail. If you do so, you must use the new roll, and you can't use this feature again until you finish a long rest.";
        indomitable.recharge = "Long";
        indomitable.spellLevel = 0;
        indomitable.requiredLevel = 9;
        fighter.classAbilityList.add(indomitable);

        charClassList.add(fighter);


        CharClass monk = null;
        monk.name = "Monk";

        Ability flurryOfBlows = null;
        flurryOfBlows.name = "Flurry of Blows";
        flurryOfBlows.actionType = "Free";
        flurryOfBlows.description = "Immediately after you take the Attack action on your turn, you can spend 1 ki point to make two unarmed strikes as a bonus action.";
        flurryOfBlows.recharge = "None";
        flurryOfBlows.spellLevel = 0;
        flurryOfBlows.requiredLevel = 2;
        monk.classAbilityList.add(flurryOfBlows);

        Ability patientDefense = null;
        patientDefense.name = "Patient Defense";
        patientDefense.actionType = "Free";
        patientDefense.description = "You can spend 1 ki point to take the Dodge action as a bonus action on your turn.";
        patientDefense.recharge = "None";
        patientDefense.spellLevel = 0;
        patientDefense.requiredLevel = 2;
        monk.classAbilityList.add(patientDefense);

        Ability stepOfTheWind = null;
        stepOfTheWind.name = "Step of the Wind";
        stepOfTheWind.actionType = "Free";
        stepOfTheWind.description = "You can spend 1 ki point to take the Disengage or Dash action as a bonus action on your turn, and your jump distance is doubled for the turn.";
        stepOfTheWind.recharge = "None";
        stepOfTheWind.spellLevel = 0;
        stepOfTheWind.requiredLevel = 2;
        monk.classAbilityList.add(stepOfTheWind);

        Ability deflectMissiles = null;
        deflectMissiles.name = "Deflect Missiles";
        deflectMissiles.actionType = "Reaction";
        deflectMissiles.description = "Starting at 3rd level, you can use your reaction to deflect or catch the missile when you are hit by a ranged weapon attack. When you do so, the damage you take from the attack is reduced by 1d10 + your Dexterity modifier + your monk level.";
        deflectMissiles.recharge = "Turn";
        deflectMissiles.spellLevel = 0;
        deflectMissiles.requiredLevel = 3;
        monk.classAbilityList.add(deflectMissiles);

        Ability slowFall = null;
        slowFall.name = "Slow Fall";
        slowFall.actionType = "Reaction";
        slowFall.description = "Beginning at 4th level, you can use your reaction when you fall to reduce any falling damage you take by an amount equal to five times your monk level.";
        slowFall.recharge = "Turn";
        slowFall.spellLevel = 0;
        slowFall.requiredLevel = 4;
        monk.classAbilityList.add(slowFall);

        Ability stunningStrike = null;
        stunningStrike.name = "Stunning Strike";
        stunningStrike.actionType = "Free";
        stunningStrike.description = "Starting at 5th level, you can interfere with the flow of ki in an opponent's body. When you hit another creature with a melee weapon attack, you can spend 1 ki point to attempt a stunning strike. The target must succeed on a Constitution saving throw or be stunned until the end of your next turn.";
        stunningStrike.recharge = "None";
        stunningStrike.spellLevel = 0;
        stunningStrike.requiredLevel = 5;
        monk.classAbilityList.add(stunningStrike);

        Ability stillnessOfMind = null;
        stillnessOfMind.name = "Stillness of Mind";
        stillnessOfMind.actionType = "Action";
        stillnessOfMind.description = "Starting at 7th level, you can use your action to end one effect on yourself that is causing you to be charmed or frightened.";
        stillnessOfMind.recharge = "Turn";
        stillnessOfMind.spellLevel = 0;
        stillnessOfMind.requiredLevel = 7;
        monk.classAbilityList.add(stillnessOfMind);

        Ability emptyBody = null;
        emptyBody.name = "Empty Body";
        emptyBody.actionType = "Action";
        emptyBody.description = "Beginning at 18th level, you can use your action to spend 4 ki points to become invisible for 1 minute. During that time, you also have resistance to all damage but force damage.";
        emptyBody.recharge = "None";
        emptyBody.spellLevel = 0;
        emptyBody.requiredLevel = 18;
        monk.classAbilityList.add(emptyBody);

        charClassList.add(monk);


        CharClass paladin = null;
        paladin.name = "Paladin";

        Ability divineSense = null;
        divineSense.name = "Divine Sense";
        divineSense.actionType = "Action";
        divineSense.description = "The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces. Until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated, as with the hallow spell.";
        divineSense.recharge = "None";
        divineSense.spellLevel = 0;
        divineSense.requiredLevel = 1;
        paladin.classAbilityList.add(divineSense);

        Ability layOnHands = null;
        layOnHands.name = "Lay on Hands";
        layOnHands.actionType = "Action";
        layOnHands.description = "As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool.";
        layOnHands.recharge = "None";
        layOnHands.spellLevel = 0;
        layOnHands.requiredLevel = 1;
        paladin.classAbilityList.add(layOnHands);

        Ability divineSmite = null;
        divineSmite.name = "Divine Smite";
        divineSmite.actionType = "Free";
        divineSmite.description = "Starting at 2nd level, when you hit a creature with a melee weapon attack, you can expend one spell slot to deal radiant damage to the target, in addition to the weapon's damage. The extra damage is 2d8 for a 1st-level spell slot, plus 1d8 for each spell level higher than 1st, to a maximum of 5d8. The damage increases by 1d8 if the target is an undead or a fiend, to a maximum of 6d8.";
        divineSmite.recharge = "None";
        divineSmite.spellLevel = 0;
        divineSmite.requiredLevel = 2;
        paladin.classAbilityList.add(divineSmite);

        Ability extraAttackPaladin = null;
        extraAttackPaladin.name = "Extra Attack";
        extraAttackPaladin.actionType = "Action";
        extraAttackPaladin.description = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        extraAttackPaladin.recharge = "None";
        extraAttackPaladin.spellLevel = 0;
        extraAttackPaladin.requiredLevel = 5;
        paladin.classAbilityList.add(extraAttackPaladin);

        Ability cleansingTouch = null;
        cleansingTouch.name = "Cleansing Touch";
        cleansingTouch.actionType = "Action";
        cleansingTouch.description = "Beginning at 14th level, you can use your action to end one spell on yourself or on one willing creature that you touch.";
        cleansingTouch.recharge = "None";
        cleansingTouch.spellLevel = 0;
        cleansingTouch.requiredLevel = 14;
        paladin.classAbilityList.add(cleansingTouch);

        charClassList.add(paladin);


        CharClass ranger = null;
        ranger.name = "Ranger";


        Ability primevalAwareness = null;
        primevalAwareness.name = "Primeval Awareness";
        primevalAwareness.actionType = "Action";
        primevalAwareness.description = "Beginning at 3rd level, you can use your action and expend one ranger spell slot to focus your awareness on the region around you. For 1 minute per level of the spell slot you expend, you can sense whether the following types of creatures are present within 1 mile of you (or within up to 6 miles if you are in your favored terrain): aberrations, celestials, dragons, elementals, fey, fiends, and undead. This feature doesn't reveal the creatures' location or number.";
        primevalAwareness.recharge = "None";
        primevalAwareness.spellLevel = 0;
        primevalAwareness.requiredLevel = 3;
        ranger.classAbilityList.add(primevalAwareness);

        Ability extraAttackRanger = null;
        extraAttackRanger.name = "Extra Attack";
        extraAttackRanger.actionType = "Free";
        extraAttackRanger.description = "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        extraAttackRanger.recharge = "None";
        extraAttackRanger.spellLevel = 0;
        extraAttackRanger.requiredLevel = 5;
        ranger.classAbilityList.add(extraAttackRanger);

        Ability vanish = null;
        vanish.name = "Vanish";
        vanish.actionType = "Bonus";
        vanish.description = "Starting at 14th level, you can use the Hide action as a bonus action on your turn. Also, you can't be tracked by nonmagical means, unless you choose to leave a trail.";
        vanish.recharge = "None";
        vanish.spellLevel = 0;
        vanish.requiredLevel = 14;
        ranger.classAbilityList.add(vanish);

        charClassList.add(ranger);


        CharClass rogue = null;
        rogue.name = "Rogue";


        Ability sneakAttack = null;
        sneakAttack.name = "Sneak Attack";
        sneakAttack.actionType = "Free";
        sneakAttack.description = "Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.";
        sneakAttack.recharge = "Turn";
        sneakAttack.spellLevel = 0;
        sneakAttack.requiredLevel = 1;
        rogue.classAbilityList.add(sneakAttack);

        Ability cunningAction = null;
        cunningAction.name = "Cunning Action";
        cunningAction.actionType = "Bonus";
        cunningAction.description = "Starting at 2nd level, your quick thinking and agility allow you to move and act quickly. You can take a bonus action on each of your turns in combat. This action can be used only to take the Dash, Disengage, or Hide action.";
        cunningAction.recharge = "Turn";
        cunningAction.spellLevel = 0;
        cunningAction.requiredLevel = 2;
        rogue.classAbilityList.add(cunningAction);

        Ability uncannyDodge = null;
        uncannyDodge.name = "Uncanny Dodge";
        uncannyDodge.actionType = "Reaction";
        uncannyDodge.description = "Starting at 5th level, when an attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage against you.";
        uncannyDodge.recharge = "Turn";
        uncannyDodge.spellLevel = 0;
        uncannyDodge.requiredLevel = 5;
        rogue.classAbilityList.add(uncannyDodge);

        charClassList.add(rogue);


        CharClass sorcerer = null;
        sorcerer.name = "Sorcerer";


        charClassList.add(sorcerer);


        CharClass warlock = null;
        warlock.name = "Warlock";

        Ability pactOfTheBlade = null;
        pactOfTheBlade.name = "Pact of the Blade";
        pactOfTheBlade.actionType = "Action";
        pactOfTheBlade.description = "You can use your action to create a pact weapon in your empty hand. You can choose the form that this melee weapon takes each time you create it (see chapter 5 for weapon options). You are proficient with it while you wield it. This weapon counts as magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage.";
        pactOfTheBlade.recharge = "Free";
        pactOfTheBlade.spellLevel = 0;
        pactOfTheBlade.requiredLevel = 3;
        warlock.classAbilityList.add(pactOfTheBlade);

        charClassList.add(warlock);



        CharClass wizard = null;
        wizard.name = "Wizard";

        charClassList.add(wizard);


        return charClassList;

    }


    static List<SubClass> createArtificerSubClassList() {

        List<SubClass> artificerSubClassList = null;

        // Artificer Subclass

        SubClass alchemist = null;
        alchemist.name = "Alchemist";
        alchemist.parentName = "Artificer";

        Ability lesserRestoration = null;
        lesserRestoration.name = "Lesser Restoration";
        lesserRestoration.actionType = "Action";
        lesserRestoration.description = "You touch a creature and can end either one disease or one condition afflicting it. The condition can be blinded, deafened, paralyzed, or poisoned.";
        lesserRestoration.recharge = "Turn";
        lesserRestoration.spellLevel = 0;
        lesserRestoration.requiredLevel = 9;
        alchemist.subclassAbilityList.add(lesserRestoration);

        Ability greaterRestoration = null;
        greaterRestoration.name = "Greater Restoration";
        greaterRestoration.actionType = "Action";
        greaterRestoration.description = "You imbue a creature you touch with positive energy to undo a debilitating effect. You can reduce the target's exhaustion level by one, or end one of the following effects on the target:";
        greaterRestoration.recharge = "Long";
        greaterRestoration.spellLevel = 0;
        greaterRestoration.requiredLevel = 15;
        alchemist.subclassAbilityList.add(greaterRestoration);

        Ability heal = null;
        heal.name = "Heal";
        heal.actionType = "Action";
        heal.description = "Choose a creature that you can see within range. A surge of positive energy washes through the creature, causing it to regain 70 hit points. This spell also ends blindness, deafness, and any diseases affecting the target. This spell has no effect on constructs or undead.";
        heal.recharge = "Long";
        heal.spellLevel = 0;
        heal.requiredLevel = 15;
        alchemist.subclassAbilityList.add(heal);

        artificerSubClassList.add(alchemist);


        SubClass artillerist = null;
        artillerist.name = "Artillerist";
        artillerist.parentName = "Artificer";

        Ability eldritchCannon = null;
        eldritchCannon.name = "Eldritch Cannon";
        eldritchCannon.actionType = "Action";
        eldritchCannon.description = "At 3rd level, you learn how to create a magical cannon. Using woodcarver's tools or smith's tools, you can take an action to magically create a Small or Tiny eldritch cannon in an unoccupied space on a horizontal surface within 5 feet of you. A Small eldritch cannon occupies its space, and a Tiny one can be held in one hand.";
        eldritchCannon.recharge = "Long";
        eldritchCannon.spellLevel = 0;
        eldritchCannon.requiredLevel = 3;
        artillerist.subclassAbilityList.add(eldritchCannon);

        Ability activateCannon = null;
        activateCannon.name = "Activate Cannon";
        activateCannon.actionType = "Bonus";
        activateCannon.description = "On each of your turns, you can take a bonus action to cause the cannon to activate if you are within 60 feet of it. As part of the same bonus action, you can direct the cannon to walk or climb up to 15 feet to an unoccupied space, provided it has legs.";
        activateCannon.recharge = "Turn";
        activateCannon.spellLevel = 0;
        activateCannon.requiredLevel = 3;
        artillerist.subclassAbilityList.add(activateCannon);

        Ability explosiveCannon = null;
        explosiveCannon.name = "Explosive Cannon";
        explosiveCannon.actionType = "Action";
        explosiveCannon.description = "As an action, you can command the cannon to detonate if you are within 60 feet of it. Doing so destroys the cannon and forces each creature within 20 feet of it to make a Dexterity saving throw against your spell save DC, taking 3d8 force damage on a failed save or half as much damage on a successful one.";
        explosiveCannon.recharge = "Long";
        explosiveCannon.spellLevel = 0;
        explosiveCannon.requiredLevel = 9;
        artillerist.subclassAbilityList.add(explosiveCannon);

        artificerSubClassList.add(artillerist);


        SubClass battleSmith = null;
        battleSmith.name = "Battle Smith";
        battleSmith.parentName = "Artificer";


        Ability steelDefender = null;
        steelDefender.name = "Steel Defender";
        steelDefender.actionType = "Bonus";
        steelDefender.description = "In combat, the steel defender shares your initiative count, but it takes its turn immediately after yours. It can move and use its reaction on its own, but the only action it takes on its turn is the Dodge action, unless you take a bonus action on your turn to command it to take one of the actions in its stat block or the Dash, Disengage, Help, Hide, or Search action.";
        steelDefender.recharge = "Turn";
        steelDefender.spellLevel = 0;
        steelDefender.requiredLevel = 3;
        battleSmith.subclassAbilityList.add(steelDefender);

        Ability extraAttack = null;
        extraAttack.name = "Extra Attack";
        extraAttack.actionType = "Action";
        extraAttack.description = "Starting at 5th level, you can attack twice, rather than once, whenever you take the Attack action on your turn.";
        extraAttack.recharge = "None";
        extraAttack.spellLevel = 0;
        extraAttack.requiredLevel = 5;
        battleSmith.subclassAbilityList.add(extraAttack);

        artificerSubClassList.add(battleSmith);


        return artificerSubClassList;


    }
    static List<SubClass> createBarbarianSubClassList() {

        List<SubClass> barbarianSubClassList = null;


        SubClass ancestralGuardian = null;
        ancestralGuardian.name = "Ancestral Guardian";
        ancestralGuardian.parentName = "Barbarian";


        Ability spiritShield = null;
        spiritShield.name = "Spirit Shield";
        spiritShield.actionType = "Reaction";
        spiritShield.description = "Beginning at 6th level, the guardian spirits that aid you can provide supernatural protection to those you defend. If you are raging and another creature you can see within 30 feet of you takes damage, you can use your reaction to reduce that damage by 2d6.";
        spiritShield.recharge = "Turn";
        spiritShield.spellLevel = 0;
        spiritShield.requiredLevel = 6;
        ancestralGuardian.subclassAbilityList.add(spiritShield);

        barbarianSubClassList.add(ancestralGuardian);


        SubClass battlerager = null;
        battlerager.name = "Battlerager";
        battlerager.parentName = "Barbarian";


        Ability battleragerArmor = null;
        battleragerArmor.name = "Battlerager Armor";
        battleragerArmor.actionType = "Bonus";
        battleragerArmor.description = "While you are wearing spiked armor and are raging, you can use a bonus action to make one melee weapon attack with your armor spikes at a target within 5 feet of you. If the attack hits, the spikes deal 1d4 piercing damage. You use your Strength modifier for the attack and damage rolls.";
        battleragerArmor.recharge = "None";
        battleragerArmor.spellLevel = 0;
        battleragerArmor.requiredLevel = 3;
        battlerager.subclassAbilityList.add(battleragerArmor);

        Ability battleragerCharge = null;
        battleragerCharge.name = "Battlerager Charge";
        battleragerCharge.actionType = "Bonus";
        battleragerCharge.description = "Beginning at 10th level, you can take the Dash action as a bonus action while you are raging.";
        battleragerCharge.recharge = "None";
        battleragerCharge.spellLevel = 0;
        battleragerCharge.requiredLevel = 10;
        battlerager.subclassAbilityList.add(battleragerCharge);

        barbarianSubClassList.add(battlerager);


        SubClass berserker = null;
        berserker.name = "Berserker";
        berserker.parentName = "Barbarian";


        Ability frenzy = null;
        frenzy.name = "Frenzy";
        frenzy.actionType = "Bonus";
        frenzy.description = "Starting when you choose this path at 3rd level, you can go into a frenzy when you rage. If you do so, for the duration of your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one. When your rage ends, you suffer one level of exhaustion.";
        frenzy.recharge = "None";
        frenzy.spellLevel = 0;
        frenzy.requiredLevel = 3;
        berserker.subclassAbilityList.add(frenzy);

        Ability intimidatingPresence = null;
        intimidatingPresence.name = "Intimidating Presence";
        intimidatingPresence.actionType = "Action";
        intimidatingPresence.description = "Beginning at 10th level, you can use your action to frighten someone with your menacing presence. When you do so, choose one creature that you can see within 30 feet of you. If the creature can see or hear you, it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be frightened of you until the end of your next turn. On subsequent turns, you can use your action to extend the duration of this effect on the frightened creature until the end of your next turn. This effect ends if the creature ends its turn out of line of sight or more than 60 feet away from you.";
        intimidatingPresence.recharge = "None";
        intimidatingPresence.spellLevel = 0;
        intimidatingPresence.requiredLevel = 10;
        berserker.subclassAbilityList.add(intimidatingPresence);

        Ability retaliation = null;
        retaliation.name = "Retaliation";
        retaliation.actionType = "Reaction";
        retaliation.description = "Starting at 14th level, when you take damage from a creature that is within 5 feet of you. you can use your reaction to make a melee weapon attack against that creature.";
        retaliation.recharge = "None";
        retaliation.spellLevel = 0;
        retaliation.requiredLevel = 14;
        berserker.subclassAbilityList.add(retaliation);

        barbarianSubClassList.add(berserker);


        SubClass stormHerald = null;
        stormHerald.name = "Storm Herald";
        stormHerald.parentName = "Barbarian";


        Ability stormAura = null;
        stormAura.name = "Storm Aura";
        stormAura.actionType = "Bonus";
        stormAura.description = "Your aura has an effect that activates when you enter your rage, and you can activate the effect again on each of your turns as a bonus action.";
        stormAura.recharge = "None";
        stormAura.spellLevel = 0;
        stormAura.requiredLevel = 3;
        stormHerald.subclassAbilityList.add(stormAura);

        Ability ragingStormDesert = null;
        ragingStormDesert.name = "Raging Storm (Desert)";
        ragingStormDesert.actionType = "Reaction";
        ragingStormDesert.description = "Immediately after a creature in your aura hits you with an attack, you can use your reaction to force that creature to make a Dexterity saving throw. On a failed save, the creature takes fire damage equal to half your barbarian level.";
        ragingStormDesert.recharge = "None";
        ragingStormDesert.spellLevel = 0;
        ragingStormDesert.requiredLevel = 14;
        stormHerald.subclassAbilityList.add(ragingStormDesert);

        Ability ragingStormSea = null;
        ragingStormSea.name = "Raging Storm (Sea)";
        ragingStormSea.actionType = "Reaction";
        ragingStormSea.description = "When you hit a creature in your aura with an attack, you can use your reaction to force that creature to make a Strength saving throw. On a failed save, the creature is knocked prone, as if struck by a wave.";
        ragingStormSea.recharge = "None";
        ragingStormSea.spellLevel = 0;
        ragingStormSea.requiredLevel = 14;
        stormHerald.subclassAbilityList.add(ragingStormSea);

        barbarianSubClassList.add(stormHerald);


        SubClass totemWarrior = null;
        totemWarrior.name = "Totem Warrior";
        totemWarrior.parentName = "Barbarian";


        Ability totemSpiritEagle = null;
        totemSpiritEagle.name = "Totem Spirit (Eagle)";
        totemSpiritEagle.actionType = "Bonus";
        totemSpiritEagle.description = "While you're raging and aren't wearing heavy armor, other creatures have disadvantage on opportunity attack rolls against you, and you can use the Dash action as a bonus action on your turn. The spirit of the eagle makes you into a predator who can weave through the fray with ease.";
        totemSpiritEagle.recharge = "None";
        totemSpiritEagle.spellLevel = 0;
        totemSpiritEagle.requiredLevel = 3;
        totemWarrior.subclassAbilityList.add(totemSpiritEagle);

        Ability totemicAttunementElk = null;
        totemicAttunementElk.name = "Totemic Attunement (Elk)";
        totemicAttunementElk.actionType = "Bonus";
        totemicAttunementElk.description = "While raging, you can use a bonus action during your move to pass through the space of a Large or smaller creature. That creature must succeed on a Strength saving throw (DC 8 + your Strength bonus + your proficiency bonus) or be knocked prone and take bludgeoning damage equal to 1d12 + your Strength modifier.";
        totemicAttunementElk.recharge = "None";
        totemicAttunementElk.spellLevel = 0;
        totemicAttunementElk.requiredLevel = 14;
        totemWarrior.subclassAbilityList.add(totemicAttunementElk);

        Ability totemicAttunementTiger = null;
        totemicAttunementTiger.name = "Totemic Attunement (Tiger)";
        totemicAttunementTiger.actionType = "Bonus";
        totemicAttunementTiger.description = "While you're raging, if you move at least 20 feet in a straight line toward a Large or smaller target right before making a melee weapon attack against it, you can use a bonus action to make an additional melee weapon attack against it.";
        totemicAttunementTiger.recharge = "None";
        totemicAttunementTiger.spellLevel = 0;
        totemicAttunementTiger.requiredLevel = 14;
        totemWarrior.subclassAbilityList.add(totemicAttunementTiger);

        Ability totemicAttunementWolf = null;
        totemicAttunementWolf.name = "Totemic Attunement (Wolf)";
        totemicAttunementWolf.actionType = "Bonus";
        totemicAttunementWolf.description = "While you're raging, you can use a bonus action on your turn to knock a Large or smaller creature prone when you hit it with melee weapon attack.";
        totemicAttunementWolf.recharge = "None";
        totemicAttunementWolf.spellLevel = 0;
        totemicAttunementWolf.requiredLevel = 14;
        totemWarrior.subclassAbilityList.add(totemicAttunementWolf);

        barbarianSubClassList.add(totemWarrior);


        SubClass zealot = null;
        zealot.name = "Zealot";
        zealot.parentName = "Barbarian";


        Ability fanaticalFocus = null;
        fanaticalFocus.name = "Fanatical Focus";
        fanaticalFocus.actionType = "Free";
        fanaticalFocus.description = "Starting at 6th level, the divine power that fuels your rage can protect you. If you fail a saving throw while you're raging, you can reroll it, and you must use the new roll. You can use this ability only once per rage.";
        fanaticalFocus.recharge = "None";
        fanaticalFocus.spellLevel = 0;
        fanaticalFocus.requiredLevel = 6;
        zealot.subclassAbilityList.add(fanaticalFocus);

        Ability zealousPresence = null;
        zealousPresence.name = "Zealous Presence";
        zealousPresence.actionType = "Bonus";
        zealousPresence.description = "At 10th level, you learn to channel divine power to inspire zealotry in others. As a bonus action, you unleash a battle cry infused with divine energy. Up to ten other creatures of your choice within 60 feet of you that can hear you gain advantage on attack rolls and saving throws until the start of your next turn.";
        zealousPresence.recharge = "Long";
        zealousPresence.spellLevel = 0;
        zealousPresence.requiredLevel = 10;
        zealot.subclassAbilityList.add(zealousPresence);

        barbarianSubClassList.add(zealot);


        return barbarianSubClassList;
    }
    static List<SubClass> createBardSubClassList() {

        List<SubClass> bardSubClassList = null;


        SubClass glamour = null;
        glamour.name = "Glamour";
        glamour.parentName = "Bard";

        Ability mantleOfInspiration = null;
        mantleOfInspiration.name = "Mantle of Inspiration";
        mantleOfInspiration.actionType = "Bonus";
        mantleOfInspiration.description = "As a bonus action, you can expend one use of your Bardic Inspiration to grant yourself a wondrous appearance. When you do so, choose a number of creatures you can see and that can see you within 60 feet of you, up to a number equal to your Charisma modifier (minimum of one). Each of them gains 5 temporary hit points. When a creature gains these temporary hit points, it can immediately use its reaction to move up to its speed, without provoking opportunity attacks.";
        mantleOfInspiration.recharge = "None";
        mantleOfInspiration.spellLevel = 0;
        mantleOfInspiration.requiredLevel = 3;
        glamour.subclassAbilityList.add(mantleOfInspiration);

        Ability mantleOfMajesty = null;
        mantleOfMajesty.name = "Mantle of Majesty";
        mantleOfMajesty.actionType = "Bonus";
        mantleOfMajesty.description = "At 6th level, you gain the ability to cloak yourself in a fey magic that makes others want to serve you. As a bonus action, you cast command, without expending a spell slot, and you take on an appearance of unearthly beauty for 1 minute or until your concentration ends (as if you were concentrating on a spell). During this time, you can cast command as a bonus action on each of your turns, without expending a spell slot.";
        mantleOfMajesty.recharge = "Long";
        mantleOfMajesty.spellLevel = 0;
        mantleOfMajesty.requiredLevel = 6;
        glamour.subclassAbilityList.add(mantleOfMajesty);

        Ability unbreakableMajesty = null;
        unbreakableMajesty.name = "Unbreakable Majesty";
        unbreakableMajesty.actionType = "Bonus";
        unbreakableMajesty.description = "In addition, as a bonus action, you can assume a magically majestic presence for 1 minute or until you are incapacitated. For the duration, whenever any creature tries to attack you for the first time on a turn, the attacker must make a Charisma saving throw against your spell save DC. On a failed save, it can't attack you on this turn, and it must choose a new target for its attack or the attack is wasted. On a successful save, it can attack you on this turn, but it has disadvantage on any saving throw it makes against your spells on your next turn.";
        unbreakableMajesty.recharge = "Short";
        unbreakableMajesty.spellLevel = 0;
        unbreakableMajesty.requiredLevel = 14;
        glamour.subclassAbilityList.add(unbreakableMajesty);

        bardSubClassList.add(glamour);


        SubClass lore = null;
        lore.name = "Lore";
        lore.parentName = "Bard";

        Ability cuttingWords = null;
        cuttingWords.name = "Cutting Words";
        cuttingWords.actionType = "Reaction";
        cuttingWords.description = "When a creature that you can see within 60 feet of you makes an attack roll, an ability check, or a damage roll, you can use your reaction to expend one of your uses of Bardic Inspiration, rolling a Bardic Inspiration die and subtracting the number rolled from the creature's roll. You can choose to use this feature after the creature makes its roll, but before the DM determines whether the attack roll or ability check succeeds or fails, or before the creature deals its damage. The creature is immune if it can't hear you or if it's immune to being charmed.";
        cuttingWords.recharge = "None";
        cuttingWords.spellLevel = 0;
        cuttingWords.requiredLevel = 3;
        lore.subclassAbilityList.add(cuttingWords);

        Ability peerlessSkill = null;
        peerlessSkill.name = "Peerless Skill";
        peerlessSkill.actionType = "Free";
        peerlessSkill.description = "Starting at 14th level, when you make an ability check, you can expend one use of Bardic Inspiration. Roll a Bardic Inspiration die and add the number rolled to your ability check. You can choose to do so after you roll the die for the ability check, but before the DM tells you whether you succeed or fail.";
        peerlessSkill.recharge = "None";
        peerlessSkill.spellLevel = 0;
        peerlessSkill.requiredLevel = 14;
        lore.subclassAbilityList.add(peerlessSkill);

        bardSubClassList.add(lore);


        SubClass swords = null;
        swords.name = "Swords";
        swords.parentName = "Bard";


        Ability defensiveFlourish = null;
        defensiveFlourish.name = "Defensive Flourish";
        defensiveFlourish.actionType = "Action";
        defensiveFlourish.description = "You can expend one use of your Bardic Inspiration to cause the weapon to deal extra damage to the target you hit. The damage equals the number you roll on the Bardic Inspiration die. You also add the number rolled to your AC until the start of your next turn.";
        defensiveFlourish.recharge = "None";
        defensiveFlourish.spellLevel = 0;
        defensiveFlourish.requiredLevel = 3;
        swords.subclassAbilityList.add(defensiveFlourish);

        Ability mobileFlourish = null;
        mobileFlourish.name = "Mobile Flourish";
        mobileFlourish.actionType = "Action";
        mobileFlourish.description = "You can expend one use of your Bardic Inspiration to cause the weapon to deal extra damage to the target you hit. The damage equals the number you roll on the Bardic Inspiration die. You can also push the target up to 5 feet away from you, plus a number of feet equal to the number you roll on that die. You can then immediately use your reaction to move up to your walking speed to an unoccupied space within 5 feet of the target.";
        mobileFlourish.recharge = "None";
        mobileFlourish.spellLevel = 0;
        mobileFlourish.requiredLevel = 3;
        swords.subclassAbilityList.add(mobileFlourish);

        Ability slashingFlourish = null;
        slashingFlourish.name = "Slashing Flourish";
        slashingFlourish.actionType = "Action";
        slashingFlourish.description = "You can expend one use of your Bardic Inspiration to cause the weapon to deal extra damage to the target you hit and to any other creature of your choice that you can see within 5 feet of you. The damage equals the number you roll on the Bardic Inspiration die.";
        slashingFlourish.recharge = "None";
        slashingFlourish.spellLevel = 0;
        slashingFlourish.requiredLevel = 3;
        swords.subclassAbilityList.add(slashingFlourish);

        Ability extraAttack = null;
        extraAttack.name = "Extra Attack";
        extraAttack.actionType = "Action";
        extraAttack.description = "Starting at 6th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        extraAttack.recharge = "None";
        extraAttack.spellLevel = 0;
        extraAttack.requiredLevel = 6;
        swords.subclassAbilityList.add(extraAttack);

        bardSubClassList.add(swords);


        SubClass valor = null;
        valor.name = "Valor";
        valor.parentName = "Bard";


        valor.subclassAbilityList.add(extraAttack);

        Ability battleMagic = null;
        battleMagic.name = "Battle Magic";
        battleMagic.actionType = "Bonus Action";
        battleMagic.description = "At 14th level, you have mastered the art of weaving spellcasting and weapon use into a single harmonious act. When you use your action to cast a bard spell, you can make one weapon attack as a bonus action.";
        battleMagic.recharge = "None";
        battleMagic.spellLevel = 0;
        battleMagic.requiredLevel = 14;
        valor.subclassAbilityList.add(battleMagic);

        bardSubClassList.add(valor);


        SubClass whispers = null;
        whispers.name = "Whispers";
        whispers.parentName = "Bard";


        Ability psychicBlades = null;
        psychicBlades.name = "Psychic Blades";
        psychicBlades.actionType = "Free";
        psychicBlades.description = "When you hit a creature with a weapon attack, you can expend one use of your Bardic Inspiration to deal an extra 2d6 psychic damage to that target. You can do so only once per round on your turn.";
        psychicBlades.recharge = "Turn";
        psychicBlades.spellLevel = 0;
        psychicBlades.requiredLevel = 3;
        whispers.subclassAbilityList.add(psychicBlades);

        Ability mantleOfWhispers = null;
        mantleOfWhispers.name = "Mantle of Whispers";
        mantleOfWhispers.actionType = "Action";
        mantleOfWhispers.description = "At 6th level, you gain the ability to adopt a humanoid's persona. When a humanoid dies within 30 feet of you, you can magically capture its shadow using your reaction. You retain this shadow until you use it or you finish a long rest.";
        mantleOfWhispers.recharge = "None";
        mantleOfWhispers.spellLevel = 0;
        mantleOfWhispers.requiredLevel = 6;
        whispers.subclassAbilityList.add(mantleOfWhispers);

        Ability shadowLore = null;
        shadowLore.name = "Shadow Lore";
        shadowLore.actionType = "Action";
        shadowLore.description = "As an action, you magically whisper a phrase that only one creature of your choice within 30 feet of you can hear. The target must make a Wisdom saving throw against your spell save DC. It automatically succeeds if it doesn't share a language with you or if it can't hear you. On a successful saving throw, your whisper sounds like unintelligible mumbling and has no effect.";
        shadowLore.recharge = "Long";
        shadowLore.spellLevel = 0;
        shadowLore.requiredLevel = 14;
        whispers.subclassAbilityList.add(shadowLore);

        bardSubClassList.add(whispers);

        return bardSubClassList;

    }
    static List<SubClass> createClericSubClassList() {

        List<SubClass> clericSubClassList = null;


        SubClass arcana = null;
        arcana.name = "Arcana";
        arcana.parentName = "Cleric";


        Ability arcaneAbjuration = null;
        arcaneAbjuration.name = "Arcane Abjuration";
        arcaneAbjuration.actionType = "Action";
        arcaneAbjuration.description = "As an action, you present your holy symbol, and one celestial, elemental, fey, or fiend of your choice that is within 30 feet of you must make a Wisdom saving throw, provided that the creature can see or hear you. If the creature fails its saving throw, it is turned for 1 minute or until it takes any damage.";
        arcaneAbjuration.recharge = "None";
        arcaneAbjuration.spellLevel = 0;
        arcaneAbjuration.requiredLevel = 2;
        arcana.subclassAbilityList.add(arcaneAbjuration);

        clericSubClassList.add(arcana);


        SubClass death = null;
        death.name = "Death";
        death.parentName = "Cleric";

        Ability reaper = null;
        reaper.name = "Reaper";
        reaper.actionType = "Free";
        reaper.description = "At 1st level, the cleric learns one necromancy cantrip of his or her choice from any spell list. When the cleric casts a necromancy cantrip that normally targets only one creature, the spell can instead target two creatures within range and within 5 feet of each other.";
        reaper.recharge = "None";
        reaper.spellLevel = 0;
        reaper.requiredLevel = 1;
        death.subclassAbilityList.add(reaper);

        Ability touchOfDeath = null;
        touchOfDeath.name = "Touch of Death";
        touchOfDeath.actionType = "Free";
        touchOfDeath.description = "When the cleric hits a creature with a melee attack, the cleric can use Channel Divinity to deal extra necrotic damage to the target. The damage equals 5 + twice his or her cleric level.";
        touchOfDeath.recharge = "None";
        touchOfDeath.spellLevel = 0;
        touchOfDeath.requiredLevel = 2;
        death.subclassAbilityList.add(touchOfDeath);

        Ability divineStrike = null;
        divineStrike.name = "Divine Strike";
        divineStrike.actionType = "Free";
        divineStrike.description = "At 8th level, the cleric gains the ability to infuse his or her weapon strikes with necrotic energy. Once on each of the cleric's turns when he or she hits a creature with a weapon attack, the cleric can cause the attack to deal an extra 1d8 necrotic damage to the target. When the cleric reaches 14th level, the extra damage increases to 2d8.";
        divineStrike.recharge = "Turn";
        divineStrike.spellLevel = 0;
        divineStrike.requiredLevel = 8;
        death.subclassAbilityList.add(divineStrike);

        Ability improvedReaper = null;
        improvedReaper.name = "Improved Reaper";
        improvedReaper.actionType = "Free";
        improvedReaper.description = "Starting at 17th level, when the cleric casts a Necromancy spell of 1st through 5th-level that targets only one creature, the spell can instead target two creatures within range and within 5 feet of each other. If the spell consumes its material components, the cleric must provide them for each target.";
        improvedReaper.recharge = "None";
        improvedReaper.spellLevel = 0;
        improvedReaper.requiredLevel = 17;
        death.subclassAbilityList.add(improvedReaper);

        clericSubClassList.add(death);


        SubClass forge = null;
        forge.name = "Forge";
        forge.parentName = "Cleric";


        Ability divineStrikeForge = null;
        divineStrikeForge.name = "Divine Strike";
        divineStrikeForge.actionType = "Free";
        divineStrikeForge.description = "At 8th level, you gain the ability to infuse your weapon strikes with the fiery power of the forge. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 fire damage to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeForge.recharge = "Turn";
        divineStrikeForge.spellLevel = 0;
        divineStrikeForge.requiredLevel = 8;
        forge.subclassAbilityList.add(divineStrikeForge);

        clericSubClassList.add(forge);


        SubClass grave = null;
        grave.name = "Grave";
        grave.parentName = "Cleric";

        Ability circleOfMortality = null;
        circleOfMortality.name = "Circle of Mortality";
        circleOfMortality.actionType = "Bonus";
        circleOfMortality.description = "In addition, you learn the spare the dying cantrip, which doesn't count against the number of cleric cantrips you know. For you, it has a range of 30 feet, and you can cast it as a bonus action.";
        circleOfMortality.recharge = "None";
        circleOfMortality.spellLevel = 0;
        circleOfMortality.requiredLevel = 1;
        grave.subclassAbilityList.add(circleOfMortality);

        Ability eyesOfTheGrave = null;
        eyesOfTheGrave.name = "Eyes of the Grave";
        eyesOfTheGrave.actionType = "Action";
        eyesOfTheGrave.description = "At 1st level, you gain the ability to occasionally sense the presence of the undead, whose existence is an insult to the natural cycle of life. As an action, you can open your awareness to magically detect undead. Until the end of your next turn, you know the location of any undead within 60 feet of you that isn't behind total cover and that isn't protected from divination magic. This sense doesn't tell you anything about a creature's capabilities or identity.";
        eyesOfTheGrave.recharge = "None";
        eyesOfTheGrave.spellLevel = 0;
        eyesOfTheGrave.requiredLevel = 1;
        grave.subclassAbilityList.add(eyesOfTheGrave);

        Ability pathOfTheGrave = null;
        pathOfTheGrave.name = "Path of the Grave";
        pathOfTheGrave.actionType = "Action";
        pathOfTheGrave.description = "As an action, you choose one creature you can see within 30 feet of you, cursing it until the end of your next turn. The next time you or an ally of yours hits the cursed creature with an attack, the creature has vulnerability to all of that attack's damage, and then the curse ends.";
        pathOfTheGrave.recharge = "None";
        pathOfTheGrave.spellLevel = 0;
        pathOfTheGrave.requiredLevel = 2;
        grave.subclassAbilityList.add(pathOfTheGrave);

        Ability sentinelAtDeathsDoor = null;
        sentinelAtDeathsDoor.name = "Sentinel at Death\'s Door";
        sentinelAtDeathsDoor.actionType = "Reaction";
        sentinelAtDeathsDoor.description = "At 6th level, you gain the ability to impede death's progress. As a reaction when you or a creature you can see within 30 feet of you suffers a critical hit, you can turn that hit into a normal hit. Any effects triggered by a critical hit are canceled.";
        sentinelAtDeathsDoor.recharge = "None";
        sentinelAtDeathsDoor.spellLevel = 0;
        sentinelAtDeathsDoor.requiredLevel = 6;
        grave.subclassAbilityList.add(sentinelAtDeathsDoor);

        Ability keeperOfSouls = null;
        keeperOfSouls.name = "Keeper of Souls";
        keeperOfSouls.actionType = "Free";
        keeperOfSouls.description = "Starting at 17th level, you can seize a trace of vitality from a parting soul and use it to heal the living. When an enemy you can see dies within 60 feet of you, you or one creature of your choice that is within 60 feet of you regains hit points equal to the enemy's number of Hit Dice. You can use this feature only if you aren't incapacitated. Once you use it, you can't do so again until the start of your next turn.";
        keeperOfSouls.recharge = "Turn";
        keeperOfSouls.spellLevel = 0;
        keeperOfSouls.requiredLevel = 17;
        grave.subclassAbilityList.add(keeperOfSouls);


        SubClass knowledge = null;
        knowledge.name = "Knowledge";
        knowledge.parentName = "Cleric";

        Ability knowledgeOfTheAges = null;
        knowledgeOfTheAges.name = "Knowledge of the Ages";
        knowledgeOfTheAges.actionType = "Action";
        knowledgeOfTheAges.description = "Starting at 2nd level, you can use your Channel Divinity to tap into a divine well of knowledge. As an action, you choose one skill or tool. For 10 minutes, you have proficiency with the chosen skill or tool.";
        knowledgeOfTheAges.recharge = "None";
        knowledgeOfTheAges.spellLevel = 0;
        knowledgeOfTheAges.requiredLevel = 2;
        knowledge.subclassAbilityList.add(knowledgeOfTheAges);

        Ability readThoughts = null;
        readThoughts.name = "Read Thoughts";
        readThoughts.actionType = "Action";
        readThoughts.description = "As an action, choose one creature that you can see within 60 feet of you. That creature must make a Wisdom saving throw. If the creature succeeds on the saving throw, you can't use this feature on it again until you finish a long rest.";
        readThoughts.recharge = "None";
        readThoughts.spellLevel = 0;
        readThoughts.requiredLevel = 6;
        knowledge.subclassAbilityList.add(readThoughts);

        clericSubClassList.add(knowledge);


        SubClass life = null;
        life.name = "Life";
        life.parentName = "Cleric";


        Ability preserveLife = null;
        preserveLife.name = "Preserve Life";
        preserveLife.actionType = "Action";
        preserveLife.description = "As an action, you present your holy symbol and evoke healing energy that can restore a number of hit points equal to five times your cleric level. Choose any creatures within 30 feet of you, and divide those hit points among them. This feature can restore a creature to no more than half of its hit point maximum. You can't use this feature on an undead or a construct.";
        preserveLife.recharge = "None";
        preserveLife.spellLevel = 0;
        preserveLife.requiredLevel = 2;
        life.subclassAbilityList.add(preserveLife);

        Ability divineStrikeLife = null;
        divineStrikeLife.name = "Divine Strike";
        divineStrikeLife.actionType = "Free";
        divineStrikeLife.description = "At 8th level, you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 radiant damage to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeLife.recharge = "Turn";
        divineStrikeLife.spellLevel = 0;
        divineStrikeLife.requiredLevel = 8;
        life.subclassAbilityList.add(divineStrikeLife);

        clericSubClassList.add(life);


        SubClass light = null;
        light.name = "Light";
        light.parentName = "Cleric";

        Ability wardingFlare = null;
        wardingFlare.name = "Warding Flare";
        wardingFlare.actionType = "Reaction";
        wardingFlare.description = "Also at 1st level, you can interpose divine light between yourself and an attacking enemy. When you are attacked by a creature within 30 feet of you that you can see, you can use your reaction to impose disadvantage on the attack roll, causing light to flare before the attacker before it hits or misses. An attacker that can't be blinded is immune to this feature.";
        wardingFlare.recharge = "None";
        wardingFlare.spellLevel = 0;
        wardingFlare.requiredLevel = 1;
        light.subclassAbilityList.add(wardingFlare);

        Ability radianceOfTheDawn = null;
        radianceOfTheDawn.name = "Radiance of the Dawn";
        radianceOfTheDawn.actionType = "Action";
        radianceOfTheDawn.description = "As an action, you present your holy symbol, and any magical darkness within 30 feet of you is dispelled. Additionally, each hostile creature within 30 feet of you must make a Constitution saving throw. A creature takes radiant damage equal to 2d10 + your cleric level on a failed saving throw, and half as much damage on a successful one. A creature that has total cover from you is not affected.";
        radianceOfTheDawn.recharge = "None";
        radianceOfTheDawn.spellLevel = 0;
        radianceOfTheDawn.requiredLevel = 2;
        light.subclassAbilityList.add(radianceOfTheDawn);

        Ability coronaOfLight = null;
        coronaOfLight.name = "Corona of Light";
        coronaOfLight.actionType = "Action";
        coronaOfLight.description = "Starting at 17th level, you can use your action to activate an aura of sunlight that lasts for 1 minute or until you dismiss it using another action. You emit bright light in a 60-foot radius and dim light 30 feet beyond that. Your enemies in the bright light have disadvantage on saving throws against any spell that deals fire or radiant damage.";
        coronaOfLight.recharge = "None";
        coronaOfLight.spellLevel = 0;
        coronaOfLight.requiredLevel = 17;
        light.subclassAbilityList.add(coronaOfLight);

        clericSubClassList.add(light);

        SubClass nature = null;
        nature.name = "Nature";
        nature.parentName = "Cleric";


        Ability charmAnimalsAndPlants = null;
        charmAnimalsAndPlants.name = "Charm Animals and Plants";
        charmAnimalsAndPlants.actionType = "Action";
        charmAnimalsAndPlants.description = "As an action, you present your holy symbol and invoke the name of your deity. Each beast or plant creature that can see you within 30 feet of you must make a Wisdom saving throw. If the creature fails its saving throw, it is charmed by you for 1 minute or until it takes damage. While it is charmed by you, it is friendly to you and other creatures you designate.";
        charmAnimalsAndPlants.recharge = "None";
        charmAnimalsAndPlants.spellLevel = 0;
        charmAnimalsAndPlants.requiredLevel = 2;
        nature.subclassAbilityList.add(charmAnimalsAndPlants);

        Ability dampenElements = null;
        dampenElements.name = "Dampen Elements";
        dampenElements.actionType = "Reaction";
        dampenElements.description = "Starting at 6th level, when you or a creature within 30 feet of you takes acid, cold, fire, lightning, or thunder damage, you can use your reaction to grant resistance to the creature against that instance of the damage.";
        dampenElements.recharge = "None";
        dampenElements.spellLevel = 0;
        dampenElements.requiredLevel = 6;
        nature.subclassAbilityList.add(dampenElements);

        Ability divineStrikeNature = null;
        divineStrikeNature.name = "Divine Strike";
        divineStrikeNature.actionType = "Free";
        divineStrikeNature.description = "At 8th level, you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 cold, fire, or lightning damage (your choice) to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeNature.recharge = "Turn";
        divineStrikeNature.spellLevel = 0;
        divineStrikeNature.requiredLevel = 8;
        nature.subclassAbilityList.add(divineStrikeNature);

        Ability masterOfNature = null;
        masterOfNature.name = "Master of Nature";
        masterOfNature.actionType = "Bonus";
        masterOfNature.description = "At 17th level, you gain the ability to command animals and plant creatures. While creatures are charmed by your Charm Animals and Plants feature, you can take a bonus action on your turn to verbally command what each of those creatures will do on its next turn.";
        masterOfNature.recharge = "None";
        masterOfNature.spellLevel = 0;
        masterOfNature.requiredLevel = 17;
        nature.subclassAbilityList.add(masterOfNature);

        clericSubClassList.add(nature);


        SubClass order = null;
        order.name = "Order";
        order.parentName = "Cleric";


        Ability voiceOfAuthority = null;
        voiceOfAuthority.name = "Voice of Authority";
        voiceOfAuthority.actionType = "Free";
        voiceOfAuthority.description = "Starting at 1st level, you can invoke the power of law to drive an ally to attack. If you cast a spell with a spell slot of 1st level or higher and target an ally with the spell, that ally can use their reaction immediately after the spell to make one weapon attack against a creature of your choice that you can see.";
        voiceOfAuthority.recharge = "None";
        voiceOfAuthority.spellLevel = 0;
        voiceOfAuthority.requiredLevel = 1;
        order.subclassAbilityList.add(voiceOfAuthority);

        Ability ordersDemand = null;
        ordersDemand.name = "Order\'s Demand";
        ordersDemand.actionType = "Action";
        ordersDemand.description = "As an action, you present your holy symbol, and each creature of your choice that can see or hear you within 30 feet of you must succeed on a Wisdom saving throw or be charmed by you until the end of your next turn or until the charmed creature takes any damage. You can also cause any of the charmed creatures to drop what they are holding when they fail the saving throw.";
        ordersDemand.recharge = "None";
        ordersDemand.spellLevel = 0;
        ordersDemand.requiredLevel = 2;
        order.subclassAbilityList.add(ordersDemand);

        Ability embodimentOfTheLaw = null;
        embodimentOfTheLaw.name = "Embodiment of the Law";
        embodimentOfTheLaw.actionType = "Bonus";
        embodimentOfTheLaw.description = "If you cast a spell of the enchantment school using a spell slot of 1st level or higher, you can change the spell's casting time to 1 bonus action for this casting, provided the spell's casting time is normally 1 action.";
        embodimentOfTheLaw.recharge = "None";
        embodimentOfTheLaw.spellLevel = 0;
        embodimentOfTheLaw.requiredLevel = 6;
        order.subclassAbilityList.add(embodimentOfTheLaw);

        Ability divineStrikeOrder = null;
        divineStrikeOrder.name = "Divine Strike";
        divineStrikeOrder.actionType = "Free";
        divineStrikeOrder.description = "At 8th level, you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 psychic damage to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeOrder.recharge = "None";
        divineStrikeOrder.spellLevel = 0;
        divineStrikeOrder.requiredLevel = 8;
        order.subclassAbilityList.add(divineStrikeOrder);

        Ability ordersWrath = null;
        ordersWrath.name = "Order\'s Wrath";
        ordersWrath.actionType = "Free";
        ordersWrath.description = "Starting at 17th level, enemies you designate for destruction wilt under the combined efforts of you and your allies. If you deal your Divine Strike damage to a creature on your turn, you can curse that creature until the start of your next turn. The next time one of your allies hits the cursed creature with an attack, the target also takes 2d8 psychic damage, and the curse ends. You can curse a creature in this way only once per turn.";
        ordersWrath.recharge = "Turn";
        ordersWrath.spellLevel = 0;
        ordersWrath.requiredLevel = 17;
        order.subclassAbilityList.add(ordersWrath);

        clericSubClassList.add(order);


        SubClass tempest = null;
        tempest.name = "Tempest";
        tempest.parentName = "Cleric";


        Ability wrathOfTheStorm = null;
        wrathOfTheStorm.name = "Wrath of the Storm";
        wrathOfTheStorm.actionType = "Reaction";
        wrathOfTheStorm.description = "When a creature within 5 feet of you that you can see hits you with an attack, you can use your reaction to cause the creature to make a Dexterity saving throw. The creature takes 2d8 lightning or thunder damage (your choice) on a failed saving throw, and half as much damage on a successful one.";
        wrathOfTheStorm.recharge = "None";
        wrathOfTheStorm.spellLevel = 0;
        wrathOfTheStorm.requiredLevel = 1;
        tempest.subclassAbilityList.add(wrathOfTheStorm);

        Ability destructiveWrath = null;
        destructiveWrath.name = "Destructive Wrath";
        destructiveWrath.actionType = "Free";
        destructiveWrath.description = "When you roll lightning or thunder damage, you can use your Channel Divinity to deal maximum damage, instead of rolling.";
        destructiveWrath.recharge = "None";
        destructiveWrath.spellLevel = 0;
        destructiveWrath.requiredLevel = 2;
        tempest.subclassAbilityList.add(destructiveWrath);

        Ability thunderboltStrike = null;
        thunderboltStrike.name = "Thunderbolt Strike";
        thunderboltStrike.actionType = "Free";
        thunderboltStrike.description = "At 6th level, when you deal lightning damage to a Large or smaller creature, you can also push it up to 10 feet away from you.";
        thunderboltStrike.recharge = "None";
        thunderboltStrike.spellLevel = 0;
        thunderboltStrike.requiredLevel = 6;
        tempest.subclassAbilityList.add(thunderboltStrike);

        Ability divineStrikeTempest = null;
        divineStrikeTempest.name = "Divine Strike";
        divineStrikeTempest.actionType = "Free";
        divineStrikeTempest.description = "At 8th level, you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 thunder damage to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeTempest.recharge = "Turn";
        divineStrikeTempest.spellLevel = 0;
        divineStrikeTempest.requiredLevel = 8;
        tempest.subclassAbilityList.add(divineStrikeTempest);

        clericSubClassList.add(tempest);


        SubClass trickery = null;
        trickery.name = "Trickery";
        trickery.parentName = "Cleric";


        Ability blessingOfTheTrickster = null;
        blessingOfTheTrickster.name = "Blessing of the Trickster";
        blessingOfTheTrickster.actionType = "Action";
        blessingOfTheTrickster.description = "You can use your action to touch a willing creature other than yourself to give it advantage on Dexterity (Stealth) checks. This blessing lasts for 1 hour or until you use this feature again.";
        blessingOfTheTrickster.recharge = "None";
        blessingOfTheTrickster.spellLevel = 0;
        blessingOfTheTrickster.requiredLevel = 1;
        trickery.subclassAbilityList.add(blessingOfTheTrickster);

        Ability invokeDuplicity = null;
        invokeDuplicity.name = "Invoke Duplicity";
        invokeDuplicity.actionType = "Action";
        invokeDuplicity.description = "As an action, you create a perfect illusion of yourself that lasts for 1 minute, or until you lose your concentration (as if you were concentrating on a spell). The illusion appears in an unoccupied space that you can see within 30 feet of you. As a bonus action on your turn, you can move the illusion up to 30 feet to a space you can see, but it must remain within 120 feet of you.";
        invokeDuplicity.recharge = "None";
        invokeDuplicity.spellLevel = 0;
        invokeDuplicity.requiredLevel = 2;
        trickery.subclassAbilityList.add(invokeDuplicity);

        Ability cloakOfShadows = null;
        cloakOfShadows.name = "Cloak of Shadows";
        cloakOfShadows.actionType = "Action";
        cloakOfShadows.description = "As an action, you become invisible until the end of your next turn. You become visible if you attack or cast a spell.";
        cloakOfShadows.recharge = "None";
        cloakOfShadows.spellLevel = 0;
        cloakOfShadows.requiredLevel = 6;
        trickery.subclassAbilityList.add(cloakOfShadows);

        Ability divineStrikeTrickery = null;
        divineStrikeTrickery.name = "Divine Strike";
        divineStrikeTrickery.actionType = "Free";
        divineStrikeTrickery.description = "At 8th level, you gain the ability to infuse your weapon strikes with poison—a gift from your deity. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 poison damage to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeTrickery.recharge = "Turn";
        divineStrikeTrickery.spellLevel = 0;
        divineStrikeTrickery.requiredLevel = 8;
        trickery.subclassAbilityList.add(divineStrikeTrickery);

        Ability improvedDuplicity = null;
        improvedDuplicity.name = "Improved Duplicity";
        improvedDuplicity.actionType = "Action";
        improvedDuplicity.description = "At 17th level, you can create up to four duplicates of yourself, instead of one, when you use Invoke Duplicity. As a bonus action on your turn, you can move any number of them up to 30 feet, to a maximum range of 120 feet.";
        improvedDuplicity.recharge = "None";
        improvedDuplicity.spellLevel = 0;
        improvedDuplicity.requiredLevel = 17;
        trickery.subclassAbilityList.add(improvedDuplicity);

        clericSubClassList.add(trickery);


        SubClass war = null;
        war.name = "War";
        war.parentName = "Cleric";


        Ability warPriest = null;
        warPriest.name = "War Priest";
        warPriest.actionType = "Bonus Action";
        warPriest.description = "From 1st level, your god delivers bolts of inspiration to you while you are engaged in battle. When you use the Attack action, you can make one weapon attack as a bonus action. You can use this feature a number of times equal to your Wisdom modifier (a minimum of once). You regain all expended uses when you finish a long rest.";
        warPriest.recharge = "None";
        warPriest.spellLevel = 0;
        warPriest.requiredLevel = 1;
        war.subclassAbilityList.add(warPriest);

        Ability guidedStrike = null;
        guidedStrike.name = "Guided Strike";
        guidedStrike.actionType = "Free";
        guidedStrike.description = "Starting at 2nd level, you can use your Channel Divinity to strike with supernatural accuracy. When you make an attack roll, you can use your Channel Divinity to gain a +10 bonus to the roll. You make this choice after you see the roll, but before the DM says whether the attack hits or misses.";
        guidedStrike.recharge = "None";
        guidedStrike.spellLevel = 0;
        guidedStrike.requiredLevel = 2;
        war.subclassAbilityList.add(guidedStrike);

        Ability warGodsBlessing = null;
        warGodsBlessing.name = "War God\'s Blessing";
        warGodsBlessing.actionType = "Reaction";
        warGodsBlessing.description = "At 6th level, when a creature within 30 feet of you makes an attack roll, you can use your reaction to grant that creature a +10 bonus to the roll, using your Channel Divinity. You make this choice after you see the roll, but before the DM says whether the attack hits or misses.";
        warGodsBlessing.recharge = "None";
        warGodsBlessing.spellLevel = 0;
        warGodsBlessing.requiredLevel = 6;
        war.subclassAbilityList.add(warGodsBlessing);

        Ability divineStrikeWar = null;
        divineStrikeWar.name = "Divine Strike";
        divineStrikeWar.actionType = "Free";
        divineStrikeWar.description = "At 8th level, you gain the ability to infuse your weapon strikes with divine energy. Once on each of your turns when you hit a creature with a weapon attack, you can cause the attack to deal an extra 1d8 damage of the same type dealt by the weapon to the target. When you reach 14th level, the extra damage increases to 2d8.";
        divineStrikeWar.recharge = "Free";
        divineStrikeWar.spellLevel = 0;
        divineStrikeWar.requiredLevel = 8;
        war.subclassAbilityList.add(divineStrikeWar);

        clericSubClassList.add(war);

        return clericSubClassList;
    }
    static List<SubClass> createDruidSubClassList() {

        List<SubClass> druidSubClassList = null;


        SubClass dreams = null;
        dreams.name = "Dreams";
        dreams.parentName = "Druid";


        Ability balmOfTheSummerCourt = null;
        balmOfTheSummerCourt.name = "Balm of the Summer Court";
        balmOfTheSummerCourt.actionType = "Bonus";
        balmOfTheSummerCourt.description = "As a bonus action, you can choose one creature you can see within 120 feet of you and spend a number of those dice equal to half your druid level or less. Roll the spent dice and add them together. The target regains a number of hit points equal to the total. The target also gains 1 temporary hit point per die spent.";
        balmOfTheSummerCourt.recharge = "None";
        balmOfTheSummerCourt.spellLevel = 0;
        balmOfTheSummerCourt.requiredLevel = 2;
        dreams.subclassAbilityList.add(balmOfTheSummerCourt);

        Ability hiddenPaths = null;
        hiddenPaths.name = "Hidden Paths";
        hiddenPaths.actionType = "Bonus";
        hiddenPaths.description = "As a bonus action on your turn, you can teleport up to 60 feet to an unoccupied space you can see. Alternatively, you can use your action to teleport one willing creature you touch up to 30 feet to an unoccupied space you can see.";
        hiddenPaths.recharge = "None";
        hiddenPaths.spellLevel = 0;
        hiddenPaths.requiredLevel = 10;
        dreams.subclassAbilityList.add(hiddenPaths);

        druidSubClassList.add(dreams);


        SubClass land = null;
        land.name = "Land";
        land.parentName = "Druid";

        druidSubClassList.add(land);


        SubClass moon = null;
        moon.name = "Moon";
        moon.parentName = "Druid";

        Ability combatWildShape = null;
        combatWildShape.name = "Combat Wild Shape";
        combatWildShape.actionType = "Bonus";
        combatWildShape.description = "You gain the ability to use Wild Shape on your turn as a bonus action, rather than as an action. Additionally, while you are transformed by Wild Shape, you can use a bonus action to expend one spell slot to regain 1d8 hit points per level of the spell slot expended.";
        combatWildShape.recharge = "None";
        combatWildShape.spellLevel = 0;
        combatWildShape.requiredLevel = 2;
        moon.subclassAbilityList.add(combatWildShape);

        Ability elementalWildShape = null;
        elementalWildShape.name = "Elemental Wild Shape";
        elementalWildShape.actionType = "Bonus";
        elementalWildShape.description = "At 10th level, you can expend two uses of Wild Shape at the same time to transform into an air elemental, an earth elemental, a fire elemental, or a water elemental.";
        elementalWildShape.recharge = "None";
        elementalWildShape.spellLevel = 0;
        elementalWildShape.requiredLevel = 10;
        moon.subclassAbilityList.add(elementalWildShape);

        Ability thousandForms = null;
        thousandForms.name = "Thousand Forms";
        thousandForms.actionType = "Free";
        thousandForms.description = "By 14th level, you have learned to use magic to alter your physical form in more subtle ways. You can cast the alter self spell at will.";
        thousandForms.recharge = "None";
        thousandForms.spellLevel = 0;
        thousandForms.requiredLevel = 14;
        moon.subclassAbilityList.add(thousandForms);

        druidSubClassList.add(moon);


        SubClass shepherd = null;
        shepherd.name = "Shepherd";
        shepherd.parentName = "Druid";

        Ability spiritTotem = null;
        spiritTotem.name = "Spirit Totem";
        spiritTotem.actionType = "Action";
        spiritTotem.description = "As a bonus action, you can magically summon an incorporeal spirit to a point you can see within 60 feet of you. The spirit creates an aura in a 30-foot radius around that point. It counts as neither a creature nor an object, though it has the spectral appearance of the creature it represents. As a bonus action, you can move the spirit up to 60 feet to a point you can see.";
        spiritTotem.recharge = "Short";
        spiritTotem.spellLevel = 0;
        spiritTotem.requiredLevel = 2;
        shepherd.subclassAbilityList.add(spiritTotem);

        Ability hawkSpirit = null;
        hawkSpirit.name = "Hawk Spirit";
        hawkSpirit.actionType = "Reaction";
        hawkSpirit.description = "When a creature makes an attack roll against a target in the spirit's aura, you can use your reaction to grant advantage to that attack roll. In addition, you and your allies have advantage on Wisdom (Perception) checks while in the aura.";
        hawkSpirit.recharge = "None";
        hawkSpirit.spellLevel = 0;
        hawkSpirit.requiredLevel = 2;
        shepherd.subclassAbilityList.add(hawkSpirit);

        Ability faithfulSummons = null;
        faithfulSummons.name = "Faithful Summons";
        faithfulSummons.actionType = "Free";
        faithfulSummons.description = "Starting at 14th level, the nature spirits you commune with protect you when you are the most defenseless. If you are reduced to 0 hit points or are incapacitated against your will, you can immediately gain the benefits of conjure animals as if it were cast using a 9th-level spell slot. It summons four beasts of your choice that are challenge rating 2 or lower. The conjured beasts appear within 20 feet of you. If they receive no commands from you, they protect you from harm and attack your foes. The spell lasts for 1 hour, requiring no concentration, or until you dismiss it (no action required).";
        faithfulSummons.recharge = "Long";
        faithfulSummons.spellLevel = 0;
        faithfulSummons.requiredLevel = 14;
        shepherd.subclassAbilityList.add(faithfulSummons);

        druidSubClassList.add(shepherd);


        SubClass spores = null;
        spores.name = "Spores";
        spores.parentName = "Druid";

        Ability haloOfSpores = null;
        haloOfSpores.name = "Halo of Spores";
        haloOfSpores.actionType = "Reaction";
        haloOfSpores.description = "Starting at 2nd level, you are surrounded by invisible, necrotic spores that are harmless until you unleash them on a creature nearby. When a creature you can see moves into a space within 10 feet of you or starts its turn there, you can use your reaction to deal 1d4 necrotic damage to that creature unless it succeeds on a Constitution saving throw against your spell save DC. The necrotic damage increases to 1d6 at 6th level, 1d8 at 10th level, and 1d10 at 14th level.";
        haloOfSpores.recharge = "None";
        haloOfSpores.spellLevel = 0;
        haloOfSpores.requiredLevel = 2;
        spores.subclassAbilityList.add(haloOfSpores);

        Ability symbioticEntity = null;
        symbioticEntity.name = "Symbiotic Entity";
        symbioticEntity.actionType = "Action";
        symbioticEntity.description = "At 2nd level, you gain the ability to channel magic into your spores. As an action, you can expend a use of your Wild Shape feature to awaken those spores, rather than transforming into a beast form, and you gain 4 temporary hit points for each level you have in this class";
        symbioticEntity.recharge = "None";
        symbioticEntity.spellLevel = 0;
        symbioticEntity.requiredLevel = 2;
        spores.subclassAbilityList.add(symbioticEntity);

        Ability fungalInfestation = null;
        fungalInfestation.name = "Fungal Infestation";
        fungalInfestation.actionType = "Reaction";
        fungalInfestation.description = "At 6th level, your spores gain the ability to infest a corpse and animate it. If a beast or a humanoid that is Small or Medium dies within 10 feet of you, you can use your reaction to animate it, causing it to stand up immediately with 1 hit point. The creature uses the zombie stat block in the Monster Manual. It remains animate for 1 hour, after which time it collapses and dies.";
        fungalInfestation.recharge = "None";
        fungalInfestation.spellLevel = 0;
        fungalInfestation.requiredLevel = 6;
        spores.subclassAbilityList.add(fungalInfestation);

        Ability spreadingSpores = null;
        spreadingSpores.name = "Spreading Spores";
        spreadingSpores.actionType = "Bonus";
        spreadingSpores.description = "At 10th level, you gain the ability to seed an area with deadly spores. As a bonus action while your Symbiotic Entity feature is active, you can hurl spores up to 30 feet away, where they swirl in a 10-foot cube for 1 minute. The spores disappear early if you use this feature again, if you dismiss them as a bonus action, or if your Symbiotic Entity feature is no longer active.";
        spreadingSpores.recharge = "None";
        spreadingSpores.spellLevel = 0;
        spreadingSpores.requiredLevel = 10;
        spores.subclassAbilityList.add(spreadingSpores);

        druidSubClassList.add(spores);

        return druidSubClassList;

    }
    static List<SubClass> createFighterSubClassList() {

        List<SubClass> fighterSubClassList = null;


        SubClass arcaneArcher = null;
        arcaneArcher.name = "Arcane Archer";
        arcaneArcher.parentName = "Fighter";


        Ability banishingArrow = null;
        banishingArrow.name = "Banishing Arrow";
        banishingArrow.actionType = "Action";
        banishingArrow.description = "You use abjuration magic to try to temporarily banish your target to a harmless location in the Feywild. The creature hit by the arrow must also succeed on a Charisma saving throw or be banished. While banished in this way, the target's speed is 0, and it is incapacitated. At the end of its next turn, the target reappears in the space it vacated or in the nearest unoccupied space if that space is occupied.";
        banishingArrow.recharge = "Turn";
        banishingArrow.spellLevel = 0;
        banishingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(banishingArrow);

        Ability beguilingArrow = null;
        beguilingArrow.name = "Beguiling Arrow";
        beguilingArrow.actionType = "Action";
        beguilingArrow.description = "our enchantment magic causes this arrow to temporarily beguile its target. The creature hit by the arrow takes an extra 2d6 psychic damage, and choose one of your allies within 30 feet of the target. The target must succeed on a Wisdom saving throw, or it is charmed by the chosen ally until the start of your next turn. This effect ends early if the chosen ally attacks the charmed target, deals damage to it, or forces it to make a saving throw.";
        beguilingArrow.recharge = "Turn";
        beguilingArrow.spellLevel = 0;
        beguilingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(beguilingArrow);

        Ability burstingArrow = null;
        burstingArrow.name = "Bursting Arrow";
        burstingArrow.actionType = "Action";
        burstingArrow.description = "You imbue your arrow with force energy drawn from the school of evocation. The energy detonates after your attack. Immediately after the arrow hits the creature, the target and all other creatures within 10 feet of it take 2d6 force damage each.";
        burstingArrow.recharge = "Turn";
        burstingArrow.spellLevel = 0;
        burstingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(burstingArrow);

        Ability enfeeblingArrow = null;
        enfeeblingArrow.name = "Enfeebling Arrow";
        enfeeblingArrow.actionType = "Action";
        enfeeblingArrow.description = "You weave necromantic magic into your arrow. The creature hit by the arrow takes an extra 2d6 necrotic damage. The target must also succeed on a Constitution saving throw, or the damage dealt by its weapon attacks is halved until the start of your next turn.";
        enfeeblingArrow.recharge = "Turn";
        enfeeblingArrow.spellLevel = 0;
        enfeeblingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(enfeeblingArrow);

        Ability graspingArrow = null;
        graspingArrow.name = "Grasping Arrow";
        graspingArrow.actionType = "Action";
        graspingArrow.description = "When this arrow strikes its target, conjuration magic creates grasping, poisonous brambles, which wrap around the target. The creature hit by the arrow takes an extra 2d6 poison damage, its speed is reduced by 10 feet, and it takes 2d6 slashing damage the first time on each turn it moves 1 foot or more without teleporting. The target or any creature that can reach it can use its action to remove the brambles with a successful Strength (Athletics) check against your Arcane Shot save DC. Otherwise, the brambles last for 1 minute or until you use this option again.";
        graspingArrow.recharge = "Turn";
        graspingArrow.spellLevel = 0;
        graspingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(graspingArrow);

        Ability piercingArrow = null;
        piercingArrow.name = "Piercing Arrow";
        piercingArrow.actionType = "Action";
        piercingArrow.description = "You use transmutation magic to give your arrow an ethereal quality. When you use this option, you don't make an attack roll for the attack. Instead, the arrow shoots forward in a line, which is 1 foot wide and 30 feet long, before disappearing. The arrow passes harmlessly through objects, ignoring cover. Each creature in that line must make a Dexterity saving throw. On a failed save, a creature takes damage as if it were hit by the arrow, plus an extra 1d6 piercing damage. On a successful save, a target takes half as much damage.";
        piercingArrow.recharge = "Turn";
        piercingArrow.spellLevel = 0;
        piercingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(piercingArrow);

        Ability seekingArrow = null;
        seekingArrow.name = "Seeking Arrow";
        seekingArrow.actionType = "Action";
        seekingArrow.description = "Using divination magic, you grant your arrow the ability to seek out a target. When you use this option, you don't make an attack roll for the attack. Instead, choose one creature you have seen in the past minute. The arrow flies toward that creature, moving around corners if necessary and ignoring three-quarters cover and half cover. If the target is within the weapon's range and there is a path large enough for the arrow to travel to the target, the target must make a Dexterity saving throw. Otherwise, the arrow disappears after traveling as far as it can. On a failed save, the target takes damage as if it were hit by the arrow, plus an extra 1d6 force damage, and you learn the target's current location. On a successful save, the target takes half as much damage, and you don't learn its location.";
        seekingArrow.recharge = "Turn";
        seekingArrow.spellLevel = 0;
        seekingArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(seekingArrow);

        Ability shadowArrow = null;
        shadowArrow.name = "Shadow Arrow";
        shadowArrow.actionType = "Action";
        shadowArrow.description = "You weave illusion magic into your arrow, causing it to occlude your foe's vision with shadows. The creature hit by the arrow takes an extra 2d6 psychic damage, and it must succeed on a Wisdom saving throw or be unable to see anything farther than 5 feet away until the start of your next turn.";
        shadowArrow.recharge = "Turn";
        shadowArrow.spellLevel = 0;
        shadowArrow.requiredLevel = 3;
        arcaneArcher.subclassAbilityList.add(shadowArrow);

        Ability magicArrow = null;
        magicArrow.name = "Magic Arrow";
        magicArrow.actionType = "Free";
        magicArrow.description = "At 7th level, you gain the ability to infuse arrows with magic. Whenever you fire a nonmagical arrow from a shortbow or longbow, you can make it magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage. The magic fades from the arrow immediately after it hits or misses its target.";
        magicArrow.recharge = "None";
        magicArrow.spellLevel = 0;
        magicArrow.requiredLevel = 7;
        arcaneArcher.subclassAbilityList.add(magicArrow);

        Ability curvingShot = null;
        curvingShot.name = "Curving Shot";
        curvingShot.actionType = "Bonus";
        curvingShot.description = "At 7th level, you learn how to direct an errant arrow toward a new target. When you make an attack roll with a magic arrow and miss, you can use a bonus action to reroll the attack roll against a different target within 60 feet of the original target.";
        curvingShot.recharge = "None";
        curvingShot.spellLevel = 0;
        curvingShot.requiredLevel = 7;
        arcaneArcher.subclassAbilityList.add(curvingShot);

        fighterSubClassList.add(arcaneArcher);


        SubClass battleMaster = null;
        battleMaster.name = "Battle Master";
        battleMaster.parentName = "Fighter";

        Ability commandersStrike = null;
        commandersStrike.name = "Commander\'s Strike";
        commandersStrike.actionType = "Bonus";
        commandersStrike.description = "When you take the Attack action on your turn, you can forgo one of your attacks and use a bonus action to direct one of your companions to strike. When you do so, choose a friendly creature who can see or hear you and expend one superiority die. That creature can immediately use its reaction to make one weapon attack, adding the superiority die to the attack's damage roll.";
        commandersStrike.recharge = "None";
        commandersStrike.spellLevel = 0;
        commandersStrike.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(commandersStrike);

        Ability disarmingAttack = null;
        disarmingAttack.name = "Disarming Attack";
        disarmingAttack.actionType = "Free";
        disarmingAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to attempt to disarm the target, forcing it to drop one item of your choice that it's holding. You add the superiority die to the attack's damage roll, and the target must make a Strength saving throw. On a failed save, it drops the object you choose. The object lands at its feet.";
        disarmingAttack.recharge = "None";
        disarmingAttack.spellLevel = 0;
        disarmingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(disarmingAttack);

        Ability distractingStrike = null;
        distractingStrike.name = "Distracting Strike";
        distractingStrike.actionType = "Free";
        distractingStrike.description = "When you hit a creature with a weapon attack, you can expend one superiority die to distract the creature, giving your allies an opening. You add the superiority die to the attack's damage roll. The next attack roll against the target by an attacker other than you has advantage if the attack is made before the start of your next turn.";
        distractingStrike.recharge = "None";
        distractingStrike.spellLevel = 0;
        distractingStrike.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(distractingStrike);

        Ability evasiveFootwork = null;
        evasiveFootwork.name = "Evasive Footwork";
        evasiveFootwork.actionType = "Free";
        evasiveFootwork.description = "When you move, you can expend one superiority die, rolling the die and adding the number rolled to your AC until you stop moving.";
        evasiveFootwork.recharge = "None";
        evasiveFootwork.spellLevel = 0;
        evasiveFootwork.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(evasiveFootwork);

        Ability feintingAttack = null;
        feintingAttack.name = "Feinting Attack";
        feintingAttack.actionType = "Bonus";
        feintingAttack.description = "You can expend one superiority die and use a bonus action on your turn to feint, choosing one creature within 5 feet of you as your target. You have advantage on your next attack roll this turn against that creature. If that attack hits, add the superiority die to the attack's damage roll.";
        feintingAttack.recharge = "None";
        feintingAttack.spellLevel = 0;
        feintingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(feintingAttack);

        Ability goadingAttack = null;
        goadingAttack.name = "Goading Attack";
        goadingAttack.actionType = "Free";
        goadingAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to attempt to goad the target into attacking you. You add the superiority die to the attack's damage roll, and the target must make a Wisdom saving throw. On a failed save, the target has disadvantage on all attack rolls against targets other than you until the end of your next turn.";
        goadingAttack.recharge = "None";
        goadingAttack.spellLevel = 0;
        goadingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(goadingAttack);

        Ability lungingAttack = null;
        lungingAttack.name = "Lunging Attack";
        lungingAttack.actionType = "Free";
        lungingAttack.description = "When you make a melee weapon attack on your turn, you can expend one superiority die to increase your reach for that attack by 5 feet. If you hit, you add the superiority die to the attack's damage roll.";
        lungingAttack.recharge = "None";
        lungingAttack.spellLevel = 0;
        lungingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(lungingAttack);

        Ability maneuveringAttack = null;
        maneuveringAttack.name = "Maneuvering Attack";
        maneuveringAttack.actionType = "Free";
        maneuveringAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to maneuver one of your comrades into a more advantageous position. You add the superiority die to the attack's damage roll, and you choose a friendly creature who can see or hear you. That creature can use its reaction to move up to half its speed without provoking opportunity attacks from the target of your attack.";
        maneuveringAttack.recharge = "None";
        maneuveringAttack.spellLevel = 0;
        maneuveringAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(maneuveringAttack);

        Ability menacingAttack = null;
        menacingAttack.name = "Menacing Attack";
        menacingAttack.actionType = "Free";
        menacingAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to attempt to frighten the target. You add the superiority die to the attack's damage roll, and the target must make a Wisdom saving throw. On a failed save, it is frightened of you until the end of your next turn.";
        menacingAttack.recharge = "None";
        menacingAttack.spellLevel = 0;
        menacingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(menacingAttack);

        Ability parry = null;
        parry.name = "Parry";
        parry.actionType = "Reaction";
        parry.description = "When another creature damages you with a melee attack, you can use your reaction and expend one superiority die to reduce the damage by the number you roll on your superiority die + your Dexterity modifier.";
        parry.recharge = "None";
        parry.spellLevel = 0;
        parry.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(parry);

        Ability precisionAttack = null;
        precisionAttack.name = "Precision Attack";
        precisionAttack.actionType = "Free";
        precisionAttack.description = "When you make a weapon attack roll against a creature, you can expend one superiority die to add it to the roll. You can use this maneuver before or after making the attack roll, but before any effects of the attack are applied.";
        precisionAttack.recharge = "None";
        precisionAttack.spellLevel = 0;
        precisionAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(precisionAttack);

        Ability pushingAttack = null;
        pushingAttack.name = "Pushing Attack";
        pushingAttack.actionType = "Free";
        pushingAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to attempt to drive the target back. You add the superiority die to the attack's damage roll, and if the target is Large or smaller, it must make a Strength saving throw. On a failed save, you push the target up to 15 feet away from you.";
        pushingAttack.recharge = "None";
        pushingAttack.spellLevel = 0;
        pushingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(pushingAttack);

        Ability rally = null;
        rally.name = "Rally";
        rally.actionType = "Bonus";
        rally.description = "On your turn, you can use a bonus action and expend one superiority die to bolster the resolve of one of your companions. When you do so, choose a friendly creature who can see or hear you. That creature gains temporary hit points equal to the superiority die roll + your Charisma modifier.";
        rally.recharge = "None";
        rally.spellLevel = 0;
        rally.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(rally);

        Ability riposte = null;
        riposte.name = "Riposte";
        riposte.actionType = "Reaction";
        riposte.description = "When a creature misses you with a melee attack, you can use your reaction and expend one superiority die to make a melee weapon attack against the creature. If you hit, you add the superiority die to the attack's damage roll.";
        riposte.recharge = "None";
        riposte.spellLevel = 0;
        riposte.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(riposte);

        Ability sweepingAttack = null;
        sweepingAttack.name = "Sweeping Attack";
        sweepingAttack.actionType = "Free";
        sweepingAttack.description = "When you hit a creature with a melee weapon attack, you can expend one superiority die to attempt to damage another creature with the same attack. Choose another creature within 5 feet of the original target and within your reach. If the original attack roll would hit the second creature, it takes damage equal to the number you roll on your superiority die. The damage is of the same type dealt by the original attack.";
        sweepingAttack.recharge = "None";
        sweepingAttack.spellLevel = 0;
        sweepingAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(sweepingAttack);

        Ability tripAttack = null;
        tripAttack.name = "Trip Attack";
        tripAttack.actionType = "Free";
        tripAttack.description = "When you hit a creature with a weapon attack, you can expend one superiority die to attempt to knock the target down. You add the superiority die to the attack's damage roll, and if the target is Large or smaller, it must make a Strength saving throw. On a failed save, you knock the target prone.";
        tripAttack.recharge = "None";
        tripAttack.spellLevel = 0;
        tripAttack.requiredLevel = 3;
        battleMaster.subclassAbilityList.add(tripAttack);

        fighterSubClassList.add(battleMaster);


        SubClass cavalier = null;
        cavalier.name = "Cavalier";
        cavalier.parentName = "Fighter";

        Ability unwaveringMark = null;
        unwaveringMark.name = "Unwavering Mark";
        unwaveringMark.actionType = "Bonus";
        unwaveringMark.description = "If a creature marked by you deals damage to anyone other than you, you can make a special melee weapon attack against the marked creature as a bonus action on your next turn. You have advantage on the attack roll, and if it hits, the attack's weapon deals extra damage to the target equal to half your fighter level.";
        unwaveringMark.recharge = "None";
        unwaveringMark.spellLevel = 0;
        unwaveringMark.requiredLevel = 3;
        cavalier.subclassAbilityList.add(unwaveringMark);

        Ability wardingManeuver = null;
        wardingManeuver.name = "Warding Maneuver";
        wardingManeuver.actionType = "Reaction";
        wardingManeuver.description = "At 7th level, you learn to fend off strikes directed at you, your mount, or other creatures nearby. If you or a creature you can see within 5 feet of you is hit by an attack, you can roll 1d8 as a reaction if you're wielding a melee weapon or a shield. Roll the die, and add the number rolled to the target's AC against that attack. If the attack still hits, the target has resistance against the attack's damage.";
        wardingManeuver.recharge = "None";
        wardingManeuver.spellLevel = 0;
        wardingManeuver.requiredLevel = 7;
        cavalier.subclassAbilityList.add(wardingManeuver);

        Ability ferociousCharger = null;
        ferociousCharger.name = "Ferocious Charger";
        ferociousCharger.actionType = "Free";
        ferociousCharger.description = "Starting at 15th level, you can run down your foes, whether you're mounted or not. If you move at least 10 feet in a straight line right before attacking a creature and you hit it with the attack, that target must succeed on a Strength saving throw (DC 8 + your proficiency bonus + your Strength modifier) or be knocked prone. You can use this feature only once on each of your turns.";
        ferociousCharger.recharge = "Turn";
        ferociousCharger.spellLevel = 0;
        ferociousCharger.requiredLevel = 15;
        cavalier.subclassAbilityList.add(ferociousCharger);

        Ability vigilantDefender = null;
        vigilantDefender.name = "Vigilant Defender";
        vigilantDefender.actionType = "Reaction";
        vigilantDefender.description = "Starting at 18th level, you respond to danger with extraordinary vigilance. In combat, you get a special reaction that you can take once on every creature's turn, except your turn. You can use this special reaction only to make an opportunity attack, and you can't use it on the same turn that you take your normal reaction.";
        vigilantDefender.recharge = "Turn";
        vigilantDefender.spellLevel = 0;
        vigilantDefender.requiredLevel = 18;
        cavalier.subclassAbilityList.add(vigilantDefender);

        fighterSubClassList.add(cavalier);


        SubClass champion = null;
        champion.name = "Champion";
        champion.parentName = "Fighter";

        fighterSubClassList.add(champion);


        SubClass eldritchKnight = null;
        eldritchKnight.name = "Eldritch Knight";
        eldritchKnight.parentName = "Fighter";

        Ability warMagic = null;
        warMagic.name = "War Magic";
        warMagic.actionType = "Bonus";
        warMagic.description = "Beginning at 7th level, when you use your action to cast a cantrip, you can make one weapon attack as a bonus action.";
        warMagic.recharge = "None";
        warMagic.spellLevel = 0;
        warMagic.requiredLevel = 7;
        eldritchKnight.subclassAbilityList.add(warMagic);

        Ability eldritchStrike = null;
        eldritchStrike.name = "Eldritch Strike";
        eldritchStrike.actionType = "Free";
        eldritchStrike.description = "At 10th level, you learn how to make your weapon strikes undercut a creature's resistance to your spells. When you hit a creature with a weapon attack, that creature has disadvantage on the next saving throw it makes against a spell you cast before the end of your next turn.";
        eldritchStrike.recharge = "None";
        eldritchStrike.spellLevel = 0;
        eldritchStrike.requiredLevel = 10;
        eldritchKnight.subclassAbilityList.add(eldritchStrike);

        Ability arcaneCharge = null;
        arcaneCharge.name = "Arcane Charge";
        arcaneCharge.actionType = "Free";
        arcaneCharge.description = "At 15th level, you gain the ability to teleport up to 30 feet to an unoccupied space you can see when you use your Action Surge. You can teleport before or after the additional action.";
        arcaneCharge.recharge = "None";
        arcaneCharge.spellLevel = 0;
        arcaneCharge.requiredLevel = 15;
        eldritchKnight.subclassAbilityList.add(arcaneCharge);

        Ability improvedWarMagic = null;
        improvedWarMagic.name = "Improved War Magic";
        improvedWarMagic.actionType = "Bonus";
        improvedWarMagic.description = "Starting at 18th level, when you use your action to cast a spell, you can make one weapon attack as a bonus action.";
        improvedWarMagic.recharge = "None";
        improvedWarMagic.spellLevel = 0;
        improvedWarMagic.requiredLevel = 18;
        eldritchKnight.subclassAbilityList.add(improvedWarMagic);

        fighterSubClassList.add(eldritchKnight);


        SubClass purpleDragonKnight = null;
        purpleDragonKnight.name = "Purple Dragon Knight (Banneret)";
        purpleDragonKnight.parentName = "Fighter";

        Ability rallyingCry = null;
        rallyingCry.name = "Rallying Cry";
        rallyingCry.actionType = "Bonus";
        rallyingCry.description = "When you use your Second Wind feature, you can choose up to three creatures within 60 feet of you that are allied with you. Each one regains hit points equal to your fighter level, provided that the creature can see or hear you.";
        rallyingCry.recharge = "Short";
        rallyingCry.spellLevel = 0;
        rallyingCry.requiredLevel = 3;
        purpleDragonKnight.subclassAbilityList.add(rallyingCry);

        Ability inspiringSurge = null;
        inspiringSurge.name = "Inspiring Surge";
        inspiringSurge.actionType = "Free";
        inspiringSurge.description = "Starting at 10th level, when you use your Action Surge feature, you can choose one creature within 60 feet of you that is allied with you. That creature can make one melee or ranged weapon attack with its reaction, provided that it can see or hear you.";
        inspiringSurge.recharge = "None";
        inspiringSurge.spellLevel = 0;
        inspiringSurge.requiredLevel = 10;
        purpleDragonKnight.subclassAbilityList.add(inspiringSurge);

        fighterSubClassList.add(purpleDragonKnight);


        SubClass samurai = null;
        samurai.name = "Samurai";
        samurai.parentName = "Fighter";

        Ability fightingSpirit = null;
        fightingSpirit.name = "Fighting Spirit";
        fightingSpirit.actionType = "Bonus";
        fightingSpirit.description = "Starting at 3rd level, your intensity in battle can shield you and help you strike true. As a bonus action on your turn, you can give yourself advantage on weapon attack rolls until the end of the current turn. When you do so, you also gain 5 temporary hit points. The number of temporary hit points increases when you reach certain levels in this class, increasing to 10 at 10th level and 15 at 15th level.";
        fightingSpirit.recharge = "None";
        fightingSpirit.spellLevel = 0;
        fightingSpirit.requiredLevel = 3;
        samurai.subclassAbilityList.add(fightingSpirit);

        Ability rapidStrike = null;
        rapidStrike.name = "Rapid Strike";
        rapidStrike.actionType = "Action";
        rapidStrike.description = "Starting at 15th level, you learn to trade accuracy for swift strikes. If you take the Attack action on your turn and have advantage on an attack roll against one of the targets, you can forgo the advantage for that roll to make an additional weapon attack against that target, as part of the same action. You can do so no more than once per turn.";
        rapidStrike.recharge = "Turn";
        rapidStrike.spellLevel = 0;
        rapidStrike.requiredLevel = 15;
        samurai.subclassAbilityList.add(rapidStrike);

        Ability strengthBeforeDeath = null;
        strengthBeforeDeath.name = "Strength Before Death";
        strengthBeforeDeath.actionType = "Reaction";
        strengthBeforeDeath.description = "Starting at 18th level, your fighting spirit can delay the grasp of death. If you take damage that reduces you to 0 hit points and doesn't kill you outright, you can use your reaction to delay falling unconscious, and you can immediately take an extra turn, interrupting the current turn. While you have 0 hit points during that extra turn, taking damage causes death saving throw failures as normal, and three death saving throw failures can still kill you. When the extra turn ends, you fall unconscious if you still have 0 hit points.";
        strengthBeforeDeath.recharge = "Long";
        strengthBeforeDeath.spellLevel = 0;
        strengthBeforeDeath.requiredLevel = 18;
        samurai.subclassAbilityList.add(strengthBeforeDeath);

        fighterSubClassList.add(samurai);

        return fighterSubClassList;

    }
    static List<SubClass> createMonkSubClassList() {

        List<SubClass> monkSubClassList = null;


        SubClass drunkenMaster = null;
        drunkenMaster.name = "Drunken Master";
        drunkenMaster.parentName = "Monk";

        Ability drunkenTechnique = null;
        drunkenTechnique.name = "Drunken Technique";
        drunkenTechnique.actionType = "Bonus";
        drunkenTechnique.description = "At 3rd level, you learn how to twist and turn quickly as part of your Flurry of Blows. Whenever you use Flurry of Blows, you gain the benefit of the Disengage action, and your walking speed increases by 10 feet until the end of the current turn.";
        drunkenTechnique.recharge = "None";
        drunkenTechnique.spellLevel = 0;
        drunkenTechnique.requiredLevel = 3;
        drunkenMaster.subclassAbilityList.add(drunkenTechnique);

        Ability redirectAttack = null;
        redirectAttack.name = "Redirect Attack";
        redirectAttack.actionType = "Reaction";
        redirectAttack.description = "When a creature misses you with a melee attack roll, you can spend 1 ki point as a reaction to cause that attack to hit one creature of your choice, other than the attacker, that you can see within 5 feet of you.";
        redirectAttack.recharge = "None";
        redirectAttack.spellLevel = 0;
        redirectAttack.requiredLevel = 6;
        drunkenMaster.subclassAbilityList.add(redirectAttack);

        Ability intoxicatedFrenzy = null;
        intoxicatedFrenzy.name = "Intoxicated Frenzy";
        intoxicatedFrenzy.actionType = "Bonus";
        intoxicatedFrenzy.description = "At 17th level, you gain the ability to make an overwhelming number of attacks against a group of enemies. When you use your Flurry of Blows, you can make up to three additional attacks with it (up to a total of five Flurry of Blows attacks), provided that each Flurry of Blows attack targets a different creature this turn.";
        intoxicatedFrenzy.recharge = "None";
        intoxicatedFrenzy.spellLevel = 0;
        intoxicatedFrenzy.requiredLevel = 17;
        drunkenMaster.subclassAbilityList.add(intoxicatedFrenzy);

        monkSubClassList.add(drunkenMaster);


        SubClass fourElements = null;
        fourElements.name = "Four Elements";
        fourElements.parentName = "Monk";

        Ability elementalAttunement = null;
        elementalAttunement.name = "Elemental Attunement";
        elementalAttunement.actionType = "Action";
        elementalAttunement.description = "You can use your action to briefly control elemental forces within 30 feet of you.";
        elementalAttunement.recharge = "None";
        elementalAttunement.spellLevel = 0;
        elementalAttunement.requiredLevel = 3;
        fourElements.subclassAbilityList.add(elementalAttunement);

        Ability fangsOfTheFireSnake = null;
        fangsOfTheFireSnake.name = "Fangs of the Fire Snake";
        fangsOfTheFireSnake.actionType = "Free";
        fangsOfTheFireSnake.description = "When you use the Attack action on your turn, you can spend 1 ki point to cause tendrils of flame to stretch out from your fists and feet. Your reach with your unarmed strikes increases by 10 feet for that action, as well as the rest of the turn. A hit with such an attack deals fire damage instead of bludgeoning damage, and if you spend 1 ki point when the attack hits, it also deals an extra 1d10 fire damage.";
        fangsOfTheFireSnake.recharge = "None";
        fangsOfTheFireSnake.spellLevel = 0;
        fangsOfTheFireSnake.requiredLevel = 3;
        fourElements.subclassAbilityList.add(fangsOfTheFireSnake);

        Ability shapeTheFlowingRiver = null;
        shapeTheFlowingRiver.name = "Shape the Flowing River";
        shapeTheFlowingRiver.actionType = "Action";
        shapeTheFlowingRiver.description = "As an action, you can spend 1 ki point to choose an area of ice or water no larger than 30 feet on a side within 120 feet of you. You can change water to ice within the area and vice versa, and you can reshape ice in the area in any manner you choose. You can raise or lower the ice's elevation, create or fill in a trench, erect or flatten a wall, or form a pillar. The extent of any such changes can't exceed half the area's largest dimension. For example, if you affect a 30-foot square, you can create a pillar up to 15 feet high. raise or lower the square's elevation by up to 15 feet, dig a trench up to 15 feet deep, and so on. You can't shape the ice to trap or injure a creature in the area.";
        shapeTheFlowingRiver.recharge = "None";
        shapeTheFlowingRiver.spellLevel = 0;
        shapeTheFlowingRiver.requiredLevel = 3;
        fourElements.subclassAbilityList.add(shapeTheFlowingRiver);

        Ability unbrokenAir = null;
        unbrokenAir.name = "Unbroken Air";
        unbrokenAir.actionType = "Action";
        unbrokenAir.description = "You can create a blast of compressed air that strikes like a mighty fist. As an action, you can spend 2 ki points and choose a creature within 30 feet of you. That creature must make a Strength saving throw. On a failed save, the creature takes 3d10 bludgeoning damage, plus an extra 1d10 bludgeoning damage for each additional ki point you spend, and you can push the creature up to 20 feet away from you and knock it prone. On a successful save, the creature takes half as much damage, and you don't push it or knock it prone.";
        unbrokenAir.recharge = "None";
        unbrokenAir.spellLevel = 0;
        unbrokenAir.requiredLevel = 3;
        fourElements.subclassAbilityList.add(unbrokenAir);

        Ability waterWhip = null;
        waterWhip.name = "Water Whip";
        waterWhip.actionType = "Action";
        waterWhip.description = "You can spend 2 ki points as an action to create a whip of water that shoves and pulls a creature to unbalance it. A creature that you can see that is within 30 feet of you must make a Dexterity saving throw. On a failed save, the creature takes 3d10 bludgeoning damage, plus an extra 1d10 bludgeoning damage for each additional ki point you spend, and you can either knock it prone or pull it up to 25 feet closer to you. On a successful save, the creature takes half as much damage, and you don't pull it or knock it prone.";
        waterWhip.recharge = "None";
        waterWhip.spellLevel = 0;
        waterWhip.requiredLevel = 3;
        fourElements.subclassAbilityList.add(waterWhip);

        monkSubClassList.add(fourElements);


        SubClass kensei = null;
        kensei.name = "Kensei";
        kensei.parentName = "Monk";

        Ability agileParry = null;
        agileParry.name = "Agile Parry";
        agileParry.actionType = "Free";
        agileParry.description = "If you make an unarmed strike as part of the Attack action on your turn and are holding a kensei weapon, you can use it to defend yourself if it is a melee weapon. You gain a +2 bonus to AC until the start of your next turn, while the weapon is in your hand and you aren't incapacitated.";
        agileParry.recharge = "None";
        agileParry.spellLevel = 0;
        agileParry.requiredLevel = 3;
        kensei.subclassAbilityList.add(agileParry);

        Ability kenseisShot = null;
        kenseisShot.name = "Kensei\'s Shot";
        kenseisShot.actionType = "Bonus";
        kenseisShot.description = "You can use a bonus action on your turn to make your ranged attacks with a kensei weapon more deadly. When you do so, any target you hit with a ranged attack using a kensei weapon takes an extra 1d4 damage of the weapon's type. You retain this benefit until the end of the current turn.";
        kenseisShot.recharge = "None";
        kenseisShot.spellLevel = 0;
        kenseisShot.requiredLevel = 3;
        kensei.subclassAbilityList.add(kenseisShot);

        Ability deftStrike = null;
        deftStrike.name = "Deft Strike";
        deftStrike.actionType = "Free";
        deftStrike.description = "When you hit a target with a kensei weapon, you can spend 1 ki point to cause the weapon to deal extra damage to the target equal to your Martial Arts die. You can use this feature only once on each of your turns.";
        deftStrike.recharge = "Turn";
        deftStrike.spellLevel = 0;
        deftStrike.requiredLevel = 6;
        kensei.subclassAbilityList.add(deftStrike);

        Ability sharpenTheBlade = null;
        sharpenTheBlade.name = "Sharpen the Blade";
        sharpenTheBlade.actionType = "Bonus";
        sharpenTheBlade.description = "At 11th level, you gain the ability to augment your weapons further with your ki. As a bonus action, you can expend up to 3 ki points to grant one kensei weapon you touch a bonus to attack and damage rolls when you attack with it. The bonus equals the number of ki points you spent. This bonus lasts for 1 minute or until you use this feature again. This feature has no effect on a magic weapon that already has a bonus to attack and damage rolls.";
        sharpenTheBlade.recharge = "None";
        sharpenTheBlade.spellLevel = 0;
        sharpenTheBlade.requiredLevel = 11;
        kensei.subclassAbilityList.add(sharpenTheBlade);

        Ability unerringAccuracy = null;
        unerringAccuracy.name = "Unerring Accuracy";
        unerringAccuracy.actionType = "Free";
        unerringAccuracy.description = "At 17th level, your mastery of weapons grants you extraordinary accuracy. If you miss with an attack roll using a monk weapon on your turn, you can reroll it. You can use this feature only once on each of your turns.";
        unerringAccuracy.recharge = "Turn";
        unerringAccuracy.spellLevel = 0;
        unerringAccuracy.requiredLevel = 17;
        kensei.subclassAbilityList.add(unerringAccuracy);

        monkSubClassList.add(kensei);


        SubClass longDeath = null;
        longDeath.name = "Long Death";
        longDeath.parentName = "Monk";

        Ability touchOfDeath = null;
        touchOfDeath.name = "Touch of Death";
        touchOfDeath.actionType = "Free";
        touchOfDeath.description = "Starting when you choose this tradition at 3rd level, your study of death allows you to extract vitality from another creature as it nears its demise. When you reduce a creature within 5 feet of you to 0 hit points, you gain temporary hit points equal to your Wisdom modifier + your monk level (minimum of 1 temporary hit point).";
        touchOfDeath.recharge = "None";
        touchOfDeath.spellLevel = 0;
        touchOfDeath.requiredLevel = 3;
        longDeath.subclassAbilityList.add(touchOfDeath);

        Ability hourOfReaping = null;
        hourOfReaping.name = "Hour of Reaping";
        hourOfReaping.actionType = "Action";
        hourOfReaping.description = "At 6th level, you gain the ability to unsettle or terrify those around you as an action, for your soul has been touched by the shadow of death. When you take this action, each creature within 30 feet of you that can see you must succeed on a Wisdom saving throw or be frightened of you until the end of your next turn";
        hourOfReaping.recharge = "None";
        hourOfReaping.spellLevel = 0;
        hourOfReaping.requiredLevel = 6;
        longDeath.subclassAbilityList.add(hourOfReaping);

        Ability masteryOfDeath = null;
        masteryOfDeath.name = "Mastery of Death";
        masteryOfDeath.actionType = "Free";
        masteryOfDeath.description = "Beginning at 11th level, you use your familiarity with death to escape its grasp. When you are reduced to 0 hit points, you can expend 1 ki point (no action required) to have 1 hit point instead.";
        masteryOfDeath.recharge = "None";
        masteryOfDeath.spellLevel = 0;
        masteryOfDeath.requiredLevel = 11;
        longDeath.subclassAbilityList.add(masteryOfDeath);

        Ability touchOfTheLongDeath = null;
        touchOfTheLongDeath.name = "Touch of the Long Death";
        touchOfTheLongDeath.actionType = "Action";
        touchOfTheLongDeath.description = "Starting at 17th level, your touch can channel the energy of death into a creature. As an action, you touch one creature within 5 feet of you, and you expend 1 to 10 ki points. The target must make a Constitution saving throw, and it takes 2d10 necrotic damage per ki point spent on a failed save, or half as much damage on a successful one.";
        touchOfTheLongDeath.recharge = "None";
        touchOfTheLongDeath.spellLevel = 0;
        touchOfTheLongDeath.requiredLevel = 17;
        longDeath.subclassAbilityList.add(touchOfTheLongDeath);

        monkSubClassList.add(longDeath);


        SubClass openHand = null;
        openHand.name = "Open Hand";
        openHand.parentName = "Monk";

        Ability openHandTechnique = null;
        openHandTechnique.name = "Open Hand Technique";
        openHandTechnique.actionType = "Free";
        openHandTechnique.description = "You can manipulate your enemy's ki when you harness your own";
        openHandTechnique.recharge = "None";
        openHandTechnique.spellLevel = 0;
        openHandTechnique.requiredLevel = 3;
        openHand.subclassAbilityList.add(openHandTechnique);

        Ability wholenessOfBody = null;
        wholenessOfBody.name = "Wholeness of Body";
        wholenessOfBody.actionType = "Action";
        wholenessOfBody.description = "You can manipulate your enemy's ki when you harness your own";
        wholenessOfBody.recharge = "Long";
        wholenessOfBody.spellLevel = 0;
        wholenessOfBody.requiredLevel = 6;
        openHand.subclassAbilityList.add(wholenessOfBody);

        Ability quiveringPalmStrike = null;
        quiveringPalmStrike.name = "Quivering Palm (Strike)";
        quiveringPalmStrike.actionType = "Free";
        quiveringPalmStrike.description = "You gain the ability to set up lethal vibrations in someone's body. When you hit a creature with an unarmed strike, you can spend 3 ki points to start these imperceptible vibrations, which last for a number of days equal to your monk level. The vibrations are harmless unless you use your action to end them. To do so, you and the target must be on the same plane of existence. When you use this action, the creature must make a Constitution saving throw. If it fails, it is reduced to 0 hit points. If it succeeds, it takes 10d10 necrotic damage.";
        quiveringPalmStrike.recharge = "None";
        quiveringPalmStrike.spellLevel = 0;
        quiveringPalmStrike.requiredLevel = 17;
        openHand.subclassAbilityList.add(quiveringPalmStrike);

        Ability quiveringPalmActivation = null;
        quiveringPalmActivation.name = "Quivering Palm (Activation)";
        quiveringPalmActivation.actionType = "Action";
        quiveringPalmActivation.description = "You gain the ability to set up lethal vibrations in someone's body. When you hit a creature with an unarmed strike, you can spend 3 ki points to start these imperceptible vibrations, which last for a number of days equal to your monk level. The vibrations are harmless unless you use your action to end them. To do so, you and the target must be on the same plane of existence. When you use this action, the creature must make a Constitution saving throw. If it fails, it is reduced to 0 hit points. If it succeeds, it takes 10d10 necrotic damage.";
        quiveringPalmActivation.recharge = "None";
        quiveringPalmActivation.spellLevel = 0;
        quiveringPalmActivation.requiredLevel = 17;
        openHand.subclassAbilityList.add(quiveringPalmActivation);

        monkSubClassList.add(openHand);


        SubClass shadow = null;
        shadow.name = "Shadow";
        shadow.parentName = "Monk";

        Ability shadowArts = null;
        shadowArts.name = "Shadow Arts";
        shadowArts.actionType = "Action";
        shadowArts.description = "You can use your ki to duplicate the effects of certain spells. As an action, you can spend 2 ki points to cast darkness, darkvision, pass without trace, or silence, without providing material components. Additionally, you gain the minor illusion cantrip if you don't already know it.";
        shadowArts.recharge = "None";
        shadowArts.spellLevel = 0;
        shadowArts.requiredLevel = 3;
        shadow.subclassAbilityList.add(shadowArts);

        Ability shadowStep = null;
        shadowStep.name = "Shadow Step";
        shadowStep.actionType = "Bonus";
        shadowStep.description = "You gain the ability to step from one shadow into another. When you are in dim light or darkness, as a bonus action you can teleport up to 60 feet to an unoccupied space you can see that is also in dim light or darkness. You then have advantage on the first melee attack you make before the end of the turn.";
        shadowStep.recharge = "None";
        shadowStep.spellLevel = 0;
        shadowStep.requiredLevel = 6;
        shadow.subclassAbilityList.add(shadowStep);

        Ability cloakOfShadows = null;
        cloakOfShadows.name = "Cloak of Shadows";
        cloakOfShadows.actionType = "Action";
        cloakOfShadows.description = "By 11th level, you have learned to become one with the shadows. When you are in an area of dim light or darkness, you can use your action to become invisible. You remain invisible until you make an attack, cast a spell, or are in an area of bright light.";
        cloakOfShadows.recharge = "None";
        cloakOfShadows.spellLevel = 0;
        cloakOfShadows.requiredLevel = 11;
        shadow.subclassAbilityList.add(cloakOfShadows);

        Ability opportunist = null;
        opportunist.name = "Opportunist";
        opportunist.actionType = "Reaction";
        opportunist.description = "At 17th level, you can exploit a creature's momentary distraction when it is hit by an attack. Whenever a creature within 5 feet of you is hit by an attack made by a creature other than you, you can use your reaction to make a melee attack against that creature.";
        opportunist.recharge = "None";
        opportunist.spellLevel = 0;
        opportunist.requiredLevel = 17;
        shadow.subclassAbilityList.add(opportunist);

        monkSubClassList.add(shadow);


        SubClass sunSoul = null;
        sunSoul.name = "Sun Soul";
        sunSoul.parentName = "Monk";

        Ability radiantSunBolt = null;
        radiantSunBolt.name = "Radiant Sun Bolt";
        radiantSunBolt.actionType = "Free";
        radiantSunBolt.description = "You gain a new attack option that you can use with the Attack action. This special attack is a ranged spell attack with a range of 30 feet. You are proficient with it, and you add your Dexterity modifier to its attack and damage rolls. Its damage is radiant, and its damage die is a d4. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.";
        radiantSunBolt.recharge = "None";
        radiantSunBolt.spellLevel = 0;
        radiantSunBolt.requiredLevel = 3;
        sunSoul.subclassAbilityList.add(radiantSunBolt);

        Ability searingArcStrike = null;
        searingArcStrike.name = "Searing Arc Strike";
        searingArcStrike.actionType = "Bonus";
        searingArcStrike.description = "At 6th level, you gain the ability to channel your ki into searing waves of energy. Immediately after you take the Attack action on your turn, you can spend 2 ki points to cast the burning hands spell as a bonus action.";
        searingArcStrike.recharge = "None";
        searingArcStrike.spellLevel = 0;
        searingArcStrike.requiredLevel = 6;
        sunSoul.subclassAbilityList.add(searingArcStrike);

        Ability searingSunburst = null;
        searingSunburst.name = "Searing Sunburst";
        searingSunburst.actionType = "Action";
        searingSunburst.description = "At 11th level, you gain the ability to create an orb of light that erupts into a devastating explosion. As an action, you magically create an orb and hurl it at a point you choose within 150 feet, where it erupts into a sphere of radiant light for a brief but deadly instant. Each creature in that 20-foot-radius sphere must succeed on a Constitution saving throw or take 2d6 radiant damage. A creature doesn\'t need to make the save if the creature is behind total cover that is opaque.";
        searingSunburst.recharge = "None";
        searingSunburst.spellLevel = 0;
        searingSunburst.requiredLevel = 11;
        sunSoul.subclassAbilityList.add(searingSunburst);

        Ability sunShield = null;
        sunShield.name = "Sun Shield";
        sunShield.actionType = "Reaction";
        sunShield.description = "If a creature hits you with a melee attack while this light shines, you can use your reaction to deal radiant damage to the creature. The radiant damage equals 5 + your Wisdom modifier.";
        sunShield.recharge = "None";
        sunShield.spellLevel = 0;
        sunShield.requiredLevel = 17;
        sunSoul.subclassAbilityList.add(sunShield);

        Ability sunShieldExtinguishRestore = null;
        sunShieldExtinguishRestore.name = "Sun Shield (Extinguish/Restore)";
        sunShieldExtinguishRestore.actionType = "Bonus";
        sunShieldExtinguishRestore.description = "At 17th level, you become wreathed in a luminous, magical aura. You shed bright light in a 30-foot radius and dim light for an additional 30 feet. You can extinguish or restore the light as a bonus action.";
        sunShieldExtinguishRestore.recharge = "None";
        sunShieldExtinguishRestore.spellLevel = 0;
        sunShieldExtinguishRestore.requiredLevel = 17;
        sunSoul.subclassAbilityList.add(sunShieldExtinguishRestore);

        monkSubClassList.add(sunSoul);

        return monkSubClassList;

    }
    static List<SubClass> createPaladinSubClassList() {

        List<SubClass> paladinSubClassList = null;


        SubClass ancients = null;
        ancients.name = "Ancients";
        ancients.parentName = "Paladin";

        Ability naturesWrath = null;
        naturesWrath.name = "Nature\'s Wrath";
        naturesWrath.actionType = "Action";
        naturesWrath.description = "You can use your Channel Divinity to invoke primeval forces to ensnare a foe. As an action, you can cause spectral vines to spring up and reach for a creature within 10 feet of you that you can see. The creature must succeed on a Strength or Dexterity saving throw (its choice) or be restrained. While restrained by the vines, the creature repeats the saving throw at the end of each of its turns. On a success, it frees itself and the vines vanish.";
        naturesWrath.recharge = "None";
        naturesWrath.spellLevel = 0;
        naturesWrath.requiredLevel = 3;
        ancients.subclassAbilityList.add(naturesWrath);

        Ability turnTheFaithless = null;
        turnTheFaithless.name = "Turn the Faithless";
        turnTheFaithless.actionType = "Action";
        turnTheFaithless.description = "You can use your Channel Divinity to utter ancient words that are painful for fey and fiends to hear. As an action, you present your holy symbol, and each fey or fiend within 30 feet of you that can hear you must make a Wisdom saving throw. On a failed save, the creature is turned for 1 minute or until it takes damage.";
        turnTheFaithless.recharge = "None";
        turnTheFaithless.spellLevel = 0;
        turnTheFaithless.requiredLevel = 3;
        ancients.subclassAbilityList.add(turnTheFaithless);

        Ability undyingSentinel = null;
        undyingSentinel.name = "Undying Sentinel";
        undyingSentinel.actionType = "Free";
        undyingSentinel.description = "Starting at 15th level, when you are reduced to 0 hit points and are not killed outright, you can choose to drop to 1 hit point instead. Once you use this ability, you can't use it again until you finish a long rest.";
        undyingSentinel.recharge = "Long";
        undyingSentinel.spellLevel = 0;
        undyingSentinel.requiredLevel = 15;
        ancients.subclassAbilityList.add(undyingSentinel);

        Ability elderChampion = null;
        elderChampion.name = "Elder Champion";
        elderChampion.actionType = "Action";
        elderChampion.description = "At 20th level, you can assume the form of an ancient force of nature, taking on an appearance you choose. For example, your skin might turn green or take on a bark-like texture, your hair might become leafy or mosslike, or you might sprout antlers or a lion-like mane.";
        elderChampion.recharge = "Long";
        elderChampion.spellLevel = 0;
        elderChampion.requiredLevel = 20;
        ancients.subclassAbilityList.add(elderChampion);

        paladinSubClassList.add(ancients);


        SubClass conquest = null;
        conquest.name = "Conquest";
        conquest.parentName = "Paladin";

        Ability conqueringPresence = null;
        conqueringPresence.name = "Conquering Presence";
        conqueringPresence.actionType = "Action";
        conqueringPresence.description = "You can use your Channel Divinity to exude a terrifying presence. As an action, you force each creature of your choice that you can see within 30 feet of you to make a Wisdom saving throw. On a failed save, a creature becomes frightened of you for 1 minute. The frightened creature can repeat this saving throw at the end of each of its turns, ending the effect on itself on a success.";
        conqueringPresence.recharge = "Short";
        conqueringPresence.spellLevel = 0;
        conqueringPresence.requiredLevel = 3;
        conquest.subclassAbilityList.add(conqueringPresence);

        Ability guidedStrike = null;
        guidedStrike.name = "Guided Strike";
        guidedStrike.actionType = "Free";
        guidedStrike.description = "You can use your Channel Divinity to strike with supernatural accuracy. When you make an attack roll, you can use your Channel Divinity to gain a +10 bonus to the roll. You make this choice after you see the roll, but before the DM says whether the attack hits or misses.";
        guidedStrike.recharge = "Short";
        guidedStrike.spellLevel = 0;
        guidedStrike.requiredLevel = 3;
        conquest.subclassAbilityList.add(guidedStrike);

        Ability invincibleConqueror = null;
        invincibleConqueror.name = "Invincible Conqueror";
        invincibleConqueror.actionType = "Action";
        invincibleConqueror.description = "At 20th level, you gain the ability to harness extraordinary martial prowess. As an action, you can magically become an avatar of conquest";
        invincibleConqueror.recharge = "Long";
        invincibleConqueror.spellLevel = 0;
        invincibleConqueror.requiredLevel = 20;
        conquest.subclassAbilityList.add(invincibleConqueror);

        paladinSubClassList.add(conquest);


        SubClass crown = null;
        crown.name = "Crown";
        crown.parentName = "Paladin";

        Ability championChallenge = null;
        championChallenge.name = "Champion Challenge";
        championChallenge.actionType = "Bonus";
        championChallenge.description = "As a bonus action, you issue a challenge that compels other creatures to do battle with you. Each creature of your choice that you can see within 30 feet of you must make a Wisdom saving throw. On a failed save, a creature can't willingly move more than 30 feet away from you. This effect ends on the creature if you are incapacitated or die or if the creature is more than 30 feet away from you.";
        championChallenge.recharge = "Short";
        championChallenge.spellLevel = 0;
        championChallenge.requiredLevel = 3;
        crown.subclassAbilityList.add(championChallenge);

        Ability turnTheTide = null;
        turnTheTide.name = "Turn the Tide";
        turnTheTide.actionType = "Bonus";
        turnTheTide.description = "As a bonus action, you can bolster injured creatures with your Channel Divinity. Each creature of your choice that can hear you within 30 feet of you regains hit points equal to 1d6 + your Charisma modifier (minimum of 1) if it has no more than half of its hit points.";
        turnTheTide.recharge = "Short";
        turnTheTide.spellLevel = 0;
        turnTheTide.requiredLevel = 3;
        crown.subclassAbilityList.add(turnTheTide);

        Ability divineAllegiance = null;
        divineAllegiance.name = "Divine Allegiance";
        divineAllegiance.actionType = "Reaction";
        divineAllegiance.description = "Starting at 7th level, when a creature within 5 feet of you takes damage, you can use your reaction to magically substitute your own health for that of the target creature, causing that creature not to take the damage. Instead, you take the damage. This damage to you can't be reduced or prevented in any way.";
        divineAllegiance.recharge = "None";
        divineAllegiance.spellLevel = 0;
        divineAllegiance.requiredLevel = 7;
        crown.subclassAbilityList.add(divineAllegiance);

        Ability exaltedChampion = null;
        exaltedChampion.name = "Exalted Champion";
        exaltedChampion.actionType = "Action";
        exaltedChampion.description = "At 20th level, your presence on the field of battle is an inspiration to those dedicated to your cause.";
        exaltedChampion.recharge = "Long";
        exaltedChampion.spellLevel = 0;
        exaltedChampion.requiredLevel = 20;
        crown.subclassAbilityList.add(exaltedChampion);

        paladinSubClassList.add(crown);


        SubClass devotion = null;
        devotion.name = "Devotion";
        devotion.parentName = "Paladin";

        Ability sacredWeapon = null;
        sacredWeapon.name = "Sacred Weapon";
        sacredWeapon.actionType = "Action";
        sacredWeapon.description = "As an action, you can imbue one weapon that you are holding with positive energy, using your Channel Divinity. For 1 minute, you add your Charisma modifier to attack rolls made with that weapon (with a minimum bonus of +1). The weapon also emits bright light in a 20-foot radius and dim light 20 feet beyond that. If the weapon is not already magical, it becomes magical for the duration.";
        sacredWeapon.recharge = "Short";
        sacredWeapon.spellLevel = 0;
        sacredWeapon.requiredLevel = 3;
        devotion.subclassAbilityList.add(sacredWeapon);

        Ability turnTheUnholy = null;
        turnTheUnholy.name = "Turn the Unholy";
        turnTheUnholy.actionType = "Action";
        turnTheUnholy.description = "As an action, you present your holy symbol and speak a prayer censuring fiends and undead, using your Channel Divinity. Each fiend or undead that can see or hear you within 30 feet of you must make a Wisdom saving throw. If the creature fails its saving throw, it is turned for 1 minute or until it takes damage.";
        turnTheUnholy.recharge = "Short";
        turnTheUnholy.spellLevel = 0;
        turnTheUnholy.requiredLevel = 3;
        devotion.subclassAbilityList.add(turnTheUnholy);

        Ability holyNimbus = null;
        holyNimbus.name = "Holy Nimbus";
        holyNimbus.actionType = "Action";
        holyNimbus.description = "At 20th level, as an action, you can emanate an aura of sunlight. For 1 minute, bright light shines from you in a 30-foot radius, and dim light shines 30 feet beyond that.";
        holyNimbus.recharge = "Long";
        holyNimbus.spellLevel = 0;
        holyNimbus.requiredLevel = 20;
        devotion.subclassAbilityList.add(holyNimbus);

        paladinSubClassList.add(devotion);


        SubClass oathbreaker = null;
        oathbreaker.name = "Oathbreaker";
        oathbreaker.parentName = "Paladin";

        Ability controlUndead = null;
        controlUndead.name = "Control Undead";
        controlUndead.actionType = "Action";
        controlUndead.description = "As an action, the paladin targets one undead creature he or she can see within 30 feet of him or her. The target must make a Wisdom saving throw. On a failed save, the target must obey the paladin's commands for the next 24 hours, or until the paladin uses this Channel Divinity option again. An undead whose challenge rating is equal to or greater than the paladin's level is immune to this effect.";
        controlUndead.recharge = "Short";
        controlUndead.spellLevel = 0;
        controlUndead.requiredLevel = 3;
        oathbreaker.subclassAbilityList.add(controlUndead);

        Ability dreadfulAspect = null;
        dreadfulAspect.name = "Dreadful Aspect";
        dreadfulAspect.actionType = "Action";
        dreadfulAspect.description = "As an action, the paladin channels the darkest emotions and focuses them into a burst of magical menace. Each creature of the paladin's choice within 30 feet of the paladin must make a Wisdom saving throw if it can see the paladin. On a failed save, the target is frightened of the paladin for 1 minute. If a creature frightened by this effect ends its turn more than 30 feet away from the paladin, it can attempt another Wisdom saving throw to end the effect on it.";
        dreadfulAspect.recharge = "Short";
        dreadfulAspect.spellLevel = 0;
        dreadfulAspect.requiredLevel = 3;
        oathbreaker.subclassAbilityList.add(dreadfulAspect);

        Ability dreadLord = null;
        dreadLord.name = "Dread Lord";
        dreadLord.actionType = "Action";
        dreadLord.description = "At 20th level, the paladin can, as an action, surround himself or herself with an aura of gloom that lasts for 1 minute. The aura reduces any bright light in a 30-foot radius around the paladin to dim light. Whenever an enemy that is frightened by the paladin starts its turn in the aura, it takes 4d10 psychic damage. Additionally, the paladin and creatures he or she chooses in the aura are draped in deeper shadow. Creatures that rely on sight have disadvantage on attack rolls against creatures draped in this shadow.";
        dreadLord.recharge = "Long";
        dreadLord.spellLevel = 0;
        dreadLord.requiredLevel = 20;
        oathbreaker.subclassAbilityList.add(dreadLord);

        Ability dreadLordShadowAttack = null;
        dreadLordShadowAttack.name = "Dread Lord (Shadow Attack)";
        dreadLordShadowAttack.actionType = "Bonus";
        dreadLordShadowAttack.description = "While the aura lasts, the paladin can use a bonus action on his or her turn to cause the shadows in the aura to attack one creature. The paladin makes a melee spell attack against the target. If the attack hits, the target takes necrotic damage equal to 3d10 + the paladin's Charisma modifier.";
        dreadLordShadowAttack.recharge = "Long";
        dreadLordShadowAttack.spellLevel = 0;
        dreadLordShadowAttack.requiredLevel = 20;
        oathbreaker.subclassAbilityList.add(dreadLordShadowAttack);

        paladinSubClassList.add(oathbreaker);


        SubClass redemption = null;
        redemption.name = "Redemption";
        redemption.parentName = "Paladin";

        Ability emissaryOfPeace = null;
        emissaryOfPeace.name = "Emissary of Peace";
        emissaryOfPeace.actionType = "Bonus";
        emissaryOfPeace.description = "You can use your Channel Divinity to augment your presence with divine power. As a bonus action, you grant yourself a +5 bonus to Charisma (Persuasion) checks for the next 10 minutes.";
        emissaryOfPeace.recharge = "Short";
        emissaryOfPeace.spellLevel = 0;
        emissaryOfPeace.requiredLevel = 3;
        redemption.subclassAbilityList.add(emissaryOfPeace);

        Ability rebukeTheViolent = null;
        rebukeTheViolent.name = "Rebuke the Violent";
        rebukeTheViolent.actionType = "Reaction";
        rebukeTheViolent.description = "You can use your Channel Divinity to rebuke those who use violence. Immediately after an attacker within 30 feet of you deals damage with an attack against a creature other than you, you can use your reaction to force the attacker to make a Wisdom saving throw. On a failed save, the attacker takes radiant damage equal to the damage it just dealt. On a successful save, it takes half as much damage.";
        rebukeTheViolent.recharge = "Short";
        rebukeTheViolent.spellLevel = 0;
        rebukeTheViolent.requiredLevel = 3;
        redemption.subclassAbilityList.add(rebukeTheViolent);

        Ability auraOfTheGuardian = null;
        auraOfTheGuardian.name = "Aura of the Guardian";
        auraOfTheGuardian.actionType = "Reaction";
        auraOfTheGuardian.description = "Starting at 7th level, you can shield others from harm at the cost of your own health. When a creature within 10 feet of you takes damage, you can use your reaction to magically take that damage, instead of that creature taking it. This feature doesn't transfer any other effects that might accompany the damage, and this damage can't be reduced in any way.";
        auraOfTheGuardian.recharge = "None";
        auraOfTheGuardian.spellLevel = 0;
        auraOfTheGuardian.requiredLevel = 7;
        redemption.subclassAbilityList.add(auraOfTheGuardian);

        Ability emissaryOfRedemption = null;
        emissaryOfRedemption.name = "Emissary of Redemption";
        emissaryOfRedemption.actionType = "Action";
        emissaryOfRedemption.description = "You become an avatar of peace, which gives you two benefits. You have resistance to all damage dealt by other creatures (their attacks, spells, and other effects). Whenever a creature hits you with an attack, it takes radiant damage equal to half the damage you take from the attack.";
        emissaryOfPeace.recharge = "Long";
        emissaryOfPeace.spellLevel = 0;
        emissaryOfPeace.requiredLevel = 20;
        redemption.subclassAbilityList.add(emissaryOfRedemption);

        paladinSubClassList.add(redemption);


        SubClass vengeance = null;
        vengeance.name = "Vengeance";
        vengeance.parentName = "Paladin";

        Ability abjureEnemy = null;
        abjureEnemy.name = "Abjure Enemy";
        abjureEnemy.actionType = "Action";
        abjureEnemy.description = "As an action, you present your holy symbol and speak a prayer of denunciation, using your Channel Divinity. Choose one creature within 60 feet of you that you can see. That creature must make a Wisdom saving throw, unless it is immune to being frightened. Fiends and undead have disadvantage on this saving throw.";
        abjureEnemy.recharge = "Short";
        abjureEnemy.spellLevel = 0;
        abjureEnemy.requiredLevel = 3;
        vengeance.subclassAbilityList.add(abjureEnemy);

        Ability vowOfEnmity = null;
        vowOfEnmity.name = "Vow of Enmity";
        vowOfEnmity.actionType = "Bonus";
        vowOfEnmity.description = "As a bonus action, you can utter a vow of enmity against a creature you can see within 10 feet of you, using your Channel Divinity. You gain advantage on attack rolls against the creature for 1 minute or until it drops to 0 hit points or falls unconscious.";
        vowOfEnmity.recharge = "Short";
        vowOfEnmity.spellLevel = 0;
        vowOfEnmity.requiredLevel = 3;
        vengeance.subclassAbilityList.add(vowOfEnmity);

        Ability relentlessAvenger = null;
        relentlessAvenger.name = "Relentless Avenger";
        relentlessAvenger.actionType = "Reaction";
        relentlessAvenger.description = "By 7th level, your supernatural focus helps you close off a foe's retreat. When you hit a creature with an opportunity attack, you can move up to half your speed immediately after the attack and as part of the same reaction. This movement doesn't provoke opportunity attacks.";
        relentlessAvenger.recharge = "None";
        relentlessAvenger.spellLevel = 0;
        relentlessAvenger.requiredLevel = 7;
        vengeance.subclassAbilityList.add(relentlessAvenger);

        Ability soulOfVengeance = null;
        soulOfVengeance.name = "Soul of Vengeance";
        soulOfVengeance.actionType = "Reaction";
        soulOfVengeance.description = "Starting at 15th level, the authority with which you speak your Vow of Enmity gives you greater power over your foe. When a creature under the effect of your Vow of Enmity makes an attack, you can use your reaction to make a melee weapon attack against that creature if it is within range.";
        soulOfVengeance.recharge = "None";
        soulOfVengeance.spellLevel = 0;
        soulOfVengeance.requiredLevel = 15;
        vengeance.subclassAbilityList.add(soulOfVengeance);

        Ability avengingAngel = null;
        avengingAngel.name = "Avenging Angel";
        avengingAngel.actionType = "Action";
        avengingAngel.description = "At 20th level, you can assume the form of an angelic avenger. Using your action, you undergo a tranformation. For 1 hour, you gane the following benefits. Wings sprout from your back and grant you a flying speed of 60 feet. You emanate an aura of menace in a 30-foot radius. The first time any enemy creature enters the aura or starts its turn there during a battle, the creature must succeed on a Wisdom saving throw or become frightened of you for 1 minute or until it takes any damage. Attack rolls against the frightened creature have advantage.";
        avengingAngel.recharge = "Long";
        avengingAngel.spellLevel = 0;
        avengingAngel.requiredLevel = 20;
        vengeance.subclassAbilityList.add(avengingAngel);

        paladinSubClassList.add(vengeance);

        return paladinSubClassList;
    }
    static List<SubClass> createRangerSubClassList() {

        List<SubClass> rangerSubClassList = null;


        SubClass beastMaster = null;
        beastMaster.name = "Beast Master";
        beastMaster.parentName = "Ranger";

        Ability rangersCompanion = null;
        rangersCompanion.name = "Ranger\'s Companion";
        rangersCompanion.actionType = "Action";
        rangersCompanion.description = "You can use your action to verbally command it to take the Attack, Dash, Disengage, or Help action. If you don't issue a command, the beast takes the Dodge action. Once you have the Extra Attack feature, you can make one weapon attack yourself when you command the beast to take the Attack action.";
        rangersCompanion.recharge = "None";
        rangersCompanion.spellLevel = 0;
        rangersCompanion.requiredLevel = 3;
        beastMaster.subclassAbilityList.add(rangersCompanion);

        Ability exceptionalTraining = null;
        exceptionalTraining.name = "Exceptional Training";
        exceptionalTraining.actionType = "Bonus";
        exceptionalTraining.description = "Beginning at 7th level, on any of your turns when your beast companion doesn't attack, you can use a bonus action to command the beast to take the Dash, Disengage, or Help action on its turn. In addition, the beast's attacks now count as magical for the purpose of overcoming resistance and immunity to nonmagical attacks and damage.";
        exceptionalTraining.recharge = "None";
        exceptionalTraining.spellLevel = 0;
        exceptionalTraining.requiredLevel = 7;
        beastMaster.subclassAbilityList.add(exceptionalTraining);

        Ability bestialFury = null;
        bestialFury.name = "Bestial Fury";
        bestialFury.actionType = "None";
        bestialFury.description = "Starting at 11th level, when you command your beast companion to take the Attack action, the beast can make two attacks, or it can take the Multiattack action if it has that action.";
        bestialFury.recharge = "None";
        bestialFury.spellLevel = 0;
        bestialFury.requiredLevel = 11;
        beastMaster.subclassAbilityList.add(bestialFury);

        rangerSubClassList.add(beastMaster);


        SubClass gloomStalker = null;
        gloomStalker.name = "Gloom Stalker";
        gloomStalker.parentName = "Ranger";

        Ability dreadAmbusher = null;
        dreadAmbusher.name = "Dread Ambusher";
        dreadAmbusher.actionType = "Action";
        dreadAmbusher.description = "At the start of your first turn of each combat, your walking speed increases by 10 feet, which lasts until the end of that turn. If you take the Attack action on that turn, you can make one additional weapon attack as part of that action. If that attack hits, the target takes an extra 1d8 damage of the weapon's damage type.";
        dreadAmbusher.recharge = "None";
        dreadAmbusher.spellLevel = 0;
        dreadAmbusher.requiredLevel = 3;
        gloomStalker.subclassAbilityList.add(dreadAmbusher);

        Ability stalkersFlurry = null;
        stalkersFlurry.name = "Stalker\'s Flurry";
        stalkersFlurry.actionType = "Free";
        stalkersFlurry.description = "At 11th level, you learn to attack with such unexpected speed that you can turn a miss into another strike. Once on each of your turns when you miss with a weapon attack, you can make another weapon attack as part of the same action.";
        stalkersFlurry.recharge = "Turn";
        stalkersFlurry.spellLevel = 0;
        stalkersFlurry.requiredLevel = 11;
        gloomStalker.subclassAbilityList.add(stalkersFlurry);

        Ability shadowyDodge = null;
        shadowyDodge.name = "Shadowy Dodge";
        shadowyDodge.actionType = "Reaction";
        shadowyDodge.description = "Starting at 15th level, you can dodge in unforeseen ways, with wisps of supernatural shadow around you. Whenever a creature makes an attack roll against you and doesn't have advantage on the roll, you can use your reaction to impose disadvantage on it. You must use this feature before you know the outcome of the attack roll.";
        shadowyDodge.recharge = "None";
        shadowyDodge.spellLevel = 0;
        shadowyDodge.requiredLevel = 15;
        gloomStalker.subclassAbilityList.add(shadowyDodge);

        rangerSubClassList.add(gloomStalker);


        SubClass horizonWalker = null;
        horizonWalker.name = "Horizon Walker";
        horizonWalker.parentName = "Ranger";

        Ability detectPortal = null;
        detectPortal.name = "Detect Portal";
        detectPortal.actionType = "Action";
        detectPortal.description = "At 3rd level, you gain the ability to magically sense the presence of a planar portal. As an action, you detect the distance and direction to the closest planar portal within 1 mile of you.";
        detectPortal.recharge = "Short";
        detectPortal.spellLevel = 0;
        detectPortal.requiredLevel = 3;
        horizonWalker.subclassAbilityList.add(detectPortal);

        Ability planarWarrior = null;
        planarWarrior.name = "Planar Warrior";
        planarWarrior.actionType = "Bonus";
        planarWarrior.description = "As a bonus action, choose one creature you can see within 30 feet of you. The next time you hit that creature on this turn with a weapon attack, all damage dealt by the attack becomes force damage, and the creature takes an extra 1d8 force damage from the attack. When you reach 11th level in this class, the extra damage increases to 2d8.";
        planarWarrior.recharge = "None";
        planarWarrior.spellLevel = 0;
        planarWarrior.requiredLevel = 3;
        horizonWalker.subclassAbilityList.add(planarWarrior);

        Ability etherealStep = null;
        etherealStep.name = "Etheral Step";
        etherealStep.actionType = "Bonus";
        etherealStep.description = "At 7th level, you learn to step through the Ethereal Plane. As a bonus action, you can cast the etherealness spell with this feature, without expending a spell slot, but the spell ends at the end of the current turn.";
        etherealStep.recharge = "Short";
        etherealStep.spellLevel = 0;
        etherealStep.requiredLevel = 7;
        horizonWalker.subclassAbilityList.add(etherealStep);

        Ability distantStrike = null;
        distantStrike.name = "Distant Strike";
        distantStrike.actionType = "Action";
        distantStrike.description = "At 11th level, you gain the ability to pass between the planes in the blink of an eye. When you take the Attack action, you can teleport up to 10 feet before each attack to an unoccupied space you can see. If you attack at least two different creatures with the action, you can make one additional attack with it against a third creature.";
        distantStrike.recharge = "None";
        distantStrike.spellLevel = 0;
        distantStrike.requiredLevel = 11;
        horizonWalker.subclassAbilityList.add(distantStrike);

        Ability spectralDefense = null;
        spectralDefense.name = "Spectral Defense";
        spectralDefense.actionType = "Reaction";
        spectralDefense.description = "At 15th level, your ability to move between planes enables you to slip through the planar boundaries to lessen the harm done to you during battle. When you take damage from an attack, you can use your reaction to give yourself resistance to all of that attack's damage on this turn.";
        spectralDefense.recharge = "None";
        spectralDefense.spellLevel = 0;
        spectralDefense.requiredLevel = 15;
        horizonWalker.subclassAbilityList.add(spectralDefense);

        rangerSubClassList.add(horizonWalker);


        SubClass hunter = null;
        hunter.name = "Hunter";
        hunter.parentName = "Ranger";

        Ability colossusSlayer = null;
        colossusSlayer.name = "Colossus Slayer";
        colossusSlayer.actionType = "Free";
        colossusSlayer.description = "Your tenacity can wear down the most potent foes. When you hit a creature with a weapon attack, the creature takes an extra 1d8 damage if it's below its hit point maximum. You can deal this extra damage only once per turn.";
        colossusSlayer.recharge = "Turn";
        colossusSlayer.spellLevel = 0;
        colossusSlayer.requiredLevel = 3;
        hunter.subclassAbilityList.add(colossusSlayer);

        Ability giantKiller = null;
        giantKiller.name = "Giant Killer";
        giantKiller.actionType = "Reaction";
        giantKiller.description = "When a Large or larger creature within 5 feet of you hits or misses you with an attack, you can use your reaction to attack that creature immediately after its attack, provided that you can see the creature.";
        giantKiller.recharge = "None";
        giantKiller.spellLevel = 0;
        giantKiller.requiredLevel = 3;
        hunter.subclassAbilityList.add(giantKiller);

        Ability hordeBreaker = null;
        hordeBreaker.name = "Horde Breaker";
        hordeBreaker.actionType = "Free";
        hordeBreaker.description = "Once on each of your turns when you make a weapon attack, you can make another attack with the same weapon against a different creature that is within 5 feet of the original target and within range of your weapon.";
        hordeBreaker.recharge = "Turn";
        hordeBreaker.spellLevel = 0;
        hordeBreaker.requiredLevel = 3;
        hunter.subclassAbilityList.add(hordeBreaker);

        Ability volley = null;
        volley.name = "Volley";
        volley.actionType = "Action";
        volley.description = "You can use your action to make a ranged attack against any number of creatures within 10 feet of a point you can see within your weapon's range. You must have ammunition for each target, as normal, and you make a separate attack roll for each target.";
        volley.recharge = "None";
        volley.spellLevel = 0;
        volley.requiredLevel = 11;
        hunter.subclassAbilityList.add(volley);

        Ability whirlwindAttack = null;
        whirlwindAttack.name = "Whirlwind Attack";
        whirlwindAttack.actionType = "Action";
        whirlwindAttack.description = "You can use your action to make a melee attack against any number of creatures within 5 feet of you, with a separate attack roll for each target.";
        whirlwindAttack.recharge = "None";
        whirlwindAttack.spellLevel = 0;
        whirlwindAttack.requiredLevel = 11;
        hunter.subclassAbilityList.add(whirlwindAttack);

        Ability standAgainstTheTide = null;
        standAgainstTheTide.name = "Stand Against the Tide";
        standAgainstTheTide.actionType = "Reaction";
        standAgainstTheTide.description = "When a hostile creature misses you with a melee attack, you can use your reaction to force that creature to repeat the same attack against another creature (other than itself) of your choice.";
        standAgainstTheTide.recharge = "None";
        standAgainstTheTide.spellLevel = 0;
        standAgainstTheTide.requiredLevel = 15;
        hunter.subclassAbilityList.add(standAgainstTheTide);

        Ability uncannyDodge = null;
        uncannyDodge.name = "Uncanny Dodge";
        uncannyDodge.actionType = "Reaction";
        uncannyDodge.description = "When an attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage against you.";
        uncannyDodge.recharge = "None";
        uncannyDodge.spellLevel = 0;
        uncannyDodge.requiredLevel = 15;
        hunter.subclassAbilityList.add(uncannyDodge);

        rangerSubClassList.add(hunter);


        SubClass monsterSlayer = null;
        monsterSlayer.name = "Monster Slayer";
        monsterSlayer.parentName = "Ranger";

        Ability huntersSense = null;
        huntersSense.name = "Hunter\'s Sense";
        huntersSense.actionType = "Action";
        huntersSense.description = "At 3rd level, you gain the ability to peer at a creature and magically discern how best to hurt it. As an action, choose one creature you can see within 60 feet of you. You immediately learn whether the creature has any damage immunities, resistances, or vulnerabilities and what they are. If the creature is hidden from divination magic, you sense that it has no damage immunities, resistances, or vulnerabilities.";
        huntersSense.recharge = "None";
        huntersSense.spellLevel = 0;
        huntersSense.requiredLevel = 3;
        monsterSlayer.subclassAbilityList.add(huntersSense);

        Ability slayersPrey = null;
        slayersPrey.name = "Slayer\'s Prey";
        slayersPrey.actionType = "Bonus";
        slayersPrey.description = "Starting at 3rd level, you can focus your ire on one foe, increasing the harm you inflict on it. As a bonus action, you designate one creature you can see within 60 feet of you as the target of this feature. The first time each turn that you hit that target with a weapon attack, it takes an extra 1d6 damage from the weapon.";
        slayersPrey.recharge = "None";
        slayersPrey.spellLevel = 0;
        slayersPrey.requiredLevel = 3;
        monsterSlayer.subclassAbilityList.add(slayersPrey);

        Ability magicUsersNemesis = null;
        magicUsersNemesis.name = "Magic-User\'s Nemesis";
        magicUsersNemesis.actionType = "Reaction";
        magicUsersNemesis.description = "At 11th level, you gain the ability to thwart someone else's magic. When you see a creature casting a spell or teleporting within 60 feet of you, you can use your reaction to try to magically foil it. The creature must succeed on a Wisdom saving throw against your spell save DC, or its spell or teleport fails and is wasted.";
        magicUsersNemesis.recharge = "Short";
        magicUsersNemesis.spellLevel = 0;
        magicUsersNemesis.requiredLevel = 11;
        monsterSlayer.subclassAbilityList.add(magicUsersNemesis);

        Ability slayersCounter = null;
        slayersCounter.name = "Slayer\'s Counter";
        slayersCounter.actionType = "Reaction";
        slayersCounter.description = "At 15th level, you gain the ability to counterattack when your prey tries to sabotage you. If the target of your Slayer's Prey forces you to make a saving throw, you can use your reaction to make one weapon attack against the quarry. You make this attack immediately before making the saving throw. If your attack hits, your save automatically succeeds, in addition to the attack's normal effects.";
        slayersCounter.recharge = "None";
        slayersCounter.spellLevel = 0;
        slayersCounter.requiredLevel = 15;
        monsterSlayer.subclassAbilityList.add(slayersCounter);

        rangerSubClassList.add(monsterSlayer);

        return rangerSubClassList;
    }
    static List<SubClass> createRogueSubClassList() {

        List<SubClass> rogueSubClassList = null;


        SubClass arcaneTrickster = null;
        arcaneTrickster.name = "Arcane Trickster";
        arcaneTrickster.parentName = "Rogue";

        Ability mageHandLegerdemain = null;
        mageHandLegerdemain.name = "Mage Hand Legerdemain";
        mageHandLegerdemain.actionType = "Bonus";
        mageHandLegerdemain.description = "Starting at 3rd level, when you cast mage hand, you can make the spectral hand invisible, and you can perform the following additional tasks with it: You can stow one object the hand is holding in a container worn or carried by another creature. You can retrieve an object in a container worn or carried by another creature. You can use thieves tools to pick locak and disarm traps at range. You can perform one of these tasks without being noticed by a creature if you succeed on a Dexterity (Sleight of Hand) check contested by the creature's Wisdom (Perception) check. In addition, you can use the bonus action granted by your Cunning Action to control the hand.";
        mageHandLegerdemain.recharge = "None";
        mageHandLegerdemain.spellLevel = 0;
        mageHandLegerdemain.requiredLevel = 3;
        arcaneTrickster.subclassAbilityList.add(mageHandLegerdemain);

        Ability versatileTrickster = null;
        versatileTrickster.name = "Versatile Trickster";
        versatileTrickster.actionType = "Bonus";
        versatileTrickster.description = "At 13th level, you gain the ability to distract targets with your mage hand. As a bonus action on your turn, you can designate a creature within 5 feet of the spectral hand created by the spell. Doing so gives you advantage on attack rolls against that creature until the end of the turn.";
        versatileTrickster.recharge = "None";
        versatileTrickster.spellLevel = 0;
        versatileTrickster.requiredLevel = 13;
        arcaneTrickster.subclassAbilityList.add(versatileTrickster);

        Ability spellThief = null;
        spellThief.name = "Spell Thief";
        spellThief.actionType = "Reaction";
        spellThief.description = "Immediately after a creature casts a spell that targets you or includes you in its area of effect, you can use your reaction to force the creature to make a saving throw with its spellcasting ability modifier. The DC equals your spell save DC. On a failed save, you negate the spell's effect against you, and you steal the knowledge of the spell if it is at least 1st level and of a level you can cast (it doesn't need to be a wizard spell). For the next 8 hours, you know the spell and can cast it using your spell slots. The creature can't cast that spell until the 8 hours have passed.";
        spellThief.recharge = "Long";
        spellThief.spellLevel = 0;
        spellThief.requiredLevel = 17;
        arcaneTrickster.subclassAbilityList.add(spellThief);

        rogueSubClassList.add(arcaneTrickster);


        SubClass assassin = null;
        assassin.name = "Assassin";
        assassin.parentName = "Rogue";

        Ability deathStrike = null;
        deathStrike.name = "Death Strike";
        deathStrike.actionType = "Free";
        deathStrike.description = "Starting at 17th level, you become a master of instant death. When you attack and hit a creature that is surprised, it must make a Constitution saving throw (DC 8 + your Dexterity modifier + your proficiency bonus). On a failed save, double the damage of your attack against the creature.";
        deathStrike.recharge = "None";
        deathStrike.spellLevel = 0;
        deathStrike.requiredLevel = 17;
        assassin.subclassAbilityList.add(deathStrike);

        rogueSubClassList.add(assassin);


        SubClass inquisitive = null;
        inquisitive.name = "Inquisitive";
        inquisitive.parentName = "Rogue";

        Ability eyeForDetail = null;
        eyeForDetail.name = "Eye for Detail";
        eyeForDetail.actionType = "Bonus";
        eyeForDetail.description = "Starting at 3rd level, you can use a bonus action to make a Wisdom (Perception) check to spot a hidden creature or object or to make an Intelligence (Investigation) check to uncover or decipher clues.";
        eyeForDetail.spellLevel = 0;
        eyeForDetail.requiredLevel = 3;
        inquisitive.subclassAbilityList.add(eyeForDetail);

        Ability insightfulFighting = null;
        insightfulFighting.name = "Insightful Fighting";
        insightfulFighting.actionType = "Bonus";
        insightfulFighting.description = "At 3rd level, you gain the ability to decipher an opponent's tactics and develop a counter to them. As a bonus action, you can make a Wisdom (Insight) check against a creature you can see that isn't incapacitated, contested by the target's Charisma (Deception) check. If you succeed, you can use your Sneak Attack against that target even if you don't have advantage on the attack roll, but not if you have disadvantage on it.";
        insightfulFighting.recharge = "None";
        insightfulFighting.spellLevel = 0;
        insightfulFighting.requiredLevel = 3;
        inquisitive.subclassAbilityList.add(insightfulFighting);

        Ability unerringEye = null;
        unerringEye.name = "Unerring Eye";
        unerringEye.actionType = "Action";
        unerringEye.description = "Beginning at 13th level, your senses are almost impossible to foil. As an action, you sense the presence of illusions, shapechangers not in their original form, and other magic designed to deceive the senses within 30 feet of you, provided you aren't blinded or deafened. You sense that an effect is attempting to trick you, but you gain no insight into what is hidden or into its true nature.";
        unerringEye.recharge = "None";
        unerringEye.spellLevel = 0;
        unerringEye.requiredLevel = 13;
        inquisitive.subclassAbilityList.add(unerringEye);

        Ability eyeForWeakness = null;
        eyeForWeakness.name = "Eye for Weakness";
        eyeForWeakness.actionType = "Free";
        eyeForWeakness.description = "At 17th level, you learn to exploit a creature's weaknesses by carefully studying its tactics and movement. While your Insightful Fighting feature applies to a creature, your Sneak Attack damage against that creature increases by 3d6.";
        eyeForWeakness.recharge = "None";
        eyeForWeakness.spellLevel = 0;
        eyeForWeakness.requiredLevel = 17;
        inquisitive.subclassAbilityList.add(eyeForWeakness);

        rogueSubClassList.add(inquisitive);


        SubClass mastermind = null;
        mastermind.name = "Mastermind";
        mastermind.parentName = "Rogue";

        Ability masterOfTactics = null;
        masterOfTactics.name = "Master of Tactics";
        masterOfTactics.actionType = "Bonus";
        masterOfTactics.description = "Starting at 3rd level, you can use the Help action as a bonus action. Additionally, when you use the Help action to aid an ally in attacking a creature, the target of that attack can be within 30 feet of you, rather than within 5 feet of you, if the target can see or hear you.";
        masterOfTactics.recharge = "None";
        masterOfTactics.spellLevel = 0;
        masterOfTactics.requiredLevel = 3;
        mastermind.subclassAbilityList.add(masterOfTactics);

        Ability misdirection = null;
        misdirection.name = "Misdirection";
        misdirection.actionType = "Reaction";
        misdirection.description = "Beginning at 13th level, you can sometimes cause another creature to suffer an attack meant for you. When you are targeted by an attack while a creature within 5 feet of you is granting you cover against that attack, you can use your reaction to have the attack target that creature instead of you.";
        misdirection.recharge = "None";
        misdirection.spellLevel = 0;
        misdirection.requiredLevel = 13;
        mastermind.subclassAbilityList.add(misdirection);

        rogueSubClassList.add(mastermind);


        SubClass scout = null;
        scout.name = "Scout";
        scout.parentName = "Rogue";

        Ability skirmisher = null;
        skirmisher.name = "Skirmisher";
        skirmisher.actionType = "Reaction";
        skirmisher.description = "Starting at 3rd level, you are difficult to pin down during a fight. You can move up to half your speed as a reaction when an enemy ends its turn within 5 feet of you. This movement doesn't provoke opportunity attacks.";
        skirmisher.recharge = "None";
        skirmisher.spellLevel = 0;
        skirmisher.requiredLevel = 3;
        scout.subclassAbilityList.add(skirmisher);

        Ability suddenStrike = null;
        suddenStrike.name = "Sudden Strike";
        suddenStrike.actionType = "Bonus";
        suddenStrike.description = "Starting at 17th level, you can strike with deadly speed. If you take the Attack action on your turn, you can make one additional attack as a bonus action. This attack can benefit from your Sneak Attack even if you have already used it this turn, but you can't use your Sneak Attack against the same target more than once in a turn.";
        suddenStrike.recharge = "None";
        suddenStrike.spellLevel = 0;
        suddenStrike.requiredLevel = 17;
        scout.subclassAbilityList.add(suddenStrike);

        rogueSubClassList.add(scout);


        SubClass swashbuckler = null;
        swashbuckler.name = "Swashbuckler";
        swashbuckler.parentName = "Rogue";

        Ability panache = null;
        panache.name = "Panache";
        panache.actionType = "Action";
        panache.description = "At 9th level, your charm becomes extraordinarily beguiling. As an action, you can make a Charisma (Persuasion) check contested by a creature's Wisdom (Insight) check. The creature must be able to hear you, and the two of you must share a language.";
        panache.recharge = "None";
        panache.spellLevel = 0;
        panache.requiredLevel = 9;
        swashbuckler.subclassAbilityList.add(panache);

        Ability elegantManeuver = null;
        elegantManeuver.name = "Elegant Maneuver";
        elegantManeuver.actionType = "Bonus";
        elegantManeuver.description = "Starting at 13th level, you can use a bonus action on your turn to gain advantage on the next Dexterity (Acrobatics) or Strength (Athletics) check you make during the same turn.";
        elegantManeuver.recharge = "None";
        elegantManeuver.spellLevel = 0;
        elegantManeuver.requiredLevel = 13;
        swashbuckler.subclassAbilityList.add(elegantManeuver);

        Ability masterDuelist = null;
        masterDuelist.name = "Master Duelist";
        masterDuelist.actionType = "Free";
        masterDuelist.description = "Beginning at 17th level, your mastery of the blade lets you turn failure into success in combat. If you miss with an attack roll, you can roll it again with advantage. Once you do so, you can't use this feature again until you finish a short or long rest.";
        masterDuelist.recharge = "Short";
        masterDuelist.spellLevel = 0;
        masterDuelist.requiredLevel = 17;
        swashbuckler.subclassAbilityList.add(masterDuelist);

        rogueSubClassList.add(swashbuckler);


        SubClass thief = null;
        thief.name = "Thief";
        thief.parentName = "Rogue";

        Ability fastHands = null;
        fastHands.name = "Fast Hands";
        fastHands.actionType = "Bonus";
        fastHands.description = "Starting at 3rd level, you can use the bonus action granted by your Cunning Action to make a Dexterity (Sleight of Hand) check, use your thieves' tools to disarm a trap or open a lock, or take the Use an Object action.";
        fastHands.recharge = "None";
        fastHands.spellLevel = 0;
        fastHands.requiredLevel = 3;
        thief.subclassAbilityList.add(fastHands);

        rogueSubClassList.add(thief);

        return rogueSubClassList;

    }
    static List<SubClass> createSorcererSubClassList() {

        List<SubClass> sorcererSubClassList = null;

        SubClass divineSoul = null;
        divineSoul.name = "Divine Soul";
        divineSoul.parentName = "Sorcerer";

        Ability favoredByTheGods = null;
        favoredByTheGods.name = "Favored by the Gods";
        favoredByTheGods.actionType = "Free";
        favoredByTheGods.description = "Starting at 1st level, divine power guards your destiny. If you fail a saving throw or miss with an attack roll, you can roll 2d4 and add it to the total, possibly changing the outcome. Once you use this feature, you can't use it again until you finish a short or long rest.";
        favoredByTheGods.recharge = "Short";
        favoredByTheGods.spellLevel = 0;
        favoredByTheGods.requiredLevel = 1;
        divineSoul.subclassAbilityList.add(favoredByTheGods);

        Ability empoweredHealing = null;
        empoweredHealing.name = "Empowered Healing";
        empoweredHealing.actionType = "Free";
        empoweredHealing.description = "Starting at 6th level, the divine energy coursing through you can empower healing spells. Whenever you or an ally within 5 feet of you rolls dice to determine the number of hit points a spell restores, you can spend 1 sorcery point to reroll any number of those dice once, provided you aren't incapacitated. You can use this feature only once per turn.";
        empoweredHealing.recharge = "Turn";
        empoweredHealing.spellLevel = 0;
        empoweredHealing.requiredLevel = 6;
        divineSoul.subclassAbilityList.add(empoweredHealing);

        Ability otherworldlyWings = null;
        otherworldlyWings.name = "Otherworldly Wings";
        otherworldlyWings.actionType = "Bonus";
        otherworldlyWings.description = "Starting at 14th level, you can use a bonus action to manifest a pair of spectral wings from your back. While the wings are present, you have a flying speed of 30 feet. The wings last until you're incapacitated, you die, or you dismiss them as a bonus action.";
        otherworldlyWings.recharge = "None";
        otherworldlyWings.spellLevel = 0;
        otherworldlyWings.requiredLevel = 14;
        divineSoul.subclassAbilityList.add(otherworldlyWings);

        Ability unearthlyRecovery = null;
        unearthlyRecovery.name = "Unearthly Recovery";
        unearthlyRecovery.actionType = "Bonus";
        unearthlyRecovery.description = "At 18th level, you gain the ability to overcome grievous injuries. As a bonus action when you have fewer than half of your hit points remaining, you can regain a number of hit points equal to half your hit point maximum.";
        unearthlyRecovery.recharge = "Long";
        unearthlyRecovery.spellLevel = 0;
        unearthlyRecovery.requiredLevel = 18;
        divineSoul.subclassAbilityList.add(unearthlyRecovery);

        sorcererSubClassList.add(divineSoul);


        SubClass draconic = null;
        draconic.name = "Draconic";
        draconic.parentName = "Sorcerer";

        Ability dragonWings = null;
        dragonWings.name = "Dragon Wings";
        dragonWings.actionType = "Bonus";
        dragonWings.description = "At 14th level, you gain the ability to sprout a pair of dragon wings from your back, gaining a flying speed equal to your current speed. You can create these wings as a bonus action on your turn. They last until you dismiss them as a bonus action on your turn.";
        dragonWings.recharge = "None";
        dragonWings.spellLevel = 0;
        dragonWings.requiredLevel = 14;
        draconic.subclassAbilityList.add(dragonWings);

        Ability draconicPresence = null;
        draconicPresence.name = "Draconic Presence";
        draconicPresence.actionType = "Action";
        draconicPresence.description = "Beginning at 18th level, you can channel the dread presence of your dragon ancestor, causing those around you to become awestruck or frightened. As an action, you can spend 5 sorcery points to draw on this power and exude an aura of awe or fear (your choice) to a distance of 60 feet. For 1 minute or until you lose your concentration (as if you were casting a concentration spell), each hostile creature that starts its turn in this aura must succeed on a Wisdom saving throw or be charmed (if you chose awe) or frightened (if you chose fear) until the aura ends. A creature that succeeds on this saving throw is immune to your aura for 24 hours.";
        draconicPresence.recharge = "None";
        draconicPresence.spellLevel = 0;
        draconicPresence.requiredLevel = 18;
        draconic.subclassAbilityList.add(draconicPresence);

        sorcererSubClassList.add(draconic);


        SubClass shadow = null;
        shadow.name = "Shadow";
        shadow.parentName = "Sorcerer";

        Ability eyesOfTheDark = null;
        eyesOfTheDark.name = "Eyes of the Dark";
        eyesOfTheDark.actionType = "Action";
        eyesOfTheDark.description = "When you reach 3rd level in this class, you learn the darkness spell, which doesn't count against your number of sorcerer spells known. In addition, you can cast it by spending 2 sorcery points or by expending a spell slot. If you cast it with sorcery points, you can see through the darkness created by the spell.";
        eyesOfTheDark.recharge = "None";
        eyesOfTheDark.spellLevel = 0;
        eyesOfTheDark.requiredLevel = 1;
        shadow.subclassAbilityList.add(eyesOfTheDark);

        Ability strengthOfTheGrave = null;
        strengthOfTheGrave.name = "Strength of the Grave";
        strengthOfTheGrave.actionType = "Free";
        strengthOfTheGrave.description = "Starting at 1st level, your existence in a twilight state between life and death makes you difficult to defeat. When damage reduces you to 0 hit points, you can make a Charisma saving throw (DC 5 + the damage taken). On a success, you instead drop to 1 hit point. You can't use this feature if you are reduced to 0 hit points by radiant damage or by a critical hit.";
        strengthOfTheGrave.recharge = "Long";
        strengthOfTheGrave.spellLevel = 0;
        strengthOfTheGrave.requiredLevel = 1;
        shadow.subclassAbilityList.add(strengthOfTheGrave);

        Ability houndOfIllOmen = null;
        houndOfIllOmen.name = "Hound of Ill Omen";
        houndOfIllOmen.actionType = "Bonus";
        houndOfIllOmen.description = "At 6th level, you gain the ability to call forth a howling creature of darkness to harass your foes. As a bonus action, you can spend 3 sorcery points to magically summon a hound of ill omen to target one creature you can see within 120 feet of you. The hound uses the dire wolf's statistics.";
        houndOfIllOmen.recharge = "None";
        houndOfIllOmen.spellLevel = 0;
        houndOfIllOmen.requiredLevel = 6;
        shadow.subclassAbilityList.add(houndOfIllOmen);

        Ability shadowWalk = null;
        shadowWalk.name = "Shadow Walk";
        shadowWalk.actionType = "Bonus";
        shadowWalk.description = "At 14th level, you gain the ability to step from one shadow into another. When you are in dim light or darkness, as a bonus action, you can magically teleport up to 120 feet to an unoccupied space you can see that is also in dim light or darkness.";
        shadowWalk.recharge = "None";
        shadowWalk.spellLevel = 0;
        shadowWalk.requiredLevel = 14;
        shadow.subclassAbilityList.add(shadowWalk);

        Ability umbralForm = null;
        umbralForm.name = "Umbral Form";
        umbralForm.actionType = "Bonus";
        umbralForm.description = "Starting at 18th level, you can spend 6 sorcery points as a bonus action to magically transform yourself into a shadowy form. In this form, you have resistance to all damage except force and radiant damage, and you can move through other creatures and objects as if they were difficult terrain. You take 5 force damage if you end your turn inside an object.";
        umbralForm.recharge = "None";
        umbralForm.spellLevel = 0;
        umbralForm.requiredLevel = 18;
        shadow.subclassAbilityList.add(umbralForm);

        sorcererSubClassList.add(shadow);


        SubClass storm = null;
        storm.name = "Storm";
        storm.parentName = "Sorcerer";

        Ability tempestuousMagic = null;
        tempestuousMagic.name = "Tempestuous Magic";
        tempestuousMagic.actionType = "Bonus";
        tempestuousMagic.description = "Starting at 1st level, you can use a bonus action on your turn to cause whirling gusts of elemental air to briefly surround you, immediately before or after you cast a spell of 1st level or higher. Doing so allows you to fly up to 10 feet without provoking opportunity attacks.";
        tempestuousMagic.recharge = "None";
        tempestuousMagic.spellLevel = 0;
        tempestuousMagic.requiredLevel = 1;
        storm.subclassAbilityList.add(tempestuousMagic);

        Ability stormGuideRain = null;
        stormGuideRain.name = "Storm Guide (Rain)";
        stormGuideRain.actionType = "Action";
        stormGuideRain.description = "If it is raining, you can use an action to cause the rain to stop falling in a 20-foot-radius sphere centered on you. You can end this effect as a bonus action.";
        stormGuideRain.recharge = "None";
        stormGuideRain.spellLevel = 0;
        stormGuideRain.requiredLevel = 6;
        storm.subclassAbilityList.add(stormGuideRain);

        Ability stormGuideWind = null;
        stormGuideWind.name = "Storm Guide (Wind)";
        stormGuideWind.actionType = "Bonus";
        stormGuideWind.description = "If it is windy, you can use a bonus action each round to choose the direction that the wind blows in a 100-foot-radius sphere centered on you. The wind blows in that direction until the end of your next turn. This feature doesn't alter the speed of the wind.";
        stormGuideWind.recharge = "None";
        stormGuideWind.spellLevel = 0;
        stormGuideWind.requiredLevel = 6;
        storm.subclassAbilityList.add(stormGuideWind);

        Ability stormsFury = null;
        stormsFury.name = "Storm\'s Fury";
        stormsFury.actionType = "Reaction";
        stormsFury.description = "Starting at 14th level, when you are hit by a melee attack, you can use your reaction to deal lightning damage to the attacker. The damage equals your sorcerer level. The attacker must also make a Strength saving throw against your sorcerer spell save DC. On a failed save, the attacker is pushed in a straight line up to 20 feet away from you.";
        stormsFury.recharge = "None";
        stormsFury.spellLevel = 0;
        stormsFury.requiredLevel = 14;
        storm.subclassAbilityList.add(stormsFury);

        Ability windSoul = null;
        windSoul.name = "Wind Soul";
        windSoul.actionType = "Action";
        windSoul.description = "At 18th level, you gain immunity to lightning and thunder damage. You also gain a magical flying speed of 60 feet. As an action, you can reduce your flying speed to 30 feet for 1 hour and choose a number of creatures within 30 feet of you equal to 3 + your Charisma modifier. The chosen creatures gain a magical flying speed of 30 feet for 1 hour. Once you reduce your flying speed in this way, you can't do so again until you finish a short or long rest.";
        windSoul.recharge = "Short";
        windSoul.spellLevel = 0;
        windSoul.requiredLevel = 18;
        storm.subclassAbilityList.add(windSoul);

        sorcererSubClassList.add(storm);


        SubClass wild = null;
        wild.name = "Wild";
        wild.parentName = "Sorcerer";

        Ability tidesOfChaos = null;
        tidesOfChaos.name = "Tides of Chaos";
        tidesOfChaos.actionType = "Free";
        tidesOfChaos.description = "Starting at 1st level, you can manipulate the forces of chance and chaos to gain advantage on one attack roll, ability check, or saving throw. Once you do so, you must finish a long rest before you can use this feature again. Any time before you regain the use of this feature, the DM can have you roll on the Wild Magic Surge table immediately after you cast a sorcerer spell of 1st level or higher. You then regain the use of this feature.";
        tidesOfChaos.recharge = "Long";
        tidesOfChaos.spellLevel = 0;
        tidesOfChaos.requiredLevel = 1;
        wild.subclassAbilityList.add(tidesOfChaos);

        Ability bendLuck = null;
        bendLuck.name = "Bend Luck";
        bendLuck.actionType = "Reaction";
        bendLuck.description = "Starting at 6th level, you have the ability to twist fate using your wild magic. When another creature you can see makes an attack roll, an ability check, or a saving throw, you can use your reaction and spend 2 sorcery points to roll 1d4 and apply the number rolled as a bonus or penalty (your choice) to the creature's roll. You can do so after the creature rolls but before any effects of the roll occur.";
        bendLuck.recharge = "None";
        bendLuck.spellLevel = 0;
        bendLuck.requiredLevel = 6;
        wild.subclassAbilityList.add(bendLuck);

        Ability spellBombardment = null;
        spellBombardment.name = "Spell Bombardment";
        spellBombardment.actionType = "Free";
        spellBombardment.description = "Beginning at 18th level, the harmful energy of your spells intensifies. When you roll damage for a spell and roll the highest number possible on any of the dice, choose one of those dice, roll it again and add that roll to the damage. You can use the feature only once per turn.";
        spellBombardment.recharge = "Turn";
        spellBombardment.spellLevel = 0;
        spellBombardment.requiredLevel = 18;
        wild.subclassAbilityList.add(spellBombardment);

        sorcererSubClassList.add(wild);

        return sorcererSubClassList;
    }
    static List<SubClass> createWarlockSubClassList() {

        List<SubClass> warlockSubClassList = null;

        SubClass archfey = null;
        archfey.name = "Archfey";
        archfey.parentName = "Warlock";

        Ability feyPresence = null;
        feyPresence.name = "Fey Presence";
        feyPresence.actionType = "Action";
        feyPresence.description = "As an action, you can cause each creature in a 10-foot cube originating from you to make a Wisdom saving throw against your warlock spell save DC. The creatures that fail their saving throws are all charmed or frightened by you (your choice) until the end of your next turn.";
        feyPresence.recharge = "Short";
        feyPresence.spellLevel = 0;
        feyPresence.requiredLevel = 1;
        archfey.subclassAbilityList.add(feyPresence);

        Ability mistyEscape = null;
        mistyEscape.name = "Misty Escape";
        mistyEscape.actionType = "Reaction";
        mistyEscape.description = "Starting at 6th level, you can vanish in a puff of mist in response to harm. When you take damage, you can use your reaction to turn invisible and teleport up to 60 feet to an unoccupied space you can see. You remain invisible until the start of your next turn or until you attack or cast a spell.";
        mistyEscape.recharge = "Short";
        mistyEscape.spellLevel = 0;
        mistyEscape.requiredLevel = 6;
        archfey.subclassAbilityList.add(mistyEscape);

        Ability beguilingDefenses = null;
        beguilingDefenses.name = "Beguiling Defenses";
        beguilingDefenses.actionType = "Reaction";
        beguilingDefenses.description = "Beginning at 10th level, your patron teaches you how to turn the mind-affecting magic of your enemies against them. You are immune to being charmed, and when another creature attempts to charm you, you can use your reaction to attempt to turn the charm back on that creature. The creature must succeed on a Wisdom saving throw against your warlock spell save DC or be charmed by you for 1 minute or until the creature takes any damage.";
        beguilingDefenses.recharge = "None";
        beguilingDefenses.spellLevel = 0;
        beguilingDefenses.requiredLevel = 10;
        archfey.subclassAbilityList.add(beguilingDefenses);

        Ability darkDelirium = null;
        darkDelirium.name = "Dark Delirium";
        darkDelirium.actionType = "Action";
        darkDelirium.description = "Starting at 14th level, you can plunge a creature into an illusory realm. As an action, choose a creature that you can see within 60 feet of you. It must make a Wisdom saving throw against your warlock spell save DC. On a failed save, it is charmed or frightened by you (your choice) for 1 minute or until your concentration is broken (as if you are concentrating on a spell). This effect ends early if the creature takes any damage.";
        darkDelirium.recharge = "Short";
        darkDelirium.spellLevel = 0;
        darkDelirium.requiredLevel = 14;
        archfey.subclassAbilityList.add(darkDelirium);

        warlockSubClassList.add(archfey);


        SubClass celestial = null;
        celestial.name = "Celestial";
        celestial.parentName = "Warlock";

        Ability healingLight = null;
        healingLight.name = "Healing Light";
        healingLight.actionType = "Bonus";
        healingLight.description = "At 1st level, you gain the ability to channel celestial energy to heal wounds. You have a pool of d6s that you spend to fuel this healing. The number of dice in the pool equals 1 + your warlock level. As a bonus action, you can heal one creature you can see within 60 feet of you, spending dice from the pool. The maximum number of dice you can spend at once equals your Charisma modifier (minimum of one die). Roll the dice you spend, add them together, and restore a number of hit points equal to the total. Your pool regains all expended dice when you finish a long rest.";
        healingLight.recharge = "None";
        healingLight.spellLevel = 0;
        healingLight.requiredLevel = 1;
        celestial.subclassAbilityList.add(healingLight);

        Ability radiantSoul = null;
        radiantSoul.name = "Radiant Soul";
        radiantSoul.actionType = "Free";
        radiantSoul.description = "Starting at 6th level, your link to the Celestial allows you to serve as a conduit for radiant energy. You have resistance to radiant damage, and when you cast a spell that deals radiant or fire damage, you can add your Charisma modifier to one radiant or fire damage roll of that spell against one of its targets.";
        radiantSoul.recharge = "None";
        radiantSoul.spellLevel = 0;
        radiantSoul.requiredLevel = 6;
        celestial.subclassAbilityList.add(radiantSoul);

        Ability searingVengeance = null;
        searingVengeance.name = "Searing Vengeance";
        searingVengeance.actionType = "Free";
        searingVengeance.description = "Starting at 14th level, the radiant energy you channel allows you to resist death. When you have to make a death saving throw at the start of your turn, you can instead spring back to your feet with a burst of radiant energy. You regain hit points equal to half your hit point maximum, and then you stand up if you so choose. Each creature of your choice that is within 30 feet of you takes radiant damage equal to 2d8 + your Charisma modifier, and it is blinded until the end of the current turn.";
        searingVengeance.recharge = "Long";
        searingVengeance.spellLevel = 0;
        searingVengeance.requiredLevel = 14;
        celestial.subclassAbilityList.add(searingVengeance);

        warlockSubClassList.add(celestial);


        SubClass fiend = null;
        fiend.name = "Fiend";
        fiend.parentName = "Warlock";

        Ability darkOnesBlessing = null;
        darkOnesBlessing.name = "Dark One\'s Blessing";
        darkOnesBlessing.actionType = "Free";
        darkOnesBlessing.description = "Starting at 1st level, when you reduce a hostile creature to 0 hit points, you gain temporary hit points equal to your Charisma modifier + your warlock level (minimum of 1).";
        darkOnesBlessing.recharge = "None";
        darkOnesBlessing.spellLevel = 0;
        darkOnesBlessing.requiredLevel = 1;
        fiend.subclassAbilityList.add(darkOnesBlessing);

        Ability darkOnesOwnLuck = null;
        darkOnesOwnLuck.name = "Dark One\'s Own Luck";
        darkOnesOwnLuck.actionType = "Free";
        darkOnesOwnLuck.description = "Starting at 6th level, you can call on your patron to alter fate in your favor. When you make an ability check or a saving throw, you can use this feature to add a d10 to your roll. You can do so after seeing the initial roll but before any of the roll's effects occur.";
        darkOnesOwnLuck.recharge = "Short";
        darkOnesOwnLuck.spellLevel = 0;
        darkOnesOwnLuck.requiredLevel = 6;
        fiend.subclassAbilityList.add(darkOnesOwnLuck);

        Ability hurlThroughHell = null;
        hurlThroughHell.name = "Hurl Through Hell";
        hurlThroughHell.actionType = "Free";
        hurlThroughHell.description = "Starting at 14th level, when you hit a creature with an attack, you can use this feature to instantly transport the target through the lower planes. The creature disappears and hurtles through a nightmare landscape. At the end of your next turn, the target returns to the space it previously occupied, or the nearest unoccupied space. If the target is not a fiend, it takes 10d10 psychic damage as it reels from its horrific experience.";
        hurlThroughHell.recharge = "Long";
        hurlThroughHell.spellLevel = 0;
        hurlThroughHell.requiredLevel = 14;
        fiend.subclassAbilityList.add(hurlThroughHell);

        warlockSubClassList.add(fiend);

        SubClass greatOldOne = null;
        greatOldOne.name = "Great Old One";
        greatOldOne.parentName = "Warlock";

        Ability awakenedMind = null;
        awakenedMind.name = "Awakened Mind";
        awakenedMind.actionType = "Free";
        awakenedMind.description = "Starting at 1st level, your alien knowledge gives you the ability to touch the minds of other creatures. You can communicate telepathically with any creature you can see within 30 feet of you. You don't need to share a language with the creature for it to understand your telepathic utterances, but the creature must be able to understand at least one language.";
        awakenedMind.recharge = "None";
        awakenedMind.spellLevel = 0;
        awakenedMind.requiredLevel = 1;
        greatOldOne.subclassAbilityList.add(awakenedMind);

        Ability entropicWard = null;
        entropicWard.name = "Entropic Ward";
        entropicWard.actionType = "Reaction";
        entropicWard.description = "At 6th level, you learn to magically ward yourself against attack and to turn an enemy's failed strike into good luck for yourself. When a creature makes an attack roll against you, you can use your reaction to impose disadvantage on that roll. If the attack misses you, your next attack roll against the creature has advantage if you make it before the end of your next turn.";
        entropicWard.recharge = "Short";
        entropicWard.spellLevel = 0;
        entropicWard.requiredLevel = 6;
        greatOldOne.subclassAbilityList.add(entropicWard);

        Ability createThrall = null;
        createThrall.name = "Create Thrall";
        createThrall.actionType = "Action";
        createThrall.description = "At 14th level, you gain the ability to infect a humanoid's mind with the alien magic of your patron. You can use your action to touch an incapacitated humanoid. That creature is then charmed by you until a remove curse spell is cast on it, the charmed condition is removed from it, or you use this feature again.";
        createThrall.recharge = "None";
        createThrall.spellLevel = 0;
        createThrall.requiredLevel = 14;
        greatOldOne.subclassAbilityList.add(createThrall);

        warlockSubClassList.add(greatOldOne);

        SubClass hexblade = null;
        hexblade.name = "Hexblade";
        hexblade.parentName = "Warlock";

        Ability hexbladesCurse = null;
        hexbladesCurse.name = "Hexblade\'s Curse";
        hexbladesCurse.actionType = "Bonus";
        hexbladesCurse.description = "Starting at 1st level, you gain the ability to place a baleful curse on someone. As a bonus action, choose one creature you can see within 30 feet of you. The target is cursed for 1 minute. The curse ends early if the target dies, you die, or you are incapacitated.";
        hexbladesCurse.recharge = "Short";
        hexbladesCurse.spellLevel = 0;
        hexbladesCurse.requiredLevel = 1;
        hexblade.subclassAbilityList.add(hexbladesCurse);

        Ability accursedSpecter = null;
        accursedSpecter.name = "Accursed Specter";
        accursedSpecter.actionType = "Free";
        accursedSpecter.description = "Starting at 6th level, you can curse the soul of a person you slay, temporarily binding it to your service. When you slay a humanoid, you can cause its spirit to rise from its corpse as a specter, the statistics for which are in the Monster Manual. When the specter appears, it gains temporary hit points equal to half your warlock level. Roll initiative for the specter, which has its own turns. It obeys your verbal commands, and it gains a special bonus to its attack rolls equal to your Charisma modifier (minimum of +0).";
        accursedSpecter.recharge = "Long";
        accursedSpecter.spellLevel = 0;
        accursedSpecter.requiredLevel = 6;
        hexblade.subclassAbilityList.add(accursedSpecter);

        Ability armorOfHexes = null;
        armorOfHexes.name = "Armor of Hexes";
        armorOfHexes.actionType = "Reaction";
        armorOfHexes.description = "At 10th level, your hex grows more powerful. If the target cursed by your Hexblade's Curse hits you with an attack roll, you can use your reaction to roll a d6. On a 4 or higher, the attack instead misses you, regardless of its roll.";
        armorOfHexes.recharge = "Turn";
        armorOfHexes.spellLevel = 0;
        armorOfHexes.requiredLevel = 10;
        hexblade.subclassAbilityList.add(armorOfHexes);

        Ability masterOfHexes = null;
        masterOfHexes.name = "Master of Hexes";
        masterOfHexes.actionType = "Free";
        masterOfHexes.description = "Starting at 14th level, you can spread your Hexblade's Curse from a slain creature to another creature. When the creature cursed by your Hexblade's Curse dies, you can apply the curse to a different creature you can see within 30 feet of you, provided you aren't incapacitated. When you apply the curse in this way, you don't regain hit points from the death of the previously cursed creature.";
        masterOfHexes.recharge = "None";
        masterOfHexes.spellLevel = 0;
        masterOfHexes.requiredLevel = 14;
        hexblade.subclassAbilityList.add(masterOfHexes);

        warlockSubClassList.add(hexblade);

        SubClass undying = null;
        undying.name = "Undying";
        undying.parentName = "Warlock";

        Ability defyDeath = null;
        defyDeath.name = "Defy Death";
        defyDeath.actionType = "Free";
        defyDeath.description = "Starting at 6th level, you can give yourself vitality when you cheat death or when you help someone else cheat it. You can regain hit points equal to 1d8 + your Constitution modifier (minimum of 1 hit point) when you succeed on a death saving throw or when you stabilize a creature with spare the dying.";
        defyDeath.recharge = "Short";
        defyDeath.spellLevel = 0;
        defyDeath.requiredLevel = 6;
        undying.subclassAbilityList.add(defyDeath);

        Ability indestructibleLife = null;
        indestructibleLife.name = "Indestructible Life";
        indestructibleLife.actionType = "Bonus";
        indestructibleLife.description = "When you reach 14th level, you partake some of the true secrets of the Undying. On your turn, you can use a bonus action to regain hit points equal to 1d8 + your warlock level. Additionally, if you put a severed body part of yours back in place when you use this feature, the part reattaches.";
        indestructibleLife.recharge = "Short";
        indestructibleLife.spellLevel = 0;
        indestructibleLife.requiredLevel = 14;
        undying.subclassAbilityList.add(indestructibleLife);

        warlockSubClassList.add(undying);

        return warlockSubClassList;


    }
    static List<SubClass> createWizardSubClassList() {
        List<SubClass> wizardSubClassList = null;

        SubClass abjuration = null;
        abjuration.name = "Abjuration";
        abjuration.parentName = "Wizard";

        Ability arcaneWind = null;
        arcaneWind.name = "Arcane Wind";
        arcaneWind.actionType = "Free";
        arcaneWind.description = "Starting at 2nd level, you can weave magic around yourself for protection. When you cast an abjuration spell of 1st level or higher, you can simultaneously use a strand of the spell's magic to create a magical ward on yourself that lasts until you finish a long rest. The ward has hit points equal to twice your wizard level + your Intelligence modifier. Whenever you take damage, the ward takes the damage instead. If this damage reduces the ward to 0 hit points, you take any remaining damage.";
        arcaneWind.recharge = "Long";
        arcaneWind.spellLevel = 0;
        arcaneWind.requiredLevel = 2;
        abjuration.subclassAbilityList.add(arcaneWind);

        Ability projectedWard = null;
        projectedWard.name = "Projected Ward";
        projectedWard.actionType = "Reaction";
        projectedWard.description = "Starting at 6th level, when a creature that you can see within 30 feet of you takes damage, you can use your reaction to cause your Arcane Ward to absorb that damage. If this damage reduces the ward to 0 hit points, the warded creature takes any remaining damage.";
        projectedWard.recharge = "Turn";
        projectedWard.spellLevel = 0;
        projectedWard.requiredLevel = 6;
        abjuration.subclassAbilityList.add(projectedWard);

        Ability improvedAbjuration = null;
        improvedAbjuration.name = "Improved Abjuration";
        improvedAbjuration.actionType = "Free";
        improvedAbjuration.description = "Beginning at 10th level, when you cast an abjuration spell that requires you to make an ability check as a part of casting that spell (as in counterspell and dispel magic), you add your proficiency bonus to that ability check.";
        improvedAbjuration.recharge = "None";
        improvedAbjuration.spellLevel = 0;
        improvedAbjuration.requiredLevel = 10;
        abjuration.subclassAbilityList.add(improvedAbjuration);

        wizardSubClassList.add(abjuration);

        SubClass bladesinging = null;
        bladesinging.name = "Bladesinging";
        bladesinging.parentName = "Wizard";

        Ability bladesong = null;
        bladesong.name = "Bladesong";
        bladesong.actionType = "Bonus";
        bladesong.description = "You can use a bonus action to start the Bladesong, which lasts for 1 minute. It ends early if you are incapacitated, if you don medium or heavy armor or a shield, or if you use two hands to make an attack with a weapon. You can also dismiss Bladesong at any time you choose (no action required).";
        bladesong.recharge = "None";
        bladesong.spellLevel = 0;
        bladesong.requiredLevel = 2;
        bladesinging.subclassAbilityList.add(bladesong);

        Ability extraAttack = null;
        extraAttack.name = "Extra Attack";
        extraAttack.actionType = "Free";
        extraAttack.description = "Starting at 6th level, you can attack twice, instead of once, whenever you take the Attack action on your turn.";
        extraAttack.recharge = "None";
        extraAttack.spellLevel = 0;
        extraAttack.requiredLevel = 6;
        bladesinging.subclassAbilityList.add(extraAttack);

        Ability songOfDefense = null;
        songOfDefense.name = "Song of Defense";
        songOfDefense.actionType = "Reaction";
        songOfDefense.description = "Beginning at 10th level, you can direct your magic to absorb damage while your bladesong is active. When you take damage, you can use your reaction to expend one spell slot and reduce that damage to you by an amount equal to five times the spell's slot level.";
        songOfDefense.recharge = "None";
        songOfDefense.spellLevel = 0;
        songOfDefense.requiredLevel = 10;
        bladesinging.subclassAbilityList.add(songOfDefense);

        wizardSubClassList.add(bladesinging);

        SubClass chronurgy = null;
        chronurgy.name = "Chronurgy";
        chronurgy.parentName = "Wizard";

        Ability chronalShift = null;
        chronalShift.name = "Chronal Shift";
        chronalShift.actionType = "Reaction";
        chronalShift.description = "You can magically exert limited control over the flow of time around a creature. As a reaction, after you or a creature you can see within 30 feet of you makes an attack roll, an ability check, or a saving throw, you can force the creature to reroll. You make this decision after you see whether the roll succeeds or fails. The target must use the result of the second roll.";
        chronalShift.recharge = "None";
        chronalShift.spellLevel = 0;
        chronalShift.requiredLevel = 2;
        chronurgy.subclassAbilityList.add(chronalShift);

        Ability momentaryStasis = null;
        momentaryStasis.name = "Momentary Stasis";
        momentaryStasis.actionType = "Action";
        momentaryStasis.description = "As an action, you can magically force a Large or smaller creature you can see within 60 feet of you to make a Constitution saving throw against your spell save DC. Unless the saving throw is a success, the creature is encased in a field of magical energy until the end of your next turn or until the creature takes any damage. While encased in this way, the creature is incapacitated and has a speed of 0.";
        momentaryStasis.recharge = "None";
        momentaryStasis.spellLevel = 0;
        momentaryStasis.requiredLevel = 6;
        chronurgy.subclassAbilityList.add(momentaryStasis);

        Ability convergentFuture = null;
        convergentFuture.name = "Convergent Future";
        convergentFuture.actionType = "Reaction";
        convergentFuture.description = "You can peer through possible futures and magically pull one of them into events around you, ensuring a particular outcome. When you or a creature you can see within 60 feet of you makes an attack roll, an ability check, or a saving throw, you can use your reaction to ignore the die roll and decide whether the number rolled is the minimum needed to succeed or one less than that number (your choice).";
        convergentFuture.recharge = "None";
        convergentFuture.spellLevel = 0;
        convergentFuture.requiredLevel = 14;
        chronurgy.subclassAbilityList.add(convergentFuture);

        wizardSubClassList.add(chronurgy);

        SubClass conjuration = null;
        conjuration.name = "Conjuration";
        conjuration.parentName = "Wizard";

        Ability minorConjuration = null;
        minorConjuration.name = "Minor Conjuration";
        minorConjuration.actionType = "Action";
        minorConjuration.description = "Starting at 2nd level when you select this school, you can use your action to conjure up an inanimate object in your hand or on the ground in an unoccupied space that you can see within 10 feet of you. This object can be no larger than 3 feet on a side and weigh no more than 10 pounds, and its form must be that of a nonmagical object that you have seen. The object is visibly magical, radiating dim light out to 5 feet.";
        minorConjuration.recharge = "None";
        minorConjuration.spellLevel = 0;
        minorConjuration.requiredLevel = 2;
        conjuration.subclassAbilityList.add(minorConjuration);

        Ability benignTeleport = null;
        benignTeleport.name = "Benign Teleport";
        benignTeleport.actionType = "Action";
        benignTeleport.description = "Starting at 6th level, you can use your action to teleport up to 30 feet to an unoccupied space that you can see. Alternatively, you can choose a space within range that is occupied by a Small or Medium creature. If that creature is willing, you both teleport, swapping places.";
        benignTeleport.recharge = "Long";
        benignTeleport.spellLevel = 0;
        benignTeleport.requiredLevel = 6;
        conjuration.subclassAbilityList.add(benignTeleport);

        wizardSubClassList.add(conjuration);

        SubClass divination = null;
        divination.name = "Divination";
        divination.parentName = "Wizard";

        Ability portent = null;
        portent.name = "Portent";
        portent.actionType = "Free";
        portent.description = "Starting at 2nd level when you choose this school, glimpses of the future begin to press in on your awareness. When you finish a long rest, roll two d20s and record the numbers rolled. You can replace any attack roll, saving throw, or ability check made by you or a creature that you can see with one of these foretelling rolls. You must choose to do so before the roll, and you can replace a roll in this way only once per turn.";
        portent.recharge = "Turn";
        portent.spellLevel = 0;
        portent.requiredLevel = 2;
        divination.subclassAbilityList.add(portent);

        Ability theThirdEye = null;
        theThirdEye.name = "The Third Eye";
        theThirdEye.actionType = "Action";
        theThirdEye.description = "Starting at 10th level, you can use your action to increase your powers of perception.";
        theThirdEye.recharge = "Short";
        theThirdEye.spellLevel = 0;
        theThirdEye.requiredLevel = 10;
        divination.subclassAbilityList.add(theThirdEye);

        wizardSubClassList.add(divination);

        SubClass enchantment = null;
        enchantment.name = "Enchantment";
        enchantment.parentName = "Wizard";

        Ability hypnoticGaze = null;
        hypnoticGaze.name = "Hypnotic Gaze";
        hypnoticGaze.actionType = "Action";
        hypnoticGaze.description = "Starting at 2nd level when you choose this school, your soft words and enchanting gaze can magically enthrall another creature. As an action, choose one creature that you can see within 5 feet of you. If the target can see or hear you, it must succeed on a Wisdom saving throw against your wizard spell save DC or be charmed by you until the end of your next turn. The charmed creature's speed drops to 0, and the creature is incapacitated and visibly dazed.";
        hypnoticGaze.recharge = "Turn";
        hypnoticGaze.spellLevel = 0;
        hypnoticGaze.requiredLevel = 2;
        enchantment.subclassAbilityList.add(hypnoticGaze);

        Ability instinctiveCharm = null;
        instinctiveCharm.name = "Instinctive Charm";
        instinctiveCharm.actionType = "Reaction";
        instinctiveCharm.description = "Beginning at 6th level, when a creature you can see within 30 feet of you makes an attack roll against you, you can use your reaction to divert the attack, provided that another creature is within the attack's range. The attacker must make a Wisdom saving throw against your wizard spell save DC. On a failed save, the attacker must target the creature that is closest to it, not including you or itself. If multiple creatures are closest, the attacker chooses which one to target. On a successful save, you can't use this feature on the attacker again until you finish a long rest.";
        instinctiveCharm.recharge = "None";
        instinctiveCharm.spellLevel = 0;
        instinctiveCharm.requiredLevel = 6;
        enchantment.subclassAbilityList.add(instinctiveCharm);

        Ability alterMemories = null;
        alterMemories.name = "Alter Memories";
        alterMemories.actionType = "Action";
        alterMemories.description = "Additionally, once before the spell expires, you can use your action to try to make the chosen creature forget some of the time it spent charmed. The creature must succeed on an Intelligence saving throw against your wizard spell save DC or lose a number of hours of its memories equal to 1 + your Charisma modifier (minimum of 1). You can make the creature forget less time, and the amount of time can't exceed the duration of your enchantment spell.";
        alterMemories.recharge = "None";
        alterMemories.spellLevel = 0;
        alterMemories.requiredLevel = 14;
        enchantment.subclassAbilityList.add(alterMemories);

        wizardSubClassList.add(enchantment);

        SubClass evocation = null;
        evocation.name = "Evocation";
        evocation.parentName = "Wizard";

        Ability sculptSpells = null;
        sculptSpells.name = "Sculpt Spells";
        sculptSpells.actionType = "Free";
        sculptSpells.description = "Beginning at 2nd level, you can create pockets of relative safety within the effects of your evocation spells. When you cast an evocation spell that affects other creatures that you can see, you can choose a number of them equal to 1 + the spell's level. The chosen creatures automatically succeed on their saving throws against the spell, and they take no damage if they would normally take half damage on a successful save.";
        sculptSpells.recharge = "None";
        sculptSpells.spellLevel = 0;
        sculptSpells.requiredLevel = 2;
        evocation.subclassAbilityList.add(sculptSpells);

        wizardSubClassList.add(evocation);

        SubClass graviturgy = null;
        graviturgy.name = "Graviturgy";
        graviturgy.parentName = "Wizard";

        Ability adjustDensity = null;
        adjustDensity.name = "Adjust Density";
        adjustDensity.actionType = "Action";
        adjustDensity.description = "As an action, you can magically alter the weight of one object or creature you can see within 30 feet of you. The object or creature must be Large or smaller. The target's weight is halved or doubled for up to 1 minute or until your concentration ends (as if you were concentrating on a spell).";
        adjustDensity.recharge = "None";
        adjustDensity.spellLevel = 0;
        adjustDensity.requiredLevel = 2;
        graviturgy.subclassAbilityList.add(adjustDensity);

        Ability gravityWell = null;
        gravityWell.name = "Gravity Well";
        gravityWell.actionType = "Free";
        gravityWell.description = "You've learned how to manipulate gravity around a living being: whenever you cast a spell on a creature, you can move the target 5 feet to an unoccupied space of your choice if the target is willing to move, the spell hits it with an attack, or it fails a saving throw against the spell.";
        gravityWell.recharge = "None";
        gravityWell.spellLevel = 0;
        gravityWell.requiredLevel = 6;
        graviturgy.subclassAbilityList.add(gravityWell);

        Ability violentAttraction = null;
        violentAttraction.name = "Violent Attraction";
        violentAttraction.actionType = "Reaction";
        violentAttraction.description = "When another creature that you can see within 60 feet of you hits with a weapon attack, you can use your reaction to increase the attack's velocity, causing the attack's target to take an extra 1d10 damage of the weapon's type. Alternatively, if a creature within 60 feet of you takes damage from a fall, you can use your reaction to increase the fall's damage by 2d10.";
        violentAttraction.recharge = "None";
        violentAttraction.spellLevel = 0;
        violentAttraction.requiredLevel = 10;
        graviturgy.subclassAbilityList.add(violentAttraction);

        Ability eventHorizon = null;
        eventHorizon.name = "Event Horizon";
        eventHorizon.actionType = "Action";
        eventHorizon.description = "As an action, you can magically emit a powerful field of gravitational energy that tugs at other creatures for up to 1 minute or until your concentration ends (as if you were concentrating on a spell). For the duration, whenever a creature hostile to you starts its turn within 30 feet of you, it must make a Strength saving throw against your spell save DC. On a failed save, it takes 2d10 force damage, and its speed is reduced to 0 until the start of its next turn. On a successful save, it takes half as much damage, and every foot it moves this turn costs 2 extra feet of movement.";
        eventHorizon.recharge = "Long";
        eventHorizon.spellLevel = 0;
        eventHorizon.requiredLevel = 14;
        graviturgy.subclassAbilityList.add(eventHorizon);

        wizardSubClassList.add(graviturgy);

        SubClass illusion = null;
        illusion.name = "Illusion";
        illusion.parentName = "Wizard";

        Ability malleableIllusions = null;
        malleableIllusions.name = "Malleable Illusions";
        malleableIllusions.actionType = "Action";
        malleableIllusions.description = "Starting at 6th level, when you cast an illusion spell that has a duration of 1 minute or longer, you can use your action to change the nature of that illusion (using the spell's normal parameters for the illusion), provided that you can see the illusion.";
        malleableIllusions.recharge = "None";
        malleableIllusions.spellLevel = 0;
        malleableIllusions.requiredLevel = 6;
        illusion.subclassAbilityList.add(malleableIllusions);

        Ability illusoryStep = null;
        illusoryStep.name = "Illusory Step";
        illusoryStep.actionType = "Reaction";
        illusoryStep.description = "Beginning at 10th level, you can create an illusory duplicate of yourself as an instant, almost instinctual reaction to danger. When a creature makes an attack roll against you, you can use your reaction to interpose the illusory duplicate between the attacker and yourself. The attack automatically misses you, then the illusion dissipates.";
        illusoryStep.recharge = "Short";
        illusoryStep.spellLevel = 0;
        illusoryStep.requiredLevel = 10;
        illusion.subclassAbilityList.add(illusoryStep);

        Ability illusoryReality = null;
        illusoryReality.name = "Illusory Reality";
        illusoryReality.actionType = "Bonus";
        illusoryReality.description = "By 14th level, you have learned the secret of weaving shadow magic into your illusions to give them a semireality. When you cast an illusion spell of 1st level or higher, you can choose one inanimate, nonmagical object that is part of the illusion and make that object real. You can do this on your turn as a bonus action while the spell is ongoing. The object remains real for 1 minute. For example, you can create an illusion of a bridge over a chasm and then make it real long enough for your allies to cross.";
        illusoryReality.recharge = "None";
        illusoryReality.spellLevel = 0;
        illusoryReality.requiredLevel = 14;
        illusion.subclassAbilityList.add(illusoryReality);

        wizardSubClassList.add(illusion);

        SubClass necromancy = null;
        necromancy.name = "Necromancy";
        necromancy.parentName = "Wizard";

        Ability grimHarvest = null;
        grimHarvest.name = "Grim Harvest";
        grimHarvest.actionType = "Free";
        grimHarvest.description = "At 2nd level, you gain the ability to reap life energy from creatures you kill with your spells. Once per turn when you kill one or more creatures with a spell of 1st level or higher, you regain hit points equal to twice the spell's level, or three times its level if the spell belongs to the School of Necromancy. You don't gain this benefit for killing constructs or undead.";
        grimHarvest.recharge = "Turn";
        grimHarvest.spellLevel = 0;
        grimHarvest.requiredLevel = 2;
        necromancy.subclassAbilityList.add(grimHarvest);

        Ability commandUndead = null;
        commandUndead.name = "Command Undead";
        commandUndead.actionType = "Action";
        commandUndead.description = "Starting at 14th level, you can use magic to bring undead under your control, even those created by other wizards. As an action, you can choose one undead that you can see within 60 feet of you. That creature must make a Charisma saving throw against your wizard spell save DC. If it succeeds, you can't use this feature on it again. If it fails, it becomes friendly to you and obeys your commands until you use this feature again.";
        commandUndead.recharge = "None";
        commandUndead.spellLevel = 0;
        commandUndead.requiredLevel = 14;
        necromancy.subclassAbilityList.add(commandUndead);

        wizardSubClassList.add(necromancy);

        SubClass transmutation = null;
        transmutation.name = "Transmutation";
        transmutation.parentName = "Wizard";

        Ability shapechanger = null;
        shapechanger.name = "Shapechanger";
        shapechanger.actionType = "Action";
        shapechanger.description = "At 10th level, you add the polymorph spell to your spellbook, if it is not there already. You can cast polymorph without expending a spell slot. When you do so, you can target only yourself and transform into a beast whose challenge rating is 1 or lower.";
        shapechanger.recharge = "Short";
        shapechanger.spellLevel = 0;
        shapechanger.requiredLevel = 10;
        transmutation.subclassAbilityList.add(shapechanger);

        Ability masterTransmuter = null;
        masterTransmuter.name = "Master Transmuter";
        masterTransmuter.actionType = "Action";
        masterTransmuter.description = "Starting at 14th level, you can use your action to consume the reserve of transmutation magic stored within your transmuter's stone in a single burst. Your transmuter's stone is destroyed and can't be remade until you finish a long rest.";
        masterTransmuter.recharge = "Long";
        masterTransmuter.spellLevel = 0;
        masterTransmuter.requiredLevel = 14;
        transmutation.subclassAbilityList.add(masterTransmuter);

        wizardSubClassList.add(transmutation);

        SubClass war = null;
        war.name = "War";
        war.parentName = "Wizard";

        Ability arcaneDeflection = null;
        arcaneDeflection.name = "Arcane Deflection";
        arcaneDeflection.actionType = "Reaction";
        arcaneDeflection.description = "At 2nd level, you have learned to weave your magic to fortify yourself against harm. When you are hit by an attack or you fail a saving throw, you can use your reaction to gain a +2 bonus to your AC against that attack or a +4 bonus to that saving throw.";
        arcaneDeflection.recharge = "Turn";
        arcaneDeflection.spellLevel = 0;
        arcaneDeflection.requiredLevel = 2;
        war.subclassAbilityList.add(arcaneDeflection);

        Ability powerSurge = null;
        powerSurge.name = "Power Surge";
        powerSurge.actionType = "Free";
        powerSurge.description = "Once per turn when you deal damage to a creature or object with a wizard spell, you can spend one power surge to deal extra force damage to that target. The extra damage equals half your wizard level.";
        powerSurge.recharge = "Turn";
        powerSurge.spellLevel = 0;
        powerSurge.requiredLevel = 6;
        war.subclassAbilityList.add(powerSurge);

        wizardSubClassList.add(war);

        return wizardSubClassList;
    }
}