import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LonguestPalindromeTest {
    @Test
    public void case1() {
        assertThat(LonguestPalindrome.longestPalindrome("cbbd"), is("bb"));
        assertThat(LonguestPalindrome.longestPalindrome("babad"), is("aba"));
    }
    @Test
    public void case2() {
        assertThat(LonguestPalindrome.longestPalindrome("babab"), is("babab"));
    }
    @Test
    public void case3() {
        assertThat(LonguestPalindrome.longestPalindrome("aaaaaa"), is("aaaaaa"));
    }
}
