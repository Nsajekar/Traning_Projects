package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.MemberDetails;


public interface MemberDeatailsRepositoryInterface {
	MemberDetails addNewMember(MemberDetails memberdetails);

	MemberDetails updateMemberByMemberId(MemberDetails memberdetails);

	MemberDetails getMemberByMemberId(int memberId);

	boolean deleteMemberByMemberId(int memberId);

	List<MemberDetails> getAllMembers();
}
