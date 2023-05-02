package kr.co.exam14;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String itemNameArray[] = new String[0];
        int itemPriceArray[] = new int[0];
        int itemCountArray[] = new int[0];
        
        while(true) {
            System.out.print("물품명 : ");
            String itemName = sc.nextLine();
            
            if(itemName.equals("없음")) {
                break;
            }
            
            System.out.print("단가 : ");
            int itemPrice = sc.nextInt(); sc.nextLine();
            
            System.out.print("수량 : ");
            int itemCount = sc.nextInt(); sc.nextLine();
            
            int len = itemNameArray.length;
            itemNameArray = Arrays.copyOf(itemNameArray, len + 1);
            itemPriceArray = Arrays.copyOf(itemPriceArray, len + 1);
            itemCountArray = Arrays.copyOf(itemCountArray, len + 1);
            
            itemNameArray[len] = itemName;
            itemPriceArray[len] = itemPrice;
            itemCountArray[len] = itemCount;
            
            System.out.println("\n");
        }
        
        int total = 0;
        System.out.println("------------------------------");
        System.out.println("물품명\t수량\t단가\t금액");
        System.out.println("------------------------------");
        
        for(int i = 0; i < itemNameArray.length; i++) {
            int amount = itemCountArray[i] * itemPriceArray[i];
            total += amount;
            System.out.printf("%s\t%,d\t%,d\t%,d\n", itemNameArray[i], itemCountArray[i], itemPriceArray[i], amount);
        }
        
        System.out.println("------------------------------");
        System.out.printf("거래금액합계\t\t%,d\n", total);
        System.out.printf("부가세액\t\t\t%,d\n", (int)(total - ((double)total / 110 * 100)));
        System.out.println("------------------------------");
    }
}
