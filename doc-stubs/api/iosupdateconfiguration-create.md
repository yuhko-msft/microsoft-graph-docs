---
title: "Create iosUpdateConfiguration"
description: "Create a new iosUpdateConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosUpdateConfiguration
Namespace: microsoft.graph



Create a new [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.iosUpdateConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.

The following table shows the properties that are required when you create the [iosUpdateConfiguration](../resources/iosupdateconfiguration.md).

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
|activeHoursEnd|TimeOfDay|Active Hours End (active hours mean the time window when updates install should not happen)|
|activeHoursStart|TimeOfDay|Active Hours Start (active hours mean the time window when updates install should not happen)|
|customUpdateTimeWindows|[customUpdateTimeWindow](../resources/customupdatetimewindow.md) collection|If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.|
|desiredOsVersion|String|If left unspecified, devices will update to the latest version of the OS.|
|enforcedSoftwareUpdateDelayInDays|Int32|Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive|
|isEnabled|Boolean|Is setting enabled in UI|
|scheduledInstallDays|dayOfWeek collection|Days in week for which active hours are configured. This collection can contain a maximum of 7 elements. Possible values are: `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`.|
|updateScheduleType|iosSoftwareUpdateScheduleType|Update schedule type. Possible values are: `updateOutsideOfActiveHours`, `alwaysUpdate`, `updateDuringTimeWindows`, `updateOutsideOfTimeWindows`.|
|utcTimeOffsetInMinutes|Int32|UTC Time Offset indicated in minutes|



## Response

If successful, this method returns a `201 Created` response code and an [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosupdateconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosUpdateConfiguration not found
Content-Type: application/json
Content-length: 1082

{
  "@odata.type": "#microsoft.graph.iosUpdateConfiguration",
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
  "activeHoursEnd": "String (time of day)",
  "activeHoursStart": "String (time of day)",
  "customUpdateTimeWindows": [
    {
      "@odata.type": "microsoft.graph.customUpdateTimeWindow"
    }
  ],
  "desiredOsVersion": "String",
  "enforcedSoftwareUpdateDelayInDays": "Integer",
  "isEnabled": "Boolean",
  "scheduledInstallDays": [
    "String"
  ],
  "updateScheduleType": "String",
  "utcTimeOffsetInMinutes": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosUpdateConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosUpdateConfiguration",
  "id": "647b167c-167c-647b-7c16-7b647c167b64",
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
  "activeHoursEnd": "String (time of day)",
  "activeHoursStart": "String (time of day)",
  "customUpdateTimeWindows": [
    {
      "@odata.type": "microsoft.graph.customUpdateTimeWindow"
    }
  ],
  "desiredOsVersion": "String",
  "enforcedSoftwareUpdateDelayInDays": "Integer",
  "isEnabled": "Boolean",
  "scheduledInstallDays": [
    "String"
  ],
  "updateScheduleType": "String",
  "utcTimeOffsetInMinutes": "Integer"
}
```

