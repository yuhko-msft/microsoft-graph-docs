---
title: "mobileAppTroubleshootingEvent resource type"
description: "MobileAppTroubleshootingEvent Entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppTroubleshootingEvent resource type

Namespace: microsoft.graph



MobileAppTroubleshootingEvent Entity.


Inherits from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppTroubleshootingEvents](../api/mobileapptroubleshootingevent-list.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|Get a list of the [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) objects and their properties.|
|[Create mobileAppTroubleshootingEvent](../api/mobileapptroubleshootingevent-create.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Create a new [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) object.|
|[Get mobileAppTroubleshootingEvent](../api/mobileapptroubleshootingevent-get.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Read the properties and relationships of a [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) object.|
|[Update mobileAppTroubleshootingEvent](../api/mobileapptroubleshootingevent-update.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Update the properties of a [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) object.|
|[Delete mobileAppTroubleshootingEvent](../api/mobileapptroubleshootingevent-delete.md)|None|Deletes a [mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) object.|
|[List appLogCollectionRequests](../api/mobileapptroubleshootingevent-list-applogcollectionrequests.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md) collection|Get the appLogCollectionRequest resources from the appLogCollectionRequests navigation property.|
|[Create appLogCollectionRequest](../api/mobileapptroubleshootingevent-post-applogcollectionrequests.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md)|Create a new appLogCollectionRequest object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalInformation|[keyValuePair](../resources/keyvaluepair.md) collection|A set of string key and string value pairs which provides additional information on the Troubleshooting event Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|applicationId|String|Intune application identifier.|
|correlationId|String|Id used for tracing the failure in the service. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventDateTime|DateTimeOffset|Time when the event occurred . Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|eventName|String|Event Name corresponding to the Troubleshooting Event. It is an Optional field Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|history|[mobileAppTroubleshootingHistoryItem](../resources/mobileapptroubleshootinghistoryitem.md) collection|Intune Mobile Application Troubleshooting History Item|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceIdentifier|String|Device identifier created or collected by Intune.|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation. Inherited from [deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md)|
|userId|String|Identifier for the user that tried to enroll the device.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appLogCollectionRequests|[appLogCollectionRequest](../resources/applogcollectionrequest.md) collection|The collection property of AppLogUploadRequest.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppTroubleshootingEvent",
  "baseType": "microsoft.graph.deviceManagementTroubleshootingEvent",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppTroubleshootingEvent",
  "id": "String (identifier)",
  "additionalInformation": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "correlationId": "String",
  "eventDateTime": "String (timestamp)",
  "eventName": "String",
  "troubleshootingErrorDetails": {
    "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorDetails"
  },
  "applicationId": "String",
  "history": [
    {
      "@odata.type": "microsoft.graph.mobileAppTroubleshootingHistoryItem"
    }
  ],
  "managedDeviceIdentifier": "String",
  "userId": "String"
}
```

