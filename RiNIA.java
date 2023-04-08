public class RiNIA {



        public static int convertation(String rimskaya) {

           String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                    "IX", "V", "IV", "I" };
            int[] arabskie = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

            StringBuilder resultat  = new StringBuilder(rimskaya);
            int arabNumber = 0, i = 0;
// Проверяем переданную строку на наличие символов
            if (resultat .length() > 0) {
                while (true) {
                    do {

                        if (roman[i].length() <= resultat .length()) {
                            // Выделяем из строки подстроку и сравниваем со
                            // значением из массива Arab
                            if (roman[i].equals(resultat .substring(0,
                                    roman[i].length()))) {
                                // После чего прибавляем число соответствующее
                                // индексу элемента римской цифры из массива Arab
                                arabNumber += arabskie[i];
                                // и удаляем из строки римскую цифру
                                resultat .delete(0, roman[i].length());
                                if (resultat .length() == 0)
                                    return arabNumber;
                            } else
                                break;
                        } else
                            break;
                    } while (true && resultat .length() != 0);
                    i++;
                }
            }
            return 0;

        }
    }


