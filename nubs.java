import java.util.Scanner;

public class nubs {
    public static void main(String[] args) {
        String baineri = "10000000111100111111011010000001";
        String ip = "128.243.246.129";

        // Проверка дали дължината на последователността е 32
        if (baineri.length() != 32) {
            System.out.println("Последователността трябва да бъде точно 32 символа.");
            System.out.println(baineri.length());
            return;
        }

        // Разделяне на групи по 8 и съхранение в променливи
        String group1 = baineri.substring(0, 8);
        String group2 = baineri.substring(8, 16);
        String group3 = baineri.substring(16, 24);
        String group4 = baineri.substring(24, 32);

        // Конвертиране на групите от двоична в десетична система
        int decimal1 = Integer.parseInt(group1, 2 );
        int decimal2 = Integer.parseInt(group2, 2);
        int decimal3 = Integer.parseInt(group3, 2);
        int decimal4 = Integer.parseInt(group4, 2);

        String regex = "[.]";
        String[] myArr = ip.split(regex);
        for (String s: myArr){
            //намира примитивите и ги запазва в масив
            int octet = Integer.parseInt(s);            
            //превръща от 10чна в двуична 
            String binaryOctet = Integer.toBinaryString(octet);  
            //address  принтира в двуична
            
            System.out.print(binaryOctet+".");
            }  
            System.out.println();
        System.out.println(decimal1+"."+decimal2+"."+decimal3+"."+decimal4);           
    }
}
