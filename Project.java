import java.util.*;
import java.io.*;
class Project
{
     public static void main(String[] args) 
{

    Scanner sc=new Scanner(System.in);
   System.out.println("enter number of faculities:");
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
{
    int f=0; 
long [] r=new long [20];
    System.out.println("enter details for facultuy:"+(i+1));
    System.out.println("enter faculty id:");
    int id=sc.nextInt();
    System.out.println("enter faculty name:");
    String name=sc.next()+sc.nextLine();
    System.out.println("enter faculty gender:");
    String gender=sc.next();
    System.out.println("enter faculty qualification:");
    String qual=sc.next()+sc.nextLine();
    System.out.println("enter faculty dept:");
    String dept=sc.next();
    System.out.println("enter faculty designation:");
    String desg=sc.next()+sc.nextLine();
    System.out.println("enter faculty mail:");
    String mail=sc.next();
    System.out.println("enter faculty mobile.no:");
    long no=sc.nextLong();
    System.out.println("enter number of students under each faculty:");
    int stdnum=sc.nextInt();
  int d=0;
    for(int j=0;j<stdnum;j++)
{
    System.out.println("enter details for student:"+(j+1));
    System.out.println("enter student id:"); 
    long stdid=sc.nextLong();
    System.out.println("enter student name:");
    String stdname=sc.next()+sc.nextLine();
    System.out.println("enter student gender:");
    String stdgender=sc.next();
    System.out.println("enter student dept:");
    String std_dept=sc.next();
    System.out.println("enter student program:");
    String prog=sc.next()+sc.nextLine();
    System.out.println("enter student year:");
    int year=sc.nextInt();
   System.out.println("enter student sem:");
   String sem=sc.next();
   System.out.println("enter student sec:");
   int sec=sc.nextInt();
   System.out.println("enter student mobile no:");
   long mobile_no=sc.nextInt();
   System.out.println("enter student email:");
   String email=sc.next();
   System.out.println("enter student parent mobile number:");
   long pmobile_no=sc.nextLong();
   System.out.println("enter number of subjects for student:"+(j+1));
   int sub=sc.nextInt();
   int [][] s= new int[20][20];
    int p=0;
   for(int k=0;k<sub;k++)
{
    System.out.print("enter marks for :");
   String s1=sc.next()+sc.nextLine();
   s[j+1][k]=sc.nextInt();
   if(s[j+1][k]<25)
    p++;  
}
    
   if(sub%2==0&&p>sub/2)
{
   r[f]=stdid;
   d+=1;
f++;
}
  else if(sub%2!=0&&p>sub/2+1)
{
  d+=1;
r[f]=stdid;
f++;
}
}
   System.out.println("number of dull students under facilty: "+(i+1)+"are: "+d);
for(int g=0;g<f;g++)
{
   System.out.println("student id's who are dull:"+r[g]);
}
}          
}
}