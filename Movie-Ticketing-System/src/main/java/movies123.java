import java.io.*;
public class movies123
{
    static double bill=0.00,ticket,snack=0.00;
    static int c,t,type,d,flag,s,counter=0;
    static int quan;
    static String option,option1,sn="",ac,fullname,address,mobileno,timing; //Initialising all the required variables

    public static void main(String [] args)throws IOException
    {
        String a,b;String ch="";

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            //Selecting a movie of your own choice
            SELECTMOVIE();
            //checking whether the user wants to buy some snacks or not
            SNACKS();
            System.out.println("\n\n");
            System.out.println("*** **** ***** COPY OF THE RECIEPT IS: ***** **** ***");
            switch(c)
            {
                case 1:
                    ch="THE GODFATHER" ;
                    break;
                case 2:
                    ch="MISSION IMPOSSIBLE" ;
                    break;
                case 3:
                    ch="NEED FOR SPEED" ;
                    break;
                case 4:
                    ch="THE CONJURING" ;
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
            switch(t)
            {
                case 1:
                    timing="for 8:00 am" ;
                    break;
                case 2:
                    timing="for 11:00 am" ;
                    break;
                case 3:
                    timing="for 2:00 pm" ;
                    break;
                case 4:
                    timing="for 5:00 pm" ;
                    break;
                case 5:
                    timing="for 9:00 pm" ;
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
            System.out.println("NAME:"+fullname);
            System.out.println("MOBILE NUMBER:"+mobileno);
            System.out.println("MOVIE: "+ch);
            System.out.println("SHOW TIMINGS: "+timing);
            System.out.println("NO. OF TICKETS: "+d + " RS. "+ticket);                                 //displaying of the bill
            System.out.println("SNACKS ORDERED: "+sn + " RS. "+snack);
            System.out.println("PAY Rs. "+bill);
            CANCELPROCESS();
            System.out.println("DO YOU WANT TO BOOK TICKET FOR ANY OTHER MOVIE:");
            System.out.println("\n\n");
            System.out.println("TYPE 'Y' FOR YES OR PRESS ANY OTHER KEY");               //checking whether the user wants to buy any tother movie ticket or not
            b=buf.readLine();
        }
        while(b.equalsIgnoreCase("y"));
    }
    public static void SELECTMOVIE()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------- WELCOME TO FUN CINEMAS ONLINE    BOOKING COUNTER ---------------");
        CUSTOMERDET();
        System.out.println(" PLEASE SELECT THE MOVIE YOU WOULD LIKE TO WATCH: ");
        System.out.println("\n");
        //Here the movie is being selected//
        System.out.println("ENTER: \n 1. THE GODFATHER \n 2. MISSION IMPOSSIBLE \n 3. NEED FOR SPEED \n 4. THE CONJURING");
        System.out.println("\n");
        try
        {
            c=Integer.parseInt(buf.readLine());
            //an expected error that the user enters  something else instead of the movie
        }
        catch(IOException e1)
        {
            System.out.println("Movie not running");          //handling of the exception
        }

        if(c==1)
        {
            System.out.println("\f");
            MOVIETIME();
        }
        if(c==2)
        {
            System.out.println("\f");                                                                   //calling of the function corresponding to the movie selected
            MOVIETIME();
        }
        if(c==3)
        {
            System.out.println("\f");
            MOVIETIME();
        }
        if(c==4)
        {
            System.out.println("\f");
            MOVIETIME();
        }
    }

