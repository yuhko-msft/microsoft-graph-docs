---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new AccessPackageAssignmentRequest()
requestBody.requestType = "UserAdd";
requestBody.accessPackageAssignment = new AccessPackageAssignment();
requestBody.accessPackageAssignment.additionalData = new Map([
			["targetId", "46184453-e63b-4f20-86c2-c557ed5d5df9"];
			["assignmentPolicyId", "2264bf65-76ba-417b-a27d-54d291f0cbc8"];
			["accessPackageId", "a914b616-e04e-476b-aa37-91038f0b165b"];
		]);
requestBody.answers = [
			new AccessPackageAnswer();
requestBody.answers.additionalData = new Map([
					["@odata.type", "#microsoft.graph.accessPackageAnswerString"];
					["value", "Arizona"];
						 ["@odata.type" , "#microsoft.graph.accessPackageMultipleChoiceQuestion"],
						 ["id" , "A714EC6F-4EE0-4614-BD81-37E0C5ECBBFF"],
				]);
			new AccessPackageAnswer();
requestBody.answers.additionalData = new Map([
					["@odata.type", "#microsoft.graph.accessPackageAnswerString"];
					["value", "Need access to marketing campaign material"];
						 ["@odata.type" , "#microsoft.graph.accessPackageTextInputQuestion"],
						 ["id" , "AA615EE9-D9D8-4C03-BE91-BEE37106DEDA"],
				]);
		]
	],
const result = async () => {
	await graphServiceClient.identityGovernance.entitlementManagement.accessPackageAssignmentRequests.post(requestBody);
}


```