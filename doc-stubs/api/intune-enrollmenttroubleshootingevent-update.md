---
title: "Update enrollmentTroubleshootingEvent"
description: "Update the properties of an enrollmentTroubleshootingEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update enrollmentTroubleshootingEvent
Namespace: microsoft.graph

Update the properties of an [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.

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
PATCH /enrollmentTroubleshootingEvent
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object.

The following table shows the properties that are required when you create the [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|eventDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|correlationId|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/intune-devicemanagementtroubleshootingerrordetails.md)|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|eventName|String|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|additionalInformation|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [deviceManagementTroubleshootingEvent](../resources/intune-devicemanagementtroubleshootingevent.md)|
|managedDeviceIdentifier|String|**TODO: Add Description**|
|operatingSystem|String|**TODO: Add Description**|
|osVersion|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|enrollmentType|deviceEnrollmentType|**TODO: Add Description**. Possible values are: `unknown`, `userEnrollment`, `deviceEnrollmentManager`, `appleBulkWithUser`, `appleBulkWithoutUser`, `windowsAzureADJoin`, `windowsBulkUserless`, `windowsAutoEnrollment`, `windowsBulkAzureDomainJoin`, `windowsCoManagement`, `appleUserEnrollment`, `appleUserEnrollmentWithServiceAccount`, `azureAdJoinUsingAzureVmExtension`, `androidEnterpriseDedicatedDevice`, `androidEnterpriseFullyManaged`, `androidEnterpriseCorporateWorkProfile`.|
|failureCategory|deviceEnrollmentFailureReason|**TODO: Add Description**. Possible values are: `unknown`, `authentication`, `authorization`, `accountValidation`, `userValidation`, `deviceNotSupported`, `inMaintenance`, `badRequest`, `featureNotSupported`, `enrollmentRestrictionsEnforced`, `clientDisconnected`, `userAbandonment`.|
|failureReason|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [enrollmentTroubleshootingEvent](../resources/intune-enrollmenttroubleshootingevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_enrollmenttroubleshootingevent"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/enrollmentTroubleshootingEvent
Content-Type: application/json
Content-length: 636

{
  "@odata.type": "#microsoft.graph.enrollmentTroubleshootingEvent",
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
  "@odata.type": "#microsoft.graph.enrollmentTroubleshootingEvent",
  "id": "643869f8-69f8-6438-f869-3864f8693864",
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

