import java.util.Scanner;

//1
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        int i = a;
        
        while (i <= b) {
            if (i % 3 == 0 && i % 5 != 0) {
                count++;
            }
            i++;
        }
        
        System.out.println(count);
    }
}
*/

//2
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num;

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println(average);
    }
}
*/

//3
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Если a нечётное, начинаем с ближайшего чётного числа
        if (a % 2 != 0) {
            a++;
        }

        while (a <= b) {
            System.out.println(a);
            a += 2;
        }
    }
}
*/

//4
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Читаем натуральное число N
        int sum = 0;          // Переменная для суммы цифр

        // Пока N не стало 0
        while (N > 0) {
            int digit = N % 10;  // Получаем последнюю цифру числа
            sum += digit;       // Добавляем эту цифру к сумме
            N = N / 10;         // Убираем последнюю цифру из числа
        }

        System.out.println(sum); // Выводим сумму цифр
    }
}
*/

//5
/*public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max1 = 0;    // Максимальное число
        int max2 = 0;    // Второе по величине число

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        
        System.out.println(max2);
    }
}
*/

//6
/*public class SumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
*/

//7
/*public class CheckWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (;;) {  // бесконечный цикл, выход по условию внутри
            String word = sc.nextLine();
            if (word.equals("СТОП")) {
                break;
            }
            if (word.equals("Куб")) {
                found = true;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
*/

//8
/*public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
*/

//9
/*public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long factorial = 1; // используем long для больших n
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println(factorial);
    }
}
*/

//10
/*public class ProductNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long product = 1;
        boolean found = false;
        
        for (;;) {  // бесконечный цикл, внутри будет break при вводе "СТОП"
            String input = sc.next();
            if (input.equals("СТОП")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num != 0) {
                product *= num;
                found = true;
            }
        }
        
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("Не найдено");
        }
    }
}
*/