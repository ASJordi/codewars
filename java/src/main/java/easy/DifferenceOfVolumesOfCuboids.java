package easy;

public class DifferenceOfVolumesOfCuboids {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int first = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int second = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];

        return first > second ? first - second : second - first;

    }

}
