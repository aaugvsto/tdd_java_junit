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

        boolean hasSpecialChar = false;

        for (char c : this._password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if(!hasSpecialChar){
            throw new IllegalArgumentException("Password must be at least 1 especial character");
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
