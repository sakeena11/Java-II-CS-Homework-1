/**
  * BookYounus.java
  * @description A class for managing data on Books
  * @author Sakeena Younus
  * @version 1.0 2022-01-22
*/

/* Outside resources:
Referenced Toddler.java program created in class
Worked with Kejsa Haska on debugging
*/

public class BookYounus {

  //____attributes:____
  private String author;
  private String title;
  private String publisher;
  private int year;
  private int pages;
  private double price;

  //_____methods:____

  /** Constructor of class: */
  public BookYounus (String a, String t) {
    author = a;
    title = t;
  }

  /** returns author */
  public String getAuthor() {
    return author;
  }

  /** returns title */
  public String getTitle() {
    return title;
  }

  /** sets publisher */
  public void setPublisher (String newPublisher){
    publisher = newPublisher;
  }

  /** returns publisher */
  public String getPublisher() {
    return publisher;
  }

  /** sets year */
  public void setYear (int newYear){
    year = newYear;
  }

  /** returns year */
  public int getYear() {
    return year;
  }

  /** sets pages */
  public void setPages (int newPages){
    pages = newPages;
  }

  /** returns pages */
  public int getPages() {
    return pages;
  }

  /** sets price */
  public void setPrice (double newPrice){
    price = newPrice;
  }

  /** returns price */
  public double getPrice() {
    return price;
  }

  /** prints information of the object */
  public String toString(){
    String s;
    s = "The book, " + title + " by " + author;
    s += " was published by " + publisher + " in " + year + ".";
    s += " It has " + pages + " pages and costs $" + price + ".";

    return s;
  }

  /** main method  */
  public static void main(String[] args) {
    /** book object #1 */
    BookYounus janeEyre;
    janeEyre = new BookYounus("Bronte", "Jane Eyre");
    janeEyre.setPublisher("Smith, Elder and Co.");
    janeEyre.setYear(1847);
    janeEyre.setPages(592);
    janeEyre.setPrice(11.99);

    System.out.println(janeEyre);

    /** book object #2 */
    BookYounus animalFarm;
    animalFarm = new BookYounus("Orwell", "Animal Farm");
    animalFarm.setPublisher("Simon & Schuster");
    animalFarm.setYear(1945);
    animalFarm.setPages(112);
    animalFarm.setPrice(13.99);

    System.out.println(animalFarm);
  }

} //end of class
