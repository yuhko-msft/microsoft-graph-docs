---
title: "Create windows10XCertificateProfile"
description: "Create a new windows10XCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10XCertificateProfile
Namespace: microsoft.graph



Create a new [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.

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
POST ** Collection URI for microsoft.graph.windows10XCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object.

The following table shows the properties that are required when you create the [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|description|String|Profile description Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|displayName|String|Profile display name Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|Scope Tags Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|version|Int32|Version of the profile Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|



## Response

If successful, this method returns a `201 Created` response code and a [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10xcertificateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows10XCertificateProfile not found
Content-Type: application/json
Content-length: 240

{
  "@odata.type": "#microsoft.graph.windows10XCertificateProfile",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10XCertificateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10XCertificateProfile",
  "id": "2e3886f8-86f8-2e38-f886-382ef886382e",
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

