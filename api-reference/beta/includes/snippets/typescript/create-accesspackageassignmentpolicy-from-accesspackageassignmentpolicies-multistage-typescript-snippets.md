---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageAssignmentPolicy()
requestBody.accessPackageId = "string (identifier)";
requestBody.displayName = "Users from connected organizations can request";
requestBody.description = "Allow users from configured connected organizations to request and be approved by their sponsors";
requestBody.canExtend = false;
requestBody.durationInDays = 365;
requestBody.expirationDateTime = null,
requestBody.requestorSettings = new RequestorSettings();
requestBody.requestorSettings.scopeType = "AllExistingConnectedOrganizationSubjects";
requestBody.requestorSettings.acceptRequests = true;
requestBody.requestorSettings.allowedRequestors = [
			]
		],
requestBody.requestApprovalSettings = new ApprovalSettings();
requestBody.requestApprovalSettings.isApprovalRequired = true;
requestBody.requestApprovalSettings.isApprovalRequiredForExtension = false;
requestBody.requestApprovalSettings.isRequestorJustificationRequired = true;
requestBody.requestApprovalSettings.approvalMode = "Serial";
requestBody.requestApprovalSettings.approvalStages = [
				new ApprovalStage();
requestBody.requestApprovalSettings.approvalStages.additionalData = new Map([
						["approvalStageTimeOutInDays", 14];
						["isApproverJustificationRequired", true];
						["isEscalationEnabled", true];
						["escalationTimeInMinutes", 11520];
						["primaryApprovers", [
									 ["@odata.type" , "#microsoft.graph.groupMembers"],
									 ["isBackup" , true],
									 ["id" , "string (identifier)"],
									 ["description" , "group for users from connected organizations which have no external sponsor"],
									 ["@odata.type" , "#microsoft.graph.externalSponsors"],
									 ["isBackup" , false],
							]
						],
						["escalationApprovers", [
									 ["@odata.type" , "#microsoft.graph.singleUser"],
									 ["isBackup" , true],
									 ["id" , "string (identifier)"],
									 ["description" , "user if the external sponsor does not respond"],
							]
						],
					]);
				new ApprovalStage();
requestBody.requestApprovalSettings.approvalStages.additionalData = new Map([
						["approvalStageTimeOutInDays", 14];
						["isApproverJustificationRequired", true];
						["isEscalationEnabled", true];
						["escalationTimeInMinutes", 11520];
						["primaryApprovers", [
									 ["@odata.type" , "#microsoft.graph.groupMembers"],
									 ["isBackup" , true],
									 ["id" , "string (identifier)"],
									 ["description" , "group for users from connected organizations which have no internal sponsor"],
									 ["@odata.type" , "#microsoft.graph.internalSponsors"],
									 ["isBackup" , false],
							]
						],
						["escalationApprovers", [
									 ["@odata.type" , "#microsoft.graph.singleUser"],
									 ["isBackup" , true],
									 ["id" , "string (identifier)"],
									 ["description" , "user if the internal sponsor does not respond"],
							]
						],
					]);
			]
		],
requestBody.accessReviewSettings = new AssignmentReviewSettings();
requestBody.accessReviewSettings.isEnabled = true;
requestBody.accessReviewSettings.recurrenceType = "quarterly";
requestBody.accessReviewSettings.reviewerType = "Self";
requestBody.accessReviewSettings.startDateTime =  new Date("2020-04-01T07:59:59.998Z");
requestBody.accessReviewSettings.durationInDays = 25;
requestBody.accessReviewSettings.reviewers = [
			]
		],
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageAssignmentPolicies.post(requestBody);
}


```