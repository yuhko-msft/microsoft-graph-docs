---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageAssignmentPolicy()
requestBody.accessPackageId = "b2eba9a1-b357-42ee-83a8-336522ed6cbf";
requestBody.displayName = "Users from connected organizations can request";
requestBody.description = "Allow users from configured connected organizations to request and be approved by their sponsors";
requestBody.canExtend = false;
requestBody.durationInDays = 365;
requestBody.expirationDateTime = null,
requestBody.requestorSettings = new RequestorSettings();
requestBody.requestorSettings.scopeType = "AllExistingConnectedOrganizationSubjects";
requestBody.requestorSettings.acceptRequests = true;
requestBody.requestApprovalSettings = new ApprovalSettings();
requestBody.requestApprovalSettings.isApprovalRequired = true;
requestBody.requestApprovalSettings.isApprovalRequiredForExtension = false;
requestBody.requestApprovalSettings.isRequestorJustificationRequired = true;
requestBody.requestApprovalSettings.approvalMode = "SingleStage";
requestBody.requestApprovalSettings.approvalStages = [
				new ApprovalStage();
requestBody.requestApprovalSettings.approvalStages.additionalData = new Map([
						["approvalStageTimeOutInDays", 14];
						["isApproverJustificationRequired", true];
						["isEscalationEnabled", false];
						["escalationTimeInMinutes", 11520];
						["primaryApprovers", [
									 ["@odata.type" , "#microsoft.graph.groupMembers"],
									 ["isBackup" , true],
									 ["id" , "d2dcb9a1-a445-42ee-83a8-476522ed6cbf"],
									 ["description" , "group for users from connected organizations which have no external sponsor"],
									 ["@odata.type" , "#microsoft.graph.externalSponsors"],
									 ["isBackup" , false],
							]
						],
					]);
			]
		],
requestBody.questions = [
			new AccessPackageQuestion();
requestBody.questions.additionalData = new Map([
					["isRequired", false];
						 ["defaultText" , "what state are you from?"],
						 ["localizedTexts" , [
									 ["text" , "¿De qué estado eres?"],
									 ["languageCode" , "es"],
							]
						],
					["@odata.type", "#microsoft.graph.accessPackageMultipleChoiceQuestion"];
					["choices", [
								 ["actualValue" , "AZ"],
									 ["localizedTexts" , [
												 ["text" , "Arizona"],
												 ["languageCode" , "es"],
										]
									],
								 ["actualValue" , "CA"],
									 ["localizedTexts" , [
												 ["text" , "California"],
												 ["languageCode" , "es"],
										]
									],
								 ["actualValue" , "OH"],
									 ["localizedTexts" , [
												 ["text" , "Ohio"],
												 ["languageCode" , "es"],
										]
									],
						]
					],
					["allowsMultipleSelection", false];
				]);
			new AccessPackageQuestion();
requestBody.questions.additionalData = new Map([
					["isRequired", false];
						 ["defaultText" , "Who is your manager?"],
						 ["localizedTexts" , [
									 ["text" , "por qué necesita acceso a este paquete"],
									 ["languageCode" , "es"],
							]
						],
					["@odata.type", "#microsoft.graph.accessPackageTextInputQuestion"];
					["isSingleLineQuestion", false];
				]);
		]
	],
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageAssignmentPolicies.post(requestBody);
}


```