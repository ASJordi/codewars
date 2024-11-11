package kyu8;

public class WellOfIdeasEasyVersion {

    public static String well(String[] x) {

        int countGoodIdeas = 0;

        for (String idea : x) {
            if (idea.equals("good")) countGoodIdeas++;
        }

        return countGoodIdeas >=1 && countGoodIdeas <= 2 ? "Publish!" : countGoodIdeas > 2 ? "I smell a series!" : "Fail!";
    }

}
