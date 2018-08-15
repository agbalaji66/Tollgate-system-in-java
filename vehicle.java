import java.util.*;
import java.lang.*;
public class vehicle
{
String vehiclenum;
static String vehicletype;
String mobilenum;
String cusname;
void setData()
{
Scanner cus=new Scanner(System.in);
System.out.println("Enter Vehicle number");
vehiclenum=cus.nextLine();
System.out.println("Enter Vehicle Type");
System.out.println("------1.Bike------");
System.out.println("------2.Car-------");
System.out.println("------3.Bus-------");
System.out.println("------4.Lorry-------");
vehicletype=cus.nextLine();
System.out.println("Enter Customer Name");
cusname=cus.nextLine();
System.out.println("Enter mobile Number");
mobilenum=cus.nextLine();
}
String gettype()
{
  return vehicletype;
}
void display()
{
//System.out.println(vehiclenum+" "+vehicletype+" "+mobilenum+" "+cusname);
System.out.println("Customer Name:"+cusname);
System.out.println("Vehicle Number:"+vehiclenum);
System.out.println("Vechile Type:"+vehicletype);
System.out.println("Mobile Num"+mobilenum);
}
public static void main(String[] args)
{
vehicle v=new vehicle();
v.setData();
v.display();
String type = v.gettype();
switch(type)
{
case "1":
System.out.println("Bill Amount Rs=20.00");
System.out.println("Vechile Type:"+vehicletype);
System.out.println("Amount Paid");
System.out.println("Happy Journey");
break;
case "2":
System.out.println("Bill Amount Rs=40.00");
System.out.println("Amount Paid");
System.out.println("Happy Journey");
break;
case "3":
System.out.println("Bill Amount Rs=100.00");
System.out.println("Amount Paid");
System.out.println("Happy Journey");
break;
case "4":
System.out.println("Bill Amount Rs=150.00");
System.out.println("Amount Paid");
System.out.println("Happy Journey");
break;
default:
System.out.println("vehicletype mismatch");
System.out.println("Transaction cancelled");
}
}
}