package kyu6;

public class YourOrderPlease {

    public static String order(String words) {

        String[] wordsArr = words.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            for (String word : wordsArr) {
                if (word.contains(String.valueOf(i))) res.append(word).append(" ");
            }
        }

        return res.toString().trim();

//        if (words.isBlank()) return "";
//
//        String[] wordsArr = words.split(" ");
//        ArrayList<Integer> nums = new ArrayList<>();
//        StringBuilder res = new StringBuilder();
//
//        for (String word : wordsArr){
//            for (char d : word.toCharArray()){
//                if (Character.isDigit(d)) nums.add(Integer.parseInt(Character.toString(d)));
//            }
//        }
//
//        Collections.sort(nums);
//
//        for (Integer num : nums) {
//            for (String s : wordsArr) {
//                if (s.contains(String.valueOf(num))) {
//                    res.append(" ").append(s);
//                }
//            }
//        }
//
//        return res.toString().trim();
    }

}