    public static void MOVIETIME()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------- PLEASE SELECT THE TIMINGS FOR THE MOVIE----------");
        System.out.println("\n\n");
        System.out.println("ENTER: \n 1. for 8:00 am \n 2. for 11:00 am \n 3. for 2:00 pm \n 4. for 5:00 pm \n 5. for 9:00 pm");
        try
        {
            t=Integer.parseInt(buf.readLine());
        }
        catch(IOException e1)
        {
            System.out.println("invalid entry");
        }
        System.out.println("PLEASE SELECT THE SEATING CLASS:");
        System.out.println("\n\n");
        System.out.println("ENTER:\n 1.BUSINESS\n 2.GOLD\n 3.SILVER\n 4.BRONZE");
        try
        {
            type=Integer.parseInt(buf.readLine());
        }
        catch(IOException e1)
        {
            System.out.println("invalid entry");
        }
        switch(type)
        {
            case 1:
                System.out.println("THE PRICE IS Rs.500 PER TICKET");
                System.out.println("\n\n");
                System.out.println("ENTER THE NO. OF TICKETS");
                d=Integer.parseInt(buf.readLine());
                System.out.println("THE AMT OF THE TICKETS= "+d*500);
                ticket=d*500;
                bill=bill+(d*500);
                break;
            case 2:
                System.out.println("THE PRICE IS Rs.250 PER TICKET");
                System.out.println("\n\n");
                System.out.println("ENTER THE NO. OF TICKETS");
                d=Integer.parseInt(buf.readLine());
                System.out.println("THE AMOUNT OF THE TICKETS= "+d*250);
                ticket=d*250;
                bill=bill+(d*250);
                break;
            case 3:
                System.out.println("THE PRICE IS Rs.175 PER TICKET");
                System.out.println("\n\n");
                System.out.println("ENTER THE NO. OF TICKETS");
                d=Integer.parseInt(buf.readLine());
                System.out.println("THE AMOUNT OF THE TICKETS= "+d*175);
                ticket=d*175;
                bill=bill+(d*175);
                break;
            case 4:
                System.out.println("THE PRICE IS Rs.100 PER TICKET");
                System.out.println("\n\n");
                System.out.println("ENTER THE NO. OF TICKETS");
                d=Integer.parseInt(buf.readLine());
                System.out.println("THE AMOUNT OF THE TICKETS= "+d*100);
                ticket=d*100;
                bill=bill+(d*100);
                break;
            default:
                System.out.println("INVALID ENTRY");
        }
    }

    public static void SNACKS()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n");
        System.out.println("---------- WOULD YOU LIKE TO ORDER SNACKS ----------");
        System.out.println("\n\n");
        System.out.println("TYPE 'Y' FOR YES OR 'N' FOR NO");
        option=buf.readLine();
        if(option.equalsIgnoreCase("y"))
        {
            counter=1;
        }

        while(counter>0)
        {
            System.out.println("ENTER \n 1. BURGER \n 2. NACHOS \n3. COKE \n4. POPCORN ");

            try
            {
                s=Integer.parseInt(buf.readLine());
            }
            catch(IOException e1)
            {
                System.out.println("invalid entry");
            }

            if(s==1)
            {
                System.out.println("\n\n");
                System.out.println("FOR BURGER");
                System.out.println("THE PRICE IS RS.80");
                System.out.println("ENTER HOW MANY BURGERS DO YOU WANT TO BUY:");
                try
                {
                    quan=Integer.parseInt(buf.readLine());
                }
                catch(IOException e2)
                {
                    System.out.println("INVALID ENTRY");
                }
                bill=bill+(quan*80);
                snack=quan*80+snack;
                sn="BURGER"+" " +sn;
            }
            if(s==2)
            {
                System.out.println("\n\n");
                System.out.println("FOR NACHOS");
                System.out.println("THE PRICE IS RS.100");
                System.out.println("ENTER HOW MANY NACHOS DO YOU WANT TO BUY:");
                try
                {
                    quan=Integer.parseInt(buf.readLine());
                }
                catch(IOException e2)
                {
                    System.out.println("INVALID ENTRY");
                }
                bill=bill+(quan*100);
                snack=quan*100+snack;
                sn="NACHOS"+" " +sn;

            }
            if(s==3)
            {
                System.out.println("\n\n");

                System.out.println("FOR COKE");
                System.out.println("THE PRICE IS RS.70");
                System.out.println("ENTER HOW MANY COKE DO YOU WANT TO BUY:");
                try
                {
                    quan=Integer.parseInt(buf.readLine());
                }
                catch(IOException e2)
                {
                    System.out.println("INVALID ENTRY");
                }
                bill=bill+(quan*70);
                snack=quan*70+snack;
                sn="COKE"+" " +sn;
            }
            if(s==4)
            {
                System.out.println("\n\n");
                System.out.println("FOR POPCORN");
                System.out.println("THE PRICE IS RS.90");
                System.out.println("ENTER HOW MANY POPCORN DO YOU WANT TO BUY:");
                try
                {
                    quan=Integer.parseInt(buf.readLine());
                }
                catch(IOException e2)
                {
                    System.out.println("INVALID ENTRY");
                }
                bill=bill+(quan*90);
                snack=quan*90+snack;
                sn="POPCORN"+" " +sn;
            }
            System.out.println("\n\n");
            System.out.println("WOULD YOU LIKE TO ORDER SOMETHING ELSE ?");
            System.out.println("\n TYPE 'Y' FOR YES OR 'N' FOR NO");
            option1=buf.readLine();

            if(option1.equalsIgnoreCase("n"))
            {
                counter=0;
                sn= sn + "";


            }
            else
            {
                counter=1;

            }
        }

    }
    public static void CANCELPROCESS()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DO YOU WISH TO PROCESS WITH THE PAYMENT OF THE TICKETS");
        System.out.println("TYPE 'P' FOR PROCESSING AND 'C' FOR CANCELLATION");
        //checking whether the user wants to cancel his tickets or process with the payment
        try
        {
            ac=buf.readLine();
        }
        catch(IOException e3)
        {
            System.out.println("PLEASE ENTER 'P' OR 'C'");
        }

        if(ac.equalsIgnoreCase("P"))
        {
            System.out.println("PROCESSING PAYMENT~~~~~~~~~~~~~~");
            for(int z=0;z<1000000000;z++)
            {
            }
            System.out.println("\f");
            System.out.println("YOUR PAYMENT OF RS." +bill+ "HAS BEEN PROCESSED");
            System.out.println("\n\n");
        }

        else
        {
            System.out.println("\f");
            System.out.println("YOUR TICKETS HAVE BEEN CANCELLED");
        }

        System.out.println("~~~~~~~~~~ THANK YOU FOR WATHCHING MOVIES WITH FUN CINEMAS ~~~~~~~~~~");
    }
    //Prompting the customer to diplay his contact details
    public static void CUSTOMERDET()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your Full Name");
        fullname=buf.readLine();
        System.out.println("Please enter your mobile number");
        mobileno=buf.readLine();
    }




}
