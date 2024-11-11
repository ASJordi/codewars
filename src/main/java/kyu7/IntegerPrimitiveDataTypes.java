package kyu7;

public class IntegerPrimitiveDataTypes {

    public String determineType(String number) {
        try {
            Byte n = Byte.parseByte(number);
            return "byte";
        } catch (Exception e){}

        try {
            Short n = Short.parseShort(number);
            return "short";
        } catch (Exception e){}

        try {
            Integer n = Integer.parseInt(number);
            return "int";
        } catch (Exception e){}

        try {
            Long n = Long.parseLong(number);
            return "long";
        } catch (Exception e){}


        return "none";
    }

}
