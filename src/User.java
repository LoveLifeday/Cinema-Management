import java.util.LinkedList;
import java.util.List;

public class User {
    LinkedList<String> userId = new LinkedList<>();      // 存储用户ID的列表
    LinkedList<String> userName = new LinkedList<>();    // 存储用户名的列表
    LinkedList<String> passWord = new LinkedList<>();    // 存储用户密码的列表
    LinkedList<String> email = new LinkedList<>();       // 存储用户邮箱的列表
    LinkedList<String> level = new LinkedList<>();       // 存储用户等级的列表
    LinkedList<String> time = new LinkedList<>();        // 存储注册时间的列表
    LinkedList<String> costMoney = new LinkedList<>();   // 存储消费金额的列表
    LinkedList<String> costCount = new LinkedList<>();   // 存储消费次数的列表
    LinkedList<String> phoneNumber = new LinkedList<>(); // 存储手机号的列表

    // 获取用户列表
    public List<User> getUsers() {
        List<User> users = new LinkedList<>();
        User user = new User();

        // 添加用户信息
        user.addUser("1", "JohnSmith", "Password1@", "john@example.com", "铜牌",
                "2023-09-28", "100", "5", "1234567890");

        user.addUser("2", "JaneSmith", "examplePassword2@", "jane.smith@example.com",
                "银牌", "2023-10-04 11:00:00", "200.00", "5", "9876543210");
        user.addUser("3", "TomSmith", "123456sdAD@", "Tom@example.com",
                "铜牌", "2023-10-05 11:00:00", "0", "0", "123456789");

        users.add(user);  // 将当前用户加入用户列表
        return users;
    }
    //添加用户
    public void addUser(String userId, String userName, String passWord, String email, String level,
                        String time, String costMoney, String costCount, String phoneNumber) {
        this.userId.add(userId);
        this.userName.add(userName);
        this.passWord.add(passWord);
        this.email.add(email);
        this.level.add(level);
        this.time.add(time);
        this.costMoney.add(costMoney);
        this.costCount.add(costCount);
        this.phoneNumber.add(phoneNumber);
    }
    //获取用户ID的列表
    public LinkedList<String> getUserId() {

        return userId;
    }
    //获取用户名的列表
    public   LinkedList<String> getUserName() {
        return userName;
    }

    // 获取用户密码的列表
    public   LinkedList<String> getPassWord() {
        return passWord;
    }

    // 获取用户邮箱的列表
    public   LinkedList<String> getEmail(){
        return email;
    }

    // 获取用户等级的列表
    public LinkedList<String> getLevel() {
        return level;
    }

}
