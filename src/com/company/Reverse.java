package com.company;

public class Reverse {
    public void reverseString(char[] s,int start, int end) {
        if(start>=end)
            return;

        char temp=s[start];
        s[start++]=s[end];
        s[end--]= temp;
        reverseString(s,start,end);
    }

}
