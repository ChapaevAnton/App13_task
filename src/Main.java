public class Main {

    public static void main(String[] args) {

        // TODO: Задание. Три потока получают на вход три строки класса CounterStr,
        //  реализуйте посимвольный корректный вывод данных строк в разных потоках с задержкой 25 миллисекунд,
        //  чтобы их читаемость не была нарушена...
        //  #####
        //  Пример верного вывода: One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten
        //  Пример неверного вывода: OOOnnneee,,,TTTwwwooo,,,TTThhhrrreeeeee,,,FFFooouuurrr,,,FFFiiivvveee,,,SSSiiixxx,,,SSSeeevvveeennn,,,EEEiiiggghhhttt,,,NNNiiinnneee,,,TTTeeennn

        // TODO: Подсказка - Порядок выполнения
        //  1. Разработайте класс CounterStr - поле, конструктор, get метод...
        //  2. Разработайте метод getAdv - логика посимвольный вывод строки в консоль...
        //  3. Синхронизируйте потоки thread1, thread2, thread3...


        // TODO: Для решения данный код изменять не надо!!! Так же для решения не используйте Thread.join()!!!
        CounterStr counterStr =  new CounterStr("One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten ");
        CounterStr counterStr1 =  new CounterStr("One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten ");
        CounterStr counterStr2 =  new CounterStr("One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten ");

        Thread thread1 = new Counter(counterStr);
        Thread thread2 = new Counter(counterStr1);
        Thread thread3 = new Counter(counterStr2);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
