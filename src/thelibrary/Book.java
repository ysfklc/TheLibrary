package thelibrary;
public class Book {
        private String bookName;
        private String authorName;
        private String ISBN;
        private int numPages;
        private int pubYear;
        private String[]  keyWords;

        public Book(){
            
        }

        public Book(String bookName, String authorName, String ISBN, int numPages, int pubYear,String[]  keyWords){
         if(bookName.length()>3 && bookName.length()>=3){
            this.bookName=bookName;
         }
         if(authorName.length()>3 && authorName.length()>=3){
            this.authorName=authorName;
         }
         if(ISBN.length()==13){
            this.ISBN=ISBN;
         }
         if(numPages>0){
            this.numPages=numPages;
         }
         if(pubYear>=1923 && pubYear<=2016){
            this.pubYear=pubYear;
         }
         this.keyWords=keyWords;   
        }
//ayaralamaları setter yap
         public String getBookName() {
             return bookName;
         }
         public void setBookName(String bookName) {
            if(bookName.length()>3)
                this.bookName=bookName;
         }
         public String getAuthorName() {
             return authorName;
         }
         public void setAuthorName(String authorName) {
            if(authorName.length()>3)
                this.authorName=authorName;
         }
         public String getISBN() {
             return ISBN;
         }
         public void setISBN(String ISBN) {
            if(ISBN.length()==13)
                this.ISBN=ISBN;
         }
         public int getNumPages() {
             return numPages;
         }
         public void setNumPages(int numPages) {
            if(numPages>0)
                this.numPages=numPages;
         }
         public int getPubyear() {
             return pubYear;
         }
         public void setPubyear(int pubYear) {
            if(pubYear>=1923 && pubYear<=2016)
                this.pubYear=pubYear;
         }
         public String[]  getKeyWords() {
             return keyWords;
         }
         public void  setKeyWords(String[]  keyWords) {
            if(keyWords.length>=3 && keyWords.length<=5)
               this.keyWords=keyWords;
         }
         
         public void displayBook(){
             int i;
             System.out.print(getBookName()+",");
             System.out.print(getAuthorName()+",");
             System.out.print(getISBN()+",");
             System.out.print(getNumPages()+",");
             System.out.print(getPubyear()+",");
             int t =keyWords.length;
             for(i=0;i<t-1;i++){    
             System.out.print(keyWords[i]+", ");
             } 
             System.out.print(keyWords[i]);
             System.out.print("\n");
        }
        public boolean searchKeyWord(String ara){
            boolean chk=false;
            int i;
            for(i=0;i<keyWords.length;i++){
                if(ara.equals(keyWords[i])){
                    chk=true;
                }
            }
            return chk;
        }
}        