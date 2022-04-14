package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HtmlTextConverter
{
    private String fullFilenameWithPath;

    public HtmlTextConverter(String fullFilenameWithPath)
    {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public String convertToHtml() throws IOException{
	    BufferedReader reader = new BufferedReader(new FileReader(fullFilenameWithPath));
	    String line = reader.readLine();
		return parseTextToHTML(reader, line);
    }

	private String parseTextToHTML(BufferedReader reader, String line) throws IOException {
		StringBuilder html = new StringBuilder();
		while (line != null) {
			html.append(getParsedLine(line));
			line = reader.readLine();
		}
		return html.toString();
	}

	private String getParsedLine(String line) {
		return StringEscapeUtils.escapeHtml(line) + "<br />";
	}

	public String getFilename() {
		return this.fullFilenameWithPath;
	}
}
