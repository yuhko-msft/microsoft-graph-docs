---
title: "List iosScepCertificateProfiles"
description: "Get a list of the iosScepCertificateProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosScepCertificateProfiles
Namespace: microsoft.graph



Get a list of the [iosScepCertificateProfile](../resources/iosscepcertificateprofile.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.iosScepCertificateProfile not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosScepCertificateProfile](../resources/iosscepcertificateprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosscepcertificateprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosScepCertificateProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosScepCertificateProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosScepCertificateProfile",
      "id": "543c537a-537a-543c-7a53-3c547a533c54",
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
      "customSubjectAlternativeNames": [
        {
          "@odata.type": "microsoft.graph.customSubjectAlternativeName"
        }
      ],
      "extendedKeyUsages": [
        {
          "@odata.type": "microsoft.graph.extendedKeyUsage"
        }
      ],
      "keySize": "String",
      "keyUsage": "String",
      "scepServerUrls": [
        "String"
      ],
      "subjectAlternativeNameFormatString": "String",
      "subjectNameFormatString": "String"
    }
  ]
}
```

