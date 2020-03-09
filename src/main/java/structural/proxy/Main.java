package structural.proxy;

public class Main{  
    public static void main(String[] args)   
    {  
        SchoolInternet internet = new ProxyInternet("Accounts");  
        internet.provideInternet();  
    }  
}  