package collection.set.member;

public class MemberNoHashhNoEq {

    private String id;

    public MemberNoHashhNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashhNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
