package semester1.practice07;

public class UserAccount {
    private static int nextId = 1001;
    private int id;
    private String username;
    private String email;

    public UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
        id = nextId++;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {
        nextId = startId;
    }

    public void getId() {
        System.out.println(id);
    }
}
