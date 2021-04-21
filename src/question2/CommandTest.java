package question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {
    @Test
    public void testSave() {
        Article article = new Article(1, "un article");

        Invoker invoke = new Invoker(new AddCommand(article));
        invoke.addArticleContent("DEF");

        assertTrue(article.createMemento() instanceof ArticleMemento);
        assertEquals(1, article.createMemento().getId());
        assertEquals("DEF", article.createMemento().getContent());
    }

    @Test
    public void testRestore() {
        Article article = new Article(1, "un article");

        Invoker invoke = new Invoker(new AddCommand(article));
        invoke.addArticleContent("DEF");

        ArticleMemento articleMemento = article.createMemento();

        invoke.addArticleContent("123");
        article.restore(articleMemento);

        assertEquals("DEF", article.createMemento().getContent());
    }
}
