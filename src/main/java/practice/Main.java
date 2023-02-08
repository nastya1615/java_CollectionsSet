package practice;

import java.util.Scanner;

public class Main {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    private static EmailList function = new EmailList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите командру");
            String input = scanner.nextLine();
            String[] words = input.split("\\s");

            if (input.equals("0")) {
                break;
            }

            if (words[0].equals("ADD")) {

                if (words.length == 2) {
                    function.add(words[1]);

                } else {
                    System.out.println(WRONG_EMAIL_ANSWER);

                }

            } else if (input.equals("LIST")) {

                for (String emil : function.getSortedEmails()) {
                    System.out.println(emil);

                }
            } else {
                System.out.println("Данной команды не существует");
            }
            //TODO: write code here

        }
    }
}
