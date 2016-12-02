import java.util.*;
class leastdigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,temp,i=0;
n=sc.nextInt();
int arr[]=new int[5];
while(n!=0)
{
arr[i]=n%10;
i++;
n=n/10;
}
Arrays.sort(arr);
for(int j=0;j<2;j++)
{
System.out.print(arr[j]);
}
}
}
