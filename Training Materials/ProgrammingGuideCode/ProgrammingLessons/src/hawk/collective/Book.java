package hawk.collective;

public class Book {
    public String title, author;
    public int pageCount;
    public Book(String title, String author, int pageCount)
    {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    public void Read()
    {
        System.out.println("Reading a Book");
    }
    public String getCitation()
    {
        return String.format("%s. %s" ,author, title);
    }
}
