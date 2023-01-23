package com.packages;
import java.io.*;
import java.util.Scanner;
class majorityelement
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of array");
int size,i,j,index=0,maxcount=0,c=0;
size=sc.nextInt();
int a[]=new int [size];
;
for(i=0;i<size;i++)
{
    a[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
    c=0;
    for(j=0;j<size;j++)
    {
        if(a[i]==a[j]) {

            c++;
        }}
if(c > maxcount){
    maxcount=c;
 index =i;}
    }
    if (maxcount >= (size/2))
        System.out.println("greatest element" + a[index]);
    }



}

