package question2;

public class Article {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createMemento(){
        return new ArticleMemento(this.id, this.title, this.content);
    }


    public void restore(ArticleMemento articleMemento) {
        this.setId(articleMemento.getId());
        this.setTitle(articleMemento.getTitle());
        this.setContent(articleMemento.getContent());
    }

    @Override
    public String toString() {
        return "question2.Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}