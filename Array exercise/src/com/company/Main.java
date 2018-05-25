package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = "this is a test string";
//        char[] charArray = test.toCharArray();
//        String reverse="";
//        for(int i = charArray.length -1; i<0; i--){
//            reverse += test.charAt(i);
//
//        }
//
//        System.out.println("----");
//        System.out.println(reverse);
//
//
//
//
//        for (int i = test.length()-1;i >=0;i-- ) {
//            System.out.print(test.charAt(i));
//        }
//
//        System.out.println();
//
//
//
//
//
//        StringBuffer sb = new StringBuffer().append());
//        System.out.println(sb.append(test).reverse());
//
//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder.append(test).reverse());


        System.out.println(new StringBuffer(test).reverse());

    }
}
