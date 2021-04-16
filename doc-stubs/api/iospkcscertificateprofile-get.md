---
title: "Get iosPkcsCertificateProfile"
description: "Read the properties and relationships of an iosPkcsCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosPkcsCertificateProfile
Namespace: microsoft.graph



Read the properties and relationships of an [iosPkcsCertificateProfile](../resources/iospkcscertificateprofile.md) object.

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
GET ** Entity URI for microsoft.graph.iosPkcsCertificateProfile not found
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

If successful, this method returns a `200 OK` response code and an [iosPkcsCertificateProfile](../resources/iospkcscertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iospkcscertificateprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosPkcsCertificateProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosPkcsCertificateProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosPkcsCertificateProfile",
    "id": "dc4c8416-8416-dc4c-1684-4cdc16844cdc",
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
    "renewalThresholdPercentage": "Integer",
    "subjectAlternativeNameType": "String",
    "subjectNameFormat": "String",
    "certificateStore": "String",
    "certificateTemplateName": "String",
    "certificationAuthority": "String",
    "certificationAuthorityName": "String",
    "customSubjectAlternativeNames": [
      {
        "@odata.type": "microsoft.graph.customSubjectAlternativeName"
      }
    ],
    "subjectAlternativeNameFormatString": "String",
    "subjectNameFormatString": "String"
  }
}
```

