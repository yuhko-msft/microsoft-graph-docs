---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new EducationUser()
requestBody.primaryRole = "String";
requestBody.middleName = "String";
requestBody.externalSource = "String";
requestBody.externalSourceDetail = "String";
requestBody.residenceAddress = new PhysicalAddress();
requestBody.residenceAddress.additionalData = new Map([
			["@odata.type", "microsoft.graph.physicalAddress"];
		]);
requestBody.mailingAddress = new PhysicalAddress();
requestBody.mailingAddress.additionalData = new Map([
			["@odata.type", "microsoft.graph.physicalAddress"];
		]);
requestBody.student = new EducationStudent();
requestBody.student.additionalData = new Map([
			["@odata.type", "microsoft.graph.educationStudent"];
		]);
requestBody.teacher = new EducationTeacher();
requestBody.teacher.additionalData = new Map([
			["@odata.type", "microsoft.graph.educationTeacher"];
		]);
requestBody.createdBy = new IdentitySet();
requestBody.createdBy.additionalData = new Map([
			["@odata.type", "microsoft.graph.identitySet"];
		]);
requestBody.accountEnabled = "Boolean";
requestBody.assignedLicenses = [
			new AssignedLicense();
requestBody.assignedLicenses.additionalData = new Map([
					["@odata.type", "microsoft.graph.assignedLicense"];
				]);
		]
	],
requestBody.assignedPlans = [
			new AssignedPlan();
requestBody.assignedPlans.additionalData = new Map([
					["@odata.type", "microsoft.graph.assignedPlan"];
				]);
		]
	],
requestBody.businessPhones = [
			"String";
		]
	],
requestBody.department = "String";
requestBody.displayName = "String";
requestBody.givenName = "String";
requestBody.mail = "String";
requestBody.mailNickname = "String";
requestBody.mobilePhone = "String";
requestBody.passwordPolicies = "String";
requestBody.passwordProfile = new PasswordProfile();
requestBody.passwordProfile.additionalData = new Map([
			["@odata.type", "microsoft.graph.passwordProfile"];
		]);
requestBody.officeLocation = "String";
requestBody.preferredLanguage = "String";
requestBody.provisionedPlans = [
			new ProvisionedPlan();
requestBody.provisionedPlans.additionalData = new Map([
					["@odata.type", "microsoft.graph.provisionedPlan"];
				]);
		]
	],
requestBody.refreshTokensValidFromDateTime =  new Date("String (timestamp)");
requestBody.showInAddressList = "Boolean";
requestBody.surname = "String";
requestBody.usageLocation = "String";
requestBody.userPrincipalName = "String";
requestBody.userType = "String";
requestBody.onPremisesInfo = new EducationOnPremisesInfo();
requestBody.onPremisesInfo.additionalData = new Map([
			["@odata.type", "microsoft.graph.educationOnPremisesInfo"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.educationUser"];
	]);
const result = async () => {
	await graphServiceClient.education.users.post(requestBody);
}


```