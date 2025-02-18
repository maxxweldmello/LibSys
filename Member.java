public class Member {
    private int memberId;
    private String name;
    private int issuedBookId;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.issuedBookId = -1;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIssuedBookId() {
        return issuedBookId;
    }

    public void setIssuedBookId(int issuedBookId) {
        this.issuedBookId = issuedBookId;
    }

    @Override
    public String toString() {
        return "ID: " + memberId + ", Name: " + name + ", Issued Book ID: " + issuedBookId;
    }
}
