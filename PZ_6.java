import java.util.Scanner;

//1
/*public class JoinStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());  // Чтение количества строк
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();  // Чтение каждой строки
        }
        
        String delimiter = sc.nextLine();  // Чтение разделителя
        
        // Объединение строк через разделитель
        String result = String.join(delimiter, words);
        
        System.out.println(result);
        
        sc.close();
    }
}
*/

//2
/*public class FindIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Читаем строку с цифрами через пробел
        String[] numbers = sc.nextLine().split(" ");

        // Читаем цифру для поиска
        String target = sc.nextLine();

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(target)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println(firstIndex + " " + lastIndex);

        sc.close();
    }
}
*/

//3
/*public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Считываем любимые буквы Маши и Олега (приводим к нижнему регистру)
        char mariaLetter = sc.nextLine().toLowerCase().charAt(0);
        char olegLetter = sc.nextLine().toLowerCase().charAt(0);

        // Считываем строку со словами
        String[] words = sc.nextLine().split("\\s+");

        int mariaCount = 0;
        int olegCount = 0;

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (lowerWord.charAt(0) == mariaLetter && lowerWord.charAt(lowerWord.length() - 1) == olegLetter) {
                mariaCount++;
            }
            if (lowerWord.charAt(0) == olegLetter && lowerWord.charAt(lowerWord.length() - 1) == mariaLetter) {
                olegCount++;
            }
        }

        System.out.println(mariaCount);
        System.out.println(olegCount);

        sc.close();
    }
}
*/

//4
/*public class IPValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine().trim();

        // Разбиваем строку по точкам
        String[] parts = ip.split("\\.");

        // Проверка количества частей
        if (parts.length != 4) {
            System.out.println("NO");
            return;
        }

        for (String part : parts) {
            // Проверяем, что часть не пустая, только цифры и нет лишних символов
            if (part.isEmpty() || !part.matches("\\d+")) {
                System.out.println("NO");
                return;
            }

            // Проверяем отсутствие ведущих нулей, если длина больше 1
            if (part.length() > 1 && part.charAt(0) == '0') {
                System.out.println("NO");
                return;
            }

            // Преобразуем в число и проверяем диапазон
            int number = Integer.parseInt(part);
            if (number < 0 || number > 255) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
*/

//5
/*public class RecipeBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = sc.nextLine();
        }

        int m = Integer.parseInt(sc.nextLine());
        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split(" - ");
            replacements.put(parts[0], parts[1]);
        }

        for (String line : book) {
            // Разбиваем строку на слова с сохранением разделителей
            StringBuilder result = new StringBuilder();
            // Стандартное разделение по пробелам - можно изменить при необходимости
            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String wordLower = word.toLowerCase();

                // Уберём возможные знаки препинания с конца (если нужно)
                // например, "яблоко," => "яблоко"
                // если знаков препинания нет, это не повлияет
                int endIndex = word.length();
                while (endIndex > 0 && !Character.isLetterOrDigit(word.charAt(endIndex - 1))) {
                    endIndex--;
                }
                String coreWord = word.substring(0, endIndex);
                String punctuation = word.substring(endIndex);

                String coreWordLower = coreWord.toLowerCase();

                // Проверяем нужно ли заменить
                if (replacements.containsKey(coreWordLower)) {
                    String replacement = replacements.get(coreWordLower);

                    // Если первая буква заглавная - делаем замену с первой большой буквы
                    if (!coreWord.isEmpty() && Character.isUpperCase(coreWord.charAt(0))) {
                        replacement = replacement.substring(0, 1).toUpperCase() + replacement.substring(1);
                    }

                    // Добавляем замену со знаками препинания
                    words[i] = replacement + punctuation;
                }
            }

            System.out.println(String.join(" ", words));
        }
    }
}
*/