
import java.io.*;
import java.util.*;

public class Solution {
    public static int findcount(int arr[],int n,int num,int diff){
        int count=0;
        for(int i=0;i<n;i++){
        int x = Math.abs(arr[i]-num);
            if(x<=diff){
                count++;
            }
        }
        return count>0?count:-1;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num =sc.nextInt();
        int diff =sc.nextInt();
        System.out.println(findcount(arr,n,num,diff));
    }
}
