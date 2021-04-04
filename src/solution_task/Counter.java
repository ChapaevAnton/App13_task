package solution_task;

public class Counter extends Thread {

    private static CounterStr counterStr;

    Counter(CounterStr counterStr) {
        Counter.counterStr = counterStr;
    }

    public void run() {
        getAdv(counterStr);
    }


    public void getAdv(CounterStr counterStr) {
        synchronized (counterStr) {
            for (int i = 0; i < counterStr.getCounter().length(); i++) {
                System.out.print(counterStr.getCounter().charAt(i));
                try {
                    Thread.sleep(25);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
            }
        }
    }

}

