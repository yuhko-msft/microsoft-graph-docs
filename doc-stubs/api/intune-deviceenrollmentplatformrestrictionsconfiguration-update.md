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

Update the properties of a [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/intune-deviceenrollmentplatformrestrictionsconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
In the request body, supply a JSON representation of the [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/intune-deviceenrollmentplatformrestrictionsconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/intune-deviceenrollmentplatformrestrictionsconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|iosRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|windowsRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|windowsHomeSkuRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|windowsMobileRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|androidRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|androidForWorkRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|macRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|
|macOSRestriction|[deviceEnrollmentPlatformRestriction](../resources/intune-deviceenrollmentplatformrestriction.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceEnrollmentPlatformRestrictionsConfiguration](../resources/intune-deviceenrollmentplatformrestrictionsconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceenrollmentplatformrestrictionsconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration not found
Content-Type: application/json
Content-length: 1108

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "iosRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsHomeSkuRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsMobileRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "androidRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "androidForWorkRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macOSRestriction": {
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
  "id": "a3e59a26-9a26-a3e5-269a-e5a3269ae5a3",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "iosRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsHomeSkuRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "windowsMobileRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "androidRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "androidForWorkRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  },
  "macOSRestriction": {
    "@odata.type": "microsoft.graph.deviceEnrollmentPlatformRestriction"
  }
}
```

