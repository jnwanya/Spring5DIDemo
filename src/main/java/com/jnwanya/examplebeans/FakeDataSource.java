package com.jnwanya.examplebeans;

/**
 * Created by Jnwanya on
 * Sat, 06 Jan, 2018.
 */
public class FakeDataSource {
    private String username;
    private String password;
    private String dbUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FakeDataSource{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", dbUrl='").append(dbUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
