package week5;

import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import theDateTimeFormatter class
class DateTimeEx
 {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }
}
