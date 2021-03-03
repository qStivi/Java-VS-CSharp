public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.Start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello World!");
        }

        stopWatch.Stop();

        System.out.println(stopWatch.executionTime);
    }
}
