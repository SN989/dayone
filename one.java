public class One {

    public static void main(String[] args) {
       byte numberOfSeats = 7;
       Byte numberOfDoors = 4;
       Byte numberOfOwners = 5;  

       short power = 362;
       Short horsePower = 496;

       Integer price =  2999999;


       Long registrationNumber = 3454576555446444489l;

       float fuelConsuption = 15.6F;
       Float fuelConsuption2 = 15.6F;

        int b = (int) fuelConsuption;

       Double carbonEmnition = 23.454454445444;

       boolean isDamaged = true;

       Character energryEff= 'A';

    //    int x =(int) registrationNumber;

       System.out.println("It old car ad details are as follows...");
       System.out.println("price :" +price); 
  
       //    System.out.println(price); 
     
       System.out.println("numberOfSeats:" +numberOfSeats);
       System.out.println("horsePower:" +horsePower); 
       System.out.println("the car is damage:" + isDamaged);
       System.out.println("registration:" + registrationNumber);
       System.out.println("power:"+ power);
       byte newPower =(byte) power;
        System.out.println("fuelConsuption:"+fuelConsuption2.intValue()); 
    }

}
// take product and make deatails of primitive datatype