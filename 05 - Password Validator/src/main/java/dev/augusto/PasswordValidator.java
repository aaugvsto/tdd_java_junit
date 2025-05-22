package dev.augusto;

public class PasswordValidator {

    private String _password;

    public PasswordValidator(String password){
        this._password = password;
    }

    public boolean Validate(){
        if(this._password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }

        return true;
    }

    public String GetPassword(){
        return this._password;
    }

    public void SetPassword(String password){
        this._password = password;
    }

}
