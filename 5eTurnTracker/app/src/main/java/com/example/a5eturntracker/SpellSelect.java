package com.example.a5eturntracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SpellSelect extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell_select);


        // Cantrip Buttons


        Button buttAcidSplash = findViewById(R.id.acidSplashButton);
        Button buttBladeWard = findViewById(R.id.bladeWardButton);
        Button buttBoomingBlade = findViewById(R.id.boomingBladeButton);
        Button buttChillTouch = findViewById(R.id.chillTouchButton);
        Button buttControlFlames = findViewById(R.id.controlFlamesButton);
        Button buttCreateBonfire = findViewById(R.id.createBonfireButton);
        Button buttDancingLights = findViewById(R.id.dancingLightsButton);
        Button buttDruidcraft = findViewById(R.id.druidcraftButton);
        Button buttEldritchBlast = findViewById(R.id.eldritchBlastButton);
        Button buttEncodeThoughts = findViewById(R.id.encodeThoughtsButton);
        Button buttFireBolt = findViewById(R.id.fireBoltButton);
        Button buttFriends = findViewById(R.id.friendsButton);
        Button buttFrostbite = findViewById(R.id.frostbiteButton);
        Button buttGreenFlameBlade = findViewById(R.id.greenFlameBladeButton);
        Button buttGuidance = findViewById(R.id.guidanceButton);
        Button buttGust = findViewById(R.id.gustButton);
        Button buttInfestation = findViewById(R.id.infestationButton);
        Button buttLight = findViewById(R.id.lightButton);
        Button buttLightningLure = findViewById(R.id.lightningLureButton);
        Button buttMageHand = findViewById(R.id.mageHandButton);
        Button buttMagicStone = findViewById(R.id.magicStoneButton);
        Button buttMessage = findViewById(R.id.messageButton);
        Button buttMinorIllusion = findViewById(R.id.minorIllusionButton);
        Button buttMoldEarth = findViewById(R.id.moldEarthButton);
        Button buttPoisonSpray = findViewById(R.id.poisonSprayButton);
        Button buttPrestidigitation = findViewById(R.id.prestidigitationButton);
        Button buttPrimalSavagery = findViewById(R.id.primalSavageryButton);
        Button buttProduceFlame = findViewById(R.id.produceFlameButton);
        Button buttRayOfFrost = findViewById(R.id.rayOfFrostButton);
        Button buttResistance = findViewById(R.id.resistanceButton);
        Button buttSacredFlame = findViewById(R.id.sacredFlameButton);
        Button buttShapeWater = findViewById(R.id.shapeWaterButton);
        Button buttShillelagh = findViewById(R.id.shillelaghButton);
        Button buttShockingGrasp = findViewById(R.id.shockingGraspButton);
        Button buttSpareTheDying = findViewById(R.id.spareDyingButton);
        Button buttSwordBurst = findViewById(R.id.swordBurstButton);
        Button buttThaumaturgy = findViewById(R.id.thaumaturgyButton);
        Button buttThornWhip = findViewById(R.id.thornWhipButton);
        Button buttThunderclap = findViewById(R.id.thunderclapButton);
        Button buttTollTheDead = findViewById(R.id.tollDeadButton);
        Button buttTrueStrike = findViewById(R.id.trueStrikeButton);
        Button buttViciousMockery = findViewById(R.id.viciousMockeryButton);
        Button buttWordOfRadiance = findViewById(R.id.wordRadianceButton);


        // Level 1 Spells


        Button buttAbsorbElements = findViewById(R.id.absorbElementsButton);
        Button buttAnimalFriendship = findViewById(R.id.animalFriendshipButton);
        Button buttArmorOfAgathys = findViewById(R.id.armorAgathysButton);
        Button buttArmsOfHadar = findViewById(R.id.armsHadarButton);
        Button buttBane = findViewById(R.id.baneButton);
        Button buttBeastBond = findViewById(R.id.beastBond);
        Button buttBless = findViewById(R.id.blessButton);
        Button buttBurningHands = findViewById(R.id.burningHandsButton);
        Button buttCatapult = findViewById(R.id.catapultButton);
        Button buttCauseFear = findViewById(R.id.causeFearButton);
        Button buttChaosBolt = findViewById(R.id.chaosBoltButton);
        Button buttCharmPerson = findViewById(R.id.charmPersonButton);
        Button buttChromaticOrb = findViewById(R.id.chromaticOrbButton);
        Button buttColorSpray = findViewById(R.id.colorSprayButton);
        Button buttCommand = findViewById(R.id.commandButton);
        Button buttCompelledDuel = findViewById(R.id.compelledDuelButton);
        Button buttComprehendLanguages = findViewById(R.id.comprehendLanguagesButton);
        Button buttCreateDestroyWater = findViewById(R.id.createDestroyWaterButton);
        Button buttCureWounds = findViewById(R.id.cureWoundsButton);
        Button buttDetectEvilGood = findViewById(R.id.detectEvilGoodButton);
        Button buttDetectMagic = findViewById(R.id.detectMagicButton);
        Button buttDetectPoisonDisease = findViewById(R.id.detectPoisonDiseaseButton);
        Button buttDisguiseSelf = findViewById(R.id.disguiseSelfButton);
        Button buttDissonantWhispers = findViewById(R.id.dissonantWhispersButton);
        Button buttDivineFavor = findViewById(R.id.divineFavorButton);
        Button buttEarthTremor = findViewById(R.id.earthTremorButton);
        Button buttEnsnaringStrike = findViewById(R.id.ensnaringStrikeButton);
        Button buttEntangle = findViewById(R.id.entangleButton);
        Button buttExpeditiousRetreat = findViewById(R.id.expeditiousRetreatButton);
        Button buttFaerieFire = findViewById(R.id.faerieFireButton);
        Button buttFalseLife = findViewById(R.id.falseLifeButton);
        Button buttFeatherFall = findViewById(R.id.featherFallButton);
        Button buttFogCloud = findViewById(R.id.fogCloudButton);
        Button buttGoodberry = findViewById(R.id.goodberryButton);
        Button buttGrease = findViewById(R.id.greaseButton);
        Button buttGuidingBolt = findViewById(R.id.guidingBoltButton);
        Button buttHailOfThorns = findViewById(R.id.hallOfThornsButton);
        Button buttHealingWord = findViewById(R.id.healingWordButton);
        Button buttHellishRebuke = findViewById(R.id.hellishRebukeButton);
        Button buttHeroism = findViewById(R.id.heroismButton);
        Button buttHex = findViewById(R.id.healingSpiritButton);
        Button buttHuntersMark = findViewById(R.id.huntersMarkButton);
        Button buttIceKnife = findViewById(R.id.iceKnifeButton);
        Button buttInflictWounds = findViewById(R.id.inflictWoundsButton);
        Button buttJimsMagicMissile = findViewById(R.id.jimsMagicMissileButton);
        Button buttJump = findViewById(R.id.jumpButton);
        Button buttLongstrider = findViewById(R.id.longstriderButton);
        Button buttMageArmor = findViewById(R.id.mageArmorButton);
        Button buttMagicMissile = findViewById(R.id.magicMissileButton);
        Button buttProtectionEvilGood = findViewById(R.id.protectionEvilGoodButton);
        Button buttPurifyFoodDrink = findViewById(R.id.purifyFoodDrinkButton);
        Button buttRayOfSickness = findViewById(R.id.rayOfSicknessButton);
        Button buttSanctuary = findViewById(R.id.sanctuaryButton);
        Button buttSearingSmite = findViewById(R.id.searingSmiteButton);
        Button buttShield = findViewById(R.id.shieldButton);
        Button buttShieldOfFaith = findViewById(R.id.shieldOfFaithButton);
        Button buttSilentImage = findViewById(R.id.silentImageButton);
        Button buttSleep = findViewById(R.id.sleepButton);
        Button buttSpeakWithAnimals = findViewById(R.id.speakAnimalsButton);
        Button buttTashasHideousLaughter = findViewById(R.id.tashasHideousLaughterButton);
        Button buttTensersFloatingDisk = findViewById(R.id.tensersFloatingDiskButton);
        Button buttThunderousSmite = findViewById(R.id.thunderousSmiteButton);
        Button buttThunderwave = findViewById(R.id.thunderwaveButton);
        Button buttUnseenServant = findViewById(R.id.unseenServant);
        Button buttWitchBolt = findViewById(R.id.witchBoltButton);
        Button buttWrathfulSmite = findViewById(R.id.wrathfulSmiteButton);
        Button buttZephyrStrike = findViewById(R.id.zephhyrStrikeButton);


        // Level 2 Spells


        Button buttAganazzarsScorcher = findViewById(R.id.aganazzarsScorcherButton);
        Button buttAid = findViewById(R.id.aidButton);
        Button buttAlterSelf = findViewById(R.id.alterSelfButton);
        Button buttAnimalMessenger = findViewById(R.id.animalMessengerButton);
        Button buttArcaneLock = findViewById(R.id.arcaneLockButton);
        Button buttBarkskin = findViewById(R.id.barkskinButton);
        Button buttBeastSense = findViewById(R.id.beastSenseButton);
        Button buttBlindnessDeafness = findViewById(R.id.blindnessDeafnessButton);
        Button buttBlur = findViewById(R.id.bludButton);
        Button buttBrandingSmite = findViewById(R.id.brandingSmiteButton);
        Button buttCalmEmotions = findViewById(R.id.calmEmotionsButton);
        Button buttCloudOfDaggers = findViewById(R.id.cloudOfDaggersButton);
        Button buttContinualFlame = findViewById(R.id.continualFlameButton);
        Button buttCordonOfArrows = findViewById(R.id.cordonArrowsButton);
        Button buttCrownOfMadness = findViewById(R.id.crownMadnessButton);
        Button buttDarkness = findViewById(R.id.darknessButton);
        Button buttDarkvision = findViewById(R.id.darkvisionButton);
        Button buttDetectThoughts = findViewById(R.id.detectThoughtsButton);
        Button buttDragonsBreath = findViewById(R.id.dragonsBreathButton);
        Button buttDustDevil = findViewById(R.id.dustDevilButton);
        Button buttEarthbind = findViewById(R.id.earthbindButton);
        Button buttEnhanceAbility = findViewById(R.id.enhanceAbilityButton);
        Button buttEnlargeReduce = findViewById(R.id.enlargeReduceButton);
        Button buttEnthrall = findViewById(R.id.enthrallButton);
        Button buttFindTraps = findViewById(R.id.findTrapsButton);
        Button buttFlameBlade = findViewById(R.id.flameBladeButton);
        Button buttFlamingSphere = findViewById(R.id.flamingSphereButton);
        Button buttGentleRepose = findViewById(R.id.gentleReposeButton);
        Button buttGiftOfGab = findViewById(R.id.giftOfGabButton);
        Button buttGustOfWind = findViewById(R.id.gustOfWindButton);
        Button buttHealingSpirit = findViewById(R.id.healingSpiritButton);
        Button buttHeatMetal = findViewById(R.id.heatMetalButton);
        Button buttHoldPerson = findViewById(R.id.holdPersonButton);
        Button buttInvisibility = findViewById(R.id.invisibilityButton);
        Button buttJimsGlowingCoin = findViewById(R.id.jimsGlowingCoinButton);
        Button buttKnock = findViewById(R.id.knockButton);
        Button buttLesserRestoration = findViewById(R.id.lesserRestorationButton);
        Button buttLevitate = findViewById(R.id.levitateButton);
        Button buttLocateAnimalsPlants = findViewById(R.id.locateAnimalsPlantsButton);
        Button buttLocateObject = findViewById(R.id.locateObjectButton);
        Button buttMagicWeapon = findViewById(R.id.magicWeaponButton);
        Button buttMaximiliansEarthenGrasp = findViewById(R.id.maximiliansEarthenGraspButton);
        Button buttMelfsAcidArrow = findViewById(R.id.melfsAcidArrowButton);
        Button buttMindSpike = findViewById(R.id.mindSpikeButton);
        Button buttMirrorImage = findViewById(R.id.mirrorImageButton);
        Button buttMistyStep = findViewById(R.id.mistyStepButton);
        Button buttMoonbeam = findViewById(R.id.moonbeamButton);
        Button buttNystulsMagicAura = findViewById(R.id.nystulsMagicAuraButton);
        Button buttPassWithoutTrace = findViewById(R.id.passWithoutTraceButton);
        Button buttPhantasmalForce = findViewById(R.id.phantasmalForceButton);
        Button buttProtectionFromPoison = findViewById(R.id.protectionFromPoisonButton);
        Button buttPyrotechnics = findViewById(R.id.pyrotechnicsButton);
        Button buttRayOfEnfeeblement = findViewById(R.id.rayOfEnfeeblementButton);
        Button buttRopeTrick = findViewById(R.id.ropeTrickButton);
        Button buttScorchingRay = findViewById(R.id.scorchingRayButton);
        Button buttSeeInvisibility = findViewById(R.id.seeInvisibilityButton);
        Button buttShadowBlade = findViewById(R.id.shadowBladeButton);
        Button buttShatter = findViewById(R.id.shatterButton);
        Button buttSilence = findViewById(R.id.silenceButton);
        Button buttSkywrite = findViewById(R.id.skywriteButton);
        Button buttSnillocsSnowballSwarm = findViewById(R.id.snillocsSnowballSwarmButton);
        Button buttSpiderClimb = findViewById(R.id.spiderClimbButton);
        Button buttSpikeGrowth = findViewById(R.id.spikeGrowthButton);
        Button buttSpiritualWeapon = findViewById(R.id.spiritualWeaponButton);
        Button buttSuggestion = findViewById(R.id.suggestionButton);
        Button buttWardingBond = findViewById(R.id.wardingBondButton);
        Button buttWardingWind = findViewById(R.id.wardingWindButton);
        Button buttWeb = findViewById(R.id.webButton);
        Button buttZoneOfTruth = findViewById(R.id.zoneOfTruthButton);


        // Level 3 Spells


        Button buttAuraOfVitality = findViewById(R.id.auraOfVitalityButton);
        Button buttBeaconOfHope = findViewById(R.id.beaconOfHopeButton);
        Button buttBestowCurse = findViewById(R.id.bestowCurseButton);
        Button buttBlindingSmite = findViewById(R.id.blindingSmiteButton);
        Button buttBlink = findViewById(R.id.blinkButton);
        Button buttCallLightning = findViewById(R.id.callLightningButton);
        Button buttCatnap = findViewById(R.id.catnapButton);
        Button buttConjureAnimals = findViewById(R.id.conjureAnimalsButton);
        Button buttConjureBarrage = findViewById(R.id.conjureBarrageButton);
        Button buttCounterspell = findViewById(R.id.counterspellButton);
        Button buttCreateFoodWater = findViewById(R.id.createFoodWaterButton);
        Button buttCrusadersMantle = findViewById(R.id.crusadersMantleButton);
        Button buttDaylight = findViewById(R.id.daylightButton);
        Button buttDispelMagic = findViewById(R.id.dispelMagicButton);
        Button buttElementalWeapon = findViewById(R.id.elementalWeaponButton);
        Button buttEnemiesAbound = findViewById(R.id.enemiesAboundButton);
        Button buttEruptingEarth = findViewById(R.id.eruptingEarthButton);
        Button buttFastFriends = findViewById(R.id.fastFriendsButton);
        Button buttFear = findViewById(R.id.fearButton);
        Button buttFeignDeath = findViewById(R.id.feignDeathButton);
        Button buttFireball = findViewById(R.id.fireballButton);
        Button buttFlameArrows = findViewById(R.id.flameArrowsButton);
        Button buttFly = findViewById(R.id.flyButton);
        Button buttGaseousForm = findViewById(R.id.gaseousFormButton);
        Button buttHaste = findViewById(R.id.hasteButton);
        Button buttHungerOfHadar = findViewById(R.id.hungerOfHadarButton);
        Button buttHypnoticPattern = findViewById(R.id.hypnoticPatternButton);
        Button buttInciteGreed = findViewById(R.id.inciteGreedButton);
        Button buttLifeTransference = findViewById(R.id.lifeTransferenceButton);
        Button buttLightningArrow = findViewById(R.id.lightningArrowButton);
        Button buttLightningBolt = findViewById(R.id.lightningBoltButton);
        Button buttMajorImage = findViewById(R.id.majorImageButton);
        Button buttMassHealingWord = findViewById(R.id.massHealingWordButton);
        Button buttMeldIntoStone = findViewById(R.id.meldIntoStoneButton);
        Button buttMelfsMinuteMeteors = findViewById(R.id.melfsMinuteMeteorsButton);
        Button buttNondetection = findViewById(R.id.nondetectionButton);
        Button buttPlantGrowth = findViewById(R.id.plantGrowthButton);
        Button buttProtectionFromEnergy = findViewById(R.id.protectionFromEnergyButton);
        Button buttRemoveCurse = findViewById(R.id.removeCurseButton);
        Button buttRevivify = findViewById(R.id.revivifyButton);
        Button buttSending = findViewById(R.id.sendingButton);
        Button buttSleetStorm = findViewById(R.id.sleetStormButton);
        Button buttSlow = findViewById(R.id.slowButton);
        Button buttSpeakWithDead = findViewById(R.id.speakWithDeadButton);
        Button buttSpeakWithPlants = findViewById(R.id.speakWithPlantsButton);
        Button buttSpiritGuardians = findViewById(R.id.spiritGuardiansButton);
        Button buttStinkingCloud = findViewById(R.id.stinkingCloudButton);
        Button buttSummonLesserDemons = findViewById(R.id.summonLesserDemonsButton);
        Button buttThunderStep = findViewById(R.id.thunderStepButton);
        Button buttTidalWave = findViewById(R.id.tidalWaveButton);
        Button buttTongues = findViewById(R.id.tonguesButton);
        Button buttVampiricTouch = findViewById(R.id.vampiricTouchButton);
        Button buttWallOfSand = findViewById(R.id.wallOfSandButton);
        Button buttWallOfWater = findViewById(R.id.wallOfWaterButton);
        Button buttWaterBreathing = findViewById(R.id.waterBreathingButton);
        Button buttWaterWalk = findViewById(R.id.waterWalkButton);
        Button buttWindWall = findViewById(R.id.windWallButton);


        // Level 4 Spells

        Button buttArcaneEye = findViewById(R.id.arcaneEyeButton);
        Button buttAuraOfLife = findViewById(R.id.auraOfLifeButton);
        Button buttBanishment = findViewById(R.id.banishmentButton);
        Button buttBlight = findViewById(R.id.blightButton);
        Button buttCharmMonster = findViewById(R.id.charmMonsterButton);
        Button buttCompulsion = findViewById(R.id.compulsionButton);
        Button buttConfusion = findViewById(R.id.confusionButton);
        Button buttConjureWoodlandBeings = findViewById(R.id.conjureWoodlandBeingsButton);
        Button buttControlWater = findViewById(R.id.controlWaterButton);
        Button buttDeathWard = findViewById(R.id.deathWardButton);
        Button buttDimensionDoor = findViewById(R.id.dimensionDoorButton);
        Button buttDivination = findViewById(R.id.divinationButton);
        Button buttDominateBeast = findViewById(R.id.dominateBeastButton);
        Button buttElementalBane = findViewById(R.id.elementalBaneButton);
        Button buttEvardsBlackTentacles = findViewById(R.id.evardsBlackTentaclesButton);
        Button buttFireShield = findViewById(R.id.fireShieldButton);
        Button buttFreedomOfMovement = findViewById(R.id.freedomOfMovementButton);
        Button buttGiantInsect = findViewById(R.id.giantInsectButton);
        Button buttGraspingVine = findViewById(R.id.graspingVineButton);
        Button buttGreaterInvisibility = findViewById(R.id.greaterInvisibilityButton);
        Button buttGuardianOfFaith = findViewById(R.id.guardianOfFaithButton);
        Button buttGuardianOfNature = findViewById(R.id.guardianOfNatureButton);
        Button buttIceStorm = findViewById(R.id.iceStormButton);
        Button buttLeomundsSecretChest = findViewById(R.id.leomundsSecretChestButton);
        Button buttLocateCreature = findViewById(R.id.locateCreatureButton);
        Button buttMordenkainensFaithfulHound = findViewById(R.id.mordenkainensFaithfulHoundButton);
        Button buttOtilukesResilientSphere = findViewById(R.id.otilukesResilientSphereButton);
        Button buttPhantasmalKiller = findViewById(R.id.phantasmalKillerButton);
        Button buttPolymorph = findViewById(R.id.polymorphButton);
        Button buttShadowOfMoil = findViewById(R.id.shadowOfMoilButton);
        Button buttSickeningRadiance = findViewById(R.id.sickeningRadianceButton);
        Button buttStaggeringSmite = findViewById(R.id.staggeringSmiteButton);
        Button buttStoneShape = findViewById(R.id.stoneShapeButton);
        Button buttStoneskin = findViewById(R.id.stoneskinButton);
        Button buttStormSphere = findViewById(R.id.stormSphereButton);
        Button buttSummonGreaterDemon = findViewById(R.id.summonGreaterDemon);
        Button buttVitriolicSphere = findViewById(R.id.vitriolicSphereButton);
        Button buttWallOfFire = findViewById(R.id.wallOfFireButton);
        Button buttWaterySphere = findViewById(R.id.waterySphereButton);


        // Level 5 Spells


        Button buttAnimateObjcets = findViewById(R.id.animateObjectsButton);
        Button buttAntilifeShell = findViewById(R.id.antilifeShellButton);
        Button buttBanishingSmite = findViewById(R.id.banishingSmiteButton);
        Button buttBigbysHand = findViewById(R.id.bigbysHandButton);
        Button buttCircleOfPower = findViewById(R.id.circleOfPowerButton);
        Button buttCloudkill = findViewById(R.id.cloudkillButton);
        Button buttConeOfCold = findViewById(R.id.coneOfColdButton);
        Button buttConjureVolley = findViewById(R.id.conjureVolleyButton);
        Button buttContagion = findViewById(R.id.contagionButton);
        Button buttControlWinds = findViewById(R.id.controlWindsButton);
        Button buttDanseMacabre = findViewById(R.id.danseMacabreButton);
        Button buttDawn = findViewById(R.id.dawnButton);
        Button buttDestructiveWave = findViewById(R.id.destructiveWaveButton);
        Button buttDispelEvilGood = findViewById(R.id.dispelEvilGoodButton);
        Button buttDominatePerson = findViewById(R.id.dominatePersonButton);
        Button buttEnervation = findViewById(R.id.enervationButton);
        Button buttFarStep = findViewById(R.id.farStepButton);
        Button buttFlameStrike = findViewById(R.id.flameStrikeButton);
        Button buttGreaterRestoration = findViewById(R.id.greaterRestorationButton);
        Button buttHoldMonster = findViewById(R.id.holdMonsterButton);
        Button buttHolyWeapon = findViewById(R.id.holyWeaponButton);
        Button buttImmolation = findViewById(R.id.immolationButton);
        Button buttInsectPlague = findViewById(R.id.insectPlagueButton);
        Button buttMaelstrom = findViewById(R.id.maelstromButton);
        Button buttMassCureWounds = findViewById(R.id.massCureWoundsButton);
        Button buttMislead = findViewById(R.id.misleadButton);
        Button buttModifyMemory = findViewById(R.id.modifyMemoryButton);
        Button buttNegativeEnergyFlood = findViewById(R.id.negativeEnergyFloodButton);
        Button buttPasswall = findViewById(R.id.passwallButton);
        Button buttRarysTelepathicBond = findViewById(R.id.rarysTelepathicBondButton);
        Button buttSeeming = findViewById(R.id.seemingButton);
        Button buttSkillEmpowerment = findViewById(R.id.skillEmpowermentButton);
        Button buttSteelWindStrike = findViewById(R.id.steelWindStrikeButton);
        Button buttSwiftQuiver = findViewById(R.id.swiftQuiverButton);
        Button buttSynapticStatic = findViewById(R.id.synapticStaticButton);
        Button buttTelekinesis = findViewById(R.id.telekinesisButton);
        Button buttTransmuteRock = findViewById(R.id.transmuteRockButton);
        Button buttTreeStride = findViewById(R.id.treeStrideButton);
        Button buttWallOfForce = findViewById(R.id.wallOfForceButton);
        Button buttWallOfLight = findViewById(R.id.wallOfLightButton);
        Button buttWallOfStone = findViewById(R.id.wallOfStoneButton);
        Button buttWrathOfNature = findViewById(R.id.wrathOfNatureButton);


        // Level 6 Spells


        Button buttArcaneGate = findViewById(R.id.arcaneGateButton);
        Button buttBladeBarrier = findViewById(R.id.bladeBarrierButton);
        Button buttBonesOfTheEarth = findViewById(R.id.bonesOfTheEarthButton);
        Button buttChainLightning = findViewById(R.id.chainLightningButton);
        Button buttCircleOfDeath = findViewById(R.id.circleOfDeathButton);
        Button buttDisintegrate = findViewById(R.id.disintegrateButton);
        Button buttEyebite = findViewById(R.id.eyebiteButton);
        Button buttFleshToStone = findViewById(R.id.fleshToStoneButton);
        Button buttGlobeOfInvulnerability = findViewById(R.id.globeOfInvulnerabilityButton);
        Button buttHarm = findViewById(R.id.harmButton);
        Button buttHeal = findViewById(R.id.healButton);
        Button buttInvestitureOfFlame = findViewById(R.id.investitureFlameButton);
        Button buttInvestitureOfIce = findViewById(R.id.investitureIceButton);
        Button buttInvestitureOfStone = findViewById(R.id.investitureStoneButton);
        Button buttInvestitureOfWind = findViewById(R.id.investitureWindButton);
        Button buttMassSuggestion = findViewById(R.id.massSuggestionButton);
        Button buttMentalPrison = findViewById(R.id.mentalPrisonButton);
        Button buttMoveEarth = findViewById(R.id.moveEarthButton);
        Button buttOtilukesFreezingSphere = findViewById(R.id.otilukesFreezingSphereButton);
        Button buttOttosIrresistibleDance = findViewById(R.id.ottosIrresistibleDanceButton);
        Button buttPrimordialWard = findViewById(R.id.primordialWardButton);
        Button buttProgrammedIllusion = findViewById(R.id.programmedIllusionButton);
        Button buttScatter = findViewById(R.id.scatterButton);
        Button buttSoulCage = findViewById(R.id.soulCageButton);
        Button buttSunbeam = findViewById(R.id.sunbeamButton);
        Button buttTensersTransformation = findViewById(R.id.tensersTransformationButton);
        Button buttTransportViaPlants = findViewById(R.id.transportViaPlantsButton);
        Button buttTrueSeeing = findViewById(R.id.trueSeeingButton);
        Button buttWallOfIce = findViewById(R.id.wallOfIceButton);
        Button buttWallOfThorns = findViewById(R.id.wallOfThornsButton);
        Button buttWordOfRecall = findViewById(R.id.wordOfRecallButton);


        // Level 7 Spells

        Button buttCrownOfStars = findViewById(R.id.crownOfStarsButton);
        Button buttDelayedBlastFireball = findViewById(R.id.delayedBlastFireballButton);
        Button buttDivineWord = findViewById(R.id.divineWordButton);
        Button buttEtherealness = findViewById(R.id.etherealnessButton);
        Button buttFingerOfDeath = findViewById(R.id.fingerOfDeathButton);
        Button buttFireStorm = findViewById(R.id.fireStormButton);
        Button buttForcecage = findViewById(R.id.forcecageButton);
        Button buttMordenkainensSword = findViewById(R.id.mordenkainensSwordButton);
        Button buttPlaneShift = findViewById(R.id.planeShiftButton);
        Button buttPowerWordPain = findViewById(R.id.powerWordPainButton);
        Button buttPrismaticSpray = findViewById(R.id.prismaticSprayButton);
        Button buttProjectImage = findViewById(R.id.projectImageButton);
        Button buttReverseGravity = findViewById(R.id.reverseGravityButton);
        Button buttSequester = findViewById(R.id.sequesterButton);
        Button buttTeleport = findViewById(R.id.teleportButton);
        Button buttWhirlwind = findViewById(R.id.whirlwindButton);


        // Level 8 Spells


        Button buttAbiDalzimsHorridWilting = findViewById(R.id.abidalzimsHorridWiltingButton);
        Button buttAnimalShapes = findViewById(R.id.animalShapesButton);
        Button buttAntimagicField = findViewById(R.id.antimagicFieldButton);
        Button buttDemiplane = findViewById(R.id.demiplaneButton);
        Button buttDominateMonster = findViewById(R.id.dominateMonsterButton);
        Button buttEarthquake = findViewById(R.id.earthquakeButton);
        Button buttFeeblemind = findViewById(R.id.feeblemindButton);
        Button buttGlibness = findViewById(R.id.glibnessButton);
        Button buttHolyAura = findViewById(R.id.holyAuraButton);
        Button buttIllusoryDragon = findViewById(R.id.illusoryDragonButton);
        Button buttIncendiaryCloud = findViewById(R.id.incendiaryCloudButton);
        Button buttMaddeningDarkness = findViewById(R.id.maddeningDarknessButton);
        Button buttMaze = findViewById(R.id.mazeButton);
        Button buttMindBlank = findViewById(R.id.mindBlankButton);
        Button buttPowerWordStun = findViewById(R.id.powerWordStunButton);
        Button buttSunburst = findViewById(R.id.sunburstButton);
        Button buttTelepathy = findViewById(R.id.telepathyButton);


        // Level 9 Spells


        Button buttGate = findViewById(R.id.gateButton);
        Button buttInvulnerability = findViewById(R.id.invulnerabilityButton);
        Button buttMassHeal = findViewById(R.id.massHealButton);
        Button buttMassPolymorph = findViewById(R.id.massPolymorphButton);
        Button buttMeteorSwarm = findViewById(R.id.meteorSwarmButton);
        Button buttPowerWordHeal = findViewById(R.id.powerWordHealButton);
        Button buttPowerWordKill = findViewById(R.id.powerWordKill);
        Button buttPrismaticWall = findViewById(R.id.prismaticWallButton);
        Button buttPsychicScream = findViewById(R.id.psychicScreamButton);
        Button buttShapechange = findViewById(R.id.shapechangeButton);
        Button buttStormOfVengeance = findViewById(R.id.stormOfVengeanceButton);
        Button buttTimeStop = findViewById(R.id.timeStopButton);
        Button buttTruePolymorph = findViewById(R.id.truePolymorphButton);
        Button buttWeird = findViewById(R.id.weirdButton);
        Button buttWish = findViewById(R.id.wishButton);

    }
}
