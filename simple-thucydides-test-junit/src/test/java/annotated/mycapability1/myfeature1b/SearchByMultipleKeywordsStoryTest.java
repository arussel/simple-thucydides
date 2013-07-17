package annotated.mycapability1.myfeature1b;

import net.thucydides.core.annotations.Narrative;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@Narrative(
        title = "a narrative title for story 1b x",
        text = {"A narrative text",
                "for story 1 b x"},
        cardNumber = "1BX",
        type = "Story"
)
@RunWith(ThucydidesRunner.class)
public class SearchByMultipleKeywordsStoryTest {

    @Test
    public void test_with_2_keywords(){

    }
}
