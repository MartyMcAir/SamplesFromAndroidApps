package a_SingleMathSimpleLogicAlgo;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
// https://javarush.ru/tasks/com.javarush.task.task04.task0427
// Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//"четное однозначное число" - если число четное и имеет одну цифру,
//"нечетное однозначное число" - если число нечетное и имеет одну цифру,
//"четное двузначное число" - если число четное и имеет две цифры,
//"нечетное двузначное число" - если число нечетное и имеет две цифры,
//"четное трехзначное число" - если число четное и имеет три цифры,
//"нечетное трехзначное число" - если число нечетное и имеет три цифры.
//Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
//
//Пример для числа 100:
//четное трехзначное число
//
//Пример для числа 51:
//нечетное двузначное число
//
//Требования:
//•	Программа должна считывать одно число c клавиатуры.
//•	Программа должна использовать команду System.out.println() или System.out.print().
//•	Программа должна выводить только строку-описание числа и больше ничего.
//•	Если число четное и имеет одну цифру, вывести "четное однозначное число".
//•	Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
//•	Если число четное и имеет две цифры, вывести "четное двузначное число".
//•	Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
//•	Если число четное и имеет три цифры, вывести "четное трехзначное число".
//•	Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
//•	Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
public class LogicThreeDigitNumber_0427 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine().trim(); // trim() - убираем пробелы и т.д.
        String[] sArr = {"", "однозначное", "двузначное", "трехзначное"};
        int n = Integer.parseInt(str); // текст в фифру

        if (n >= 1 && n <= 999) {
            String negApos = (n%2)==0 ? "четное" : "нечетное";
            System.out.println(negApos+" "+sArr[str.length()]+" число");
        }
    }
}