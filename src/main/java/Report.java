import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.LongAdder;

public class Report implements Runnable {

    private final long[] array;
    private final LongAdder report;

    public Report(long[] array, LongAdder report) {
        this.array = array;
        this.report = report;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            report.add(array[i]);
        }
    }
}


