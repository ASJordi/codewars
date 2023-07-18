package kyu8;

public class ILoveYouALittleALotPassionatelyNotAtAll {

    public static String howMuchILoveYou(int nb_petals) {

        String[] flowerPetals = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return flowerPetals[(nb_petals - 1) % flowerPetals.length];

    }

}
