package org.dinesh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageBuilderTest {

    @Test
    public void testNameByPerson() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello John", obj.getMessage("John"));

    }

    @Test
    public void testNameEmpty() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));
    }
    @Test
    public void testNameNull() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));
    }

}
