---
title: "Create riskyUser"
description: "Create a new riskyUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create riskyUser
Namespace: microsoft.graph



Create a new [riskyUser](../resources/riskyuser.md) object.

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
POST /riskyUsers
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [riskyUser](../resources/riskyuser.md) object.

The following table shows the properties that are required when you create the [riskyUser](../resources/riskyuser.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|isProcessing|Boolean|**TODO: Add Description**|
|riskDetail|riskDetail|**TODO: Add Description**. Possible values are: `none`, `adminGeneratedTemporaryPassword`, `userPerformedSecuredPasswordChange`, `userPerformedSecuredPasswordReset`, `adminConfirmedSigninSafe`, `aiConfirmedSigninSafe`, `userPassedMFADrivenByRiskBasedPolicy`, `adminDismissedAllRiskForUser`, `adminConfirmedSigninCompromised`, `hidden`, `adminConfirmedUserCompromised`, `unknownFutureValue`.|
|riskLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|riskLevel|riskLevel|**TODO: Add Description**. Possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|riskState|riskState|**TODO: Add Description**. Possible values are: `none`, `confirmedSafe`, `remediated`, `dismissed`, `atRisk`, `confirmedCompromised`, `unknownFutureValue`.|
|userDisplayName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [riskyUser](../resources/riskyuser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_riskyuser_from_riskyusers"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/riskyUsers
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#microsoft.graph.riskyUser",
  "isDeleted": "Boolean",
  "isProcessing": "Boolean",
  "riskDetail": "String",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.riskyUser"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.riskyUser",
  "id": "7138cf51-cf51-7138-51cf-387151cf3871",
  "isDeleted": "Boolean",
  "isProcessing": "Boolean",
  "riskDetail": "String",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

