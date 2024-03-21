package org.example;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int ns = 0;
        int ew = 0;
        if(walk.length != 10){
            return false;
        }
        int i;
        for (i = 0; i < walk.length;i++) {
            if (walk[i] == 'n') {
                ns++;
            }
            if (walk[i] == 's') {
                ns--;
            }
            if (walk[i] == 'e') {
                ew++;
            }
            if (walk[i] == 'w') {
                ew--;
            }
        }
        System.out.println(ns);
        System.out.println(ew);
       if(ns == 0 && ew == 0){
         return true;
       }else {
         return false;
     }
    }

    public static void main(String[] args) {
        char[] arr = {'n','s','e','w'};
        System.out.println(isValid(arr));
//        System.out.println("The 10 minutes walk: " + valid);
    }
}