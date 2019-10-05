package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeBuilderTest {

    @Test
    void addField() {
        assertEquals(CodeBuilder.class, new CodeBuilder("Person").addField("name","String").getClass());
    }

    @Test
    void testToString() {
        String expected = "public class Person\n" +
                "{\n" +
                "  public String name;\n" +
                "}";
        assertEquals(expected, new CodeBuilder("Person").addField("name","String").toString());
    }
}