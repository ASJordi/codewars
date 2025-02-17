package kyu8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WolvesAndSheepTest {

    @Test
    public void wolfIsClosestToTheSheep() {
        assertThat(WolvesAndSheep.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"})).isEqualTo("Oi! Sheep number 2! You are about to be eaten by a wolf!");
        assertThat(WolvesAndSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"})).isEqualTo("Oi! Sheep number 5! You are about to be eaten by a wolf!");
        assertThat(WolvesAndSheep.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"})).isEqualTo("Oi! Sheep number 6! You are about to be eaten by a wolf!");
        assertThat(WolvesAndSheep.warnTheSheep(new String[]{"sheep", "wolf", "sheep"})).isEqualTo("Oi! Sheep number 1! You are about to be eaten by a wolf!");
    }

    @Test
    public void wolfIsTheClosestAnimalToFarmer() {
        assertThat(WolvesAndSheep.warnTheSheep(new String[]{"sheep", "sheep", "wolf"})).isEqualTo("Pls go away and stop eating my sheep");
    }



}
