package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsRepositoryInterface {

	public boolean addNewMember(MemberDetails memberDetails);

	public boolean updateMemberByMemberCode(int membercode);

	public MemberDetails getMemberByMemberCode(int memberCode);

	public List<MemberDetails> getAllMembers();
}
