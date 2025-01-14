package com.euronet.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.euronet.main.domain.MemberDetails;

@Repository
public class MemberDetailsRepository implements
		MemberDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_NEW_MEMBER = 
			"insert into member_details(first_name,last_name,role_id,book_issue_count,approval_Status,user_name,pass_word) values (?,?,?,?,?,?,?)";
	private static final String UPDATE_MEMBER_BY_USERNAME =
			"update  member_details set approval_Status ='1' where member_code =? ";
	private static final String GET_MEMBER_BY_USERNAME = "";
	private static final String GET_ALL_MEMBERS = "select * from member_details";

	@Override
	public boolean addNewMember(MemberDetails memberDetails) {
		Object[] params = { memberDetails.getFirstName(),
				memberDetails.getLastName(),
				memberDetails.getRoleDetails().getRoleId(),
				memberDetails.getBookIssuedCount(),
				memberDetails.isApprovalStatus(), memberDetails.getUsername(),
				memberDetails.getPassword() };
		int count = jdbcTemplate.update(ADD_NEW_MEMBER, params);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMemberByMemberCode(int memberCode){
		int count = jdbcTemplate.update(UPDATE_MEMBER_BY_USERNAME, memberCode);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public MemberDetails getMemberByMemberCode(int memberCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDetails> getAllMembers() {
		List<MemberDetails>allMembers = jdbcTemplate.query(GET_ALL_MEMBERS, new MemberDetailsRowMapper());
		return allMembers;
	}

}
