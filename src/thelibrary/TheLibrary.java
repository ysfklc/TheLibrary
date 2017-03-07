package thelibrary;
import java.util.Scanner;
public class TheLibrary {
    static int s;
    static int i;
    static String klm;
    //The input must be like this
    //A Capital in the Twenty-First Century, Thomas Piketty, 9780674430006, 696, 2013, economic instability, wealth, tax
    //
    public static void sort(Book[] b){
        Book temp=null;
        for(i=0; i< s; i++) {
            for(int j=i;j<s;j++){
                if(b[i]==null) break;
                if(b[j].getNumPages() > b[i].getNumPages()) 
                {
                    temp = b[i];
                    b[i]=b[j];
                    b[j]=temp; 
                }
            }    
        }    
    }
      
    public static void delete(Book[] b,String klm){
        int k;
        int p=0;
        while(p<s){
        for(k=0;k<s;k++){
            if(b[k]==null) break;
            if(b[k].searchKeyWord(klm)==true){
                if(b[k]==null) break;
                s--;
                for(int j=k;j<=s;j++){
                    if(b[j+1]==null){
                        b[j]=null;
                        break;
                    }
                    b[j] = b[j+1];
                }
                System.out.println("Deleted!!");
            }
        }
        p++;
        }
        
    }
    public static void main(String[] args) {
        Book[] b=new Book[100];
        
        boolean check=true;
        while(check){
        System.out.print("Press A to insert a book\nPress D to delete a book\nPress S to sort all books\nPress X to display all books\nPress Q to exit\n");
        System.out.print("Your choice: ");
        Scanner input =new Scanner(System.in);
        String choice =input.next();
        
        i = s;
            switch(choice){
                    case("A"):
                            String[] word =new String[200];
                            word=input.nextLine().split(", ");
                            b[i]=new Book();
                            int a=word.length;
                            if(word[0].length()>3 && word[1].length()>=3 && word[2].length()==13 
                                && Integer.parseInt(word[3])>0 && Integer.parseInt(word[4])>=1923 
                                && Integer.parseInt(word[4])<=2016 && a>=8 && a<=13){
                            b[i].setBookName(word[0]);
                            b[i].setAuthorName(word[1]);
                            b[i].setISBN(word[2]);
                            b[i].setNumPages(Integer.parseInt(word[3]));
                            b[i].setPubyear(Integer.parseInt(word[4])); 
                            String[] words = new String[a-5];
                            for(int x=5;x<word.length;x++) {
                                  words[x-5]=word[x];
                            }
                            b[i].setKeyWords(words);
                            i++;
                            s=i;
                            System.out.println("\nAdded!\n");
                            }
                            else
                                System.out.println("Sorry something went wrong!!!");
                            break;
                    case("D"):
                        klm=input.next();
                        delete(b,klm); 
                        break;
                    case("S"):  
                        sort(b); 
                        System.out.println("Sorted!");
                        break;
                    case("X"):
                        for(int c=0;c<s;c++){
                            if(b[c]==null) break;
                            b[c].displayBook();
                        }
                        
                        break;
                    case("Q"): check=false; System.out.println("Good bye!"); break;
                    default:  
                        System.out.println("Sorry something went wrong!!!");
                        break;     
            }
        }
    }
}
