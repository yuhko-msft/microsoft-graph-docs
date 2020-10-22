---
title: "Create workforceIntegrations"
description: "Create a new workforceIntegration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create workforceIntegrations
Namespace: microsoft.graph

Create a new workforceIntegration object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /teamwork/workforceIntegrations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workforceIntegration](../resources/workforceintegration.md) object.

The following table shows the properties that are required when you create the [workforceIntegration](../resources/workforceintegration.md).

|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|displayName|String|**TODO: Add Description**|
|apiVersion|Int32|**TODO: Add Description**|
|encryption|[workforceIntegrationEncryption](../resources/workforceintegrationencryption.md)|**TODO: Add Description**|
|isActive|Boolean|**TODO: Add Description**|
|url|String|**TODO: Add Description**|
|supports|workforceIntegrationSupportedEntities|**TODO: Add Description**. Possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`.|
|supportedEntities|workforceIntegrationSupportedEntities|**TODO: Add Description**. Possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`.|
|eligibilityFilteringEnabledEntities|eligibilityFilteringEnabledEntities|**TODO: Add Description**. Possible values are: `none`, `swapRequest`, `offerShiftRequest`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [workforceIntegration](../resources/workforceintegration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_workforceintegration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/teamwork/workforceIntegrations
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
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workforceIntegration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.workforceIntegration",
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

