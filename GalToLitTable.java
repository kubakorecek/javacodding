/* Try This 1-2
   This program displazs a conversion of table of
   gallons to liters.

   Call this program to "GalToLitTabl."
   */
   class GalToLitTable {
     public static void main(String args[] ) {
         double gallons, liters;
         int counter;
         counter = 0;
         for(gallons = 1; gallons <= 100; gallons++) {
           liters = gallons*3.7854;// convert to liters
           System.out.println(gallons + "gal. is  "
              + liters +"liters.");
        counter++;
        //every 10th line print blank line
        if(counter==10){
          System.out.println();
          counter=0;//reset
        }
         }
       }
     }

   
