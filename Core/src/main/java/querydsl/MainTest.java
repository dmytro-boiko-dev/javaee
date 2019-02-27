package querydsl;

public class MainTest {
    public static void main(String[] args) {

        UserEntityDAO userEntityDAO = new UserEntityDAO();
        userEntityDAO.findUserById(1);
    }
}
