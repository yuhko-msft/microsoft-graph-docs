---
title: "Create teamworkDevice"
description: "Create a new teamworkDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamworkDevice
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [teamworkDevice](../resources/teamworkdevice.md) object.

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
POST /teamwork/devices
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamworkDevice](../resources/teamworkdevice.md) object.

You can specify the following properties when creating a **teamworkDevice**.

|Property|Type|Description|
|:---|:---|:---|
|deviceType|teamworkDeviceType|**TODO: Add Description**. The possible values are: `unknown`, `ipPhone`, `teamsRoom`, `surfaceHub`, `collaborationBar`, `teamsDisplay`, `touchConsole`, `lowCostPhone`, `teamsPanel`, `sip`, `unknownFutureValue`. Required.|
|hardware|[Microsoft.Teams.GraphSvc.teamworkHardwareDetail](../resources/teamworkhardwaredetail.md)|**TODO: Add Description** Required.|
|notes|String|**TODO: Add Description** Optional.|
|companyAssetTag|String|**TODO: Add Description** Optional.|
|healthStatus|teamworkDeviceHealthStatus|**TODO: Add Description**. The possible values are: `unknown`, `offline`, `critical`, `nonUrgent`, `healthy`, `unknownFutureValue`. Optional.|
|activityState|teamworkDeviceActivityState|**TODO: Add Description**. The possible values are: `unknown`, `busy`, `idle`, `unavailable`, `unknownFutureValue`. Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdBy|[Microsoft.Teams.GraphSvc.identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedBy|[Microsoft.Teams.GraphSvc.identitySet](../resources/identityset.md)|**TODO: Add Description** Optional.|
|currentUser|[Microsoft.Teams.GraphSvc.teamworkUserIdentity](../resources/teamworkuseridentity.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [teamworkDevice](../resources/teamworkdevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamworkdevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/teamwork/devices
Content-Type: application/json
Content-length: 448

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkDevice",
  "deviceType": "String",
  "hardware": {
    "@odata.type": "microsoft.graph.teamworkHardwareDetail"
  },
  "notes": "String",
  "companyAssetTag": "String",
  "healthStatus": "String",
  "activityState": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "currentUser": {
    "@odata.type": "microsoft.graph.teamworkUserIdentity"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.teamworkDevice"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.teamworkDevice",
  "id": "b8db02e8-02e8-b8db-e802-dbb8e802dbb8",
  "deviceType": "String",
  "hardware": {
    "@odata.type": "microsoft.graph.teamworkHardwareDetail"
  },
  "notes": "String",
  "companyAssetTag": "String",
  "healthStatus": "String",
  "activityState": "String",
  "createdDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "currentUser": {
    "@odata.type": "microsoft.graph.teamworkUserIdentity"
  }
}
```

