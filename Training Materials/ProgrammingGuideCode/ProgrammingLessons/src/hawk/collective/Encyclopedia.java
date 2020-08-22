package hawk.collective;

public class Encyclopedia extends Book {
    public int editionYear;
    public Encyclopedia(String title, String author, int pageCount, int editionYear)
    {
        super(title, author, pageCount);
        this.editionYear = editionYear;
    }
    @Override
    public String getCitation() {
        //Uses base class' getCitation method and adds on the Encyclopedia's
        // edition as well as 'Print' per MLA guidelines
        return super.getCitation() + String.format(" %s. Print", editionYear);
    }
    public void doResearch()
    {
        System.out.println("Researching a topic");
    }
}
