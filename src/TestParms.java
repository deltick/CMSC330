/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamerjj1
 */
public class TestParms {
    
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        String w = "4";
             
        int result = mySubProgram(x,y);
        System.out.println(result);
        
        Record record = new Record(x,y,z);
        
        Record newRecord = mySubRecord(record);
        System.out.println(newRecord.toString());
        
    }
    
    public static int mySubProgram(int a, int b) {
        return a+b;
    }
    
    public static Record mySubRecord(Record inRecord) {
        System.out.println(inRecord.toString());
        inRecord.field1 = 32;  //has no effect
        inRecord.setField1(4);
        inRecord.setField2(5);
        inRecord.setField3(6);
        
        return inRecord;
        
    }
    
} 
