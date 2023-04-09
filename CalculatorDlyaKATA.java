import java.io.IOException;
import java.util.Scanner;

public class CalculatorDlyaKATA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("вводи");
        String r = s.nextLine();          //получение и перевод ввода данных пользователем в строку
        String arifmet = "012345";        //для получения знака +-*/, делаем переменную строковую

        int  chislo1 ;                 //переменная для работы с числами
        int  chislo2 ;                 //переменная для работы с числами

        int number1 = 0;               //переменная, для работы с исключением
        int number2 = 0;               //переменная, для работы с исключением



//----------------Проверяю на наличие или отсутсвие знаков арифметики------------
        boolean f = false;
        int analiz2 = 0;
        for (char element : r.toCharArray()) {                                    // Проверка на присутсвие +-*/ и если нахожу,
            if (element == '-') analiz2++;                                        // то плюсую единицу в analyz2, что бы использовать как "да" или "нет"
            else if (element == '+') analiz2++;                                   // в булевой логике
            else if (element == '*') analiz2++;
            else if (element == '/') analiz2++;
        }

        if (f = analiz2 != 1) {                                                   // если знак не найден, то analyz == 0 и
            try {                                                                 // срабатывает трай кетч блок с исключением
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Пример записан ошибочно!");
            }
        }
//--------------------------------------------------------------------------------

        int index9 = r.indexOf("+");      //ловим номер, на котором стоит знак
        int index10 = r.indexOf("-");
        int index11 = r.indexOf("*");
        int index12 = r.indexOf("/");


        char[] kantino = new char[10];          // создаем массив, что выловить правильный
        for (int i = 0; i < r.length(); i++){     //делаем цикл, для заполнения массива
            kantino[i] = r.charAt(i);}            // глупо, но добываю символ операции, для его использования


        if (index9>0){                             // строка 31 - 47  получение знака, для работы с ним
        if (kantino[index9] == '+') {
            arifmet = "+";

        }}
        if (index10>0){
        if (kantino[index10] == '-') {
            arifmet = "-";
            }}
        if (index11>0){
            if (kantino[index11] == '*') {
                arifmet = "*";
                }}
        if (index12>0){
            if (kantino[index12] == '/') {
                arifmet = "/";
                 }}

int index = r.indexOf(arifmet);               //просто с тестовой версии, решил включать все действия так, глупо, но я учусь

        //мой примитивный калькулятор:)))
//_______________________________________________________

        if (index > 0){      //при + ,index1 изменит свое значение на 1 и включится.

            String  onestr1 = r.substring(0,index);  //разделим на первую половину выражения
            String twostr2 = r.substring(index+1);// и вторую пловину


            char[] onestr_char = new char[4];   // массив для символов первой половины строки (над разумить, цифра или нет
            char[] twostr_char = new char[4];   // массив для второй половины


            for (int i = 0; i < onestr1.length(); i++){     //делаем цикл, для заполнения массива
                onestr_char[i] = onestr1.charAt(i);}   //onestr1 - первая половина выражения в массив


            for (int i = 0; i < twostr2.length(); i++){     //делаем цикл, для заполнения массива
                twostr_char[i] = twostr2.charAt(i);}   //twostr2 - вторая половина выражения в массив



//---------------------------------------------------------------------------------------------------------
                                                                                                        //-
            boolean a = false;                                                                          //-Создаю переменную типа boolean,выключаю
            boolean b = false;                                                                          //-еще бульена)
            boolean c = false;                                                                          //
            boolean d = false;


            int analiz = 0;
            for (char element : r.toCharArray()) {                                                      // хотел реализовать что то подобное тому,
                if (element == '-') analiz++;                                                           // что проверяет ввод пользователя, на наличие
                if (element == '+') analiz++;                                                           // отрицательных чисел.
                if (element == '*') analiz++;
                if (element == '/') analiz++;
            }


            if (d = analiz > 1) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Только положительные числа");
                }
            }


