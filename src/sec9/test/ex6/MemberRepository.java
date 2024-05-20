package sec9.test.ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    Map<String, Member> memberMap = new HashMap<>();

    // 회원 저장
    public void save(Member member){
        memberMap.put(member.getId(), member);
    }

    // 회원 조회(id)
    public Member findById(String id){
        return memberMap.get(id);
    }

    // 회원 조회(이름)
    public Member findByName(String name){
        for (Member member : memberMap.values()){
            if (member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    // 회원 삭제
    public void remove(String id){
        memberMap.remove(id);
    }
}
