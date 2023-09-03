import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  Main{
    public static void main (String[] args) {
        // 1 - задание
        String[] slagaemye;
        Integer sum = 0;
        boolean isException;
        StringBuilder itogStroka;

        do {
            isException = false;
            slagaemye = null;
            itogStroka = new StringBuilder();
            Scanner str = new Scanner(System.in);
            System.out.print("Введите минимум два целых числа через один пробел: ");
            String isxStroka = str.nextLine();
            slagaemye = isxStroka.split(" ");

            try {
                itogStroka.append(slagaemye[0]);
                sum = Integer.parseInt(slagaemye[0]);
                for (int i = 1; i < slagaemye.length; i++) {
                    if (Integer.parseInt(slagaemye[i]) >= 0) {
                        itogStroka.append("+");
                        itogStroka.append(slagaemye[i]);
                    } else {
                        itogStroka.append(slagaemye[i]);
                    }
                    sum += Integer.parseInt(slagaemye[i]);
                }
                itogStroka.append("=");
            } catch (NumberFormatException ex1) {
                isException = true;
                System.out.println("Строка не введена, либо содержит не только целые числа разделенные пробелом ");

            } catch (ArrayIndexOutOfBoundsException ex2) { // если введен только пробел
                isException = true;
                System.out.println("Веден только пробел");
            }
        } while (slagaemye.length < 2 || isException);

        itogStroka.append(Integer.toString(sum));
        System.out.println(itogStroka);

        Matcher match = Pattern.compile("=").matcher(itogStroka);

        if (match.find()) {
            System.out.println(itogStroka.replace(match.start(), match.start() + 1, " равно "));
            //System.out.println("замена с индекса: " + match.start());
        }
        // 2  задание
        Scanner str = new Scanner(System.in);
        System.out.print("Введите текст, содержащий ссылку ");
        String text = str.nextLine();

        if (Pattern.compile(".+\\.{1}com[ ]*").matcher(text).find()) {
            System.out.println("Введенный текст, содержит ссылку  *.com ");
        } else {
            System.out.println("Введенный текст НЕ содержит ссылку  *.com ");
        }

        // 3 задание
        text = "ahb acb aeb aeeb adcb axeb";
        match = Pattern.compile("[ ]*a[a-zA-Z]{1}b").matcher(text);

        System.out.print("Cовпадения с шаблоном a*b  в строке: " + text + " : ");

        while (match.find()) {
            System.out.print(match.group() + " ");
        }
        System.out.println();
        // 4 задание
        text = "ab abab abab abababab abea";
        sum = 0;
        match = Pattern.compile("[ ]*ab[^ ]*").matcher(text);
        System.out.print("Cовпадения с шаблоном ab*  в строке: " + text + ":  ");
        while (match.find()) {
            System.out.print(match.group() + " ");
        }
        System.out.println();
        // 5 задание
        // не рациональный способ, но было интересно что будет: оказалось с шагом в одну минуту переполнится память ))))))
        // но вцелом - даты  и время ищет
        String s = "1000-01-01T00:00";
        String e = "2012-01-01T00:00";
        LocalDateTime n = LocalDateTime.parse(s);
        LocalDateTime k = LocalDateTime.parse(e);

        while (k.isAfter(n)) {
            itogStroka.append(n);
            itogStroka.append(" ");
            n = n.plusDays(1);
        }
        do{
            isException = false;
            try{
                System.out.println("Введите дату в формате YYYY-MM-DDTHH:MM из промежутка с "+s+ " по "+ e);
                text = str.nextLine();
                //text = "2011-12-31T23:01";
                if (Pattern.compile(text.substring(0,11)).matcher(itogStroka).find()
                        && Pattern.compile("[0][0-9]|[1][0-9]|2[0-3]:[0-5][0-9]").matcher(text.substring(11,16)).find()){
                    System.out.println ("Дата и время: " + text + " найдены в исходном промежутке");
                } else
                    System.out.println ("Дата и время: " + text + " не найдены в исходном промежутке");
                //([01]?[0-9]|2[0-3]):[0-5][0-9]
            }catch (Exception ex) {
                isException = true;
                System.out.println("Неверен формат введенной даты");
            }
        } while (isException);

        // 6 задание
        do {
            try {
                isException = false;
                str = new Scanner(System.in);
                System.out.print("Введите ФИО и возраст через пробел: ");
                String isxStroka = str.nextLine();
                new ProverkaDannyh(isxStroka);
            } catch (IncorrectInfoException ex1) {
                ex1.printStackTrace();
                // трассировочный стек не успевал вывестись до повторного приглашения ввести данные и иногда выводился после него
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                isException = true;
                //System.out.println(ex1.getMessage());
               // ex1.printStackTrace();
            } catch (Exception ex2) {
                isException = true;
                System.out.println("Ошибка формата, до проверки из задания дело не дошло, введите правильно ");
            }
        } while (isException);
        System.out.println("Введенные данные прошли проверку, завершаем программу ");

    }
}
