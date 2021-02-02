---
title: "Create iosTrustedRootCertificateProfile"
description: "Create a new iosTrustedRootCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosTrustedRootCertificateProfile
Namespace: microsoft.graph

Create a new [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.

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
POST ** Collection URI for microsoft.graph.iosTrustedRootCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object.

The following table shows the properties that are required when you create the [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|trustedRootCertificateContent|Binary|**TODO: Add Description**|
|certificateFileDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [iosTrustedRootCertificateProfile](../resources/iostrustedrootcertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iostrustedrootcertificateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosTrustedRootCertificateProfile not found
Content-Type: application/json
Content-length: 333

{
  "@odata.type": "#microsoft.graph.iosTrustedRootCertificateProfile",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "trustedRootCertificateContent": "Binary",
  "certificateFileDisplayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosTrustedRootCertificateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosTrustedRootCertificateProfile",
  "id": "4e5079f5-79f5-4e50-f579-504ef579504e",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "trustedRootCertificateContent": "Binary",
  "certificateFileDisplayName": "String"
}
```

