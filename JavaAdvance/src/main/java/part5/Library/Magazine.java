package Part5.Library;

public class Magazine extends Position {
    private int issueNumber;

    public Magazine(String title, int year, String isbn, Author author, int issueNumber) {
        super(title, year, isbn, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                '}';
    }
}
