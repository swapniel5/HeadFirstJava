package Another;

//A Java program to print all subsets of a set
//import java.io.IOException;

class subsetOfStr
{
 // Print all subsets of given set[]
 static void printSubsets(char set[])
 {
     int n = set.length;

     // Run a loop for printing all 2^n
     // subsets one by one
     System.out.println("Value of n: "+n+"\n1<<n:\t"+(1<<n));
     System.out.println(Integer.toBinaryString((1<<n)));
     
     for (int i = 0; i < (1<<n); i++)
     {
         System.out.print(i+"i{ ");

         // Print current subset
         for (int j = 0; j < n; j++)

             // (1<<j) is a number with jth bit 1
             // so when we 'and' them with the
             // subset number we get which numbers
             // are present in the subset and which
             // are not
             if ((i & (1 << j)) > 0) {
                 System.out.print(set[j] + " j"+j);
                 System.out.print((i&(1<<j))+" 	"+(1<<j));
             }

         System.out.println("}");
     }
     
 }

 // Driver code
 public static void main(String[] args)
 {
     char set[] = {'a', 'b', 'c'};
     printSubsets(set);
 }
}