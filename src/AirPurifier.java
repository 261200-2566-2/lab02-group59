// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class AirPurifier{
    String model;
    int SerialNum;
    int RoomTemp;
    int PMLevel;
    boolean power = false;
    void turnOn(){power = true;}
    void turnOff(){power = false;}
    int RoomTempNow(){return RoomTemp;}
    int PMLvlNow(){return PMLevel;}
    static int RegModCount;
    static int ProModCount;

    AirPurifier(String model){
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

    static void MostPopularModel(){
        if(RegModCount>ProModCount){
            System.out.println("Regular Model is the most popular model");
        }else if(RegModCount<ProModCount){
            System.out.println("Pro Model is the most popular model");
        }else{System.out.println("Both Regular and Pro model are most popular model");}
    };

    public static void main(String[] args){
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
        // if(f.power == false){System.out.println("AirPurifier is currently off");}
        // else{System.out.println("AirPurifier is currently on");};
    }
}