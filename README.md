# Sync it up!

Задание. Три потока получают на вход три строки класса CounterStr, 
реализуйте посимвольный корректный вывод данных строк в разных потоках с задержкой 25 миллисекунд,
чтобы их читаемость не была нарушена...

####Порядок выполнения

1. Разработайте класс CounterStr - поле, конструктор, get метод...

2. Разработайте метод getAdv - логика посимвольный вывод строки в консоль...

3. Синхронизируйте потоки thread1, thread2, thread3...

####Для решения код в методе main() изменять не надо!!! Так же для решения не используйте Thread.join()!!!

Пример верного вывода: 
```
One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten
```
Пример неверного вывода: 
```
OOOnnneee,,,TTTwwwooo,,,TTThhhrrreeeeee,,,FFFooouuurrr,,,FFFiiivvveee,,,SSSiiixxx,,,SSSeeevvveeennn,,,EEEiiiggghhhttt,,,NNNiiinnneee,,,TTTeeennn
```
        


        
