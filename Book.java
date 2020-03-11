public class Book {
    private String name, Author,language,Genre,Published;

    public Book(){
        System.out.println("book object has created!");
    }
    public  void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }

    public void setAuthor(String newAuthor){
        this.Author=newAuthor;
    }
    public String getAuthor(){
        return this.Author;
    }
    public void setlanguage(String newlanguage){
        this.language=newlanguage;
    }
    public String getlanguage(){
        return this.language;
    }
    public void setGenre(String newGenre){
        this.Genre=newGenre;
    }
    public String getGenre(){
        return this.Genre;
    }
    public void setPublished(String newPublished){
        this.Published=newPublished;
    }
    public String getPublished(){
        return this.Published;
    }
}
