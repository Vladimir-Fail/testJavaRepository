package ru.mpei.fail.threat;

public class Test1 {
    public void func() {
        System.out.println("you found me");
    }
    
    public int sum(int... numbers) {
        int fin = 0;
        for (int i = 0; i < numbers.length; i++) {
            fin += numbers[i];
        }
        
        return fin;
    }
    
    
}
