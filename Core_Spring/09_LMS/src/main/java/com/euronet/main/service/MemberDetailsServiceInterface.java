package com.euronet.main.service;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsServiceInterface {
	
MemberDetails getMemberDetailsByMemberCode(int membercode);

boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails);
}
