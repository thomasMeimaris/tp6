package question1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MementoTest {
    @Test
    public void testSave() {
        Article article = new Article(1, "un article");

        article.setContent("DEF");

        assertTrue(article.createMemento() instanceof ArticleMemento);
        assertEquals(1, article.createMemento().getId());
        assertEquals("DEF", article.createMemento().getContent());
    }

    @Test
    public void testRestore() {
        Article article = new Article(1, "un article");

        article.setContent("DEF");
        ArticleMemento articleMemento = article.createMemento();

        article.setContent("123");
        article.restore(articleMemento);

        assertEquals("DEF", article.createMemento().getContent());
    }
}
