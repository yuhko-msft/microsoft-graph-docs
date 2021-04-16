---
title: "Get deviceEnrollmentPlatformRestrictionsConfiguration"
description: "Read the properties and relationships of a deviceEnrollmentPlatformRestrictionsConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceEnrollmentPlatformRestrictionsConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_deviceenrollmentplatformrestrictionsconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration",
    "id": "8848f8dc-f8dc-8848-dcf8-4888dcf84888",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "priority": "Integer",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "Integer",
    "androidForWorkRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "androidRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "aospRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "iosRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "macOSRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "macRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "windowsHomeSkuRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "windowsMobileRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    },
    "windowsRestriction": {
      "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
    }
  }
}
```

