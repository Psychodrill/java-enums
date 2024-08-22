

public class Employee{
    private Customer.Genders sex;
    private String name;
    
    public Employee(String name, Customer.Genders gender){
        this.name = name;
        this.sex=gender;
    }   

    public Customer.Genders getSex(){
        
        return sex;
    }
    public void setSex(Customer.Genders gender){
        this.sex=gender;

    }
}