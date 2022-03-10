---
title: "List impactedResources"
description: "List the details of the Azure AD resources that are associated with a recommendation."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# List impactedResources for a given recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

List the details of the Azure AD resources that are associated with a [recommendation](/../resources/recommendation.md).

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /directory/recommendations/{recommendationId}?$expand=impactedResources
```

## Optional query parameters
This method supports the `$select`, `$skip`, `$top`, and `$filter` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [recommendationResource](../resources/recommendationresource.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_recommendationresource"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations/7918d4b5-0442-4a97-be2d-36f9f9962ece_Microsoft.Identity.IAM.Insights.ThirdPartyApps?$expand=impactedResources
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.recommendationResource)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#directory/recommendations(impactedResources())/$entity",
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
    ],
    "impactedResources@odata.context": "https://graph.microsoft.com/beta/$metadata#directory/recommendations('7918d4b5-0442-4a97-be2d-36f9f9962ece_Microsoft.Identity.IAM.Insights.ThirdPartyApps')/impactedResources",
    "impactedResources": []
  }
}
```
