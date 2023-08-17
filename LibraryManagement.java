
import java.util.Scanner;

public class LibraryManagement {
    
    public static void main(String[] args){
        char r;
        do{
            System.out.println("********************(Library Management System)*******************");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a Book");
            System.out.println("Press 3 to return a Book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            System.out.println("******************************************************************");
            Scanner obj3 = new Scanner(System.in);
            System.out.print("Enter any number :");
            int a = obj3.nextInt();
            switch(a){
                case 1:
                Library aa = new Library();
                aa.add();
                break;

                case 2:
                Library bb = new Library();
                bb.issue();
                break;

                case 3:
                Library cc = new Library();
                cc.Return();
                break;
                
                case 4:
                Library dd = new Library();
                dd.details();
                break;

                case 5:
                Library ee = new Library();
                ee.exit();
                break;

                default:
                System.out.println("Invalid Number!");
            }
           System.out.println("You want to select next option Y/N");
            r = obj3.next().charAt(0);
               
        } 
        while(r == 'y' || r == 'Y');
            if(r == 'n' || r == 'N'){
              Library z = new Library();
              z.exit();
                   
            }
        }
}    
class Library{
        static String str, b, date;
        static int a, c;
            void add(){
                System.out.println("Enter Book Name, Price, and Book_id : ");
                Scanner obj1 = new Scanner(System.in);
                String str = obj1.nextLine();
                float price = obj1.nextInt();
                int bookid = obj1.nextInt();
                System.out.println("Your details is : " + str +", " + price+", " + bookid);
            }
            void issue(){
                Scanner obj2 = new Scanner(System.in);
                System.out.print("Book Name : ");
                str = obj2.nextLine();
                System.out.print("Book_id : ");
                a = obj2.nextInt();
                obj2.nextLine();
                System.out.print("Issue date : ");
                b = obj2.nextLine();
                System.out.print("Total number of book issued : ");
                c = obj2.nextInt();
                obj2.nextLine();
                System.out.print("Return Book date : ");
                date = obj2.nextLine();
            }
            int get_id(){
                return a;
            }
            void Return(){
                System.out.println("Enter student_name and Book_id :");
                Scanner c = new Scanner(System.in);
                String name = c.nextLine();
                int bookid = c.nextInt();
                if(a==bookid){
                  //System.out.println("Total details");
                   {
                      System.out.println("Total Details : ");
                      System.out.println("Book Name:: " + Library.str);
                      System.out.println("Book id:: " + Library.a);
                      System.out.println("Issue date:: "+Library.b);
                      System.out.println("Total number of book issued:: " + Library.c);
                      System.out.println("Book Return Date:: " +Library.date);
                    }
                }    
                else{
                    System.out.println("Wrong Id, Please enter correct Id!");
                }
            
            }
            void details(){
                System.out.println("Book Name:: " + Library.str);
                System.out.println("Book id:: " + Library.a);
                System.out.println("Issue date:: "+Library.b);
                System.out.println("Total number of book issued:: " + Library.c);
                System.out.println("Book Return Date:: " +Library.date);
            }
            void exit(){
                System.out.println("Exiting the program...");
                System.exit(0);
            
            }    
        }
 