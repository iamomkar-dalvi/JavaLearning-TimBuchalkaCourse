package com.company;

public class VipCustomer {
    private String name;
    private int limit;
    private String email_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VipCustomer(){
        this("Omkar",10000,"omkar17dalvi@gmail.com");
    }
    public VipCustomer(String name,String email_address){
        this(name,10000,email_address);
    }
    public VipCustomer(String name, int limit,String email_address){
        this.name = name;
        this.limit = limit;
        this.email_address = email_address;
    }


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
