package dev.augusto;

public class FactorialCalculator {
    private int Number;
    private int Result;

    public FactorialCalculator(int number){
        this.Number = number;
        this.Result = Calculate(number);
    }

    private int Calculate(int number){
        return -1;
    }

    public int GetResult(){
        return this.Result;
    }

    public int GetNumber(){
        return this.Number;
    }
}
