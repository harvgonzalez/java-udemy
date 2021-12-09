package oop;

public class Person {
    // write your code here
    String firstName;
    String lastName;
    int age;
    
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if( age < 0 || age > 100 ) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if( age>12 && age <20 ) {
            return true;
        } else {
            return false;
        }
    }
    public String getFullName() {
        if( this.firstName.isEmpty() && this.lastName.isEmpty() ){
            return "";
        } 
        else if(this.firstName.isEmpty()) {
            return this.lastName;
        }
        else if( this.lastName.isEmpty()) {
            return this.firstName;
        }
        else {
            return this.firstName + " " + this.lastName;
        }
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");  // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
      }
    }
    	
//
//
//person.setAge(10)
//System.out.println("fullName= " + person.getFullName());
//System.out.println("teen= " + person.isTeen());
//person.setFirstName("John");    // firstName is set to John
//person.setAge(18);
//System.out.println("fullName= " + person.getFullName());
//System.out.println("teen= " + person.isTeen());
//person.setLastName("Smith");    // lastName is set to Smith
//System.out.println("fullName= " + person.getFullName());
