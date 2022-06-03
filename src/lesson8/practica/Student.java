package lesson8.practica;

public class Student {
    private String name;
    private String surname;
    private String adress;
    private String phoneNumber;

    public Student(){

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String surname, String name, String adress, String phoneNumber){
        this.name = name;
        this.adress = adress;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Dodomashka (){
        System.out.println("Не делаю домашек!!!!");
    }
}
