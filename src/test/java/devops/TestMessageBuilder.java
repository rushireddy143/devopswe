package devops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import login.MessageBuilder;

public class TestMessageBuilder {

    @Test
    public void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello mkyong", obj.getMessage("mkyong"));

    }

}