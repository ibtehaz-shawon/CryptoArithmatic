/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptoarithmatic;

/**
 *
 * @author Ibtehaz
 * ibtehaz.shawon@gmail.com
 */
public class CryptoArithmatic {

    /**
     * @param args the command line arguments
     */
    
    private static int f, o, u, r, t, w;
    private static int x1, x2, x3;
    
    public static void main(String[] args) 
    {
        System.out.println("Initiate Rocket.... ");
        loop();
        System.out.println("Touch Down");
    }
 
    
    public static void loop()
    {
    /*
     *  loop()
     *       >> initiate all the variable (T, W, O, F, U, R) [ all variables must be different ]
     *       >> initiate flag variable to false. TO make sure first time, the value does not increment.
     *       >> initiate counter1, counter2, counter3, counter4, counter5, counter6 to run the loop.
     *       >> counter variable will be independent to the regular variables.
    */
    
        o = 0; 
        u = 1; 
        f = 2; 
        t = 3;
        r = 4;
        w = 5;
        boolean flag = false;
        int counter1 = 0, counter2 = 0,
                counter3 = 0, counter4 = 0,
                counter5 = 0, counter6 = 0;
        
        
        for(; counter1 < 9;)
        {
//            loop for O
            if(flag)
                o = loopValue(o, f, u, w, r, t);
            
            counter2 = 0; //re-changing the value of counter to 0 so that it moves 9 times
            
            for(; counter2 < 9;)
            {
//                loop for U
                if(flag)
                    u = loopValue(u, f, o, w, r, t);
                
                counter3 = 0; //re-changing the value of counter to 0 so that it moves 9 times
                
                for(; counter3 < 9;)
                {
//                    loop for f & f != 0
                    if(flag)
                        f = loopValue2(f, w, o, u, r, t);
                    
                    counter4 = 0; //re-changing the value of counter to 0 so that it moves 9 times
                    
                    for(; counter4 < 9;)
                    {
//                        loop for t & t != 0
                        if(flag)   
                            t = loopValue2(t, f, o, u, r, w);
                        
                        counter5 = 0; //re-changing the value of counter to 0 so that it moves 9 times
                        
                        for(; counter5 < 9; )
                        {
//                            loop for r
//                            mainCalculation 
                            if(flag)   
                                r = loopValue(r, f, o, u, w, t);
                            
                            
                            counter6 = 0; //re-changing the value of counter to 0 so that it moves 9 times
                            for(; counter6 < 9;)
                            {
//                                loop for w;
                                
//                                main calculation in this loop
                                  if(flag)
                                      w = loopValue(w, f, o, u, r, t);
                                  
                                  flag = true; //for the first round of looping
                                  
                                  String TWO = t + ""+w+""+o;
                                  String FOUR = f+""+o+""+u+""+r;
                                  
                                  int count1 = Integer.parseInt(TWO) + Integer.parseInt(TWO);
                                  int count2 = Integer.parseInt(FOUR);
                                  
//                                  System.out.println("TWo " +TWO+" FOUR "+FOUR);
                                  
                                  if(count1 == count2)
                                  {
//                                      bingo baby
//                                      calculate x1, x2, x3 and print out all the result
                                    bingo();
                                  }
                                  
                                  counter6++;
                            }
                            counter5++;
                        }
                        counter4++;
                    }
                    counter3++;
                }
                counter2++;
            }
            counter1++;
        }
        return;
    }
    
   public static int loopValue(int returnValue, int c1, int c2, int c3, int c4, int c5)
    {
   /*
     *    loopValue function
     *       >> parameter first acts as the returnValue and the rest acts as other five variables.
     *        >> loop rounds 9 times.
     *        >> returnValue increments one in each loop. checks with the other exisiting variable.
     *        >> if noone matches, it returns that value or else, increments one again.
     *    This function is only for <O, U, R and W>.
    
    */
    
        for(int x = 0; x< 10;)
        {
            if( returnValue == 9)
            {
                returnValue = 0;
            }
            else
            {
                returnValue++;
            }
                
            if(returnValue != c1 && returnValue != c2 
                 && returnValue != c3 && 
                 returnValue != c4 && returnValue != c5)
            {
//                System.out.println("returnValue > "+returnValue);
                break;
            }
            else
            {
                x++;
            }
        }
        return returnValue;
    }
    
    
    public static int loopValue2(int returnValue, int c1, int c2, int c3, int c4, int c5)
    {
     /*
     *    loopValue function
     *         >> parameter first acts as the returnValue and the rest acts as other five variables.
     *         >> loop rounds 9 times.
     *         >> returnValue increments one in each loop. checks with the other exisiting variable.
     *         >> if noone matches, it returns that value or else, increments one again.
     *    This function is only for F and T [F != 0 && T != 0]
    */
        
        for(int x = 0; x< 10;)
        {
         if(returnValue == 9)
         {
             returnValue = 1;
         }
         else
         {
             returnValue++;
         }
         if(returnValue != c1 && returnValue != c2 
                 && returnValue != c3 && 
                 returnValue != c4 && returnValue != c5)
         {
                break; 
         }
         else
         {
             x++;
            
         }
        }
        return returnValue;
    }
    
    public static void bingo()
    {
    /*
     *    bingo()
     *        >> this functions calculate the value of x1, x2, x3 from the equation.
    */
    
        int x3 = f;
        
        int x2 = o + 10*x3 - 2*t;
        
        int x1 = u + 10*x2 - 2*w;
        
        print(x1, x2, x3);
        
        return;
    }
    
    
    
    public static void print(int x1,int x2,int x3)
    {
    /*
     *    print()
     *        >> printing function
    */
        System.out.println("# T > "+t
                +" # W > "+w
                +" # O > "+o
                +" # F > "+f
                +" # U > "+u
                +" # R > "+r
                +" # x1 > "+x1    
                +" # x2 > "+x2
                +" # x3 > "+x3);
        
        return;
        }
    
}
