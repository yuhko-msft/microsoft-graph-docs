---
title: "Get windows10ImportedPFXCertificateProfile"
description: "Read the properties and relationships of a windows10ImportedPFXCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10ImportedPFXCertificateProfile
Namespace: microsoft.graph



Read the properties and relationships of a [windows10ImportedPFXCertificateProfile](../resources/windows10importedpfxcertificateprofile.md) object.

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
GET ** Entity URI for microsoft.graph.windows10ImportedPFXCertificateProfile not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windows10ImportedPFXCertificateProfile](../resources/windows10importedpfxcertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10importedpfxcertificateprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10ImportedPFXCertificateProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10ImportedPFXCertificateProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windows10ImportedPFXCertificateProfile",
    "id": "f95e7d88-7d88-f95e-887d-5ef9887d5ef9",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "certificateValidityPeriodScale": "String",
    "certificateValidityPeriodValue": "Integer",
    "keyStorageProvider": "String",
    "renewalThresholdPercentage": "Integer",
    "subjectAlternativeNameType": "String",
    "subjectNameFormat": "String",
    "intendedPurpose": "String"
  }
}
```

