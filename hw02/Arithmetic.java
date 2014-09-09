//Ariana Hewitt
//September 9, 2014
//Homework 2
//Shopping at Walmart, compute cost and tax

public class Arithmetic{
     public static void main(String[] args) {
     //number of pairs of socks
          int nSocks=3;
          //Cost per pair of socks
          //($ is part of the variable name
          double sockCost$=2.58;
          
          //# of drinking glasses
          int nGlasses=6;
          //cost per glass
          double glassCost$=2.29;
          
         //Number of boxes of envelopes
          int nEnvelopes=1;
          //cost per box of envelopes
          double envelopeCost$=3.25;
          
          double taxPercent=0.06;//tax of total purchase

          
          //print out item bought and cost of item
          //Socks
          System.out.println("I bought " +nSocks+  " pairs of socks. The cost of a pair of socks is $" 
                                  +sockCost$);
          //Drinking glasses
          System.out.println("I bought " +nGlasses+  " drinking glasses. The cost of a drinking glass is $" 
                                  +glassCost$);
          //Box of envelopes
          System.out.println("I bought " +nEnvelopes+  " box of envelopes. The cost of a box of envelopes is $" 
                                  +envelopeCost$);
          
          //initialize variables for cost of each item without tax and sales tax of each item
          double totalSockCost, totalSockCost$, taxSockCost$, 
               totalGlassCost, totalGlassCost$, taxGlassCost$,
               totalEnvelopeCost, totalEnvelopeCost$, taxEnvelopeCost$;
          
          totalSockCost= nSocks*sockCost$;//total cost of socks bought without tax
          taxSockCost$=(totalSockCost*taxPercent);//sales tax for socks
          totalSockCost$=totalSockCost+(totalSockCost*taxPercent);//total cost for socks with tax
          
          totalGlassCost=nGlasses*glassCost$;//total cost of glasses bought without tax
          taxGlassCost$=(totalGlassCost*taxPercent);//sales tax for glasses
          totalGlassCost$=totalGlassCost+(totalGlassCost*taxPercent);//total cost for glasses with tax
          
          totalEnvelopeCost=nEnvelopes*envelopeCost$;//total cost of boxes of envelopes bought without 
          taxEnvelopeCost$=(totalEnvelopeCost*taxPercent);//sales tax for envelopes 
          totalEnvelopeCost$=totalEnvelopeCost+(totalEnvelopeCost*taxPercent);//total cost for envelopes with
          
          //print out total cost of each item bought and sales tax
          // \n means new line
          //Socks
          System.out.printf("Total cost of pairs of socks bought without tax is $%4.2f\n", +totalSockCost);
          System.out.printf("Sales tax for socks is $%4.2f\n", +taxSockCost$);
          System.out.printf("Total cost of pairs of socks bought with tax is $%4.2f\n", +totalSockCost$);
          
          //drinking glasses
          System.out.printf("Total cost of drinking glasses bought without tax is $%4.2f\n", +totalGlassCost);
          System.out.printf("Sales tax for drinking glasses is $%4.2f\n", +taxGlassCost$);
          System.out.printf("Total cost of drinking glasses bought with tax is $%4.2f\n", +totalGlassCost$);
          
          //envelopes
          System.out.printf("Total cost of boxes of envelopes bought wihtout tax is $%4.2f\n", +totalEnvelopeCost);
          System.out.printf("Sales tax for a box of envelopes is $%4.2f\n", +taxEnvelopeCost$);
          System.out.printf("Total cost of boxes of envelopes bought with tax is $%4.2f\n", +totalEnvelopeCost$);
          
          //initialize variables for total costs 
          double totalcost, totalcost$, totalTax$;
          totalcost= totalSockCost+totalGlassCost+totalEnvelopeCost; //total cost before tax
          totalcost$= totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //total cost with tax
          totalTax$=taxSockCost$+taxGlassCost$+taxEnvelopeCost$; //total sales tax
          
          
          
          System.out.printf("Total cost of purchases before tax is $%4.2f\n", +totalcost);
          System.out.printf("Total cost of purchases after tax is $%4.2f\n", +totalcost$);
          System.out.printf("Total sales tax is $%4.2f\n", +totalTax$);
          
          
          
     }
}
