package singletonMethod;

import templateMethod.LogEntry;
import templateMethod.LogReader;
import factoryMethod.LogType;

public class Program {
    public static String data = """
            Ночь, улица, фонарь, аптека,
            Бессмысленный и тусклый свет.
            Живи ещё хоть четверть века —
            Всё будет так. Исхода нет.
            Умрёшь — начнёшь опять сначала
            И повторится всё, как встарь:
            Ночь, ледяная рябь канала,
            Аптека, улица, фонарь.""";

    public static void main(String[] args) {
        // Получаем единственный экземпляр SingletonLogManager
        SingletonLogManager logManager = SingletonLogManager.getInstance();

        // Устанавливаем LogReader через Singleton с использованием строки data
        logManager.setLogReader(LogType.Poem);

        // Получаем LogReader через Singleton
        LogReader logReader = logManager.getLogReader();

        // Объявляем переменную logEntries заранее
        Iterable<LogEntry> logEntries = null;

        // Читаем и выводим логи
        if (logReader != null) {
            logEntries = logReader.readLogEntry();
            if (logEntries != null) {
                for (LogEntry log : logEntries) {
                    System.out.println(log.getText());
                }
            } else {
                System.out.println("No log entries found.");
            }
        } else {
            System.out.println("LogReader is not available.");
        }

        // Пример смены источника данных (если нужно)
        logManager.setLogReader(LogType.Text); // или другой тип

        logReader = logManager.getLogReader();

        if (logReader != null) {
            logEntries = logReader.readLogEntry();
            if (logEntries != null) {
                for (LogEntry log : logEntries) {
                    System.out.println(log.getText());
                }
            } else {
                System.out.println("No log entries found.");
            }
        } else {
            System.out.println("LogReader is not available.");
        }
    }
}
