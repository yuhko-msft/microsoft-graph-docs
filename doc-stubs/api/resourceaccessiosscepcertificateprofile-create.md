---
title: "Create resourceAccessIosSCEPCertificateProfile"
description: "Create a new resourceAccessIosSCEPCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create resourceAccessIosSCEPCertificateProfile
Namespace: microsoft.graph

Create a new [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.

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
POST ** Collection URI for microsoft.graph.resourceAccessIosSCEPCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object.

The following table shows the properties that are required when you create the [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md)|
|certificateScope|iosCertificateScope|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|keySize|iosKeySize|**TODO: Add Description**. Possible values are: `size1024Bits`, `size2048Bits`.|
|keyUsage|keyUsages|**TODO: Add Description**. Possible values are: `keyEncipherment`, `digitalSignature`.|
|rootCertificateId|Guid|**TODO: Add Description**|
|scepServerUrls|String collection|**TODO: Add Description**|
|subjectAlternativeNameFormats|[iosCustomSubjectAlternativeName](../resources/intune-ioscustomsubjectalternativename.md) collection|**TODO: Add Description**|
|subjectNameFormatString|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [resourceAccessIosSCEPCertificateProfile](../resources/resourceaccessiosscepcertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_resourceaccessiosscepcertificateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.resourceAccessIosSCEPCertificateProfile not found
Content-Type: application/json
Content-length: 622

{
  "@odata.type": "#microsoft.graph.resourceAccessIosSCEPCertificateProfile",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "renewalThresholdPercentage": "Integer",
  "certificateScope": "String",
  "keySize": "String",
  "keyUsage": "String",
  "rootCertificateId": "Guid",
  "scepServerUrls": [
    "String"
  ],
  "subjectAlternativeNameFormats": [
    {
      "@odata.type": "microsoft.graph.iosCustomSubjectAlternativeName"
    }
  ],
  "subjectNameFormatString": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.resourceAccessIosSCEPCertificateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.resourceAccessIosSCEPCertificateProfile",
  "id": "86fb1123-1123-86fb-2311-fb862311fb86",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "renewalThresholdPercentage": "Integer",
  "certificateScope": "String",
  "keySize": "String",
  "keyUsage": "String",
  "rootCertificateId": "Guid",
  "scepServerUrls": [
    "String"
  ],
  "subjectAlternativeNameFormats": [
    {
      "@odata.type": "microsoft.graph.iosCustomSubjectAlternativeName"
    }
  ],
  "subjectNameFormatString": "String"
}
```

