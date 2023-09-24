public class ListUser {
    private User[] users;
    private int capacity = 10;
    private int size = 0;

    public ListUser() {
        users = new User[10];
    }

    public void insertUser(User user) {
        if (size + 1 >= capacity) {
            resize();
        }
        users[size++] = user;
    }

    public void resize() {
        capacity *= 2;

        User[] newUsers = new User[capacity];

        if (size >= 0) System.arraycopy(users, 0, newUsers, 0, size);

        users = newUsers;
    }

    public void printUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User[] getUsers() {
        return users;
    }

    public int getSize() {
        return size;
    }
}

