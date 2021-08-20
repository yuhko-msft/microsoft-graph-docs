---
title: "Create windowsDriverUpdateProfile"
description: "Create a new windowsDriverUpdateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsDriverUpdateProfile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.

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
POST /deviceManagement/windowsDriverUpdateProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object.

The following table shows the properties that are required when you create the [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|approvalType|driverUpdateProfileApprovalType|**TODO: Add Description**. Possible values are: `manual`, `automatic`.|
|deviceReporting|Int32|**TODO: Add Description**|
|newUpdates|Int32|**TODO: Add Description**|
|deploymentDeferralInDays|Int32|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsDriverUpdateProfile](../resources/intune-windowsdriverupdateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsdriverupdateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsDriverUpdateProfiles
Content-Type: application/json
Content-length: 300

{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateProfile",
  "displayName": "String",
  "description": "String",
  "approvalType": "String",
  "deviceReporting": "Integer",
  "newUpdates": "Integer",
  "deploymentDeferralInDays": "Integer",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsDriverUpdateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateProfile",
  "id": "7dbfe33e-e33e-7dbf-3ee3-bf7d3ee3bf7d",
  "displayName": "String",
  "description": "String",
  "approvalType": "String",
  "deviceReporting": "Integer",
  "newUpdates": "Integer",
  "deploymentDeferralInDays": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

