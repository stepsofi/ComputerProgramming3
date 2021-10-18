

public class Person
{   int hight;
    double weight;
    String name;
    
    Person(String name){
        this.name= name;
    }
    Person (String name, double weight, int hight){
        this.name = name;
        this.weight=weight;
        this.hight = hight;
    }
    void setWeightAndHight(double weght, int hight){
        this.weight=weight;
        this.hight = hight;
    }
    double calculateBMI(){
        return weight/(hight*hight);
    }
    void displayRecord(){
        System.out.println(name+" "+weight+" "+hight+ " "+calculateBMI());
    }
    
}
