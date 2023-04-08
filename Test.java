






/*

import java.util.Scanner;    //Импорт класса сканер из пакета утил

public class CalculatorDlyaKATA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("вводи");
        String r = s.nextLine();          //получение и перевод ввода данных пользователем в строку
        String arifmet = "012345";        //для получения знака +-*, делаем переменную строковую

        int  chislo1 ;                 //переменная для работы с числами
        int  chislo2 ;                 //переменная для работы с числами

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


        //проверяем, можно ли перевести в арабские цифры
        if (onestr_char [0] >= '1' && onestr_char [0] <= '9' && twostr_char [0] >= '1' && twostr_char [0] <='9'){ //Подумать, глупое решение. Проверка на цифры, через сравнение, по первым символам
        chislo1 = Integer.parseInt(onestr1);//перевод строки в число
        chislo2 = Integer.parseInt(twostr2);//перевод строки в число

        if (chislo1 >=1 && chislo1 <=10 && chislo2 >=1 && chislo2 <=10) { // проверка, цифры от 1 до 10.
        int otvet = Obrabotka2.poluchenie( chislo1, arifmet, chislo2);   // просим у класса Obrabotka2 обработать выражение и записываем его в otvet
        System.out.println(otvet);
        } else {System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. ");}
        } else {
        RomeNumber numberr1 = RomeNumber.valueOf(onestr1);  //сравниваем первую половину с енам и получаем цифру
        chislo1 = numberr1.getromearab();  // получаем цифру из римской в арабский

        RomeNumber numberr2 = RomeNumber.valueOf(twostr2);  // сравниваем вторую половину с енам и получаем цифру
        chislo2 = numberr2.getromearab();

        int otvet = Obrabotka2.poluchenie( chislo1, arifmet, chislo2);      // получаем сложение арабских цифр

        if (otvet > 0){
        //перевод арабских в римские и вывод
        String otvetRome = ANIR.convertation(otvet); // делаем конвертацию в классе ANIR и возвращаем готовый пирожок

        System.out.println(otvetRome);

        // подумай, как можно ограничить ввод римских от 1 до 10.

        } else {
        System.out.println("В Римской системе исчисления, нет отрицательных чисел");
        }

        }
        }

        }
        }





























public enum RomeNumber {                               // делаю перечисление
    I(1), II(2), III(3), IV(4),
    V(5), VI(6), VII(7), VIII(8),
    XI(9), X(10);

    private int RomeArab;

    RomeNumber(int RomeArab){
        this.RomeArab = RomeArab;
    }
            public int getromearab(){
            return RomeArab;
            }
}





































public class ANIR {

        public static String convertation(int chislovaya) {   // конвертация арабских в римские

            StringBuilder resultat = new StringBuilder();

            int[] arabskie = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //массив числовой

            String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; //масив с римскими

            for (int i = 0; i < arabskie.length; i++ ) {    //проходимся по массиву циклом и получаем римскую цифру
                while (chislovaya >= arabskie[i]) {            // цикл
                    chislovaya -= arabskie[i];

                    resultat.append(roman[i]);
                }
            }
            return resultat.toString();

    }
}






















*/

