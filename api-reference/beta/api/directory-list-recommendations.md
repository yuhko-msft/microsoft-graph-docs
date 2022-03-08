---
title: "List recommendations"
description: "Get a list of Azure AD recommendations for your tenant."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# List recommendations
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of Azure AD [recommendations](../resources/recommendation.md) for your tenant.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported|
|Application|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /directory/recommendations
```

## Optional query parameters
This method supports the `$top`, `$select` and `$filter` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [recommendation](../resources/recommendation.md) objects in the response body.

## Examples

### Example 1: Get a list of available recommendations

#### Request
<!-- {
  "blockType": "request",
  "name": "list_recommendation"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations
```

#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.recommendation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#directory/recommendations",
    "value": [
        {
            "id": "7918d4b5-0442-4a97-be2d-36f9f9962ece_Microsoft.Identity.IAM.Insights.ThirdPartyApps",
            "createdDateTime": "2022-02-26T00:02:54Z",
            "impactStartDateTime": "2022-02-26T00:02:54Z",
            "postponeUntilDateTime": null,
            "lastModifiedDateTime": "2022-03-08T05:45:08.3265466Z",
            "lastModifiedBy": "131a8fea-5507-4ae4-90bf-20dbf1b6f1b5",
            "displayName": "Integrate your 3rd party apps with Azure AD",
            "insights": "No users are currently authenticating to any pre-integrated, custom app (BYOA) or SaaS app.",
            "benefits": "Integrating 3rd party apps with Azure AD allows you to leverage Azure AD's security features, which enables seamless, more productive and more secure sign-ins. You can add an additional security layer to your 3rd party app sign-ins by using conditional access.",
            "category": "configuration",
            "status": "active",
            "priority": "medium",
            "impactType": "tenantLevel",
            "actionSteps": [
                {
                    "stepNumber": 1,
                    "text": "1. Review your apps",
                    "actionUrl": {
                        "displayName": "Enterprise applications",
                        "url": "https://ms.portal.azure.com/#blade/Microsoft_AAD_IAM/StartboardApplicationsMenuBlade/AllApps/menuId/"
                    }
                },
                {
                    "stepNumber": 2,
                    "text": "2. For each eligible apps, integrate your 3rd party app with Azure AD",
                    "actionUrl": {
                        "displayName": "Tutorials for integrating SaaS applications with Azure AD",
                        "url": "https://docs.microsoft.com/en-us/azure/active-directory/saas-apps/tutorial-list"
                    }
                }
            ]
        },
        {
            "id": "7918d4b5-0442-4a97-be2d-36f9f9962ece_Microsoft.Identity.IAM.Insights.TurnOffPerUserMFA",
            "createdDateTime": "2022-02-28T02:53:00Z",
            "impactStartDateTime": "2022-02-28T02:53:00Z",
            "postponeUntilDateTime": null,
            "lastModifiedDateTime": "2022-03-01T21:19:02.6483104Z",
            "lastModifiedBy": "ab268ccd-aa82-40e9-a1c3-f166746197e3",
            "displayName": "Convert from per-user MFA to Conditional Access MFA",
            "insights": "13 users are currently configured for per-user Multi-Factor Authentication (MFA). However, there are 3 users configured for Conditional Access (CA) MFA. The per-user MFA configuration supersedes the MFA settings applied via CA policies, potentially creating unnecessary MFA prompts.",
            "benefits": "Improve user productivity and minimize sign-in time with fewer MFA prompts. Ensure that your most sensitive resources can have the tighest controls, while your least sensitive resources can be more freely accessible.",
            "category": "configuration",
            "status": "completedByUser",
            "priority": "medium",
            "impactType": "users",
            "actionSteps": [
                {
                    "stepNumber": 1,
                    "text": "1. To get started, confirm that there is an existing CA policy with an MFA requirement. Ensure that you are covering all resources and users you would like to secure with MFA.",
                    "actionUrl": {
                        "displayName": "Click here to view your CA policies",
                        "url": "https://portal.azure.com/?Microsoft_AAD_IAM_enableAadvisorFeaturePreview=true&Microsoft_AAD_IAM_enableAadvisorFeature=true#blade/Microsoft_AAD_IAM/PoliciesTemplateBlade"
                    }
                },
                {
                    "stepNumber": 2,
                    "text": "2. To require MFA via a CA policy, follow the steps in this tutorial.",
                    "actionUrl": {
                        "displayName": "Secure user sign-in events with Azure AD Multi-Factor Authentication",
                        "url": "https://docs.microsoft.com/en-us/azure/active-directory/authentication/tutorial-enable-azure-mfa?toc=/azure/active-directory/conditional-access/toc.json&bc=/azure/active-directory/conditional-access/breadcrumb/toc.json"
                    }
                },
                {
                    "stepNumber": 3,
                    "text": "3. Ensure that the per-user MFA configuration is turned off",
                    "actionUrl": {
                        "displayName": "Navigate to MFA settings.",
                        "url": "https://account.activedirectory.windowsazure.com/UserManagement/MfaSettings.aspx"
                    }
                }
            ]
        }
    ]
}
```

### Example 2
Get a list of available recommendations for a given tenant resource. Returns a list of those recommendations for which the resource is associated.

#### Request
<!-- {
  "blockType": "request",
  "name": "list_recommendation"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/impactedResources?$filter=id eq '{recommendationResourceId}'
```

#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.recommendation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.recommendation",
      "id": "d98332df-8837-eece-3036-9e0c3579ad01",
      "actionSteps": [
        {
          "@odata.type": "microsoft.graph.actionStep"
        }
      ],
      "benefits": "String",
      "category": "String",
      "createdDateTime": "String (timestamp)",
      "currentScore": "Double",
      "displayName": "String",
      "featureArea": "String",
      "impactType": "String",
      "impactStartDateTime": "String (timestamp)",
      "implementationCost": "String",
      "insights": "String",
      "lastCheckedDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "lastModifiedBy": "String",
      "maxScore": "Double",
      "postponeUntilDateTime": "String (timestamp)",
      "priority": "String",
      "provider": "String",
      "status": "String"
    }
  ]
}
```