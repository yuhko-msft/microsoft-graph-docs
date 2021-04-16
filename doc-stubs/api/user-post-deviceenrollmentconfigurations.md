---
title: "Create deviceEnrollmentConfiguration"
description: "Create a new deviceEnrollmentConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceEnrollmentConfiguration
Namespace: microsoft.graph



Create a new deviceEnrollmentConfiguration object.

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
POST /me/deviceEnrollmentConfigurations
POST /users/{usersId}/deviceEnrollmentConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration|
|description|String|The description of the device enrollment configuration|
|displayName|String|The display name of the device enrollment configuration|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions.|
|version|Int32|The version of the device enrollment configuration|



## Response

If successful, this method returns a `201 Created` response code and a [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceenrollmentconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/deviceEnrollmentConfigurations
Content-Type: application/json
Content-length: 222

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentConfiguration",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceEnrollmentConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentConfiguration",
  "id": "54dd055f-055f-54dd-5f05-dd545f05dd54",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```

