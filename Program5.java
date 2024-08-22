//import stuff here?


//Your code here
public class Program5 {
    public static void main (String [] args){
        double rMiles = 286.0; // chose to initialize as double to save the trouble of casting
        double rgallons = 9.0;
        double kMiles = 412.0;
        double kgallons = 40.0;
        double pMiles = 361.0; 
        double pgallons = 18.0;
        double bMiles = 161.0;
        double bgallons = 11.0;
        
        double rAverage = (rMiles/rgallons);
        rAverage = Math.round(rAverage*10.0)/10.0; // this rounds to nearest tenth place
         
        double kAverage = (kMiles/kgallons);
        kAverage = Math.round(kAverage*10.0)/10.0;
        
        double pAverage = (pMiles/pgallons);
        pAverage = Math.round(pAverage*10.0)/10.0;
        
        double bAverage = (bMiles/bgallons);
        bAverage = Math.round(bAverage*10.0)/10.0;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + rAverage + " mpg");
        
        System.out.println("Koopa King averaged " + kAverage+" mpg");
        
        System.out.println("Pipe Frame averaged " + pAverage+" mpg");
        
        System.out.println("Badwagon averaged " + bAverage+ " mpg");
        
        
    }
}




//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 mpg
Koopa King averaged 10.3 mpg
Pipe Frame averaged 20.1 mpg
Badwagon averaged 14.6 mpg


*/
