---
title: "Update serviceHealthIssue"
description: "Update the properties of a serviceHealthIssue object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update serviceHealthIssue
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [serviceHealthIssue](../resources/servicehealthissue.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /admin/serviceAnnouncement/issues/{serviceHealthIssueId}
PATCH /admin/serviceAnnouncement/healthOverviews/{serviceHealthId}/issues/{serviceHealthIssueId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|details|[keyValuePair](../resources/keyvaluepair.md) collection|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Optional.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|title|String|**TODO: Add Description** Inherited from [serviceAnnouncementBase](../resources/serviceannouncementbase.md). Required.|
|classification|serviceHealthClassificationType|**TODO: Add Description**. The possible values are: `advisory`, `incident`, `unknownFutureValue`. Required.|
|feature|String|**TODO: Add Description** Optional.|
|featureGroup|String|**TODO: Add Description** Optional.|
|highImpact|Boolean|**TODO: Add Description** Optional.|
|impactDescription|String|**TODO: Add Description** Required.|
|isResolved|Boolean|**TODO: Add Description** Required.|
|origin|serviceHealthOrigin|**TODO: Add Description**. The possible values are: `microsoft`, `thirdParty`, `customer`, `unknownFutureValue`. Required.|
|posts|[serviceHealthIssuePost](../resources/servicehealthissuepost.md) collection|**TODO: Add Description** Required.|
|service|String|**TODO: Add Description** Required.|
|status|serviceHealthStatus|**TODO: Add Description**. The possible values are: `serviceOperational`, `investigating`, `restoringService`, `verifyingService`, `serviceRestored`, `postIncidentReviewPublished`, `serviceDegradation`, `serviceInterruption`, `extendedRecovery`, `falsePositive`, `investigationSuspended`, `resolved`, `mitigatedExternal`, `mitigated`, `resolvedExternal`, `confirmed`, `reported`, `unknownFutureValue`. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [serviceHealthIssue](../resources/servicehealthissue.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_servicehealthissue"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/admin/serviceAnnouncement/issues/{serviceHealthIssueId}
Content-Type: application/json
Content-length: 594

{
  "@odata.type": "#microsoft.graph.serviceHealthIssue",
  "details": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "endDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "title": "String",
  "classification": "String",
  "feature": "String",
  "featureGroup": "String",
  "highImpact": "Boolean",
  "impactDescription": "String",
  "isResolved": "Boolean",
  "origin": "String",
  "posts": [
    {
      "@odata.type": "microsoft.graph.serviceHealthIssuePost"
    }
  ],
  "service": "String",
  "status": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.serviceHealthIssue",
  "id": "bbb19bda-9bda-bbb1-da9b-b1bbda9bb1bb",
  "details": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "endDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "title": "String",
  "classification": "String",
  "feature": "String",
  "featureGroup": "String",
  "highImpact": "Boolean",
  "impactDescription": "String",
  "isResolved": "Boolean",
  "origin": "String",
  "posts": [
    {
      "@odata.type": "microsoft.graph.serviceHealthIssuePost"
    }
  ],
  "service": "String",
  "status": "String"
}
```

