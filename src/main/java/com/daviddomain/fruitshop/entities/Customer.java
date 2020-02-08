package com.daviddomain.fruitshop.entities;


public class Customer implements java.io.Serializable {
	private static int count = 0;
	private int pid;
	private String name;
        private String surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        setPid(++count);

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", surname=" + surname + '}';
    }

	
	

}