package templateMethod;
/*
* Основа работы алгоритма чтения данных
*/

import java.util.ArrayList;
import java.util.List;

public abstract class LogReader {
    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readLogEntry() {
        Iterable<String> rawEntries = readEntries(currentPosition);

        if (rawEntries == null) {
            return new ArrayList<>();
        }

        List<LogEntry> logEntries = new ArrayList<>();
        for (String entry : rawEntries) {
            logEntries.add(parseLogEntry(entry));
        }
        return logEntries;
    }


    public abstract Object getDataSource();
    public abstract void setDataSource(Object data);

    protected abstract Iterable<String> readEntries(Integer position);
    protected abstract LogEntry parseLogEntry(String stringEntry);
}
