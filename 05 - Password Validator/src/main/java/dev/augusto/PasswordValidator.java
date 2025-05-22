package dev.augusto;

public class PasswordValidator {

    private String _password;

    public PasswordValidator(String password){
        this._password = password;
    }

    public boolean Validate(){
        return false;
    }

    public String GetPassword(){
        return this._password;
    }

    public void SetPassword(String password){
        this._password = password;
    }

}
