class Book {
    private String title;
    private String writer;

    // Constructor
    Book (String title, String writer){
        this.title = title;
        this.writer = writer;
    }

    public String getBookTitle() {

        return this.title;
    }

    public String getBookWriter() {

        return this.writer;
    }

    public void setBookTitle(String title) {

        this.title = title;
    }

    public void setBookWriter(String writer) {

        this.writer = writer;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + this.getBookTitle() + '\'' +
                ", writer='" + this.getBookWriter() + '\'' +
                '}';
    }
}