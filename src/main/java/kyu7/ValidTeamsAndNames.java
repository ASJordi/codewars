package kyu7;

public class ValidTeamsAndNames {

    public static String validate(String s) {
        StringBuilder sb = new StringBuilder();
        String[] teams = s.split("[A-Z]:");
        int validTeam = 0;

        for (String team : teams) {
            String[] names = team.split(",");
            if (names.length > 1) {
                sb.append(String.join(",", names)).append(",");
                validTeam++;
            }

        }

        return sb.deleteCharAt(sb.length() - 1).insert(0, validTeam + ":").toString();
    }

}
