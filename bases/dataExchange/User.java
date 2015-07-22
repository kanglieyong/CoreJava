package dataExchange;

public class User
{
    private String username;
    private char[] password;

    public User(String aUsername, char[] aPassword)
    {
	username = aUsername;
	password = aPassword;
    }

    public String getName() {
	return username;
    }
    public void setName(String aName) {
	username = aName;
    }

    public char[] getPassword() {
	return password;
    }
    public void setPassword(char[] aPassword) {
	password = aPassword;
    }
}
