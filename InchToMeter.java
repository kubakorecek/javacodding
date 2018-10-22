/* Try This 1-2
   This program displazs a conversion of table of
   inches to meters.

   Call this program to "GalToLitTabl."
   */
   class InchToMeter {
     public static void main(String args[] ) {
         double inches, meters;
         int counter;
         counter = 0;
         for(inches = 1; inches <= 120; inches++) {
           meters = inches/39.37;// convert to meters
           System.out.println(inches + "iches. is  "
              + meters +"meters.");
        counter++;
        //every 10th line print blank line
        if(counter==12){
          System.out.println();
          counter=0;//reset
        }
         }
       }
     }
