package B.B9_BDB;

public class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    public int compareTo(Book o) {
        //Ilosc stron
        //Tytul

        if (pages>o.pages) return 1;
        else if (pages<o.pages) return -1;
        else if (pages==o.pages && !title.equals(o.title)) return title.compareTo(o.title);
        return 0;
    }
}
