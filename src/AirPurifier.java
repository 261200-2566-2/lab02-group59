// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class AirPurifier{
    String model;//มีไว้เก็บรุ่น
    int SerialNum;//มีไว้เก็บรหัสเครื่อง
    int RoomTemp;//มีไว้เก็บอุณหภูมิที่เครื่องวัดได้
    int PMLevel;//มีไว้เก็บค่าฝุ่นที่เครื่องวัดได้
    boolean power = false;//สถานะของเครื่อง
    void turnOn(){power = true;}//เปิดเครื่อง
    void turnOff(){power = false;}//ปิดเครื่อง
    int RoomTempNow(){return RoomTemp;}//เรียกดูอุณหภูมิ
    int PMLvlNow(){return PMLevel;}//เรียกดูระดับฝุ่น
    static int RegModCount;//เก็บจำนวนเครื่องรุ่น Regular
    static int ProModCount;//เก็บจำนวนเครื่องรุ่น Pro

    AirPurifier(String model){//Constructor
        if(model.equals("Regular")){
            RegModCount++;
            this.model = model;
            this.SerialNum = ProModCount+RegModCount;
        }
        else if(model.equals("Pro")){
            ProModCount++;
            this.model = model;
            this.SerialNum = ProModCount+RegModCount;
        }else{System.out.println("Invalid Model");}
    }

    static void MostPopularModel(){//class method ที่เรียกใช้เพื่อดูว่ารุ่นไหนมีมากกว่ากัน
        if(RegModCount>ProModCount){
            System.out.println("Regular Model is the most popular model");
        }else if(RegModCount<ProModCount){
            System.out.println("Pro Model is the most popular model");
        }else{System.out.println("Both Regular and Pro model are most popular model");}
    };

    public static void main(String[] args){//main จ้า
        Scanner GetModel = new Scanner(System.in);
        System.out.println("Please enter model name:");
        String model = GetModel.nextLine();
        GetModel.close();
        AirPurifier f = new AirPurifier(model);
        System.out.println("This Airpurifier Serial Number is " + f.SerialNum);
        System.out.println("PM Level is now " + f.PMLvlNow());
        if(f.power == false){System.out.println("AirPurifier is currently off");}
        else{System.out.println("AirPurifier is currently on");};
        // Scanner GetTXT = new Scanner(System.in);
        // System.out.println("Do you wish to turn "+f.SerialNum+" on (Y/N)");
        // String TXT = GetTXT.nextLine();
        // GetTXT.close();
        // if(TXT.equals("Y")){
        //     f.power = true;
        // }else if(TXT.equals("N")){
        //     f.power = false;
        // }
    }
}