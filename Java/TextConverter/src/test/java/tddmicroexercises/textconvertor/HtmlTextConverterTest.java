package tddmicroexercises.textconvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HtmlTextConverterTest {
    String path = "C:\\AcademyWork\\ExtendedLearning\\Racing-Car-Katas\\Java\\TextConverter\\src\\test\\java\\tddmicroexercises\\textconvertor\\texttests\\";

    @Test
    @DisplayName("Check the specified file can be found")
    public void checkCanFindFile() {
        path += "Normal";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("C:\\AcademyWork\\ExtendedLearning\\Racing-Car-Katas\\Java\\TextConverter\\src\\test\\" +
                "java\\tddmicroexercises\\textconvertor\\texttests\\NormalText.txt",
                converter.getFilename()
        );
    }

    @Test
    @DisplayName("Check that normal text is converted correctly")
    public void checkNormalText() throws IOException {
        path += "Normal";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is a normal line of text.<br />", converter.convertToHtml());
    }

    @Test
    @DisplayName("Check that multi-line text is converted correctly")
    public void checkMultiLineText() throws IOException {
        path += "MultiLine";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is text has more than one line of text.<br />" +
                "Here is the second one.<br />" +
                "And the third.<br />",
                converter.convertToHtml()
        );
    }

    @Test
    @DisplayName("Check that text with the ampersand symbol is converted correctly")
    public void checkAmpersandSymbol() throws IOException {
        path += "Ampersand";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is line has &amp; in it.<br />", converter.convertToHtml());
    }

    @Test
    @DisplayName("Check that text with the apostrophe symbol is converted correctly")
    public void checkApostropheSymbol() throws IOException {
        path += "Apostrophe";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is line has &quot; in it.<br />", converter.convertToHtml());
    }

    @Test
    @DisplayName("Check that text with the greater than symbol is converted correctly")
    public void checkGreaterThanSymbol() throws IOException {
        path += "GreaterThanSign";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is line has &gt; in it.<br />", converter.convertToHtml());
    }

    @Test
    @DisplayName("Check that text with the less than symbol is converted correctly")
    public void checkLessThanSymbol() throws IOException {
        path += "LessThanSign";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is line has &lt; in it.<br />", converter.convertToHtml());
    }


    @Test
    @DisplayName("Check that text with the quotation mark symbol is converted correctly")
    public void checkQuotationMarkSymbol() throws IOException {
        path += "QuotationMark";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is line has &quot; in it.<br />", converter.convertToHtml());
    }

    @Test
    @DisplayName("Check that multi-line text with mixed symbols are converted correctly")
    public void checkMixedText() throws IOException {
        path += "Mixed";
        HtmlTextConverter converter = new HtmlTextConverter(path+"Text.txt");
        assertEquals("This is text has more than one line of text.<br />" +
                "And it has &amp;, &lt; and &quot;<br />",
                converter.convertToHtml()
        );
    }
}
