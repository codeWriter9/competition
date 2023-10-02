package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GoatLatinTest {

    private GoatLatin goatLatin;

    @Before
    public void setUp() throws Exception {
        goatLatin = new GoatLatin();
    }

    @Test
    public void testToGoatLatin() {
        assertNotNull(goatLatin);
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
                goatLatin.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa " +
                        "umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
        assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa " +
                        "andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
                goatLatin.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }

    @After
    public void tearDown() throws Exception {
        goatLatin = null;
    }
}
