package kyu6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.format.DateTimeFormatter.ofPattern;

public class MyFriendTime {

    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        var format = ofPattern("dd-MM-yyyy HH:mm");

        LocalDateTime ldt = LocalDateTime.parse(myTime, format);
        ZoneId pZoneId = ZoneId.of(myZone);
        ZonedDateTime pZone = ldt.atZone(pZoneId);

        ZoneId fZone = ZoneId.of(friendZone);
        ZonedDateTime friendDateTime = pZone.withZoneSameInstant(fZone);

        return format.format(friendDateTime);
//        return LocalDateTime.parse(myTime, format).atZone(ZoneId.of(myZone)).withZoneSameInstant(ZoneId.of(friendZone)).format(format);
    }

}
