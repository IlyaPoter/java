// Input: s = "the sky is blue"
// Output: "blue is sky the"

package org.example.seminar1.hw_1;

public class task1 {
    public static void main(String[] args) {
        String myList = "the sky is blue";
        System.out.println(myList);
        String[] textArr = myList.split(" ");
        for (int i = textArr.length - 1; i >=0 ; i--) {
            System.out.println(textArr[i] + " ");
        }
    }
}

