package com.euronet.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euronet.main.domain.MemberDetails;
import com.euronet.main.repository.MemberDetailsRepositoryInterface;
@Service
public class MemberDetailsService implements MemberDetailsServiceInterface{
	@Autowired
	private MemberDetailsRepositoryInterface memberDetailsRepositoryInterface;

	@Override
	public boolean addNewMember(MemberDetails memberDetails) {
		return memberDetailsRepositoryInterface.addNewMember(memberDetails);
	}

	@Override
	public boolean updateMemberByMemberCode(int membercode){
		return memberDetailsRepositoryInterface.updateMemberByMemberCode(membercode);
	}

	@Override
	public MemberDetails getMemberByMemberCode(int memberCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDetails> getAllMembers() {
		
		return memberDetailsRepositoryInterface.getAllMembers();
	}

}
