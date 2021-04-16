---
title: "List androidDeviceOwnerPkcsCertificateProfiles"
description: "Get a list of the androidDeviceOwnerPkcsCertificateProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidDeviceOwnerPkcsCertificateProfiles
Namespace: microsoft.graph



Get a list of the [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidDeviceOwnerPkcsCertificateProfile not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androiddeviceownerpkcscertificateprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceOwnerPkcsCertificateProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidDeviceOwnerPkcsCertificateProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile",
      "id": "2b1a7f75-7f75-2b1a-757f-1a2b757f1a2b",
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
      "extendedKeyUsages": [
        {
          "@odata.type": "microsoft.graph.extendedKeyUsage"
        }
      ],
      "renewalThresholdPercentage": "Integer",
      "subjectAlternativeNameType": "String",
      "subjectNameFormat": "String",
      "certificateStore": "String",
      "certificateTemplateName": "String",
      "certificationAuthority": "String",
      "certificationAuthorityName": "String",
      "certificationAuthorityType": "String",
      "customSubjectAlternativeNames": [
        {
          "@odata.type": "microsoft.graph.customSubjectAlternativeName"
        }
      ],
      "subjectAlternativeNameFormatString": "String",
      "subjectNameFormatString": "String"
    }
  ]
}
```

