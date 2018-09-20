package mypack;
interface Bank{  
int rateOfInterest();  
}  
class SBI implements Bank{  
public int rateOfInterest(){return 9;}  
}  
class PNB implements Bank{  
public int rateOfInterest(){return 9;}  
}  
class TestInterface2{  
public static void main(String[] args){  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}}  