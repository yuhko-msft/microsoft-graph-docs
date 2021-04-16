---
title: "Create windows10XTrustedRootCertificate"
description: "Create a new windows10XTrustedRootCertificate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10XTrustedRootCertificate
Namespace: microsoft.graph



Create a new [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.

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
POST ** Collection URI for microsoft.graph.windows10XTrustedRootCertificate not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object.

The following table shows the properties that are required when you create the [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|description|String|Profile description Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|displayName|String|Profile display name Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|Scope Tags Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|version|Int32|Version of the profile Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|certFileName|String|File name to display in UI.|
|destinationStore|certificateDestinationStore|Destination store location for the Trusted Root Certificate. Possible values are: `computerCertStoreRoot`, `computerCertStoreIntermediate`, `userCertStoreIntermediate`.|
|trustedRootCertificate|Binary|Trusted Root Certificate|



## Response

If successful, this method returns a `201 Created` response code and a [windows10XTrustedRootCertificate](../resources/windows10xtrustedrootcertificate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10xtrustedrootcertificate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows10XTrustedRootCertificate not found
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.windows10XTrustedRootCertificate",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "certFileName": "String",
  "destinationStore": "String",
  "trustedRootCertificate": "Binary"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10XTrustedRootCertificate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10XTrustedRootCertificate",
  "id": "55569be4-9be4-5556-e49b-5655e49b5655",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "certFileName": "String",
  "destinationStore": "String",
  "trustedRootCertificate": "Binary"
}
```

