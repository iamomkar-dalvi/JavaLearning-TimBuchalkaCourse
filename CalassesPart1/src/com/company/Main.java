package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vc = new VipCustomer("Ajay",200,"ajaychaudhari@gmail.com");
        System.out.println(vc.getName());
        System.out.println(vc.getLimit());
        System.out.println(vc.getEmail_address());
    }
}
