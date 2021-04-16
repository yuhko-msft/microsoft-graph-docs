---
title: "Update openShift"
description: "Update the properties of an openShift object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update openShift
Namespace: microsoft.graph



Update the properties of an [openShift](../resources/openshift.md) object.

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
PATCH /teams/{teamsId}/schedule/openShifts/{openShiftId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [openShift](../resources/openshift.md) object.

The following table shows the properties that are required when you update the [openShift](../resources/openshift.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|draftOpenShift|[openShiftItem](../resources/openshiftitem.md)|**TODO: Add Description**|
|isStagedForDeletion|Boolean|**TODO: Add Description**|
|schedulingGroupId|String|**TODO: Add Description**|
|sharedOpenShift|[openShiftItem](../resources/openshiftitem.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [openShift](../resources/openshift.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_openshift"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/teams/{teamsId}/schedule/openShifts/{openShiftId}
Content-Type: application/json
Content-length: 359

{
  "@odata.type": "#microsoft.graph.openShift",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "draftOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  },
  "isStagedForDeletion": "Boolean",
  "schedulingGroupId": "String",
  "sharedOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.openShift",
  "id": "3d4b4d3c-4d3c-3d4b-3c4d-4b3d3c4d4b3d",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "draftOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  },
  "isStagedForDeletion": "Boolean",
  "schedulingGroupId": "String",
  "sharedOpenShift": {
    "@odata.type": "microsoft.graph.openShiftItem"
  }
}
```

