/**
 * task1:
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 *  результат после каждой итерации запишите в лог-файл.
 */

// import java.io.IOException;
// import java.util.logging.*;
// import java.util.Arrays;

// public class Program {
//     public static void main(String[] args) throws SecurityException, IOException {
//         int[] arr = { 5, 4, 3, 2, 1 };
//         int len = arr.length;

//         for (int i = 0; i < len - 1; i++) {
//             for (int j = 0; j < len - 1 - i; j++) {
//                 if (arr[j + 1] < arr[j]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//             String arrayToString = Arrays.toString(arr);

//             Logger logger = Logger.getLogger(Program.class.getName());
//             FileHandler fh = new FileHandler("log.txt");
//             logger.addHandler(fh);
//             SimpleFormatter sFormat = new SimpleFormatter();
//             fh.setFormatter(sFormat);
//             logger.info(arrayToString);
//         }
//     }
// }

/**
 * task2:
 * К калькулятору из предыдущего дз добавить логирование.
 */

// import java.io.Console;
// import java.io.IOException;
// import java.util.Scanner;
// import java.util.logging.*;

// public class Program {
//     public static void main(String[] args) throws SecurityException, IOException {
//         double num1;
//         double num2;
//         double result;
//         char op;
//         Scanner isScanner = new Scanner(System.in);
        // System.out.print("Введите первое число: ");
        // num1 = isScanner.nextDouble();
        // System.out.print("Введите второе число: ");
        // num2 = isScanner.nextDouble();
        // System.out.print("Выберите действие: (+, -, *, /): ");
        // op = isScanner.next().charAt(0);
        // switch (op) {
        //     case '+':
        //         result = num1 + num2;
        //         break;
        //     case '-':
        //         result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.printf("Ошибка, выберите правильное действие ");
//                 return;
//         }
//         System.out.print("\nОперация:\n");
//         System.out.printf(num1 + " " + op + " " + num2 + " = " + result);

//         Logger logger = Logger.getLogger(Program.class.getName());
//         FileHandler fh = new FileHandler("log.txt", true);
//         logger.addHandler(fh);
//         SimpleFormatter sFormat = new SimpleFormatter();
//         fh.setFormatter(sFormat);
//         logger.info(num1 + " " + op + " " + num2 + " = " + result);
//     }
// }