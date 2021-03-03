public class StopWatch {
    public long executionTime = 0L;
    private long startTime = 0L;

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void Stop() {
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }
}
