/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode_Contest;

/**
 *
 * @author Vishwa
 */
public class Problem_1 {
    
    public static int peakIndexInMountainArray(int[] A){
        if(A.length < 3){
            return 0;
        }
        
        for(int i = 1; i < A.length-1; i++){
//            int j = i-1;
//            int k = i+1;
//            while(j >=0 && k <=A.length-1){
//                if(A[j] < A[j+1] && A[k-1] > A[k]){
//                    result = i; 
//                } 
//                j--;
//                k++;
//            }
            if(A[i]>A[i+1]){
                return i;
            }
        }
        return 0;
    }
    
}
