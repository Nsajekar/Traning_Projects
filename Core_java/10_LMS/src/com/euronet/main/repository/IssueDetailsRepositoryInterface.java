package com.euronet.main.repository;

import java.util.List;

import com.euronet.main.domain.IssueDetails;


public interface IssueDetailsRepositoryInterface {
	IssueDetails addNewIssue(IssueDetails issuedetails);

	IssueDetails updateIssueByIssueId(IssueDetails issuedetails);

	IssueDetails getIssueByIssueId(int memberId);

	boolean deleteIssueByIssueId(int memberId);

	List<IssueDetails> getAllIssues();
}
