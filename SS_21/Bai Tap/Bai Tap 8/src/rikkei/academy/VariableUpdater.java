package rikkei.academy;

public class VariableUpdater {
    private int sharedVariable = 0;

    public synchronized void increase() {
        sharedVariable++;
        System.out.println("Increased: " + sharedVariable);
    }

    public synchronized void decrease() {
        sharedVariable--;
        System.out.println("Decreased: " + sharedVariable);
    }

    public static void main(String[] args) {
        VariableUpdater variableUpdater = new VariableUpdater();

        Thread increaseThread = new Thread(() -> {
            while (true) {
                variableUpdater.increase();
                try {
                    Thread.sleep(1000); // Ngủ 1 nhân
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decreaseThread = new Thread(() -> {
            while (true) {
                variableUpdater.decrease();
                try {
                    Thread.sleep(1000); // Ngủ 1 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        increaseThread.start();
        decreaseThread.start();
    }
}


















