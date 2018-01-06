package com.jnwanya.examplebeans;

/**
 * Created by Jnwanya on
 * Sat, 06 Jan, 2018.
 */
public class FakeJmsBroker {
    private String username;
    private String password;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FakeJmsBroker{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
