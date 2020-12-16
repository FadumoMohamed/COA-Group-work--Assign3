package com.example.coa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class COA {

    public static void main(String[] args){
        Scanner scan;
        int num;
        double num2,fractionalPart= 0,number;
        int selection;
        int rem=0,integralPart,k,y;
        StringBuilder s=new StringBuilder();
        StringBuilder v= new StringBuilder();


        scan = new Scanner(System.in);
        System.out.println("Select 1 for whole number conversion 2 for fractional conversion");
        selection = Integer.parseInt(scan.nextLine());

        if (selection ==1){
//            // Generate random integers in range 0 to 999
//        int rand_int1 = rand.nextInt(1000);
//        int rand_int2 = rand.nextInt(1000);
//            System.out.println("\nEnter Number");
//            num = Integer.parseInt(scan.nextLine());
            String hexa;
            String binary;
            int randomNumber;
            final int[] ints = new Random().ints(1, 50).distinct().limit(30).toArray();
            System.out.println(Arrays.toString(ints));
            for(int j=0;j<ints.length;j++){
                randomNumber = ints[j];
                System.out.println("Decimal Value :" + randomNumber);
                 hexa = Integer.toHexString(ints[j]);
                System.out.println("To hexadecimal :" + hexa);
                 binary = Integer.toBinaryString(ints[j]);
                System.out.println("Binary is :" + binary);
                System.out.println("\n" +
                        "New line");
            }
//            String hexa = Integer.toHexString(num);
//            System.out.println("HexaDecimal Value is :" + hexa);
//            String binary = Integer.toBinaryString(num);
//            System.out.println("Binary is :" + binary);
        }else if(selection == 2) {
            String hexa;
            double randomNumber;
            final double[] doubles = new Random().doubles(1.0, 50.0).distinct().limit(30).toArray();
            System.out.println(Arrays.toString(doubles));
//            System.out.println("Enter number upto which precision is required with 5 being maximum");
            k = 5;

            for (int j = 0; j < doubles.length; j++){
                randomNumber = doubles[j];
                System.out.print("Binary is ");
                int n = (int) randomNumber;
                fractionalPart = randomNumber - n;
                while (n != 0) {
                    rem = n % 2;
                    n = n / 2;
                    s.insert(0, rem);
                    v.insert(0,rem);
                }
                System.out.print(s + ".");
                s = new StringBuilder();
                while (k != 0) {
                    integralPart = (int) (fractionalPart * 2);
                    s.append(integralPart);
                    number = fractionalPart * 2;
                    fractionalPart = number - integralPart;
                    k--;
                }
                System.out.println(s);
                hexa = Double.toHexString(randomNumber);
                System.out.println("Hexadecimal :" + hexa);
                System.out.println("Decimal Value :" + randomNumber);
//                System.out.println("Equivalent is"+v);
                System.out.println("\n" +
                        "New line");
                k = 5;
            }

//    System.out.println("\nEnter the number");
//    num2=scan.nextDouble();
//    System.out.println("Enter number upto which precision is required with 5 being maximum");
//    k=scan.nextInt();
//    System.out.print("Binary is ");
//    int n=(int) num2;
//    fractionalPart=num2-n;
//    while(n!=0) {
//      rem=n%2;
//      n=n/2;
//      s.insert(0,rem);
//    }
//    System.out.print(s+".");
//    s=new StringBuilder();
//    while(k!=0) {
//      integralPart=(int) (fractionalPart*2);
//      s.append(integralPart);
//      number=fractionalPart*2;
//      fractionalPart=number-integralPart;
//      k--;
//    }
//    String hexa = Double.toHexString(num2);
//    System.out.println(s);
//     System.out.println("HexaDecimal Value is :" + hexa);
//        }
        }else{
            System.out.println("Wrong selection");
        }
    }
}

