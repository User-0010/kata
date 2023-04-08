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
