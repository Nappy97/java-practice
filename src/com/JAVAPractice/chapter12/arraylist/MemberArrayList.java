package com.JAVAPractice.chapter12.arraylist;

import java.util.ArrayList;

import com.JAVAPractice.chapter12.collection.Member;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member :arrayList){
            System.out.println(member);
        }
        System.out.println();
    }


}