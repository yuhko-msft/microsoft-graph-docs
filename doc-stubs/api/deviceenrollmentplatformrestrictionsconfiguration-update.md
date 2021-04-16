---
title: "Update deviceEnrollmentPlatformRestrictionsConfiguration"
description: "Update the properties of a deviceEnrollmentPlatformRestrictionsConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceEnrollmentPlatformRestrictionsConfiguration
Namespace: microsoft.graph



Update the properties of a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object.

The following table shows the properties that are required when you update the [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|androidForWorkRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Android for work restrictions based on platform, platform operating system version, and device ownership|
|androidRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Android restrictions based on platform, platform operating system version, and device ownership|
|aospRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|AOSP restrictions based on platform, platform operating system version, and device ownership|
|iosRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Ios restrictions based on platform, platform operating system version, and device ownership|
|macOSRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Mac restrictions based on platform, platform operating system version, and device ownership|
|macRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Mac restrictions based on platform, platform operating system version, and device ownership|
|windowsHomeSkuRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows Home Sku restrictions based on platform, platform operating system version, and device ownership|
|windowsMobileRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows mobile restrictions based on platform, platform operating system version, and device ownership|
|windowsRestriction|[deviceEnrollmentPlatformRestriction](../resources/deviceenrollmentplatformrestriction.md)|Windows restrictions based on platform, platform operating system version, and device ownership|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/deviceenrollmentplatformrestrictionsconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceenrollmentplatformrestrictionsconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration not found
Content-Type: application/json
Content-length: 1212

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration",
  "description": "String",
  "displayName": "String",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

