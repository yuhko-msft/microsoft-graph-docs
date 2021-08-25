---
title: "Update workforceIntegration"
description: "Update the properties of a workforceIntegration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workforceIntegration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workforceIntegration](../resources/workforceintegration.md) object.

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
PATCH /teamwork/workforceIntegrations/{workforceIntegrationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workforceIntegration](../resources/workforceintegration.md) object.

The following table shows the properties that are required when you update the [workforceIntegration](../resources/workforceintegration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdBy|[Microsoft.Teams.Shifts.identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[Microsoft.Teams.Shifts.identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|displayName|String|**TODO: Add Description**|
|apiVersion|Int32|**TODO: Add Description**|
|encryption|[Microsoft.Teams.Shifts.workforceIntegrationEncryption](../resources/workforceintegrationencryption.md)|**TODO: Add Description**|
|isActive|Boolean|**TODO: Add Description**|
|url|String|**TODO: Add Description**|
|supports|workforceIntegrationSupportedEntities|**TODO: Add Description**. The possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`, `timeCard`, `timeOffReason`, `timeOff`, `timeOffRequest`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `timeCard` , `timeOffReason` , `timeOff` , `timeOffRequest`.|
|supportedEntities|workforceIntegrationSupportedEntities|**TODO: Add Description**. The possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`, `timeCard`, `timeOffReason`, `timeOff`, `timeOffRequest`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `timeCard` , `timeOffReason` , `timeOff` , `timeOffRequest`.|
|eligibilityFilteringEnabledEntities|eligibilityFilteringEnabledEntities|**TODO: Add Description**. The possible values are: `none`, `swapRequest`, `offerShiftRequest`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [workforceIntegration](../resources/workforceintegration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workforceintegration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/teamwork/workforceIntegrations/{workforceIntegrationId}
Content-Type: application/json
Content-length: 443

{
  "@odata.type": "#microsoft.graph.workforceIntegration",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "apiVersion": "Integer",
  "encryption": {
    "@odata.type": "microsoft.graph.workforceIntegrationEncryption"
  },
  "isActive": "Boolean",
  "url": "String",
  "supports": "String",
  "supportedEntities": "String",
  "eligibilityFilteringEnabledEntities": "String"
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
  "@odata.type": "#microsoft.graph.workforceIntegration",
  "id": "c131abd9-abd9-c131-d9ab-31c1d9ab31c1",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "apiVersion": "Integer",
  "encryption": {
    "@odata.type": "microsoft.graph.workforceIntegrationEncryption"
  },
  "isActive": "Boolean",
  "url": "String",
  "supports": "String",
  "supportedEntities": "String",
  "eligibilityFilteringEnabledEntities": "String"
}
```

