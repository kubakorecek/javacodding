class LogicalOpTable{
  public static void main(String arg[]){
    boolean p,q;

    System.out.println("P\tQ\tAND\tOR\tXOr\tNOT");

    p = q = true;
    System.out.print(p +"\t" + q + "\t");
    System.out.print((p&q)+"\t" + (p|q) + "\t"  );
    System.out.println((p^q)+"\t" + (!p) + "\t" );

    p = q = false;
    System.out.print(p +"\t" + q + "\t");
    System.out.print((p&q)+"\t" + (p|q) + "\t"  );
    System.out.println((p^q)+"\t" + (!p) + "\t" );

    p = false; q = true;
    System.out.print(p +"\t" + q + "\t");
    System.out.print((p&q)+"\t" + (p|q) + "\t"  );
    System.out.println((p^q)+"\t" + (!p) + "\t"  );

    p = true; q = false;
    System.out.print(p +"\t" + q + "\t");
    System.out.print((p&q)+"\t" + (p|q) + "\t"  );
    System.out.println((p^q)+"\t" + (!p) + "\t"  );

  }





}
