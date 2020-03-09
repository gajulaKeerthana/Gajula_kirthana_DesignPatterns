package structural.proxy;

public class ProxyInternet implements SchoolInternet {  
    private String departmentName;  
    private RealInternet  realobject;  
        public ProxyInternet(String departmentName) {  
     this.departmentName= departmentName;  
 }  
 
 public void provideInternet()   
 {  
     if (getDepartment(departmentName) != "Computer")   
     {  
         realobject= new RealInternet(departmentName);  
         realobject.provideInternet();  
     }   
     else  
     {  
         System.out.println("No Internet access provided. Your Department is Computer");  
     }  
 }  
 public String getDepartment(String dept1Name) {  
     return "Accounts";  
 }  
}  