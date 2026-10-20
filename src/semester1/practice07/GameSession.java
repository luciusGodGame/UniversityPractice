package semester1.practice07;

public class GameSession {
    public static final int MAX_SESSIONS = 3;
    private static int activeSessionsCount = 0;
    private static int nextToken = 0;
    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private GameSession(String host) {
        sessionToken = "" + nextToken++;
        hostPlayer = host;
        isActive = true;
        activeSessionsCount++;
    }

    public static GameSession createSession(String host) {
        if (activeSessionsCount >= MAX_SESSIONS) {
            System.out.println("Помилка: усі сервера перевантажені");
            return null;
        }
        return new GameSession(host);
    }

    public boolean start() {
        if (isActive) {
            System.out.println("Помилка: сервер вже активний");
            return false;
        }
        if (MAX_SESSIONS <= activeSessionsCount) {
            System.out.println("Помилка: усі сервера перевантажені!");
            return false;
        }
        isActive = true;
        activeSessionsCount++;
        return true;
    }

    public void terminate() {
        if (isActive) {
            isActive = false;
            activeSessionsCount--;
        }
    }
}
