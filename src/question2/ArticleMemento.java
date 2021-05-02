package question2;

public class ArticleMemento {
    private long id;
    public long getId() {
        return this.id;
    }

    private String title;
    public String getTitle() {
        return this.title;
    }

    private String content;
    public String getContent() {
        return this.content;
    }

    public ArticleMemento(long id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;

    }


}