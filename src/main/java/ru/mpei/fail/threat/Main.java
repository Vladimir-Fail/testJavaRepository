package ru.mpei.fail.threat;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        
        Test1 search = new Test1();
        search.func();
        
        int a = 0;
        try {
            int b = 7/ a;
        } catch (Exception e){
            System.out.println("исключение " + e);
            
        }

        
        
        
        
        
        
        
        
        
        
        
    }
}
