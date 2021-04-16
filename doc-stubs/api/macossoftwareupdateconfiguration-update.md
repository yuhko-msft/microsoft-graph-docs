---
title: "Update macOSSoftwareUpdateConfiguration"
description: "Update the properties of a macOSSoftwareUpdateConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSSoftwareUpdateConfiguration
Namespace: microsoft.graph



Update the properties of a [macOSSoftwareUpdateConfiguration](../resources/macossoftwareupdateconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSSoftwareUpdateConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSSoftwareUpdateConfiguration](../resources/macossoftwareupdateconfiguration.md) object.

The following table shows the properties that are required when you update the [macOSSoftwareUpdateConfiguration](../resources/macossoftwareupdateconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|allOtherUpdateBehavior|macOSSoftwareUpdateBehavior|Update behavior for all other updates. Possible values are: `notConfigured`, `default`.|
|configDataUpdateBehavior|macOSSoftwareUpdateBehavior|Update behavior for configuration data file updates. Possible values are: `notConfigured`, `default`.|
|criticalUpdateBehavior|macOSSoftwareUpdateBehavior|Update behavior for critical updates. Possible values are: `notConfigured`, `default`.|
|customUpdateTimeWindows|[customUpdateTimeWindow](../resources/customupdatetimewindow.md) collection|Custom Time windows when updates will be allowed or blocked. This collection can contain a maximum of 20 elements.|
|firmwareUpdateBehavior|macOSSoftwareUpdateBehavior|Update behavior for firmware updates. Possible values are: `notConfigured`, `default`.|
|updateScheduleType|macOSSoftwareUpdateScheduleType|Update schedule type. Possible values are: `alwaysUpdate`, `updateDuringTimeWindows`, `updateOutsideOfTimeWindows`.|
|updateTimeWindowUtcOffsetInMinutes|Int32|Minutes indicating UTC offset for each update time window|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSSoftwareUpdateConfiguration](../resources/macossoftwareupdateconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macossoftwareupdateconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSSoftwareUpdateConfiguration not found
Content-Type: application/json
Content-length: 1010

{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateConfiguration",
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
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "allOtherUpdateBehavior": "String",
  "configDataUpdateBehavior": "String",
  "criticalUpdateBehavior": "String",
  "customUpdateTimeWindows": [
    {
      "@odata.type": "microsoft.graph.customUpdateTimeWindow"
    }
  ],
  "firmwareUpdateBehavior": "String",
  "updateScheduleType": "String",
  "updateTimeWindowUtcOffsetInMinutes": "Integer"
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
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateConfiguration",
  "id": "a59a0865-0865-a59a-6508-9aa565089aa5",
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
  "allOtherUpdateBehavior": "String",
  "configDataUpdateBehavior": "String",
  "criticalUpdateBehavior": "String",
  "customUpdateTimeWindows": [
    {
      "@odata.type": "microsoft.graph.customUpdateTimeWindow"
    }
  ],
  "firmwareUpdateBehavior": "String",
  "updateScheduleType": "String",
  "updateTimeWindowUtcOffsetInMinutes": "Integer"
}
```

