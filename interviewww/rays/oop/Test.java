public class BankAccount implements Cloneable{ 
public int balance;

public Object clone() thorw CloneNotSupportedException{
return super.clone();
}

public BankAccount(int b){
this.balance=b;
}
}

public class Customer implements Cloneable{
public String name;
public BankAccount acc;
public Customer(String n){
this.name  =n;
account = new BankAccout(20);
}
public Object clone(){
Customer c =(Customer)super.clone();
c.acc= (BankAccount)acc.clone();
return c;

}

}