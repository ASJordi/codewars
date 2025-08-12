package kyu7;

public class WillYouSurviveTheZombieOnslaught {
    
    public static String zombieShootout(int zombies, int range, int ammo) {
	    range *= 2;
	    return "You shot " + (zombies > range || zombies > ammo ? Math.min(ammo, range) + " zombies before being eaten: " + (ammo < range ? "ran out of ammo." : "overwhelmed.") : "all " + zombies + " zombies.");
    }

}
