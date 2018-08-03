package cn.com.bosssoft.model;

/**
 * @author Shixiaodong
 * @date 2018/8/3 8:59
 */
public class Account {

    private Integer accountId;

    private String password;

    private User user;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
