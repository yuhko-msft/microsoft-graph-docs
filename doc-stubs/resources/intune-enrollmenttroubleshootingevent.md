---
title: "enrollmentTroubleshootingEvent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# enrollmentTroubleshootingEvent resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List enrollmentTroubleshootingEvents](../api/intune-enrollmenttroubleshootingevent-list.md)|[enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) collection|Get a list of the [enrollmentTroubleshootingEvent](../resources/enrollmenttroubleshootingevent.md) objects and their properties.|
|[Create enrollmentTroubleshootingEvent](../api/intune-enrollmenttroubleshootingevent-create.md)|[enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md)|Create a new [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.|
|[Get enrollmentTroubleshootingEvent](../api/intune-enrollmenttroubleshootingevent-get.md)|[enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md)|Read the properties and relationships of an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.|
|[Update enrollmentTroubleshootingEvent](../api/intune-enrollmenttroubleshootingevent-update.md)|[enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md)|Update the properties of an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.|
|[Delete enrollmentTroubleshootingEvent](../api/intune-enrollmenttroubleshootingevent-delete.md)|None|Deletes an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|correlationId|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|deviceId|String|**TODO: Add Description**|
|enrollmentType|deviceEnrollmentType|**TODO: Add Description**. Possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`.|
|eventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventName|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|failureCategory|deviceEnrollmentFailureReason|**TODO: Add Description**. Possible values are: `unknown`, `authentication`, `authorization`, `accountValidation`, `userValidation`, `deviceNotSupported`, `inMaintenance`, `badRequest`, `featureNotSupported`, `enrollmentRestrictionsEnforced`, `clientDisconnected`, `userAbandonment`.|
|failureReason|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceIdentifier|String|**TODO: Add Description**|
|operatingSystem|String|**TODO: Add Description**|
|osVersion|String|**TODO: Add Description**|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/intune-devicemanagementtroubleshootingerrordetails.md)|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|userId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.enrollmentTroubleshootingEvent",
  "baseType": "microsoft.graph.deviceManagementTroubleshootingEvent",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.enrollmentTroubleshootingEvent",
  "id": "String (identifier)",
  "eventDateTime": "String (timestamp)",
  "correlationId": "String",
  "troubleshootingErrorDetails": {
    "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorDetails"
  },
  "eventName": "String",
  "additionalInformation": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "managedDeviceIdentifier": "String",
  "operatingSystem": "String",
  "osVersion": "String",
  "userId": "String",
  "deviceId": "String",
  "enrollmentType": "String",
  "failureCategory": "String",
  "failureReason": "String"
}
```

