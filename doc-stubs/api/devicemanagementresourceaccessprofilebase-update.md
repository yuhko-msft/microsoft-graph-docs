---
title: "Update deviceManagementResourceAccessProfileBase"
description: "Update the properties of a deviceManagementResourceAccessProfileBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementResourceAccessProfileBase
Namespace: microsoft.graph



Update the properties of a [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.

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
PATCH /deviceManagement/resourceAccessProfiles/{deviceManagementResourceAccessProfileBaseId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.

The following table shows the properties that are required when you update the [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|DateTime profile was created|
|description|String|Profile description|
|displayName|String|Profile display name|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified|
|roleScopeTagIds|String collection|Scope Tags|
|version|Int32|Version of the profile|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementresourceaccessprofilebase"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/resourceAccessProfiles/{deviceManagementResourceAccessProfileBaseId}
Content-Type: application/json
Content-length: 253

{
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileBase",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileBase",
  "id": "484a8e0c-8e0c-484a-0c8e-4a480c8e4a48",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

