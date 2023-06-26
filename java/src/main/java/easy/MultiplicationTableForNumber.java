package easy;

public class MultiplicationTableForNumber {

    public static String multiTable(int num) {

        StringBuilder table = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            if (i == 10) {
                table.append(i).append(" * ").append(num).append(" = ").append(i * num);
                break;
            }

            table.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }

        return table.toString();
    }

}
