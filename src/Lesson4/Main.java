package Lesson4;

public class Main {
    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Artem","88899855656");
        phoneBook.addElementPhoneBook("Artem","+7896453120");
        phoneBook.addElementPhoneBook("Artem","82565451223");

        phoneBook.addElementPhoneBook("Arts","888888");
        phoneBook.addElementPhoneBook("Arts","888888");
        phoneBook.addElementPhoneBook("Arts","888888   ");
        phoneBook.addElementPhoneBook("Arts","888  88 8 ");
        phoneBook.addElementPhoneBook("Arts","8  8  8 888     ");

        System.out.println("Artem: " + phoneBook.getPhonesByName("Artem"));
        System.out.println("Arts: " + phoneBook.getPhonesByName("Arts"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Niko: " + phoneBook.getPhonesByName("Niko"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mama";
        strings[1] = "Papa";
        strings[2] = "Puma";
        strings[3] = "Lev";
        strings[4] = "Mama";
        strings[5] = "Papa";
        strings[6] = "Kot";
        strings[7] = "KIt";
        strings[8] = "Babuhca";
        strings[9] = "Sova";
        return strings;
    }
}
