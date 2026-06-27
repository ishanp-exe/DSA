//https://leetcode.com/problems/destroying-asteroids/

import java.util.*;
public class Destroying_Asteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long newmass = mass;
        for(int i=0; i<asteroids.length; i++){
            if(newmass >= asteroids[i]){
                newmass = newmass + asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int mass =sc.nextInt();
        int asteroids[]=new int[n];
        for(int i=0;i<asteroids.length;i++){
            asteroids[i]=sc.nextInt();
        }
        Destroying_Asteroids DA = new Destroying_Asteroids();
       System.out.println(DA.asteroidsDestroyed(mass, asteroids));
    }
 }

