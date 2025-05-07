class Library{

    static  int totalIssue = 0;
    String name;
    Library(String name){
       this.name =name;
     }


    public void issuebook(){
        
        totalIssue ++;
        System.out.println(name+"issued book");

    }

    public static void issuebookShow(){
        
        System.out.println("Total Book Issued "+totalIssue );

    }


}







public class IssueBook {
    public static void main(String[] args) {
        Library obj = new Library("rahim");
        Library obj1 = new Library("kahim");

        obj. issuebook();
        obj1. issuebook();
        obj. issuebook();
        Library.issuebookShow();
       
        
    }
    
}
