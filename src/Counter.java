// TODO: Доработайте класс потока...
public class Counter extends Thread {

    // FIXME: Подсказка -  обратите внимание на эту переменную...
    private CounterStr counterStr;

    Counter(CounterStr counterStr) {
        this.counterStr = counterStr;
    }

    public void run() {
        getAdv(counterStr);
    }

    // TODO: Разработайте метод getAdv который посимвольно выводит в консоль строку класса CounterStr,
    //  для достижения корректного отображения результата - синхронизируйте алгоритм

    public void getAdv(CounterStr counterStr) {
        // TODO: разработать
        // FIXME: Возможно поможет методы класса String и цикл...
    }

}

