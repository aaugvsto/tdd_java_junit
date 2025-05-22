package dev.augusto;

public class PasswordValidator {

    private String _password;

    public PasswordValidator(String password){
        this._password = password;
    }

    public boolean Validate() {
        if (this._password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }

        int digitCount = 0;
        for (char c : this._password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            throw new IllegalArgumentException("A senha deve conter pelo menos 2 dígitos");
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

        int upperCaseCount = 0;
        for(char c : this._password.toCharArray()){
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }
        
        if(upperCaseCount < 2){
        throw new IllegalArgumentException("A senha deve conter pelo menos 2 letras maiúsculas");
        }

        return true;
    }

    public String GetPassword () {
        return this._password;
    }

    public void SetPassword (String password){
        this._password = password;
    }
}
