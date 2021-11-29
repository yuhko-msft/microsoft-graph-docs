---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new UnifiedRoleManagementPolicyRule()
requestBody.target = new UnifiedRoleManagementPolicyRuleTarget();
requestBody.target.additionalData = new Map([
			["@odata.type", "microsoft.graph.unifiedRoleManagementPolicyRuleTarget"];
		]);
requestBody.additionalData = new Map([
		["@odata.type", "#microsoft.graph.unifiedRoleManagementPolicyApprovalRule"];
	]);
async () => {
	await graphServiceClient.policies.roleManagementPoliciesById("unifiedRoleManagementPolicy-id").rulesById("unifiedRoleManagementPolicyRule-id").patch(requestBody);
}


```