package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> data;

    public MemberRepository() {
        this.data = new HashMap<>();
    }

    public void save(Member member) {
        data.put(member.getId(), member);
    }

    public Member findById(String id) {
        return data.get(id);
    }

    public Member findByName(String name) {
        for (Member member : data.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        data.remove(id);
    }
}
