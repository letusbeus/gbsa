package singletonMethod;

import templateMethod.LogReader;
import factoryMethod.ConcreteReaderCreator;
import factoryMethod.LogType;

public class SingletonLogManager {
    // Единственный экземпляр класса с использованием volatile для обеспечения корректной работы в многопоточной среде
    private static volatile SingletonLogManager instance;

    // Экземпляр LogReader, управляемый Singleton
    private LogReader logReader;

    // Приватный конструктор для предотвращения создания экземпляров извне
    private SingletonLogManager() {
        // Инициализация логгера через Factory Method
        ConcreteReaderCreator creator = new ConcreteReaderCreator();
        this.logReader = creator.createPublicLogReader(LogType.Poem, Program.data); // Используем Program.data
    }

    // Глобальная точка доступа к единственному экземпляру с двойной проверкой блокировки
    public static SingletonLogManager getInstance() {
        if (instance == null) {
            synchronized (SingletonLogManager.class) {
                if (instance == null) {
                    instance = new SingletonLogManager();
                }
            }
        }
        return instance;
    }

    // Метод для получения LogReader
    public LogReader getLogReader() {
        return this.logReader;
    }

    // Метод для установки LogReader (если нужно сменить тип)
    public void setLogReader(LogType logType) {
        ConcreteReaderCreator creator = new ConcreteReaderCreator();
        this.logReader = creator.createPublicLogReader(logType, Program.data); // Используем Program.data
    }

    // Другие методы для работы с логами могут быть добавлены здесь
}
