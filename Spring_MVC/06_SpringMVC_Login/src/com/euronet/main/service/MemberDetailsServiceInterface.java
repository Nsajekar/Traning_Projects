package com.euronet.main.service;

import java.util.List;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsServiceInterface {

	public boolean addNewMember(MemberDetails memberDetails);

	public boolean updateMemberByMemberCode(int membercode);

	public MemberDetails getMemberByMemberCode(int memberCode);

	public List<MemberDetails> getAllMembers();
}
