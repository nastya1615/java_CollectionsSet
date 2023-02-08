package practice;
import java.util.*;

public class EmailList {

    TreeSet<String> colection = new TreeSet<>();

    public void add(String email) {

        String regex = "[A-Z a-z 0-9]+[@][a-z]+[.][a-z]+";

        if (email.matches(regex)) {
            colection.add(email.toLowerCase());
        }

        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
    }

    public List<String> getSortedEmails() {

        ArrayList<String> collectionList = new ArrayList<>();

        for (String email : colection) {

            collectionList.add(email);
        }
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return collectionList;
    }

}
