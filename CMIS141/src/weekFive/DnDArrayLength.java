package weekFive;

/* File: DnDArrayLength.java
 * Author: Amy Heyen
 * Date: 09-20-2020
 * Purpose: Rolls a die to select a random encounter
*/

public class DnDArrayLength {
  public static void main(String[] args)  { 
    // array of encounter names
    ////////////////////////////////////////////////////////////
    // EDIT added encounters, list of creatures retrieved from: 
    // https://docs.google.com/spreadsheets/d/1qdMeBoSE5Mo0aztA4zE7sHWRW9zC4ESQo3axqwKDqYU/edit#gid=795091671
    ////////////////////////////////////////////////////////////
    String[] encounters = { "Aarakocra", "Aboleth", "Abominable Yeti", "Acolyte", 
                            "Air Elemental", "Allosaurus", "Androsphinx", "Animated Armor", "Ankheg", "Ankylosaurus", "Ape", 
                            "Arcanaloth", "Archmage", "Assassin", "Awakened Shrub", "Awakened Tree", "Axe Beak", "Azer", 
                            "Baboon", "Badger", "Balor", "Bandit", "Bandit Captain", "Banshee", "Barbed Devil", "Barlgura", 
                            "Basilisk", "Bat", "Bearded Devil", "Behir", "Beholder", "Beholder Zombie", "Berserker", 
                            "Black Bear", "Black Dragon, Adult", "Black Dragon, Ancient", "Black Dragon, Wyrmling", 
                            "Black Dragon, Young", "Black Pudding", "Blink Dog", "Blood Hawk", "Blue Dragon, Adult", 
                            "Blue Dragon, Ancient", "Blue Dragon, Wyrmling", "Blue Dragon, Young", "Blue Slaad", "Boar", 
                            "Bone Devil", "Bone Naga", "Brass Dragon, Adult", "Brass Dragon, Ancient", "Brass Dragon, Wyrmling", 
                            "Brass Dragon, Young", "Bronze Dragon, Adult", "Bronze Dragon, Ancient", "Bronze Dragon, Wyrmling", 
                            "Bronze Dragon, Young", "Brown Bear", "Bugbear", "Bugbear Chief", "Bulette", "Bullywug", "Cambion", 
                            "Camel", "Carrion Crawler", "Cat", "Centaur", "Chain Devil", "Chasme", "Chimera", "Chuul", 
                            "Clay Golem", "Cloaker", "Cloud Giant", "Cockatrice", "Commoner", "Constrictor Snake", 
                            "Copper Dragon, Adult", "Copper Dragon, Ancient", "Copper Dragon, Wyrmling", "Copper Dragon, Young", 
                            "Couatl", "Crab", "Crawling Claw", "Crocodile", "Cult Fanatic", "Cultist", "Cyclops", "Dao", 
                            "Darkmantle", "Death Dog", "Death Knight", "Death Slaad", "Death Tyrant", "Deer", "Demilich", 
                            "Deva", "Dire Wolf", "Displacer Beast", "Djinni", "Doppelganger", "Dracolich", "Draft Horse", 
                            "Dragon Turtle", "Dretch", "Drider", "Drow", "Drow Elite Warrior", "Drow Mage", "Drow Priestess of Lolth", 
                            "Druid", "Dryad", "Duergar", "Duodrone", "Dust Mephit", "Eagle", "Earth Elemental", "Efreeti", 
                            "Elephant", "Elk", "Empyrean", "Erinyes", "Ettercap", "Ettin", "Faerie Dragon", "Fire Elemental", 
                            "Fire Giant", "Fire Snake", "Flameskull", "Flesh Golem", "Flumph", "Flying Snake", "Flying Sword", 
                            "Fomorian", "Frog", "Frost Giant", "Galeb Duhr", "Gargoyle", "Gas Spore", "Gelatinous Cube", 
                            "Ghast", "Ghost", "Ghoul", "Giant Ape", "Giant Badger", "Giant Bat", "Giant Boar", "Giant Centipede", 
                            "Giant Constrictor Snake", "Giant Crab", "Giant Crocodile", "Giant Eagle", "Giant Elk", "Giant Fire Beetle", 
                            "Giant Frog", "Giant Goat", "Giant Hyena", "Giant Lizard", "Giant Octopus", "Giant Owl", 
                            "Giant Poisonous Snake", "Giant Rat", "Giant Scorpion", "Giant Sea Horse", "Giant Shark", 
                            "Giant Spider", "Giant Toad", "Giant Vulture", "Giant Wasp", "Giant Weasel", "Giant Wolf Spider", 
                            "Gibbering Mouther", "Githyanki Knight", "Githyanki Warrior", "Githzerai Monk", "Githzerai Zerth", 
                            "Glabrezu", "Gladiator", "Gnoll", "Gnoll Fang of Yeenoghu", "Gnoll Pack Lord", "Gnome, Deep (Svirfneblin)", 
                            "Goat", "Goblin", "Goblin Boss", "Gold Dragon, Adult", "Gold Dragon, Ancient", "Gold Dragon, Wyrmling", 
                            "Gold Dragon, Young", "Gorgon", "Goristro", "Gray Ooze", "Gray Slaad", "Green Dragon, Adult", 
                            "Green Dragon, Ancient", "Green Dragon, Wyrmling", "Green Dragon, Young", "Green Hag", "Green Slaad", 
                            "Grell", "Grick", "Grick Alpha", "Griffon", "Grimlock", "Guard", "Guardian Naga", "Gynosphinx", 
                            "Half Ogre", "Half-Red Dragon Veteran", "Harpy", "Hawk", "Hell Hound", "Helmed Horror", "Hezrou", 
                            "Hill Giant", "Hippogriff", "Hobgoblin", "Hobgoblin Captain", "Hobgoblin Warlord", "Homunculus", 
                            "Hook Horror", "Horned Devil", "Hunter Shark", "Hydra", "Hyena", "Ice Devil", "Ice Mephit", "Imp", 
                            "Intellect Devourer", "Invisible Stalker", "Iron Golem", "Jackal", "Jackalwere", "Kenku", "Killer Whale", 
                            "Knight", "Kobold", "Kraken", "Kuo-Toa", "Kuo-Toa Archpriest", "Kuo-Toa Whip", "Lamia", "Lemure", 
                            "Lich", "Lion", "Lizard", "Lizard King/Queen", "Lizardfolk", "Lizardfolk Shaman", "Mage", "Magma Mephit", 
                            "Magmin", "Mammoth", "Manes", "Manticore", "Marid", "Marilith", "Mastiff", "Medusa", "Merfolk", 
                            "Merrow", "Mezzoloth", "Mimic", "Mind Flayer", "Minotaur", "Minotaur Skeleton", "Monodrone", "Mud Mephit", 
                            "Mule", "Mummy", "Mummy Lord", "Myconid Adult", "Myconid Sovereign", "Myconid Sprout", "Nalfeshnee", 
                            "Needle Blight", "Night Hag", "Nightmare", "Noble", "Nothic", "Nycaloth", "Ochre Jelly", "Octopus", 
                            "Ogre", "Ogre Zombie", "Oni", "Orc", "Orc Eye of Gruumsh", "Orc War Chief", "Orog", "Otyugh", "Owl", 
                            "Owlbear", "Panther", "Pegasus", "Pentadrone", "Peryton", "Phase Spider", "Piercer", "Pit Fiend", 
                            "Pixie", "Planetar", "Plesiosaurus", "Poisonous Snake", "Polar Bear", "Pony", "Priest", "Pseudodragon", 
                            "Pteranodon", "Purple Worm", "Quadrone", "Quaggoth", "Quaggoth Spore Servant", "Quasit", "Quipper", 
                            "Rakshasa", "Rat", "Raven", "Red Dragon, Adult", "Red Dragon, Ancient", "Red Dragon, Wyrmling", 
                            "Red Dragon, Young", "Red Slaad", "Reef Shark", "Remorhaz", "Revenant", "Rhinoceros", "Riding Horse", 
                            "Roc", "Roper", "Rug of Smothering", "Rust Monster", "Saber-Toothed Tiger", "Sahuagin", "Sahuagin Baron", 
                            "Sahuagin Priestess", "Salamander", "Satyr", "Scarecrow", "Scorpion", "Scout", "Sea Hag", "Sea Horse", 
                            "Shadow", "Shadow Demon", "Shadow Dragon", "Shambling Mound", "Shield Guardian", "Shrieker", 
                            "Silver Dragon, Adult", "Silver Dragon, Ancient", "Silver Dragon, Wyrmling", "Silver Dragon, Young", 
                            "Skeleton", "Slaad Tadpole", "Smoke Mephit", "Solar", "Spectator", "Specter", "Spider", "Spined Devil", 
                            "Spirit Naga", "Sprite", "Spy", "Steam Mephit", "Stirge", "Stone Giant", "Stone Golem", "Storm Giant", 
                            "Succubus/Incubus", "Swarm of Bats", "Swarm of Insects", "Swarm of Poisonous Snakes", "Swarm of Quippers", 
                            "Swarm of Rats", "Swarm of Ravens", "Tarrasque", "Thri-Kreen", "Thug", "Tiger", "Treant", "Tribal Warrior", 
                            "Triceratops", "Tridrone", "Troglodyte", "Troll", "Twig Blight", "Tyrannosaurus Rex", "Ultroloth", 
                            "Umber Hulk", "Unicorn", "Vampire", "Vampire Spawn", "Veteran", "Vine Blight", "Violet Fungus", "Vrock", 
                            "Vulture", "Warhorse", "Warhorse Skeleton", "Water Elemental", "Water Weird", "Weasel", "Werebear",
                            "Wereboar", "Wererat", "Weretiger", "Werewolf", "White Dragon, Adult", "White Dragon, Ancient", 
                            "White Dragon, Wyrmling", "White Dragon, Young", "Wight", "Will-O'-Wisp", "Winged Kobold", "Winter Wolf", 
                            "Wolf", "Worg", "Wraith", "Wyvern", "Xorn", "Yeti", "Yochlol", "Young Remorhaz", "Yuan-Ti Abomination", 
                            "Yuan-Ti Malison", "Yuan-Ti Pureblood", "Zombie", 
    };
    // saves length of array as an int
    int numberOfEncounters = encounters.length;
    // rolls a die = number of encounters and adds 1 so that zero is not an option
    int die = (int)(Math.random() * numberOfEncounters) + 1;
    // prints the dice roll result
    System.out.println("You rolled a d" + numberOfEncounters + " and got a " + die);
    // prints the encounter name that corresponds to dice roll (minus one because arrays start at 0)
    System.out.println("The encounter that matches " + die + " is " + encounters[die - 1]);
    } // main
} // class 