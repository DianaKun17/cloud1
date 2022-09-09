package server;

import java.util.List;

public class Authentication {
    private static final List<User> clients = List.of(
            new User("user1", "1111", "Тимофей"),
            new User("user2", "2222", "Дмитрий"),
            new User("user3", "3333", "Диана"),
            new User("user4", "4444", "Денис"));
}
