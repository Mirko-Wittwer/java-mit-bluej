/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pagesNumber;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pagesNumber = pages;
        refNumber = "";
        borrowed = 0;
        courseText = true;
        
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pagesNumber;
    }
    
    /*public void printAuthor()
    {
        System.out.println("Author: " + author + ".");
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + title + ".");
    }*/
    
    /*public void printDetails()
    {
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pagesNumber);
    }*/
    
    public void printDetails()
    {
        if (refNumber.length() > 0 ){
            System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pagesNumber + ", " + "Ausgeliehen: " + borrowed + ", " + "RefNumber: " + refNumber);}
        else{
            System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pagesNumber + ", " + "Ausgeliehen: " + borrowed + ", " + "RefNumber: ZZZ");
            }
    }
    
    /*public void setRefNumber(String ref)
    {
        refNumber = ref;
    }*/
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
            refNumber = ref;}
        else{
            System.out.println("Zu kurz!");
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    private void isCourseText()
    {
        isCourseText = courseText;
        if(isCourseText == true)
        { returen isCourseTest;}
    }
}    

