---
title: "Update riskyUserHistoryItem"
description: "Update the properties of a riskyUserHistoryItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update riskyUserHistoryItem
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [riskyUserHistoryItem](../resources/riskyuserhistoryitem.md) object.

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
PATCH /riskyUsers/{riskyUsersId}/history/{riskyUserHistoryItemId}
PATCH /riskyUsers/{riskyUsersId}/history/{riskyUserHistoryItemId}/history/{riskyUserHistoryItemId}
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
|isDeleted|Boolean|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). Optional.|
|isProcessing|Boolean|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). Optional.|
|riskLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). Optional.|
|riskLevel|riskLevel|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). The possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`. Optional.|
|riskState|riskState|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). The possible values are: `none`, `confirmedSafe`, `remediated`, `dismissed`, `atRisk`, `confirmedCompromised`, `unknownFutureValue`. Optional.|
|riskDetail|riskDetail|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). The possible values are: `none`, `adminGeneratedTemporaryPassword`, `userPerformedSecuredPasswordChange`, `userPerformedSecuredPasswordReset`, `adminConfirmedSigninSafe`, `aiConfirmedSigninSafe`, `userPassedMFADrivenByRiskBasedPolicy`, `adminDismissedAllRiskForUser`, `adminConfirmedSigninCompromised`, `hidden`, `adminConfirmedUserCompromised`, `unknownFutureValue`, `adminConfirmedServicePrincipalCompromised`, `adminDismissedAllRiskForServicePrincipal`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `adminConfirmedServicePrincipalCompromised` , `adminDismissedAllRiskForServicePrincipal`. Optional.|
|userDisplayName|String|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). Optional.|
|userPrincipalName|String|**TODO: Add Description** Inherited from [riskyUser](../resources/riskyuser.md). Optional.|
|userId|String|**TODO: Add Description** Optional.|
|initiatedBy|String|**TODO: Add Description** Optional.|
|activity|[Microsoft.IdentityProtectionServices.riskUserActivity](../resources/riskuseractivity.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [riskyUserHistoryItem](../resources/riskyuserhistoryitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_riskyuserhistoryitem"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/riskyUsers/{riskyUsersId}/history/{riskyUserHistoryItemId}
Content-Type: application/json
Content-length: 445

{
  "@odata.type": "#microsoft.graph.riskyUserHistoryItem",
  "isDeleted": "Boolean",
  "isProcessing": "Boolean",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "riskDetail": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "userId": "String",
  "initiatedBy": "String",
  "activity": {
    "@odata.type": "microsoft.graph.riskUserActivity"
  }
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
  "@odata.type": "#microsoft.graph.riskyUserHistoryItem",
  "id": "57a19192-9192-57a1-9291-a1579291a157",
  "isDeleted": "Boolean",
  "isProcessing": "Boolean",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "riskDetail": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String",
  "userId": "String",
  "initiatedBy": "String",
  "activity": {
    "@odata.type": "microsoft.graph.riskUserActivity"
  }
}
```

