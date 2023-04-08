import java.util.Scanner;

public class CalculatorDlyaKATA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("вводи");
        String r = s.nextLine();          //получение и перевод ввода данных пользователем в строку
        String arifmet = "012345";        //для получения знака +-*/, делаем переменную строковую

        int  chislo1 ;                 //переменная для работы с числами
        int  chislo2 ;                 //переменная для работы с числами









        double number1 = 0.0;
        double number2 = 0.0 ;











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



            boolean b = false;
            boolean a = false;


                    try {
                        if (true) {


                            if (number2 != Integer.parseInt(twostr2)) b = true;
                            else b = false;

                            if (number1 == Integer.parseInt(onestr1)) a = true;
                            else a = false;

                            if (number1 != Integer.parseInt(onestr1)) b = true;
                            else b = false;

                            if (number2 == Integer.parseInt(twostr2)) a = true;
                            else a = false;

                        }
                    } catch (NumberFormatException e) {
                       if ((a == true) && (b == true)) {
                           System.out.println("Используются разные системы исчисления");
                       } else {}

                    }
















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

                        // подумай, как можно ограничить ввод римских от 1 до 10.

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