// Пробую поймать разные системы исчисления, пришлось накинуть грязи, потому что блок try читал только одно исключение.
// Хотелось убить 2х зайев). Примитивно, но учусь же :D
//---------------------------------------------------------------------------------------------------------
                                                                                                        //-
            try {                                                                                       //-Блок трай кетч
                number2 = Integer.parseInt(twostr2);                                                    //-Собственно, проверяю, является ли строка, числом
            }                                                                                           //-
            catch (NumberFormatException e) {                                                           //Ну и присваиваю в кетче, переменной b true (включая)
                b = number2 > 0;                                                                        //-
            }                                                                                           //-
                                                                                                        //-
                    try {                                                                               //-Пришлось создать 2 try-catch блока, так как 2е исключение, не читалось
                            number1 = Integer.parseInt(onestr1);                                        //-То же самое, что и сверху
                        number2 = Integer.parseInt(twostr2);                                            //-Отключено, не понимаю почему без этого условия, не работает 1 блок трай,
                                                                                                        //-условие бывает не верным,но все равно, не пашет без нее, пришлось оставить.
                    }                                                                                   //-
                    catch (NumberFormatException e) {                                                   //-Обрабатываем
                                                                                                        //-
                        a = number1 > 0;                                                                //-Ну и присваиваю в кетче, переменной true (включая)
                        b = number2 > 0;                                                                //-Ну и присваиваю в кетче, переменной true (включая)
                       if ((a == true) && (b == false) || (a == false) && (b == true)) {                //-Вся логика в том, а1 б0 или а0 б1. Включено - выключено.
                           System.out.println("Используются разные системы исчисления");                //-
                       }                                                                                //-
                                                                                                        //-
                    }
                    catch (ArrayIndexOutOfBoundsException e){                                           // Это еще не дописанно, выходит ошибка по размеру массива
                        System.out.println();
                    }                                                                                   //-
// --------------------------------------------------------------------------------------------------------


            //проверяем, можно ли перевести в арабские цифры
            if (onestr_char [0] >= '1' && onestr_char [0] <= '9' && twostr_char [0] >= '1' && twostr_char [0] <='9'){ //Подумать, глупое решение. Проверка на цифры, через сравнение, по первым символам
                chislo1 = Integer.parseInt(onestr1);//перевод строки в число
                chislo2 = Integer.parseInt(twostr2);//перевод строки в число

                if (chislo1 >=1 && chislo1 <=10 && chislo2 >=1 && chislo2 <=10) { // проверка, цифры от 1 до 10.
                    int otvet = Obrabotka2.poluchenie( chislo1, arifmet, chislo2);   // просим у класса Obrabotka2 обработать выражение и записываем его в otvet
                    System.out.println(otvet);
                } else {System.out.println("Калькулятор должен принимать на вход числа, от 1 до 10 включительно, не более. ");}
            } else {
              //  RomeNumber numberr1 = RomeNumber.valueOf(onestr1);  //сравниваем первую половину с енам и получаем цифру
                chislo1 = RiNIA.convertation(onestr1);                //numberr1.getromearab();  // получаем цифру из римской в арабский

              //  RomeNumber numberr2 = RomeNumber.valueOf(twostr2);  // сравниваем вторую половину с енам и получаем цифру
                chislo2 = RiNIA.convertation(twostr2);                    //numberr2.getromearab();


                if (chislo1 >=1 & chislo1 <=10 & chislo2 >=1 & chislo2 <=10) {
                    int otvet = Obrabotka2.poluchenie(chislo1, arifmet, chislo2);      // получаем сложение арабских цифр

                    if (otvet > 0) {
                        //перевод арабских в римские и вывод
                        String otvetRome = ANIR.convertation(otvet); // делаем конвертацию в классе ANIR и возвращаем готовый пирожок

                        System.out.println(otvetRome);

                    } else {
                        System.out.println("В Римской системе исчисления, нет отрицательных чисел и нулей");
                    }
                } else {
                    System.out.println("Калькулятор должен принимать на вход числа, от I до X включительно, не более. ");
                }
            }
        }
    }
}