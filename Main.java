class Main {
  public static void main(String[] args) {
    
    //Practice Problem1:
    int total = 0;
    
    for (int num = 1; num <= 10; num++) {
      total = total + num;
    }
    System.out.println("the  sum of number  is: " +total);
    
    //pratice Problem2:
    int evennum;
    int eventotal =0;

    for (evennum = 1; evennum <=10; evennum=evennum + 2) {
      eventotal = eventotal + evennum;
    }
    System.out.println("the sum of even number  is: " +eventotal);

    int oddnum;
    int oddtotal =0;

    for (oddnum = 10; oddnum >=0; oddnum=oddnum - 2) {
      // System.out.println(oddnum);
      oddtotal = oddtotal + oddnum;
    }
    System.out.println("the sum of odd number is: " +oddtotal);

    practice1();//call practice1

  }
    //practice Problem3: write the print

    //practice Problem4:
    

    static int practice1 () {
      int num; 
      int total1 = 0;
      for (num = 1; num <= 10; num++) {
        total1 = total1 + num;
    }
      System.out.println("the  total  is: " + total1);

      return total1;
      
    }






}





