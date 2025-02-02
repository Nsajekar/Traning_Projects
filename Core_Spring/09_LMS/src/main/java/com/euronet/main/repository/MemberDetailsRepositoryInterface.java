
package com.euronet.main.repository;

import com.euronet.main.domain.MemberDetails;

public interface MemberDetailsRepositoryInterface {
	
	MemberDetails getMemberDetailsByMemberCode(int membercode);

	boolean updateBookIssueCountByMemberCode(MemberDetails memberDetails);
}
